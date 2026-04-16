import java.io.*;

class CreateFileAndWriteToConsole {

    public static void main(String[] args) {

        try {
            
            FileWriter fw = new FileWriter("abc.txt");
            fw.write("hi..im Masood M!!");
            fw.close();

            System.out.println("\nFile written successfully\n");

            
            FileReader fr = new FileReader("abc.txt");
            BufferedReader in = new BufferedReader(fr);

            String line = in.readLine();

            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }

            in.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("There are some IO Exceptions");
        }
    }
}
