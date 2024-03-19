package goesToMethod;
import java.util.Scanner;
public class kondisional {
    
public static void main(String[]args){

    // Program untuk menentukan bilangan ganjil genap
    // Dengan inputan pengguna

    Scanner in = new Scanner(System.in);

    System.out.print("Silahkan masukan bilangan Anda : ");
    int bil = in.nextInt();

    if(bil % 2 == 0){
        System.out.println("Bilangan yang Anda masukan genap");
    }else{
        System.out.println("Bilangan yang Anda masukan ganjil");
    }}}
