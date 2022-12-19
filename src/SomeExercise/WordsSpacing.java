package SomeExercise;

import java.util.Scanner;

public class WordsSpacing {
    public static void main(String[] args) {
        // \s+|\s+$
        // /^\s+|\s+$/g deep sir stackoverflow
        // \w+ \w+  for two words only

        //String regex = "/^\\s+|\\s+$/g";
        // s.replaceAll("^\\s+", "").replaceAll("\\s+$", "")

        System.out.println("Enter a string ");
        String str = new Scanner(System.in).nextLine();
        String s = str.replaceAll("^\\s+", "").replaceAll("\\s+$", "");

        System.out.println(s);


        /*Pattern p = Pattern.compile("\\w+ \\w+");
        Matcher matcher = p.matcher("    shivam chaubey  ");
        while (matcher.find()){
            System.out.println(matcher.group());
        }*/
    }
}