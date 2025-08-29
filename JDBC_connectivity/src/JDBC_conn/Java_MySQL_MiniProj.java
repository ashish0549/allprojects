package JDBC_conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.sql.Statement;


public class Java_MySQL_MiniProj {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement();
        stmt.execute("create table if not exists studs (rollno int, name varchar(50), per int, email varchar(50), city varchar(50))");
        stmt.execute("create table if not exists insti (inst_id int, rollno int, inst_name varchar(50))");
        stmt.execute("insert into studs values (1, 'Arya', 89, 'arya@mail.com', 'Vizag')");
        stmt.execute("insert into studs values (2, 'Bharath', 91, 'bharath@mail.com', 'Vizag')");    
        stmt.execute("insert into studs values (3, 'Chethan', 75, 'chethan@mail.com', 'Mumbai')");
        stmt.execute("insert into studs values (4, 'Dhruv', 92, 'dhruv@mail.com', 'Chennai')");

        stmt.execute("insert into insti values (101, 1, 'IIIT')");
        stmt.execute("insert into insti values (102, 2, 'IIIT')");
        stmt.execute("insert into insti values (103, 5, 'BITS')");

        ResultSet rs = stmt.executeQuery("select * from studs");
        System.out.println("\nStuds Table:");
        while (rs.next()) {
            System.out.println(rs.getInt("rollno") + " " + rs.getString("name") + " " + rs.getInt("per") + " " + rs.getString("email") + " " + rs.getString("city"));
        }
        //Update
        stmt.executeUpdate("update studs set per = 95 where rollno = 1");
        //Highest PER
        rs = stmt.executeQuery("select * from studs where per = (select max(per) from studs)");
        System.out.println("\nHigh percent:");
        while (rs.next()) {
            System.out.println(rs.getString("name") + " - " + rs.getInt("per"));
        }
        //Ascending ordering
        rs = stmt.executeQuery("select * from studs order by name asc");
        System.out.println("\nStudents in Ascending Order:");
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }
        //Group by same city
        rs = stmt.executeQuery(
        	    "select s.city, s.name from studs s " +
        	    "join (select city from studs group by city having count(*) > 1) c " +
        	    "on s.city = c.city"
        	);

        	System.out.println("\nSame City Students");
        	while (rs.next()) {
        	    System.out.println(rs.getString("city") + " - " + rs.getString("name"));
        	}
        // Added column
        stmt.execute("alter table studs add gender varchar(10)");
        // Modifying 
        stmt.execute("alter table studs modify gender char(1)");
        // Changing name of the table
        stmt.execute("rename table studs to studsinfos");
        //Delete column
        stmt.execute("alter table studsinfos drop column gender");
        
        //Inner Join
        rs = stmt.executeQuery("select s.rollno, s.name, i.inst_name from studsinfos s inner join insti i on s.rollno = i.rollno");
        System.out.println("\nInner Join (Common Records):");
        while (rs.next()) {
            System.out.println(rs.getInt("rollno") + " " + rs.getString("name") + " " + rs.getString("inst_name"));
        }
       
        //Left Join
        rs = stmt.executeQuery("select s.rollno, s.name, i.inst_name from studsinfos s left join insti i on s.rollno = i.rollno");
        System.out.println("\nLeft Join (All Students):");
        while (rs.next()) {
            System.out.println(rs.getString("name") + " - " + rs.getString("inst_name"));
        }
        
        // Right Join
        rs = stmt.executeQuery("select s.name, i.inst_name from studsinfos s right join insti i on s.rollno = i.rollno");
        System.out.println("\nRight Join (All Institutes):");
        while (rs.next()) {
            System.out.println(rs.getString("name") + " - " + rs.getString("inst_name"));
        }
        
        //Union
        rs = stmt.executeQuery(
            "(select s.name, i.inst_name from studsinfos s left join insti i on s.rollno = i.rollno) " +
            "union " +
            "(select s.name, i.inst_name from studsinfos s right join insti i on s.rollno = i.rollno)"
        );
        //
        System.out.println("\nFull Outer Join (All Records):");
        while (rs.next()) {
            System.out.println(rs.getString("name") + " - " + rs.getString("inst_name"));
        }
        
        //Delete Single row
        stmt.execute("delete from studsinfos where rollno = 3");
        System.out.print("one record deleted");
        
        //Truncate(Only deleting data of the table
        stmt.execute("truncate table studsinfos");
        System.out.print("all records deleted");
        
        //Delete Entire table
        stmt.execute("drop table studsinfos");

        rs.close();
        stmt.close();
        con.close();
    }
}
		
