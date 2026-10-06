import java.io.*;

class fileop {
    public static void main(String[] args) {

        try {
            // Create/Open file for writing
            FileWriter fw = new FileWriter("student.txt");

            // Write data into file
            fw.write("Student Name: Monish\n");
            fw.write("Department: CSE\n");
            fw.write("Marks: 85\n");

            // Close writing stream
            fw.close();

            System.out.println("Data written successfully.");

            // Open file for reading
            FileReader fr = new FileReader("student.txt");

            int ch;

            System.out.println("\nFile Contents:");

            // Read data character by character
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            // Close reading stream
            fr.close();

        }
        catch (IOException e) {
            System.out.println("File error: " + e);
        }
    }
}
