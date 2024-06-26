package collection;

import java.util.LinkedList;

public class Praktik7 {

    LinkedList daftarMhs = new LinkedList();
    
    Praktik7(){  // A Constructor

        daftarMhs.add("Livia");
        daftarMhs.add("Intan");
        daftarMhs.add("Mahes");
        daftarMhs.add("Indri");
        daftarMhs.add("Lastri");
        daftarMhs.add("Dian");
        daftarMhs.add("Sinta");
        daftarMhs.add("Warjo");
        daftarMhs.add("Laras");
        System.out.println("");
        System.out.println("N = " + daftarMhs.size()); // 'size()' adalah method untuk mengetahui index elemen dari Linkedlist

        for(int i = 0; i <= daftarMhs.size()-1;i++){
            System.out.printf(i+1+" ");
            System.out.print(daftarMhs.get(i)+"\n");
        }
        System.out.println(" ");

        daftarMhs.set(5, "Lestari"); // 'set()' merupakan method untuk men-set atau secara harfiah mengatur data dalam suatu elemen

        for(int i = 0; i <= daftarMhs.size()-1;i++){
            System.out.printf(i+1+" ");
            System.out.print(daftarMhs.get(i)+"\n");
        }
        System.out.println(" ");
    }

    public static void main(String args[]){

    new Praktik7();     

    }

}
