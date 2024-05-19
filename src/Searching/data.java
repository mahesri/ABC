package Searching;

import java.util.Scanner;

import stack.stack;

class dataMahasiswa {
    String nama;
    int umur;
}

public class data {

    public static int N = 10;
    
    public static void inisialisasiData(){

        dataMahasiswa data[] = new dataMahasiswa[N];

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

    public static void tambahData(){

        

    }

    public static void cariDataLinear(dataMahasiswa data[]){

       Scanner in = new Scanner(System.in);

        System.out.print("Masukan nama yang ingin dicari : ");
        String cariNama = in.next();

       boolean setatusKetemu = false;
       int lokasiKetemu = -1;
       int i = 0;

       while ((i<=N-1) && (setatusKetemu == false)) {
        if(cariNama.equals(data[i].nama)){
            setatusKetemu = true;
            lokasiKetemu = 1;
        }
        i++;
       }

       System.out.println("Setatus ketemu :"+setatusKetemu+" di posisi ke "+lokasiKetemu);

    }

    public static void main(String[]args){

        dataMahasiswa data[] = new dataMahasiswa[N];


        inisialisasiData();
        cariDataLinear(data);
    }
}
