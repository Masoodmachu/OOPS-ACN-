import java.io.*;

public class EvenOddFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("integers.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            if (!line.trim().isEmpty()) {   // skip empty lines
                int num = Integer.parseInt(line);

                if (num % 2 == 0) {
                    System.out.println(num + " is Even");
                } else {
                    System.out.println(num + " is Odd");
                }
            }
        }
        br.close();
    }
}
