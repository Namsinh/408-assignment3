import org.fluttercode.datafactory.impl.DataFactory;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class CSV
{
    public static void main(string[] argv) throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Enter the number of tuples to generate: ");
        while(userInput == 0){
            if(!userInput.hasNextInt()){ //check next token
                userInput.nextLine();
                System.out.println("Not a valid input, try again: ");
            }
            else
                userInput = in.nextInt()
        }
        PrintWriter p = new PrintWriter(new File("test.csv"));
        StringBuilder s = new StringBuilder();
        Random r = new Random();
        DataFactory d = new DataFactory();

        String[] majors = {"CPSC", "CE", "SE", "CIS", "DA", "BUS", "ECON", "MATH"};
        //SID, firstname, lastname, major, gpa, email, phone

        for(int i = 0; i < userInput; ++i){
            s.append(d.getFirstName());
            s.append(',');
            s.append(d.getLastName());
            s.append(',');
            s.append(d.getItem(major, 100, "Undecided");
            s.append(',');
            s.append(d.getAddress());
            s.append(',');
            s.append(d.getCity());
            s.append(',');
            s.append(d.getNumberText(10));
            s.append('\n');

            p.write(s.toString());
            s.setLength(0);
        }
        p.close();
        System.out.println(in + " total records have been generated.");

    }
}