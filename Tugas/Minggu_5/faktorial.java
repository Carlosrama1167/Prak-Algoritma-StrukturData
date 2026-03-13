package Tugas.Minggu_5;

public class faktorial {
    int faktorialIBF(int n){
        int fakto = 1;
        for (int i = n; i < n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    int faktorialIDC(int n){
        if(n==1){
            return 1;
        }else{
            int fakto = n * faktorialIDC( n - 1);
            return fakto;
        }
    }
}
