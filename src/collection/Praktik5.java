package collection;

import java.util.LinkedList;

public class Praktik5 {

    LinkedList daftarMhs = new LinkedList();
    
    Praktik5(){  // A Constructor

        daftarMhs.add("Livia");
        daftarMhs.add("Intan");
        daftarMhs.add("Mahes");
        daftarMhs.add("Indri");
        daftarMhs.add("Lastri");
        daftarMhs.add("Dian");
        daftarMhs.add("Sinta");
        daftarMhs.add("Warjo");
        daftarMhs.add("Laras");
       
        System.out.println("N = " + daftarMhs.size()); // 'size()' adalah method untuk mengetahui index elemen dari Linkedlist
        for(int i = 0; i <= daftarMhs.size()-1;i++){
            System.out.printf(i+1+" ");
            System.out.print(daftarMhs.get(i)+"\n");
        }
        System.out.println(" ");

        daftarMhs.addFirst("Novita"); // 'addFirst' adalah method untuk menambahkan suatu elemen kedalam indek 0 atau yang pertama
        daftarMhs.addLast("Yoga"); // sementara 'addLast' merupakan method untuk menambahkan data pada elemen index terkahir

        System.out.println("N = " + daftarMhs.size()); // 'size()' adalah method untuk mengetahui index elemen dari Linkedlist
        for(int i = 0; i <= daftarMhs.size()-1;i++){
            System.out.printf(i+1+" ");
            System.out.print(daftarMhs.get(i)+"\n");
        }
        System.out.println(" ");
        System.out.println("Mhs awal = "+daftarMhs.getFirst()); // 'getFirst' merupakan method untuk mengetahui data yang berada pada index pertama atau 0
        System.out.println("Mhs awal = "+daftarMhs.getLast()); // 'getLast' merupakanmethod untuk mengetahui data yang ada diindex N atau terakhir
     }

    public static void main(String args[]){

    new Praktik5();     

    }

}
