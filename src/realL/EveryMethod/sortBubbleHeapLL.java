package realL.EveryMethod;

public class sortBubbleHeapLL {

public static void mengurutkanDataBubble_TeknikTukarHeap(){

    int N = hitungJumlahSimpul();
    simpul A = null;
    simpul B = null;
    simpul bantu = null;
    simpul berhenti = akhir.kanan;
    int nomor;

    System.out.println("Jumlah simpul adalah = "+hitungJumlahSimpul());
    for(int i = 1;i<=hitungJumlahSimpul()-1;i++){ // for(int i = 1;i <= 4;i++)
        
        B = awal;
        A = awal.kanan;
        nomor = 1;

        // Proses banding-tukar, khusus simpul pertama dengan sebaliknya
        if(A.nama.compareTo(B.nama)>0){
            A.kanan = B.kanan;
        }
    }    
}
}
