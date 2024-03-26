package goesToMethod;

class User{
    String nama;
    int umur;

    public String ngisi_data(String NAMA, int UMUR){
        if(UMUR >= 17){
            nama = NAMA;
            umur = UMUR;
            return("Anda diterima!");
        }else{
            return("Anda ditolak!");
        }
    }
}

public class modulTipe1 {
    
public static void main(String[]args){
    
    String tangkapPesan;
    
    User user1 = new User();
    tangkapPesan = user1.ngisi_data("Yadi", 17);
    System.out.println(tangkapPesan);


}

}
