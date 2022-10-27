import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)
        throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a year:");

        String yearString = bufferedReader.readLine();

        int year = Integer.parseInt(yearString);

        if (LeapYear.isLeapYear(year) == true)
            System.out.println(year + " is a leap year");

        else {
            System.out.println(year + " is NOT a leap year");
        }

    }
}
//here be changes
