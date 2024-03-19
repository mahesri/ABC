package goesToMethod;

import java.util.Scanner;
public class Switch {
    
    public static void main(String[]args){
        // Program untuk mengetahui jumlah hari dalam bulan
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan bulan dengan Angka : ");
        int bulan = in.nextInt();
        
        switch (bulan) {
            case 1, 3, 5, 7, 8, 10,12:
                System.out.println("31 Hari");
                break;
                case 2 :
                System.out.print("Masukan tahun : ");
                int tahun = in.nextInt();
                if(tahun % 4 == 0){
                    System.out.println("29 hari");
                }else{
                    System.out.println("28 hari");
                }
                break;
                case 4, 6, 9, 11:
                System.out.println("30 hari");
                break;
                default:
                System.out.println("Anda salah memasukan bulan");
                break;
        }}}
