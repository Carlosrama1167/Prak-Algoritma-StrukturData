package Tugas.Minggu_11;

public class TugasMahasiswa {
    String nim, nama;

    public TugasMahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    void tampil() {
        System.out.println("NIM: " + nim + " | Nama: " + nama);
    }
}
