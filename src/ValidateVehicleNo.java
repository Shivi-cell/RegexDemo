import java.util.Scanner;

public class ValidateVehicleNo {
    public static void main(String[] args) {
        String vehicleNo;
        System.out.println("Enter vehicle number");
        vehicleNo = new Scanner(System.in).nextLine();

        /**
         * vehicle number should have of type UP55AC5692
         *                                   => [a-zA-Z]{2}[0-9]{2}[a-zA-Z]{2}[0-9]{4}
         * vehicle number should have of type
         *                                   UP55AC5692
         *                                   or UP55C5692
         *                             => [a-zA-Z]{2}[0-9]{2}[a-zA-Z]{1,2}[0-9]{4}
         */

        if (vehicleNo.matches("[a-zA-Z]{2}[0-9]{2}[a-zA-Z]{1,2}[0-9]{4}"))
        {
            System.out.println("Valid vehicle number.");
        }
        else
        {
            System.out.println("Invalid vehicle number.");
        }
    }
}
