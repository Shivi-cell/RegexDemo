import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        //StringTokenizer st = new StringTokenizer("Shivam chaubey Noida");

        /**
         * default regex or pattern or delimiter for StringTokenizer is space(" ")
         */

        StringTokenizer st = new StringTokenizer("12-03-2022","-");

        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
