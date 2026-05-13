package Tugas.Minggu_12;

public class Mahasiswa06 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa06(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil(){
        System.out.println(
            "NIM : " + nim + "\n" +
            "Nama : " + nama + "\n" +
            "Kelas : " + kelas + "\n" +
            "IPK : " + ipk
        );
    }
}
