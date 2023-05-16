import java.util.Scanner;

public class PassportSystem {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the Automatic Passport System.");
        
        // Prompt user for personal details
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your date of birth (DD/MM/YYYY): ");
        String dob = input.nextLine();
        System.out.print("Enter your nationality: ");
        String nationality = input.nextLine();
        
        // Generate a unique passport number based on the personal details
        String passportNumber = generatePassportNumber(name, dob, nationality);
        
        //Display the passport details
        System.out.println("Your passport details are:");
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Nationality: " + nationality);
        System.out.println("Passport Number: " + passportNumber);
        
        input.close();
    }
    
    public static String generatePassportNumber(String name, String dob, String nationality) {
        String passportNumber = "";
        passportNumber += name.substring(0, 3).toUpperCase();
        passportNumber += dob.substring(6) + dob.substring(3, 5) + dob.substring(0, 2);
        passportNumber += nationality.substring(0, 2).toUpperCase();
        return passportNumber;
 
    }

}
