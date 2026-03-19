import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        int totalBuildings = 0;

        do {
            System.out.println("\n=========================================");
            System.out.println("   SMART CITY MANAGEMENT SYSTEM");
            System.out.println("=========================================");
            System.out.println("1. Add New Building");
            System.out.println("2. View All Buildings");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");

            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1: { // <--- KURUNG BUKA DI SINI
                    System.out.println("\n--- Add New Building ---");
                    System.out.print("Enter Building Name: ");
                    String bName = input.nextLine();

                    System.out.print("Enter Building Address: ");
                    String bAddress = input.nextLine();

                    int bFloors = 0;

                    while (bFloors <= 0) {
                        System.out.print("Enter Number of Floors (Must be > 0): ");
                        bFloors = input.nextInt();

                        if (bFloors <= 0) {
                            System.out.println("Warning: Lantai tidak boleh nol atau minus! Coba lagi.");
                        }
                    }
                    input.nextLine();

                    totalBuildings++;
                    String buildingID = "SCMS-" + totalBuildings;

                    System.out.println("\n[ Building Details ]");
                    System.out.println("Building ID: " + buildingID);
                    System.out.println("Building Name: " + bName);
                    System.out.println("Building Address: " + bAddress);
                    System.out.println("Number of Floors: " + bFloors);
                    System.out.println("Building added successfully!");
                    break;
                } // <--- KURUNG TUTUP DI SINI

                case 2:
                    System.out.println("\n--- View All Buildings ---");
                    System.out.println("Coming Soon");
                    break;

                case 3:
                    System.out.println("\nExiting program...");
                    System.out.println("Total buildings added this session: " + totalBuildings);
                    System.out.println("Bye!");
                    break;

                default:
                    System.out.println("Invalid option, try again.");
                    break;
            }
        } while (option != 3);

        input.close();
    }
}