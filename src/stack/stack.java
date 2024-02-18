package stack;

public class stack {
	public static int N = 5;
	public static int atas = -1; // atas adalah variable untuk sebagai acuan diberapa tumpukan 'variable atas' tersebut berada

	public static void PUSH(String tumpukan[], String data){ // 'String tumpukan[], String data' dalam
															 //  fungsi ini adalah "parameter formal" 
	if(atas == N -1){ // Kondisi jika tumpukan penuh		// yang mana merupakan aray of String yang akan diolah oleh fungsi push.
		System.out.println("Maaf, Tumpukan penuh, PUSH "+data+" tidak dapat dilakukan");

	}else{ //Ketika tumpukan tidak penuh!
		atas = atas + 1;
		tumpukan[atas] = data;
		System.out.println("PUSH " + data + " berhasil..");
	}
}

public static void POP (String tumpukan[]){ // POP Fungsi untuk menghaspus
	
	String hasil;
	if(atas < 0){ //Jika tumpukan kosong
		hasil = "Data = 0, POP tidak dapat dilakukan";
	}else{ // Jika tumpukan tidak kosong
		hasil = tumpukan[atas];
		atas = atas -1; // Menghapus data yang berada diatas
	}
	return;
	
}

public static void LihatTumpukan(String tumpukan[]){
	System.out.println(" ");
	System.out.println("--TUMPUKAN--");
	for(int i = atas;i>= 0-1; i--){
		System.out.println(tumpukan[i]);
	}
	System.out.println("--akhir tumpukan-");
	System.out.println("");
	}

	public static void main(String[]args){
		String tumpukan[] = new String[10];
	}

	}