import java.util.Scanner;

public class ValidateMobileNo {
    public static void main(String[] args) {
        String s;
        System.out.println("Enter your phone number ");
        s = new Scanner(System.in).nextLine();

        /**
         * for 10 digit mobile no that starts with 6 or 7 or 8 or 9
         *                              ans is => [6-9][0-9]{9}
         *
         * for 10 or 11 digit mobile no
         *                              if 10 digit then first digit should be [6-9]
         *                              if 11 digit then first digit should be 0
         *                              ans is => 0?[6-9][0-9]{9}
         *
         * for 10, 11 or 12 digit mobile no
         *                              if 11 then first digit should be 0
         *                              if 12 then first two digits should be 91
         *                              ans is => (0|91)?[6-9][0-9]{9}
         */

        if (s.matches("(0|91)?[6-9][0-9]{9}"))
        {
            System.out.println("Valid phone number.");
        }
        else {
            System.out.println("invalid phone number.");
        }
    }
}
