package CRUD_mahasiswa;
import java.io.*;
import java.util.*;

public class FileHandler {
    private static final String FILE_PATH = "src/main/resources/students.csv";
    private static final String HEADER = "NIM,Nama,Alamat,Semester,SKS,IPK"; //

    public static List<Student> readFromFile() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            boolean firstLine = true;

            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false; // ✅ Lewati header di baris pertama
                    continue;
                }

                String[] data = line.split(",");
                if (data.length == 6) {
                    students.add(new Student(
                            data[0], // NIM
                            data[1], // Nama
                            data[2], // Alamat
                            Integer.parseInt(data[3]), // Semester
                            Integer.parseInt(data[4]), // SKS
                            Double.parseDouble(data[5]) // IPK
                    ));
                }
            }
        } catch (IOException e) {
            System.out.println("File tidak ditemukan, membuat baru...");
        }
        return students;
    }

    public static void writeToFile(List<Student> students) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write(HEADER); //
            bw.newLine();

            for (Student s : students) {
                bw.write(s.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data.");
        }
    }
}
