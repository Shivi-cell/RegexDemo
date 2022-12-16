import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {
    public static void main(String[] args) {
        //Pattern p = Pattern.compile("[abc]"); // either a or b or c

        //Pattern p = Pattern.compile("[^abc]"); // except a, b and c

        //Pattern p = Pattern.compile("[a-z]"); // any lower case alphabet

        //Pattern p = Pattern.compile("[A-Z]"); // any upper case alphabet

        //Pattern p = Pattern.compile("[a-zA-Z]"); // any upper or lower case alphabet

        //Pattern p = Pattern.compile("[0-9]"); // any digit from 0-9

        //Pattern p = Pattern.compile("[a-zA-Z0-9]"); // any alphabet or digit

        Pattern p = Pattern.compile("[^a-zA-Z0-9]"); // except any alphabet or digit (special characters)

        Matcher m = p.matcher("a7b@z#9");

        while (m.find())
        {
            System.out.println(m.start()+"..."+m.group());
        }

    }
}
