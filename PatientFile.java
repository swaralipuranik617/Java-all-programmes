import java.io.*;

public class PatientFile {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("patient.txt"));

            writer.write("Patient ID: 201");
            writer.newLine();
            writer.write("Name: Priya");
            writer.newLine();
            writer.write("Age: 25");
            writer.newLine();
            writer.write("Diagnosis: Fever");
            writer.newLine();

            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("patient.txt"));

            String line;
            System.out.println("Patient Details:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}