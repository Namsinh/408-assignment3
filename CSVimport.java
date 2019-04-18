import org.apache.commons.csv.*;
import java.util.Scanner;
import java.sql.*;
import java.io*;

public class CSVimport{

    public static main void(String[] argv)
    {
        Connection conn = DBConfig.getMySqlConnection();
        if (conn.isClosed()) {
            System.out.println("Connection is closed.");
            System.out.println("Trying to re-establish a connection to MySQL...");
            conn = DBConfig.getMySqlConnection();
        }
    }

    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter path to CSV file to import to database: ");
    String path = userInput.nextLine();

    File filepath = new File(path);
    while(!filepath.exists())
    {
        System.out.println("File path does not exist.  Enter another filepath: ");
        filepath = userInput.nextLine();
    }
    //continue

    public void


    public static int importStudentInfo(Connection conn, int sid, String firstname, String lastname)
    {
        try
        {
            PreparedStatement ps =
        }
    }
}