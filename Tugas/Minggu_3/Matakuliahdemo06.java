package Tugas.Minggu_3;
import Tugas.Minggu_2.MataKuliah06;
import java.util.Scanner;
public class Matakuliahdemo06 {
    public static void main(String[] args) {
        Matakuliahdemo06 demo = new Matakuliahdemo06();
        Scanner sc = new Scanner(System.in);
        MataKuliah06[] arrayofMataKuliah06 = new MataKuliah06[3];
        String kode, nama, dummy;
        int sks, jumlahjam;
        for (int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.println("kode \t: ");
            kode = sc.nextLine();
            System.out.println("nama \t: ");
            nama = sc.nextLine();
            System.out.println("Sks \t: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.println("Jumlah jam \t: ");
            dummy = sc.nextLine();
            jumlahjam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------------");

            arrayofMataKuliah06[i] = new MataKuliah06(kode, nama, sks, jumlahjam);
        }
    }
}
