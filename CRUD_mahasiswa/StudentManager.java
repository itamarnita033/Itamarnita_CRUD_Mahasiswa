package CRUD_mahasiswa;

import java.util.*; // Mengimpor semua kelas dari java.util (termasuk List dan Scanner)
// Kelas StudentManager untuk mengelola daftar mahasiswa
public class StudentManager {
    private List<Student> students; //List untuk menyimpan objek mahasiswa
    //Membaca data mahasiswa dari file saat objek dibuat
    public StudentManager() {
        students = FileHandler.readFromFile();//Mengambil data mahasiswa dari file
    }
    //Mengambil data mahasiswa dari file
    public void addStudent(String nim, String name, String address, int semester, int sks, double ipk) {
        students.add(new Student(nim, name, address, semester, sks, ipk));// Menambahkan mahasiswa ke list
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }
    // Method untuk menampilkan daftar mahasiswa
    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("Tidak ada data.");
            return;
        }
        System.out.println("\nData Mahasiswa:");
        for (Student s : students) {// Loop untuk menampilkan setiap mahasiswa
            System.out.printf("%s | %s | %s | Semester: %d | SKS: %d | IPK: %.2f\n",
                    s.getNim(), s.getName(), s.getAddress(), s.getSemester(), s.getSks(), s.getIpk());
        }
    }
// Method untuk memperbarui data mahasiswa berdasarkan NIM
    public void updateStudent(String nim) {
        for (Student s : students) {
            if (s.getNim().equals(nim)) {
                Scanner input = new Scanner(System.in);
                System.out.print("Nama baru: ");
                s.setName(input.nextLine());
                System.out.print("Alamat baru: ");
                s.setAddress(input.nextLine());
                System.out.print("Semester baru: ");
                s.setSemester(input.nextInt());
                System.out.print("SKS baru: ");
                s.setSks(input.nextInt());
                System.out.print("IPK baru: ");
                s.setIpk(input.nextDouble());
                System.out.println("Data berhasil diperbarui.");
                return;
            }
        }
        System.out.println("NIM tidak ditemukan.");
    }
    // Method untuk menghapus mahasiswa berdasarkan NIM
    public void deleteStudent(String nim) {
        students.removeIf(s -> s.getNim().equals(nim));
        System.out.println("Data berhasil dihapus.");
    }
    // Method untuk menyimpan data mahasiswa ke dalam file
    public void saveData() {
        FileHandler.writeToFile(students);// Menyimpan daftar mahasiswa ke file
    }
}
