package linkedlist;

class thePointer{
   String namaKota;
   myPointer kanan;
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
R.kanan = T;
T.kanan = S;
S.kanan = null;

System.out.println("Nilai-nilai yang dapat diakses dari pointer P adalah :");
System.out.println(P.namaKota); //Yogyakarta
System.out.println(P.kanan.namaKota);//Klaten
System.out.println(P.kanan.kanan.namaKota);//Solo
System.out.println(P.kanan.kanan.kanan.namaKota);//Sragen
System.out.println(P.kanan.kanan.kanan.kanan.namaKota);//Ngawi

}    
}
