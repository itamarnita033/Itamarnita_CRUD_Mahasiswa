package CRUD_mahasiswa;
//mendefinisikan kelas data mahasiswa
public class Student {
    private String nim;
    private String name;
    private String address;
    private int semester;
    private int sks;
    private double ipk;
// Konstruktor untuk inisialisasi objek Student dengan data awal
    public Student(String nim, String name, String address, int semester, int sks, double ipk) {
        this.nim = nim;
        this.name = name;
        this.address = address;
        this.semester = semester;
        this.sks = sks;
        this.ipk = ipk;
    }
    // Getter method untuk mendapatkan nilai NIM
    public String getNim() { return nim; }
    // Getter method untuk mendapatkan nama mahasiswa
    public String getName() { return name; }
    // Getter method untuk mendapatkan alamat mahasiswqa
    public String getAddress() { return address; }
    // Getter method untuk mendapatkan semester mahasiswa
    public int getSemester() { return semester; }
    // Getter method untuk mendapatkan jumlah SKS
    public int getSks() { return sks; }
    // Getter method untuk mendapatkan jumlah IPK
    public double getIpk() { return ipk; }
    // Setter method untuk mengubah nama mahasiswa
    public void setName(String name) { this.name = name; }
    // Setter method untuk mengubah alamat mahasiswa
    public void setAddress(String address) { this.address = address; }
    // Setter method untuk mengubah semester mahasiswa
    public void setSemester(int semester) { this.semester = semester; }
    // Setter method untuk mengubah jumlah SKS mahasiswa
    public void setSks(int sks) { this.sks = sks; }
    // Setter method untuk mengubah IPK mahasiswa
    public void setIpk(double ipk) { this.ipk = ipk; }
    // Override method toString untuk mengembalikan representasi string dari objek Student
    @Override
    public String toString() {
        return nim + "," + name + "," + address + "," + semester + "," + sks + "," + ipk;
    }
}
