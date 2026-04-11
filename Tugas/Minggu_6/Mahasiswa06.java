package Tugas.Minggu_6;

public class Mahasiswa06 {
    String nim, nama, kelas, ipk;

    Mahasiswa06(){

    }
    Mahasiswa06(String nim, String nama, String kelas, String ipk){
        nim = nim;
        nama = nama;
        kelas = kelas;
        ipk = ipk;
    }

    void tampilInformasi(){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}
