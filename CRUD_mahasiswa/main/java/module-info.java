module com.example.crud_mahasiswa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.crud_mahasiswa to javafx.fxml;
    exports com.example.crud_mahasiswa;
}