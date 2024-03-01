package collection;

import java.util.LinkedList;

public class Praktik {
    
    LinkedList daftarMhs = new LinkedList<String>(); // '<>' adalah Diamond Operato secara umum digunakan untuk menentukan tipe data dari linkedlist

    Praktik(){
        if(daftarMhs.isEmpty() ==  true){ //isEmpty() merupakan method yang biasanya dipakai untuk mengetahui apakah suatu linkedlist ada isinya atau tidak, ketika linkedlist tersebut ada isinya maka akan bernilai true ketika tidak maka secara umum akan bernilai false.
            System.out.println("LinkedList Kosong!");
        }else{
            System.out.println("LinkedList Isi!");
        }
    }

    public static void main(String args[]){

        new Praktik();

}
}
