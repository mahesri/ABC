package collection;

import java.util.LinkedList;

public class latihan {

    LinkedList daftarMhs = new LinkedList();
    
    latihan(){  // A Constructor

       daftarMhs.add(new Integer(10));
       daftarMhs.add(new Float(10));
       daftarMhs.add(new Long(10));
    }

    public static void main(String args[]){

    new latihan();     

    }

}
