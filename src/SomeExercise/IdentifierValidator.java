package SomeExercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IdentifierValidator {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-zA-Z_$][a-zA-Z\\d_$]*");
        String string;
        System.out.println("Enter a java identifier : ");
        string = new Scanner(System.in).nextLine();
        boolean b = p.matcher(string).matches();

        if (string == null)
            System.out.println("invalid identifier");
        else if (b)
            System.out.println("valid identifier");
        else
            System.out.println("invalid identifier");
    }
}
