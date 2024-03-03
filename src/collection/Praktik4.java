package collection;

import java.util.LinkedList;

public class Praktik4 {

    LinkedList daftarMhs = new LinkedList();
    
    Praktik4(){  // A Constructor

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

        
    }
    
    public static void main(String args[]){

    new Praktik4();     
    }
}
