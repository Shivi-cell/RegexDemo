import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3 {
    public static void main(String[] args) {

        //Pattern p = Pattern.compile("\\s"); // space character

        /**
         * we use \\s instead of using \s because the java compiler reads \s as the escape character
         * but there is no escape character in the java like \s so compiler will give error message as
         * illegal escape character,
         * so we use extra \ to tell the compiler that it is not the escape character
         */

        //Pattern p = Pattern.compile("\\S"); // except space character

        //Pattern p = Pattern.compile("\\d"); // any digit from [0-9]

        //Pattern p = Pattern.compile("\\D"); // except any digit from [0-9]

        //Pattern p = Pattern.compile("\\w"); // any word character [a-zA-Z0-9]

        //Pattern p = Pattern.compile("\\W"); // except any word character [a-zA-Z0-9] i.e. special character

        Pattern p = Pattern.compile("."); // any symbol including special character also

        Matcher m = p.matcher("a7b@z#9");

        while (m.find())
        {
            System.out.println(m.start()+"...."+m.group());
        }
    }
}
