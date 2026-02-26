package Tugas.Minggu_2;

public class DosenMain {
    public static void main(String[] args) {
        
        Dosen06 dosen1 = new Dosen06();
        dosen1.idDosen = "DSN01";
        dosen1.nama = "Dr. Aris";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Sistem Informasi";

        Dosen06 dosen2 = new Dosen06("DSN02", "Budi, M.T.", false, 2020, "Jaringan Komputer");

        System.out.println("=== Data Dosen 1 ===");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        System.out.println();
 
        System.out.println("=== Data Dosen 2 ===");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Keamanan Siber");
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
    }
}
