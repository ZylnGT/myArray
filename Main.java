import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;

        while (true) {
            try {
                System.out.println("Enter size of array: ");
                size = scan.nextInt();
                break; // Exit the loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid value.");
                scan.nextLine(); // Consume the invalid input
            }
        }

        MyArray m = new MyArray(size);
        int n;

        do {
            System.out.println("===MY ARRAY===");
            System.out.println("\n[1] Add");
            System.out.println("[2] View");
            System.out.println("[3] Remove");
            System.out.println("[4] Search");
            System.out.println("[5] Sort Ascending");
            System.out.println("[6] Sort Descending");
            System.out.println("[7] Edit");
            System.out.println("[8] Exit\n");

            System.out.println("ENTER YOUR CHOICE: ");
            try {
                n = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid value.");
                scan.nextLine(); 
                n = -1; 
            }

            switch (n) {
                case 1:
                    int value;

                    while (true) {
                        try {
                            System.out.println("ENTER NUMBER TO ADD: ");
                            value = scan.nextInt();
                            break; 
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid value.");
                            scan.nextLine(); 
                        }
                    }

                    m.add(value);
                    break;
                case 2:
                    m.view();
                    break;
                case 3:
                    int idx;

                    while (true) {
                        try {
                            System.out.println("ENTER INDEX TO REMOVE: ");
                            idx = scan.nextInt();
                            break; 
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid input.");
                            scan.nextLine(); 
                        }
                    }

                    m.remove(idx);
                    break;
                case 4:
                    int vlue;

                    while (true) {
                        try {
                            System.out.println("ENTER VALUE TO SEARCH: ");
                            vlue = scan.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid input.");
                            scan.nextLine(); 
                        }
                    }

                    m.search(vlue);
                    break;
                case 5:
                    m.sort('a');
                    break;
                case 6:
                    m.sort('d');
                    break;
                case 7:
                    int valuetoreplace;
                    int indextoedit;

                    while (true) {
                        try {
                            System.out.println("ENTER VALUE TO REPLACE: ");
                            valuetoreplace = scan.nextInt();
                            System.out.println("ENTER INDEX TO EDIT: ");
                            indextoedit = scan.nextInt();
                            break; 
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid value.");
                            scan.nextLine();
                        }
                    }

                    m.edit(indextoedit, valuetoreplace);
                    break;
                case 8:
                    System.out.println("Exit....");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-8).");
            }
        } while (n != 8);
    }
}
