package collection;

import java.util.LinkedList;

public class Praktik2 {
    
    LinkedList daftarMhs = new LinkedList<>();

    Praktik2(){

        if(daftarMhs.isEmpty() == true){
            System.out.println("LinkedList Kosong!");
        }else{
            System.out.println("LinkedList Isi!");
        }

        daftarMhs.add("Mahes"); // 'add()' adalah method umum yang sering digunakan dalam menambahkan sebuah data kedalam collections
        daftarMhs.add("Livia");

        if(daftarMhs.isEmpty() == true){
            System.out.println("LinkedList Kosong!");
        }else{
            System.out.println("LinkedList Isi!");
        }
    }

    public static void main(String[]args){
        new Praktik2();
    }

}
