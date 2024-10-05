import Arthematics.Mathematics;

public class Main {
    public static void main(String[] args) {
        Mathematics math = new Mathematics();

        
        System.out.println("Addition of int: " + math.add(5, 3));
        System.out.println("Addition of float: " + math.add(5.5f, 2.3f));
        System.out.println("Addition of double: " + math.add(5.123, 2.789));

        
        System.out.println("Square root of 16: " + math.sqrt(16));
        System.out.println("Square root of -4: " + math.sqrt(-4)); // Error handled

        
        System.out.println("Cosine of 60 degrees: " + math.cos(60));
        // System.out.println("Sine of 45 degrees: " + math.sin(45));

       
        System.out.println("Division of 10/2: " + math.divide(10, 2));
        System.out.println("Division of 10/0: " + math.divide(10, 0)); // Error handled
    }
}
