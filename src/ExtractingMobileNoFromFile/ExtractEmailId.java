package ExtractingMobileNoFromFile;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailId {
    public static void main(String[] args) throws IOException {

        System.out.println("Program started.");
        // making the pattern to extract the email address
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com");

        // opening file to write emails on it
        PrintWriter out = new PrintWriter("EmailId.txt");

        // reading the data from the file
        BufferedReader br = new BufferedReader(new FileReader("Input.txt"));
        // reading the first line
        String line = br.readLine();

        while (line != null)
        {
            Matcher m = p.matcher(line);
            while (m.find())
            {
                out.println(m.group()); // writing to the file
            }
            line = br.readLine(); // reading next line
        }
        out.flush();
        out.close();
        br.close();
        System.out.println("Program ended.");
    }

}
