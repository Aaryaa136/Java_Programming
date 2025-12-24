import java.sql.*;

class MarvellousJDBC
{
    public static void main(String A[])
    {
        try
        {
            // Step 1: Load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Connect the driver with database connection
            Connection cobj = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ppa53",
                "root",
                ""
            );

            // Step 3: Create statement class object
            Statement sobj = cobj.createStatement();

            // Step 4: Execute query
            ResultSet robj = sobj.executeQuery("select * from student");

            // Step 5: Display result
            while(robj.next())
            {
                System.out.println("Roll number: " + robj.getInt("Rno"));
                System.out.println("Name: " + robj.getString("Name"));
                System.out.println("City: " + robj.getString("City"));
                System.out.println("Marks: " + robj.getInt("Marks"));
                System.out.println("---------------------------");
            }

            robj.close();
            sobj.close();
            cobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured: " + eobj);
        }
    }
}
