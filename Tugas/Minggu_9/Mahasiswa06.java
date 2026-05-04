package Tugas.Minggu_9;

public class Mahasiswa06 {
String nama, nim, kelas;
    int nilai;

    // Konstruktor berparameter [cite: 30]
    Mahasiswa06(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1; // Nilai default awal [cite: 31, 37]
    }

    // Method untuk mengeset nilai tugas [cite: 38]
    void tugasDinilai(int nilai) {
        this.nilai = nilai; 
    }
}
