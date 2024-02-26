package linkedlist;

class myPointer{
    int angka;
    String teks;
}

public class Mpraktik2 {
    public static void main(String[]args){

        myPointer P;
        P = new myPointer();
        P.angka = 100;
        P.teks = "Halo";
        
        myPointer Q = new myPointer();
        Q.angka = 200;
        Q.teks = "Akakom";

        System.out.println("Nilai elemen P dan Q adalah :");
        System.out.println("-----------------------------");
        System.out.println("Nilai P.angka adalah = " + P.angka);
        System.out.println("Nilai P.teks adalah = " + P.teks);
        System.out.println("Nilai Q.angka adalah = " + Q.angka);
        System.out.println("Nilai Q.teks adalah = " + Q.teks);

        myPointer R;
        R = P;

        System.out.println("Nilai elemen R adalah :");
        System.out.println("------------------------");
        System.out.println("Nilai R.angka adalah = " + R.angka);
        System.out.println("Nilai R.teks adalah = " + R.teks);

            R=Q;

        System.out.println("Nilai elemen R saat ini adalah :");
        System.out.println("--------------------------------");
        System.out.println("Nilai R.angka adalah = " + R.angka);
        System.out.println("Nilai R.teks adalah = " + R.teks);
    }
}


/*
 * Dalam program diatas R pertama kali menunjuk P, sehingga dalam hal ini R.akngka memiliki nilai 100 dan R.teks memiliki nilai 'Halo'
 * Setelah itu R menunjuk ke Q sehingga dalam hal ini R sekarang memiliki nilai R.angka = '200' dan R.teks = 'Akakom'
 */