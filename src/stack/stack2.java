package stack;

import java.util.Stack;

class tumpukan {
    private int array[];
    private int atas = -1; // to count index of the entry
    tumpukan(int ukuran){array = new int[ukuran];}

    void PUSH(int n){
    if(atas == array.length-1){
        System.out.println("Tumpukan penuh!");
    }else{
        array[++atas] = n;
    }
}

}

public class stack2 {
    
    
}
