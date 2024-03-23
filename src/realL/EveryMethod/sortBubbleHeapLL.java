package realL.EveryMethod;

public class sortBubbleHeapLL {

public static void mengurutkanDataBubble_TeknikTukarHeap(){

    int N = hitungJumlahSimpul();
    simpul A = null;
    simpul B = null;
    simpul bantu = null;
    simpul berhenti = akhir.kanan; // berhenti cuma menunjuk 'akhir.kanan' bukan 'akhir.kanan' itu sendiri
    int nomor;

    System.out.println("Banyaknya simpul = "+hitungJumlahSimpul());
    for(int i =1; i<=hitungJumlahSimpul()-1;i++){

        A = awal;
        B = awal.kanan;
        nomor = 1;

        // proses banding-tukar, khusus simpul pertama dengan simpul setelahnya.
        if(A.kanan.compareTo(B.nama)>0){
            A.kanan = B.kanan;
            B.kanan = A;
            awal = B;
        }

        // Proses banding-tukar, simpul kedua dengan sebelahnya, dst
        nomor++;
        bantu = awal;
    }

}
}
