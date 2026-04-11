package Tugas.Minggu_6;

public class MahasiswaBerprestasi {
    Mahasiswa06 [] lisMhs = new Mahasiswa06[5];
    int idx;

    void tambah(Mahasiswa06 m){
        if (idx < lisMhs.length) {
            lisMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil(){
        for (Mahasiswa06 m : lisMhs) {
            m.tampilInformasi();
            System.out.println("-------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < lisMhs.length-1; i++) {
            for (int j = 1; j < lisMhs.length-i; j++) {
                if (Double.parseDouble(lisMhs[j].ipk) > Double.parseDouble(lisMhs[j-1].ipk)) {
                    Mahasiswa06 temp = lisMhs[j];
                    lisMhs[j] = lisMhs[j-1];
                    lisMhs[j-1] = temp;
                }
            }
        }
    }
}
