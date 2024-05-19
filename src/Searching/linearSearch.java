package Searching;

import java.util.Scanner;


class dataMahasiswa {
    String nama;
    int umur;
}

public class linearSearch {

    public static int N = 10;
    public static Scanner in = new Scanner(System.in);

    
   

    public static void tambahData(dataMahasiswa data[]){
    
        for(int i = 0;i <= N-1;i++){
            System.out.print("Masukan nama : ");
            data[i].nama = in.next();
            System.out.print("Masukan umur : ");
            data[i].umur = in.nextInt();
        }
    


    }

    public static void cariDataLinear(dataMahasiswa data[]){

        System.out.print("Masukan nama yang ingin dicari : ");
        String cariNama = in.next();

       boolean setatusKetemu = false;
       int lokasiKetemu = -1;
    //    int i = 0;

    // Menggiunakan while loop 

    //    while ((i<=N-1) && (setatusKetemu == false)) {
    //     if(cariNama.equals(data[i].nama)){
    //         setatusKetemu = true;
    //         lokasiKetemu = i;
    //     }
    //     i++;
    //    }

    // Menggunakan for

    for(int i = 0;i <= N-1;i++){
        if(data[i].nama.equals(cariNama)){
            setatusKetemu = true;
            lokasiKetemu = i;
            break;
        }
        }

        if(setatusKetemu == true){

            System.out.println("Setatus ketemu :"+setatusKetemu+" di posisi ke "+lokasiKetemu);
        }else{
            System.out.println("Maaf nama yang anda cari tidak ditemukan");
        }
       
    }
    

    public static void inisialisasiData(dataMahasiswa data[]){



        data[0] = new dataMahasiswa();
        data[0].nama = "Amir";
        data[0].umur = 17;
        
        data[1] = new dataMahasiswa();
        data[1].nama = "Bejo";
        data[1].umur = 21;
        
        data[2] = new dataMahasiswa();
        data[2].nama = "Cecep";
        data[2].umur = 25;

        data[3] = new dataMahasiswa();
        data[3].nama = "Dadang";
        data[3].umur = 31;
        
        data[4] = new dataMahasiswa();
        data[4].nama = "Endah";
        data[4].umur = 15;

        data[5] = new dataMahasiswa();
        data[5].nama = "Fitri";
        data[5].umur = 23;

        data[6] = new dataMahasiswa();
        data[6].nama = "Gilang";
        data[6].umur = 34;

        data[7] = new dataMahasiswa();
        data[7].nama = "Idrus";
        data[7].umur = 17;

        data[8] = new dataMahasiswa();
        data[8].nama = "Janu";
        data[8].umur = 27;

        data[9] = new dataMahasiswa();
        data[9].nama = "Kumar";
        data[9].umur = 42;
        
    }

    public static void main(String[]args){

        dataMahasiswa data[] = new dataMahasiswa[N];
        inisialisasiData(data);
        cariDataLinear(data);
    }
}
