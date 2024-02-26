package linkedlist;

class myPointer{
    int angka;
    String teks;
}

public class praktik2 {
    public static void main(String[]args){
        myPointer P = new myPointer();
        P.angka = 100;
        P.teks = "Halo";
        
        System.out.println("Pointer P berisi "+P.angka+" dan "+P.teks);
    }
}
