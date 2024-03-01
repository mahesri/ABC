package collection;

import java.util.LinkedList;

public class PercobaanLinkedList {

    LinkedList daftarMhs = new LinkedList();
    
    PercobaanLinkedList(){  // A Constructor

        if(daftarMhs.isEmpty() == true){ // 'isEmpty()' adalah method untuk mengetahui apakah objeck 'daftarMhs' memiliki isi atau tidak

            System.out.println("Linkedlist kosong");
        }else{
            System.out.println("Linkedlist isi");
        }

        daftarMhs.add("Livia");
        daftarMhs.add("Intan");
        daftarMhs.add("Mahes");
        daftarMhs.add("Indri");
        daftarMhs.add("Lastri");
        daftarMhs.add("Dian");
        daftarMhs.add("Sinta");
        daftarMhs.add("Warjo");
        daftarMhs.add("Laras");
        System.out.println();

        if(daftarMhs.isEmpty() == true){ 

            System.out.println("Linkedlist kosong");
        }else{
            System.out.println("Linkedlist isi");
        }


    }

    public static void main(String args[]){

    new PercobaanLinkedList();     

    }

}
