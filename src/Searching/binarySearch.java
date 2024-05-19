package Searching;

import java.util.*;

class dataMahasiswa {
    String nama;
    int umur;
}

public class binarySearch {

    public static int N = 10;
    public static Scanner in = new Scanner(System.in);
    
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

    public static void cariDataBinary(dataMahasiswa data[]){

        System.out.print("Masukan nama yang inig dicari : ");
        String kataKunci = in.next();

        int lokasi = -1;
        Boolean setatusKetemu = false;

        //Bagian mencari data

        int atas, bawah, tengah;
        atas = 0;
        bawah = N -1;
        tengah = (atas + bawah) / 2;

        while ((setatusKetemu == false) && (bawah-atas !=1)) {
        
            System.out.println(data[tengah].nama+" <---> "+kataKunci);
            
            //Jika katakunci < data[tengah].nama
            if(kataKunci.compareTo(data[tengah].nama) < 0){
                bawah = tengah;
                tengah = (atas + bawah) / 2;
            }
            
            //Jika katakunci < data[tengah].nama
            else if(kataKunci.compareTo(data[tengah].nama)>0){
                atas = tengah;
                tengah = (atas + bawah) / 2;
            }else{
                setatusKetemu = true;
                lokasi = tengah;
            }
        }

        if(setatusKetemu == true){
            System.out.print("Data yang Anda cari KETEMU dinomor ke-");
            System.out.printf(lokasi+1+"");
            System.out.println("");
        }else{
            System.out.println("Maaf nama yang Anda cari tidak ditemukan");
        }

    }

    public static void tampilData(dataMahasiswa data[]){

        System.out.println("NO || NAMA  ||  UMUR  ||");
        for(int i =0; i<= N-1;i++){
            System.out.printf(i+1+"");
            System.out.print("    "+data[i].nama+"  \t");
            System.out.print(data[i].umur+"\n");
        }
    }



    public static void main(String[]args){
        dataMahasiswa data[] = new dataMahasiswa[N];
        inisialisasiData(data);
        cariDataBinary(data);
        tampilData(data);

    }

}
