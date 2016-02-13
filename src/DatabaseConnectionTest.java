import java.sql.*;
public class DatabaseConnectionTest
{


    private final String driverType = "jdbc";
    private final String dbmsType = "sqlserver";
    private final String hostname = "//192.168.1.66";
    private final String portNumber = "1433";
    private final String databaseName = "TestDB1";
    private final String connectionString = String.format("%s:%s:%s:%s", driverType, dbmsType, hostname, portNumber);
    private Connection databaseConnection;


    public DatabaseConnectionTest() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        databaseConnection = DriverManager.getConnection(connectionString);
        System.out.println(databaseConnection.isValid(30));


    }


    public static void main(String args[])
    {
        try
        {
            DatabaseConnectionTest databaseConnectionTest = new DatabaseConnectionTest();
        }
        catch(Exception e)
        {
        System.out.println(e);
        }


    }
}
