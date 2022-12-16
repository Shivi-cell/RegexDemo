import java.util.Scanner;

public class ValidateEmailAddress {
    public static void main(String[] args) {
        String email;
        System.out.println("Enter your email address");
        email = new Scanner(System.in).nextLine();

        /**
         * validating only gmail addresses (alex01@gmail.com)
         *          => [a-zA-Z0-9][a-zA-Z_.]*@gmail[.]com
         *
         * validating all mail addresses
         *                              (alex01@gmail.com)
         *                              (12alex@yahoo.co.in)
         *                              (12alex_d.insight@yahoo.co.in.ap)
         *          => [a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+
         */
        if (email.matches("[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com"))
        {
            System.out.println("Valid email.");
        }
        else
        {
            System.out.println("Invalid email address.");
        }

    }
}
