package SomeExercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PanValidator {
    public static void main(String[] args) {
        System.out.println("Enter your pan no ");
        String str = new Scanner(System.in).nextLine();

        Pattern p = Pattern.compile("[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}");
        Boolean b = p.matcher(str).matches();

        if (b)
            System.out.println("PAN is valid.");
        else
            System.out.println("PAN is invalid.");
    }
}
