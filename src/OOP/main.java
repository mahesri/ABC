package OOP;

class nasabah {

	private String nama;
	private String nim;
	private int saldo;

	public void setName(String NAMA){ // 'public' modifier boleh ditulis seperti ini atau tidak seperti dalam method dibawah.
		nama = NAMA;
		}

	void setNim(String NIM){ // 'void' mengartikan bahwa sebuah method tidak mengembalikan sesuatu dan "(String NIM)" adalah definisi formal akan data yang akan dikelola atau dimanipulasi oleh method tersebut.
		nim = NIM;
		}

	void setSaldo(int SALDO){ // Mutator method
		saldo = SALDO;
		}
        
		void setor(int setorNilai){
			saldo += setorNilai;
		}

		void transfer(int saldo, nasabah penerima) {

			if (this.saldo >= saldo) { // Mengecek apakah saldo yang ada di n1 >= saldo yang akan ditransfer

			  this.saldo -= saldo; // Mengkurangkan saldo yang ada di N1 dengan saldo yang akan ditransfer
			  penerima.saldo += saldo; // Proses transfer itu sendiri

			  System.out.println("Transfer berhasil!");
			} else {
			  System.out.println("Saldo tidak cukup!");
			}
		}

        String getName(){ // Ketika suatu method mengembalikan sebuah nilai, maka tidak ada "void". Melainkan terdapat sebuah tipe data 'String' yang akan dikembalikan nilainya dengan tipe data String. 
            return(nama);
        }
        
        String getNim(){ // Aksesor method
            return(nim);
        }
        
        int getSaldo(){
            return(saldo);
        }
	}

public class main {


	public static void main(String[]args){

	// Membuat sebuah objek dengan tipe data "nasabah" bernama N1
	nasabah N1 = new nasabah();
		
		// Karena N1 memiliki atribute dari kelas nasabah, 
		// maka terdapat nama, nim dan saldo didalam objek N1
		 
		
	
    N1.setName("MAHESRI");
    N1.setNim("111");
    N1.setSaldo(15000000);

    nasabah N2 = new nasabah(); // N2 sebagai 
    N2.setName("BUDI");
    N2.setNim("222");
    N2.setSaldo(10000000);

    N1.transfer(500000, N2); // Proses transfer // Variable dan definisi formalnya

	System.out.println(N1.getName() + " - " + N1.getNim() + " - " + N1.getSaldo());
    System.out.println(N2.getName() + " - " + N2.getNim() + " - " + N2.getSaldo());
		
		}

	}