package collection;

import java.util.LinkedList;

public class Praktik6 {

    LinkedList daftarMhs = new LinkedList();
    
    Praktik6(){  // A Constructor

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

        daftarMhs.remove(5); // 'remove()' merupakan methode untuk menghapus suatu data dalamLinkedList dan untuk menyatakan datanya harus disertai dengan '("String")' atau '()'

        System.out.println("N = " + daftarMhs.size()); // 'size()' adalah method untuk mengetahui index elemen dari Linkedlist
        for(int i = 0; i <= daftarMhs.size()-1;i++){
            System.out.printf(i+1+" ");
            System.out.print(daftarMhs.get(i)+"\n");
        }
        System.out.println(" ");
        
        System.out.println("Mhs awal = "+daftarMhs.removeFirst()); // 'removeFirst' merupakan method untuk menghapus data yang berada pada index pertama atau 0
        System.out.println("Mhs awal = "+daftarMhs.removeLast()); // 'getLast' merupakanmethod untuk menghapus data yang ada diindex N atau terakhir
        
        System.out.println(" ");
        System.out.println("N = " + daftarMhs.size()); // 'size()' adalah method untuk mengetahui index elemen dari Linkedlist
        for(int i = 0; i <= daftarMhs.size()-1;i++){
            System.out.printf(i+1+" ");
            System.out.print(daftarMhs.get(i)+"\n");
        }
        System.out.println(" ");
     }

    public static void main(String args[]){

    new Praktik6();     

    }

}
