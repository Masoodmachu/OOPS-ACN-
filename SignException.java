import java.util.Scanner;

// User-defined Exception
class MyException extends Exception {
    MyException(String str) {
        System.out.println(str);
    }
}

// Main Class
public class SignException {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of inputs:");
        int n = sc.nextInt();

        int sum = 0, k = 0;
        int numbers[] = new int[n];

        System.out.println("Enter numbers:");

        while (n > 0) {
            try {
                int num = sc.nextInt();

                if (num < 0) {
                    throw new MyException("Number is negative");
                } else {
                    numbers[k] = num;
                    sum = sum + num;
                    k++;
                }
                n--;
            }

            catch (MyException m) {
                System.out.println(m);
                n--; // move to next input
            }
        }

        System.out.println("The average is: " + (sum / k));

        sc.close();
    }
}
