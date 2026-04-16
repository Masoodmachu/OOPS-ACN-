import java.util.Scanner;

interface Shape {
    public void getdata();
    public void area();
    public void perimeter();
}

class Circle implements Shape {
    double r, a, p;
    Scanner sc = new Scanner(System.in);

    public void getdata() {
        System.out.println("enter the radius of circle:");
        r = sc.nextDouble();
    }

    public void perimeter() {
        p = 2 * 3.14 * r;
        System.out.println(p);
    }

    public void area() {
        a = 3.14 * r * r;
        System.out.println(a);
    }
}

class Rectangle implements Shape {
    int l, b, p, a;
    Scanner sc = new Scanner(System.in);

    public void getdata() {
        System.out.println("enter the length of rectangle:");
        l = sc.nextInt();
        System.out.println("enter the breadth of rectangle:");
        b = sc.nextInt();
    }

    public void perimeter() {
        p = 2 * (l + b);
        System.out.println(p);
    }

    public void area() {
        a = l * b;
        System.out.println(a);
    }
}

public class Areainterface {
    public static void main(String args[]) {
        int wish, ch;
        Scanner sc = new Scanner(System.in);

        Circle cir = new Circle();
        Rectangle rect = new Rectangle();

        do {
            System.out.println("1.Circle\n2.Rectangle\n");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    cir.getdata();
                    cir.area();
                    System.out.println("Area of circle:");
                    cir.perimeter();
                    System.out.println("Perimeter of circle:");
                    break;

                case 2:
                    rect.getdata();
                    rect.area();
                    System.out.println("Area of rectangle:");
                    rect.perimeter();
                    System.out.println("Perimeter of rectangle:");
                    break;
            }

            System.out.println("Do you wish to continue(1/0)?");
            wish = sc.nextInt();
        } while (wish == 1);
    }
}
