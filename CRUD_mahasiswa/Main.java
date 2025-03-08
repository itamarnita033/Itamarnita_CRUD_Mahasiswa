package CRUD_mahasiswa;
import java.util.Scanner;
// kelas untuk menjalankan program CRUD
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//scanner untuk membaca input dari pengguna
        StudentManager manager = new StudentManager();// Membuat objek StudentManager untuk mengelola mahasiswa
       //loop pertamam program
        while (true) {
            System.out.println("\n===== Menu CRUD =====");
            System.out.println("[C] Create");
            System.out.println("[R] Read");
            System.out.println("[U] Update");
            System.out.println("[D] Delete");
            System.out.println("[X] Exit");
            System.out.print("Pilih opsi: ");
            String choice = input.nextLine().toUpperCase();

            switch (choice) {
                case "C"://masukkan data / tambah data
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String name = input.nextLine();
                    System.out.print("Masukkan Alamat: ");
                    String address = input.nextLine();
                    System.out.print("Masukkan Semester: ");
                    int semester = input.nextInt();
                    System.out.print("Masukkan SKS: ");
                    int sks = input.nextInt();
                    System.out.print("Masukkan IPK: ");
                    double ipk = input.nextDouble();
                    input.nextLine(); // Membersihkan buffer
                    manager.addStudent(nim, name, address, semester, sks, ipk);
                    break;
                case "R"://menampilkan semua daftar mahasiswa
                    manager.showStudents();
                    break;
                case "U":// untuk update data mahasiswa
                    System.out.print("Masukkan NIM yang ingin diperbarui: ");
                    manager.updateStudent(input.nextLine());
                    break;
                case "D"://untuk delete data mahasiswa
                    System.out.print("Masukkan NIM yang ingin dihapus: ");
                    manager.deleteStudent(input.nextLine());
                    break;
                case "X":// unuk menyimpan data seblum keluar
                    manager.saveData();
                    System.out.println("Data tersimpan. Keluar...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

