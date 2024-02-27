package linkedlist2;

import java.util.Scanner;

class simpul {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
    simpul kanan;
}
 

public class praktik1 {

    public static simpul awal;
    public static simpul akhir;
    public static Scanner in = new Scanner(System.in);

    public static void inisialisasiSenaraiKosong(){
        awal = null;
        akhir = null;
    }

    public static void tambahDepan(){

        //Bagian entry data dari keyboard

        String NAMA;
        String ALAMAT;
        int UMUR;
        char JEKEL;
        String HOBI[] = new String[3];
        float IPK;
        int bacaTombol = 0;

        System.out.println("TAMBAH DEPAN : ");
        System.out.print("Silahkan masukan nama Anda : ");
        NAMA = in.next();
        System.out.print("Silahkan masukan alamat Anda : ");
        ALAMAT = in.next();
        System.out.print("Silahkan masukan umur Anda : ");
        UMUR = in.nextInt();
        System.out.print("Silahkan masukan jenis kelamin Anda : ");
        try{
            bacaTombol = System.in.read();
        }catch(java.io.IOException e){}
        JEKEL = (char)bacaTombol;
        System.out.print("Silahkan masukan hobi Anda : ");
        for(int i = 0;i<=3-1;i++){
            System.out.print("hobi ke-"+i+" : ");
            HOBI[i] = in.next();
        }
        System.out.print("Silahkan masukan IPK Anda : ");
        IPK = in.nextInt();

        //Bagian menciptakan dan mengisi simpul baru

        simpul baru;
        baru = new simpul();

        baru.nama = NAMA;
        baru.alamat  = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        for(int i = 0;i<=3-1;i++){
            baru.hobi[i] = HOBI[i];
        }
        baru.ipk = IPK;

        //Bagian mencangkokan simpul baru ke dalam simpul lama
        
        if (awal == null) { // Apabila senarai kosong sama seperti saat awal program dieksekusi
            awal = baru;
            akhir = baru;
            baru.kanan = null;
        }else{              // Apabila senarai tidak kosong.
            baru.kanan = awal;
            awal = baru;
        }

    }

    public static void main(String[]args){
        inisialisasiSenaraiKosong();
        tambahDepan();
        tambahDepan();
        tambahDepan();

    }
}
