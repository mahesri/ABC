package realL;

import java.util.Scanner;

class simpul{
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
    simpul kanan;
    simpul kiri;
}

public class doubleLinkedlist {

    public static simpul awal;
    public static simpul akhir;
    public static Scanner in = new Scanner(System.in);

    public static void inisialisasiSenaraiKosong(){
     awal = null;
     akhir = null;   
    }

    public static void tambahDepan(){
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

        System.out.println("Silahkan masukan hobi Anda maks-3");
        for(int i = 0; i <= 3-1;i++){
            System.out.print("hobi ke-"+i+" : ");
            HOBI[i] = in.next();
        }

        System.out.print("Silahkan masukan IPK Anda : ");
        IPK = in.nextFloat();

        simpul baru;
        baru = new simpul();

        baru.nama = NAMA;
        baru.alamat = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        for(int i=0;i<=3-1;i++){
            baru.hobi[i] = HOBI[i];
        }
        baru.ipk = IPK;

        /*
         * Bagian terpenting yang perlu dipahami adalah ini.
         * Ini merupakan bagian untuk mencangkokan data.
         * Ini merupakan proses menambahkan data baru kedalam simpul heap.
         */

        if (awal == null) { // Kondisi senarai awal masih kosong 
            awal = baru;
            akhir = baru;
            baru.kiri = null;
            baru.kanan = null;
        }else{      // Fokus on this
            baru.kanan = awal;
            awal.kiri = baru;
            awal = baru;
            awal.kiri = null;
        }

            /*
             * 1. Langkah pertama adalah 'awal' selalu 'null' dan data akan disimpan di 'awal' maupun 'akhir'
             * 2. Pemanggilan fungsi tambahDepan kedua akan membuat 'baru.kanan' yang sebelumnya 'null' menjadi 'awal' || Kalau 'awal != null'
             * 3. Pemanggilan fungsi tambahDepan ketiga akan berlangsung sama dengan langkah ke-2.
             * 
             * Sebuah heap meskipun memiliki nama objek yang sama, apabila dideklarasikan 2 kali tetap akan menjadi 2 heap yang berbeda. 
             * 
             */
    }

    public static void tambahBelakang(){
        String NAMA;
        String ALAMAT;
        int UMUR;
        char JEKEL;
        String HOBI[] = new String[3];
        float IPK;
        int bacaTombol = 0;

        System.out.println("TAMBAH BELAKANG : ");
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

        System.out.println("Silahkan masukan hobi Anda maks-3");
        for(int i = 0; i <= 3-1;i++){
            System.out.print("hobi ke-"+i+" : ");
            HOBI[i] = in.next();
        }

        System.out.print("Silahkan masukan IPK Anda : ");
        IPK = in.nextFloat();

        simpul baru;
        baru = new simpul();

        baru.nama = NAMA;
        baru.alamat = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        for(int i=0;i<=3-1;i++){
            baru.hobi[i] = HOBI[i];
        }
        baru.ipk = IPK;

        // The most important thing that we need to understand

        if (awal == null) {
            awal = baru;
            akhir = baru;
            baru.kiri = null;
            baru.kanan = null;
        }else{
            baru.kiri = akhir;
            akhir.kanan = baru;
            akhir = baru;
            akhir.kanan = null;
    }    
    }

    
    public static int hitungJumlahSimpul(){

        int N = 0;
        simpul bantu;
        bantu = awal;
        while(bantu != null){
            N++;
            bantu = bantu.kanan;
        }
        return(N);
    }

    public static void tambahTengah(){

        System.out.print("Tentukan Lokasi Penambahan Data : ");
        int LOKASI = in.nextInt();

        int jumlahSimpulYangAda = hitungJumlahSimpul();

        if(LOKASI == 1){
            System.out.println("Lakukan penambahan di depan");
        }else if (LOKASI > jumlahSimpulYangAda){
            System.out.println("Lakukan penambahan di belakang");
        }else{

        String NAMA;
        String ALAMAT;
        int UMUR;
        char JEKEL;
        String HOBI[] = new String[3];
        float IPK;
        int bacaTombol = 0;

        System.out.println("TAMBAH TENGAH : ");
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

        System.out.println("Silahkan masukan hobi Anda maks-3");
        for(int i = 0; i <= 3-1;i++){
            System.out.print("hobi ke-"+i+" : ");
            HOBI[i] = in.next();
        }

        System.out.print("Silahkan masukan IPK Anda : ");
        IPK = in.nextFloat();

        // -----  Bagian menentukan posisi yang dikehendaki  -----


        simpul bantu;
        bantu = awal;

        int N = 1;

        while((N < LOKASI - 1) && (bantu != akhir)){
            bantu = bantu.kanan;
            N++;
        }

        //----- Bagian menciptakan & mengisi simpul baru-----


        simpul baru = new simpul();
        baru.nama = NAMA;
        baru.alamat = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        for(int i=0;i<=3-1;i++){
            baru.hobi[i] = HOBI[i];
        }
        baru.ipk = IPK;
    
        //--------bagian mencangkokkan simpul baru ke dalam linkedlist lama------
        
        // Here

        baru.kiri = bantu.kiri;
        baru.kiri.kanan = baru;
        baru.kanan = bantu;
        bantu.kiri = baru;

        // here  
    
    }

    }

    public static void hapus(){

    if(awal == null) {// Jika senarai masih kosong

    System.out.println("Senari kosong hapus tidak dapat dilakukan");
     }else{ // Jika senarai tidak kosong!

        System.out.print("Silahkan masukan nama yang ingin dihapus : ");
        String namaCari = in.next();

        if(awal ==  akhir) { //Jika hanya ada sebuah simpul
           
            if(awal.nama.equals(namaCari)){
                System.out.println("menghapus "+namaCari+" dilakukan");
                inisialisasiSenaraiKosong();
            }else
            System.out.println("data "+namaCari+" tidak ditemukan!");
       
        }else if (awal.nama.equals(namaCari)) { // jika nama ditemukan diawal
           
            System.out.println("menghapus "+namaCari+" dilakukan");
            awal = awal.kanan;
            awal.kiri = null;
       
        }else{
        
         simpul bantu;
         bantu = awal;
         
         while(bantu.kanan.nama.equals(namaCari) == false){
           
            bantu = bantu.kanan;
            if(bantu.kanan == null) break;

         }

         if((bantu == akhir) && (akhir.nama.equals(namaCari) == false)){
            
            System.out.println("data "+namaCari+" tidak ditemukan!");
         }else if (akhir.nama.equals(namaCari)) { // jika nama tidak ditemukan diakhir
           
            akhir= bantu.kiri;
            akhir.kanan = null;

         }else{

            System.out.println("menghapus "+namaCari+" dilakukan");
            bantu.kanan.kiri = bantu.kiri;
            bantu.kiri.kanan = bantu.kanan;
         }
        }
     }
    } 

    public static void cetakSenaraiMaju(){
        if(awal == null){ //Jika senarai masih kosong
            System.out.println("Maaf senarai masih kosong!");
        }else{ // jika senarai tidak kosong

            System.out.println("---------------------------------------------------");
            System.out.println("NO      NAMA     ALAMAT     UMUR     JEKEL      IPK");
            System.out.println("---------------------------------------------------");

            simpul bantu;
            bantu = awal;

            while(bantu != null){
                System.out.print(bantu.nama +"\t ");
                System.out.print(bantu.alamat +"\t ");
                System.out.print(bantu.umur +"\t ");
                System.out.print(bantu.jekel +"\t ");
                System.out.print(bantu.hobi[0] +"\t ");
                System.out.print(bantu.hobi[1] +"\t ");
                System.out.print(bantu.hobi[2] +"\t ");
                System.out.println(bantu.ipk +"\t ");
                bantu = bantu.kanan;
            }

            System.out.println("---------------------------------------------------");


        }
    }
    
    public static void cetakSenaraiMundur(){
        if(awal == null){ //Jika senarai masih kosong
            System.out.println("Maaf senarai masih kosong!");
        }else{ // jika senarai tidak kosong

            System.out.println("---------------------------------------------------");
            System.out.println("NO      NAMA     ALAMAT     UMUR     JEKEL      IPK");
            System.out.println("---------------------------------------------------");

            simpul bantu;
            bantu = akhir;

            while(bantu != null){
                System.out.print(bantu.nama +"\t ");
                System.out.print(bantu.alamat +"\t ");
                System.out.print(bantu.umur +"\t ");
                System.out.print(bantu.jekel +"\t ");
                System.out.print(bantu.hobi[0] +"\t ");
                System.out.print(bantu.hobi[1] +"\t ");
                System.out.print(bantu.hobi[2] +"\t ");
                System.out.println(bantu.ipk +"\t ");
                bantu = bantu.kiri;
            }

            System.out.println("---------------------------------------------------");


        }
    }

    public static void cetakMundur(){
        if(awal == null){ //Jika senarai masih kosong
            System.out.println("Maaf senarai masih kosong!");
        }else{ // jika senarai tidak kosong

            System.out.println("---------------------------------------------------");
            System.out.println("NO      NAMA     ALAMAT     UMUR     JEKEL      IPK");
            System.out.println("---------------------------------------------------");

            simpul bantu;
            bantu = akhir;

            while(bantu != null){
                System.out.print(bantu.nama +"\t ");
                System.out.print(bantu.alamat +"\t ");
                System.out.print(bantu.umur +"\t ");
                System.out.print(bantu.jekel +"\t ");
                System.out.print(bantu.hobi[0] +"\t ");
                System.out.print(bantu.hobi[1] +"\t ");
                System.out.print(bantu.hobi[2] +"\t ");
                System.out.println(bantu.ipk +"\t ");
                bantu = bantu.kiri;
            }

            System.out.println("---------------------------------------------------");
        }
    }

    public static void main(String[]args){
        inisialisasiSenaraiKosong();
        tambahDepan();
        hapus();
        cetakSenaraiMaju();
        cetakSenaraiMundur();
    }
}
