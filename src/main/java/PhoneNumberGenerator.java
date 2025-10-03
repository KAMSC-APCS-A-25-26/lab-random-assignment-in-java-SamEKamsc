import java.util.Random;
import java.text.DecimalFormat;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        // TODO: Create Random object for phone number generation
        Random rand = new Random();
        DecimalFormat df = new DecimalFormat("000");

        // TODO: Generate first three digits (XXX)
        // Constraint: Cannot contain 8 or 9 (digits 0-7 only)
        int dig1 = rand.nextInt(8);
        int dig2 = rand.nextInt(8);
        int dig3 = rand.nextInt(8);
        // TODO: Generate second three digits (XXX) 
        // Constraint: Must be <= 742 (000-742)
        int dig456 = rand.nextInt(743);
        // TODO: Generate third three digits (XXX)
        // No constraints (000-999)
        int dig789 = rand.nextInt(1000);
        // TODO: Format and display phone number as XXX-XXX-XXX
        // Include the dashes in the output
        System.out.printf("%d%d%d-%s-%s", dig1, dig2, dig3, df.format(dig456), df.format(dig789));
    }
}
