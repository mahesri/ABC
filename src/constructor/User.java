package constructor;

// Ini merupakan dokumentasi untuk pembelajaran konstruktor

public class User {

    String username; // diubah menjadi public agar String
    String password;

            /* Catatan :
             * Cara membuat sebuah konstruktor adalah dengan menuliskan nama method constructor
             * sama seperti nama kelas.
             *
             * Pastikan memberikan modifier public kepada Constructor, karena ia akan
             * dieksekusi saat pembuatan objek (instance).
             */

   public User (String username, String password){ // 'public User' merupakan konstruktornya || 'String username, String password' adalah 2 parameter yang diterima oleh konstruktor

        this.username = username; // Memasukan parameter username dan password yang kemudian diset kedalam anggota `username` dan 'password' menggunakan kata kunci 'this' ke dalam instance baru berdasarkan variable yang berada di objek.
        this.password = password;
    }

    }

class DemoConstructor{

    public static void main(String[]args){

     User user1 = new User("User1", "111");
     System.out.println("Username : " + user1.username);
     System.out.println("Password : " + user1.password);

     User user2 = new User("user2", "222");
     System.out.println("Nama saya "+user2.username);
     System.out.println("Password saya "+user2.password);

     }
}


/* Catatan :
 * Construktor biasanya digunakan untuk inisialisasi(menyiapkan) data untuk class
 * Untuk melakukan ini, kita harus membuat parameter inputan untuk konstruktor.
 * Contoh ada di baris 18 - 22.
 *
 * Mahesta Cerdas
 *
 * Tambahan Catatan dari chat gpt :
 * Ketika Anda membuat objek MacbookAir menggunakan konstruktor User, konstruktor tersebut akan dieksekusi. Pada bagian this.username = username; dan this.password = password;, this merujuk kepada variabel anggota (instance variables) dari objek yang sedang dibuat.

Jadi, ketika Anda memanggil konstruktor User("Livia", "maindfullness"), nilai "Livia" akan diset sebagai nilai dari username dan nilai "maindfullness" akan diset sebagai nilai dari password. Dengan demikian, MacbookAir.username akan memiliki nilai "Livia" dan MacbookAir.password akan memiliki nilai "maindfullness".

Jadi, konstruktor menginisialisasi variabel anggota objek dengan nilai-nilai yang diberikan saat pembuatan objek.
 */


