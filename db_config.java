import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig
{
    private Connection pgSqlConnection = null;
    public static Connection getMySQLConnection(String ipaddr, String db_name, String username, String password)
    {
        Connection mysqlConnection = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://ip:3306/cpsc408";
            mysqlConnection = DriverManager.getConnection(String.format(url, user:"cpsc408", password:"";
        }
        catch(Exception e)
        {
            e,printStackTrace();
        }
        return mysqlConnection;
    }
}