package linkedlist;

class thePointer{
   String namaKota;
   thePointer kiri;
   thePointer kanan;
}


public class praktik3 {
    
public static void main(String[]args){

thePointer P;
P = new thePointer();
P.namaKota = "Yogyakarta";

thePointer Q;
Q = new thePointer();
Q.namaKota = "Klaten";

thePointer R;
R = new thePointer();
R.namaKota = "Solo";

thePointer S;
S = new thePointer();
S.namaKota = "Sragen";

thePointer T;
T = new thePointer();
T.namaKota = "Ngawi";

System.out.println("Nilai P,Q,R,S,T adalah :");
System.out.println("Nilai P.namaKota adalah = "+P.namaKota);
System.out.println("Nilai Q.namaKota adalah = "+Q.namaKota);
System.out.println("Nilai R.namaKota adalah = "+R.namaKota);
System.out.println("Nilai S.namaKota adalah = "+S.namaKota);
System.out.println("Nilai T.namaKota adalah = "+T.namaKota);

P.kanan = Q;
Q.kanan = R;
R.kanan = S;
S.kanan = T;
T.kanan = null;

// Manipulasi linkedlist 1

System.out.println("");
System.out.println("MANIPULASI LINKEDLIST 1");
System.out.println("");
System.out.println("Nilai-nilai yang dapat diakses dari pointer P adalah :");
System.out.println(P.namaKota); //Yogyakarta
System.out.println(P.kanan.namaKota);//Klaten
System.out.println(P.kanan.kanan.namaKota);//Solo
System.out.println(P.kanan.kanan.kanan.namaKota);//Sragen
System.out.println(P.kanan.kanan.kanan.kanan.namaKota);//Ngawi

/*
 * Kesimpulan dari Percabaan ini kita dapat mengakses heap dari 
 * pointer lain dengan pionter yang dikaitkan didalam pointer tersebut.  
 */

 // Manipulasi linkedlist 2
 System.out.println("");
 System.out.println("MANIPULASI LINKEDLIST 2");
 System.out.println("");

 thePointer BANTU;
 BANTU = P;

 while (BANTU!=null) {
   System.out.println("Nilai BANTU.namaKota adalah "+BANTU.namaKota);
   BANTU = BANTU.kanan;
 }

 /*
  * Catatan : Iterasi While dalam program diatas mengekesekusi sebanyak 5 kali
  * Hasil Output setiap iterasi berbeda, hal ini karena sebelumnya sudah dideklarasikan bahwa Pointer P.kanan = Q dan Q.kanan = R dan seterusnya sampai S.kanan = Null yang mana dalam iterasi kelima T.kanan = Null karena while hanya akan mengeksekusi apabila BANTU.kanan tidak sama dengan null maka diiterasi ke 5 while berhenti  
  */
 
// Manipulasi linkedlist 3
 
P.kiri = null;
Q.kiri = P;
R.kiri = Q;
S.kiri = R;
T.kiri = S;

BANTU = T;

System.out.println("");
System.out.println("MANIPULASI LINKEDLIST 3");
System.out.println("");

System.out.println("Elemen namaKota untuk pointer P adalah :");
System.out.println("----------------------------------------");
System.out.println(P.namaKota);
System.out.println(P.kanan.kiri.namaKota);// Output akan menjadi Yogyakarta
System.out.println(P.kanan.kanan.kiri.kiri.namaKota); //Output juga sama Yogyakarta


while (BANTU!=null) {
  System.out.println("Nilai BANTU.namaKota adalah "+BANTU.namaKota);
  BANTU = BANTU.kiri;
}




}    
}
