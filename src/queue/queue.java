package queue;

public class queue {
 
    public static int N = 5; // N sebagai batas antrian
    public static int belakang = -1; // Belakang sebagai parameter untuk mengukur berapa jumlah antrian 

    public static void ENQUEUE (String antrian[], String data){ // 'String antrian[], String data' adalah parameter formal data yang akan diolah oleh fungsi

    if(belakang == N-1){ // jika antrian penuh
        System.out.println("maap, antrian penuh, ENQUEUE " + data + " tidak dapat dilakukan");
    }else{
        belakang = belakang + 1; // Proses penambahan antrian yang akan terlacak dalam variable 'belakang'
        antrian[belakang] = data; // proses memasukan data ke antrian
        System.out.println("ENQUEUE " + data + " berhasil..");
 }
}

public static void DEQUEUE (String antrian[]){
   
    String hasil; // variable yang akan mencatat hasil dari proses dequeue

    if(belakang < 0){
        hasil = "ANTRIAN KOSONG, DEQUEUE GAGAL DILAKUKAN";
    }else{ //Jika antrian tidak kosong
        hasil = antrian[0];
        for(int i = 0; i<=belakang-1;i++){
            antrian[i] = antrian[i +1]; // proses menggeser antrian 
        }
        belakang = belakang -1; // Proses mengurangi jumlah antrian
    }
    return;
}

public static void lihatAntrian(String antrian[]){
    System.out.println("------------------------------------------");
    System.out.print("ISI ANTRIAN : (depan)");
    for(int i = 0;i <= N;i++){
        System.out.println(" "+antrian[i]);
    }
    System.out.println(" (belakang)");
    System.out.println("------------------------------------------");

}

public static void main(String[]args){
    String antrian[] = new String[5];
}
    
}