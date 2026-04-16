import java.util.Scanner;

class Shape {
    double area(double length, double breadth) { return length * breadth; }
    double area(int side) { return side * side; }
    double area(double radius) { return Math.PI * radius * radius; } // Using Math.PI for accuracy
    double area(int base, double height) { return 0.5 * base * height; }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape obj = new Shape();
        int ch;
        int wish; 

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Rectangle\n2. Square\n3. Circle\n4. Triangle");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter length & breadth: ");
                    System.out.println("Area: " + obj.area(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 2:
                    System.out.print("Enter side: ");
                    System.out.println("Area: " + obj.area(sc.nextInt()));
                    break;
                case 3:
                    System.out.print("Enter radius: ");
                    System.out.println("Area: " + obj.area(sc.nextDouble()));
                    break;
                case 4:
                    System.out.print("Enter base (int) & height (double): ");
                    System.out.println("Area: " + obj.area(sc.nextInt(), sc.nextDouble()));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("\nDo you want to continue? (Press 1 for Yes, 0 for No): ");
            wish = sc.nextInt(); 
        } while (wish != 0);

        sc.close();
        System.out.println("Program Ended.");
    }
}
