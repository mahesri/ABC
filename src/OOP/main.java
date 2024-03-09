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

	void setSaldo(int SALDO){
		saldo = SALDO;
		}
        
        String getName(){ // Ketika suatu method mengembalikan sebuah nilai, maka tidak ada "void". Melainkan terdapat sebuah tipe data 'String' yang akan dikembalikan nilainya dengan tipe data String. 
            return(nama);
        }
        
        String getNim(){
            return(nim);
        }
        
        int getSaldo(){
            return(saldo);
        }
	}

public class main {


	public static void main(String[]args){

		nasabah N1 = new nasabah(); // Membuat sebuah objek dengan tipe data "nasabah" bernama N1

		
		// Karena N1 memiliki atribute dari kelas nasabah, maka terdapat nama, nim dan saldo didalam objek N1
		 
		
		N1.setName("MAHESRI"); // mendeklarasikan nama dalam objek N1
		N1.setNim("225411079"); 
		N1.setSaldo(15000000);
                
        System.out.println(N1.getName()+" - "+N1.getNim()+" - "+N1.getSaldo());
		
		}

	}