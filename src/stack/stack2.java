package stack;

class tumpukan {
   
    private int array[];
    private int atas = -1; // to count index of the entry
    
    tumpukan(int ukuran){
        array = new int[ukuran];
    }

    void PUSH(int n){ // Function to add data // but it is a instance method from the object "tumpukan" 
                      // so the method don't need "static" and also "public"
    if(atas == array.length-1){
        System.out.println("Tumpukan penuh!");
    }else{
        array[++atas] = n;
    }
    }

    void POP(){
    if(atas == -1){ // If the Stack is emty
    System.out.println("Tumpukan kosong!");
    }else{
    array[atas--] = 0;
    }
    }


    void printStack(){
    System.out.print("[ ");
    
    for(int i=0; i<= atas ; i++){
        System.out.print(array[i]+",");
    }
    System.out.println("\b ]");
    }   
    }
    

public class stack2 {
    
    public static void main(String[]args){

        tumpukan s = new tumpukan(3); // 3 Stack size
        s.printStack();
        s.POP();
        s.printStack();
        s.PUSH(10);
        s.printStack();
        s.PUSH(20);
        s.printStack();
        s.POP();
        s.printStack();
        s.PUSH(50);
        s.printStack();
        s.PUSH(40);
        s.printStack();
        s.POP();
        s.printStack();
        s.PUSH(60);
        s.printStack();



    }
    
}
