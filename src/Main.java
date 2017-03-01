/**
 * Created by AWShades on 3/2/2017.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Table ExtraLargeTable = new Table(1);
        Table LargeTable = new Table(3);
        Table MediumTable = new Table(8);
        Table SmallTable = new Table(4);

        int userinput = 1;
        Scanner user_input = new Scanner( System.in );


        while(userinput!=0) {
            System.out.println("To Place a reservation press 1 and to Exit press 0: ");
            userinput = user_input.nextInt();
            if (userinput == 1) {
                int people;
                System.out.println("Enter Number of people: ");
                people = user_input.nextInt();
                if (people <= 2) {
                    if (SmallTable.checkavailable()) {
                        SmallTable.availabledown();
                        System.out.println("Reservation Successful");
                    } else
                        System.out.println("Reservation Unsuccessful");
                } else if (people <= 4) {
                    if (MediumTable.checkavailable()) {
                        MediumTable.availabledown();
                        System.out.println("Reservation Successful");
                    } else
                        System.out.println("Reservation Unsuccessful");
                } else if (people <= 6) {
                    if (LargeTable.checkavailable()) {
                        LargeTable.availabledown();
                        System.out.println("Reservation Successful");
                    } else
                        System.out.println("Reservation Unsuccessful");
                } else if (people <= 12) {
                    if (ExtraLargeTable.checkavailable()) {
                        ExtraLargeTable.availabledown();
                        System.out.println("Reservation Successful");
                    } else
                        System.out.println("Reservation Unsuccessful");
                } else
                    System.out.println("No Table Available.");
            }
        }
    }
}
