package ExtractingMobileNoFromFile;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractMobileNo {
    public static void main(String[] args) throws IOException {
        System.out.println("Program started");
        // file to write the numbers
        PrintWriter out = new PrintWriter("Output.txt");

        // pattern for matching the mobile numbers
        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");

        // opening the file where the mobile no are mixed with the text
        BufferedReader br = new BufferedReader(new FileReader("Input.txt"));

        // reading the first line from the file
        String line = br.readLine();

        while (line != null)
        {
            Matcher m = p.matcher(line);
            while (m.find())
            {
                out.println(m.group()); // writing to the file
            }
            // reading the next line
            line = br.readLine();
        }
        out.flush();
        out.close();
        br.close();
        System.out.println("Program ended.");
    }
}
