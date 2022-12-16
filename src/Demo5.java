import java.util.regex.Pattern;

public class Demo5 {
    public static void main(String[] args) {
        //Pattern p = Pattern.compile("\\s"); // split according to space (Shivam chaubey noida)

        //Pattern p = Pattern.compile("a"); // split according 'a' (Shivam chaubey noida)

        //Pattern p = Pattern.compile("\\."); // split according to '.' (first way)

        Pattern p = Pattern.compile("[.]"); // split according to '.' (second way)

        String[] split = p.split("www.shivam.chaubey.com");

        for (String s1 : split)
        {
            System.out.println(s1);
        }
    }
}
