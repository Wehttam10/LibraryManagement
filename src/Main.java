import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Library Management System");
        System.out.println("--------------------------");
        System.out.println("1. New Library Member Registration");
        System.out.println("2. Borrow / Access Resources");
        System.out.println("3. Manage Member Account (Credits/Fines)");
        System.out.println("4. View / Return Loans");
        System.out.println("5. Exit");
        System.out.println("Select option (1 - 5) >>");
        int option = input.nextInt();

        if (option >= 1 && option <= 5) {
            switch (option) {
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

            }
        }
    }
}

