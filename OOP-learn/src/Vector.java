public class Vector {


    private double [] elements;
    // Constructor
    public Vector(double[] elements) {
        this.elements = elements;
    }
    // Method to add two vectors
    public Vector add(Vector other) {
        if (this.elements.length != other.elements.length) {
            throw new IllegalArgumentException("Vectors must have the same length for addition");
        }

        double[] results1 = new double[this.elements.length];
        for (int i = 0; i < this.elements.length; i++) {
            results1[i] = this.elements[i] + other.elements[i];
        }

        return new Vector(results1);
    }
    public Vector multiply(Vector other){
        if (this.elements.length != other.elements.length){
            throw new IllegalArgumentException("Vectors must have the same length for multiplication");
        }
        double results2[] = new double[this.elements.length];
        //double results2[3];
        for (int i=0; i< this.elements.length; i++){
            results2[i]=this.elements[i] * other.elements[i];
        }
        return new Vector(results2);
    }

    // Method to display the vector
    public void display() {
        System.out.print("[");
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i]);
            if (i < elements.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
