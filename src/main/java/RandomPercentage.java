import java.util.Random;
import java.text.DecimalFormat;

public class RandomPercentage {
    public static void main(String[] args) {
        // TODO: Create two Random objects
        // 1. One Random object without a seed (unseeded)
        // 2. One Random object with any seed value (seeded)
        Random seed = new Random(67);
        Random unseed = new Random();
        DecimalFormat df = new DecimalFormat("#.00%");
        // TODO: Generate random double values from both Random objects
        // Use nextDouble() method to get values between 0.0 and 1.0
        double unsint = unseed.nextDouble();
        double sint = seed.nextDouble();

        // TODO: Format as percentages
        // Format the values to exactly 2 decimal places
        // Display with % symbol
        String unsstr = df.format(unsint);
        String sstr = df.format(sint);
        // TODO: Display the values as percentages
        // Show both unseeded and seeded random values
        // Each value should be formatted as below
        System.out.println("Unseeded Random: " + unsstr);
        System.out.println("Seeded Random: " + sstr);
    }
}