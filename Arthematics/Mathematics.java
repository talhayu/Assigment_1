package Arthematics;

public class Mathematics{


    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

   
    public int subtract(int a, int b) {
        return a - b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }


    int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println( e.getMessage());
            return 0;
        }
    }   

    float divide(float a, float b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println( e.getMessage());
            return 0;
        }
    }   


    public double divide(double a, double b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println( e.getMessage());
            return 0;
        }
    }

    public double sqrt(double a) {
        try {
            if (a < 0) {
                throw new IllegalArgumentException("Error: Square root of negative number");
            }
            return Math.sqrt(a);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public double cos(double angle) {
        return Math.cos(Math.toRadians(angle)); 
    }

}