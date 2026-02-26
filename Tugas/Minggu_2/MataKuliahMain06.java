package Tugas.Minggu_2;

public class MataKuliahMain06 {
    public static void main(String[] args) {
       
        MataKuliah06 mk1 = new MataKuliah06();
        mk1.kodeMK = "ALSD_01";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        MataKuliah06 mk2 = new MataKuliah06("BASDAT_02", "Basis Data", 3, 6);

        System.out.println("=== Data Mata Kuliah 1 ===");
        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        System.out.println();

        System.out.println("=== Data Mata Kuliah 2 ===");
        mk2.tampilInformasi();
        mk2.kurangiJam(10); 
    }
}
