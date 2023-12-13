public class Main {
    public static void main(String[] args) {
        double[] vector1Elements = {1.0, 2.0, 3.0};
        double[] vector2Elements = {4.0, 5.0, 6.0};

        Vector vector1 = new Vector(vector1Elements);
        Vector vector2 = new Vector(vector2Elements);

        // Adding two vectors
        Vector results1 = vector1.add(vector2);
        Vector results2 = vector1.multiply(vector2);

        // Displaying the result
        System.out.println("Vector 1:");
        vector1.display();
        System.out.println("Vector 2:");
        vector2.display();
        System.out.println("Resultant Vector (Vector 1 + Vector 2):");
        results1.display();
        results2.display();
    }
}
