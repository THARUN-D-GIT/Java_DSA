package OOPS;

public class ComplexNumber {

    double x;
    double y;

    ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        if (y >= 0)
            System.out.println(x + " + i" + y);
        else
            System.out.println(x + " - i" + (-y));
    }

    void add(ComplexNumber c2) {
        this.x += c2.x;
        this.y += c2.y;
    }

    void subtract(ComplexNumber c2) {
        this.x -= c2.x;
        this.y -= c2.y;
    }

    void multiply(ComplexNumber c2) {
        double a = this.x;
        double b = this.y;
        double c = c2.x;
        double d = c2.y;

        this.x = a * c - b * d;
        this.y = a * d + b * c;
    }

    void divide(ComplexNumber c2) {
        double a = this.x;
        double b = this.y;
        double c = c2.x;
        double d = c2.y;

        double denominator = c * c + d * d;

        this.x = (a * c + b * d) / denominator;
        this.y = (b * c - a * d) / denominator;
    }

    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(2, 4);
        ComplexNumber c2 = new ComplexNumber(2, -5);

        ComplexNumber c3 = new ComplexNumber(3, 6);
        ComplexNumber c4 = new ComplexNumber(5, -3);

        ComplexNumber c5 = new ComplexNumber(6, 2);
        ComplexNumber c6 = new ComplexNumber(4, 3);

        System.out.println("First Complex Number:");
        c1.print();

        System.out.println("Second Complex Number:");
        c2.print();

        System.out.println("\nAddition:");
        c1.add(c2);
        c1.print();

        System.out.println("\nMultiplication:");
        c3.print();
        c4.print();
        c3.multiply(c4);
        c3.print();

        System.out.println("\nDivision:");
        c5.print();
        c6.print();
        c5.divide(c6);
        c5.print();
    }
}