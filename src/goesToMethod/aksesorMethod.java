package goesToMethod;

// Akesor method adalah method yang secara umum menmbalikan sebuah nilai, atau dapat mengakses suatu attribute didalam objek umumnya dinotasikan 'get()' dalam sebuah method.
// Aksesor method dalam program ini adalah 'infoB'

class beta{

    public int b;
    public void ubahNilaiB(int B){
        this.b = B;
    }

    public void InfoB(){
        System.out.println(this.b);
        this.ubahNilaiB(44);
        System.out.println(this.b);
    }


}

public class aksesorMethod {
    public static void main(String[]args){
        beta objek1 = new beta();
        objek1.ubahNilaiB(2000);
        objek1.InfoB();
    }
}
