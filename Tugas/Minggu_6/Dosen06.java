package Tugas.Minggu_6;

public class Dosen06 {
    String kode, nama;
    boolean jenisKelamin; // true: Laki-laki, false: Perempuan
    int usia;

    Dosen06(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia          : " + usia);
        System.out.println("---------------------------");
    }
}
