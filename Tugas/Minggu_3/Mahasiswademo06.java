package Tugas.Minggu_3;
import java.util.Scanner;
public class Mahasiswademo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa06[] arrayofMahasiswas = new Mahasiswa06[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String NIM = input.nextLine();
            System.out.print("Nama: ");
            String Nama = input.nextLine();
            System.out.print("Kelas: ");
            String Kelas = input.nextLine();
            System.out.print("IPK: ");
            dummy = input.nextLine();
            arrayofMahasiswas[i].IPK = Float.parseFloat(dummy);
            System.out.println("-----------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            System.out.println("NIM \t:" + arrayofMahasiswas[i].NIM);
            System.out.println("Nama \t:" + arrayofMahasiswas[i].Nama);
            System.out.println("Kelas \t:" + arrayofMahasiswas[i].Kelas);
            System.out.println("IPK \t:" + arrayofMahasiswas[i].IPK);
            System.out.println("-----------------------------------");
        }

        arrayofMahasiswas[0] = new Mahasiswa06();
        arrayofMahasiswas[0].NIM = "210001";
        arrayofMahasiswas[0].Nama = "AGNES TITANIA KINANTI";
        arrayofMahasiswas[0].Kelas = "SIB-1E";
        arrayofMahasiswas[0].IPK = (float) 3.75;

        arrayofMahasiswas[1] = new Mahasiswa06();
        arrayofMahasiswas[1].NIM = "210001";
        arrayofMahasiswas[1].Nama = "AHMAD MAULANA HAMZAH";
        arrayofMahasiswas[1].Kelas = "SIB-1E";
        arrayofMahasiswas[1].IPK = (float) 3.75;

        arrayofMahasiswas[2] = new Mahasiswa06();
        arrayofMahasiswas[2].NIM = "210002";
        arrayofMahasiswas[2].Nama = "BUDI SETIAWAN";
        arrayofMahasiswas[2].Kelas = "SIB-1E";
        arrayofMahasiswas[2].IPK = (float) 3.50;

        System.out.println("NIM \t:" + arrayofMahasiswas[0].NIM);
        System.out.println("Nama \t:" + arrayofMahasiswas[0].Nama);
        System.out.println("Kelas \t:" + arrayofMahasiswas[0].Kelas);
        System.out.println("IPK \t:" + arrayofMahasiswas[0].IPK);
        System.out.println("-----------------------------------");
        System.out.println("NIM \t:" + arrayofMahasiswas[1].NIM);
        System.out.println("Nama \t:" + arrayofMahasiswas[1].Nama);
        System.out.println("Kelas \t:" + arrayofMahasiswas[1].Kelas);
        System.out.println("IPK \t:" + arrayofMahasiswas[1].IPK);
        System.out.println("-----------------------------------");
        System.out.println("NIM \t:" + arrayofMahasiswas[2].NIM);
        System.out.println("Nama \t:" + arrayofMahasiswas[2].Nama);
        System.out.println("Kelas \t:" + arrayofMahasiswas[2].Kelas);
        System.out.println("IPK \t:" + arrayofMahasiswas[2].IPK);
        System.out.println("-----------------------------------");
    }
}
