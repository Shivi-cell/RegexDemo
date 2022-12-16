import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4 {
    public static void main(String[] args) {

        //Pattern p = Pattern.compile("a"); // exactly one a

        //Pattern p = Pattern.compile("a+"); // at least one a

        //Pattern p = Pattern.compile("a+"); // at least one a

        /**
         * in regular expression the cursor can move at the end+1 location also
         */

        //Pattern p = Pattern.compile("a*"); // any number of a's including zero number also

        Pattern p = Pattern.compile("a?"); // at most one a

        Matcher m = p.matcher("abaabaaab");

        while (m.find())
        {
            System.out.println(m.start()+"..."+m.group());
        }

    }
}
