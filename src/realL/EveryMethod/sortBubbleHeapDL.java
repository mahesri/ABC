package realL.EveryMethod;

public class sortBubbleHeapDL{
public static void mengurutkanDataBubble_TeknikTukarHeap(){

int N = hitungJumlahSimpul();
simpul bantu = awal;

System.out.println("Banyaknya simpul : "+hitungJumlahSimpul());

for(int i =1;i<=hitungJumlahSimpul()-1;i++){

   // Khusus menguji simpul pertama dengan simpul sebeleahnya
   if(awal.nama.compareTo(awal.kanan.nama)>0){

    bantu = awal.kanan;
    awal.kanan = bantu.kanan;

   } 
}

}
}