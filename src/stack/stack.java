package stack;

public class stack {
	public static int N = 5;
	public static int atas = -1; // atas adalah variable untuk sebagai acuan diberapa tumpukan 'variable atas' tersebut berada

	public static void PUSH(String tumpukan[], String data){ // 'String tumpukan[], String data' dalam
															 //  fungsi ini adalah "parameter formal" 
	if(atas == N -1){ // Kondisi jika tumpukan penuh		// yang mana merupakan aray of String yang akan diolah oleh fungsi push.
		System.out.println("Maaf, Tumpukan penuh, PUSH "+data+" tidak dapat dilakukan");

	}else{ //Ketika tumpukan tidak penuh!
		atas = atas + 1; // saat ini atas memiliki nilai 0
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
	for(int i = atas;i>= 0; i--){
		System.out.println(tumpukan[i]);
	}
	System.out.println("--akhir tumpukan-");
	System.out.println("");
	}

	public static void main(String[]args){
		String tumpukan[] = new String[10];
		tumpukan[0] = new String();
		tumpukan[1] = new String();
		tumpukan[2] = new String();
		tumpukan[3] = new String();
		tumpukan[4] = new String();
		tumpukan[5] = new String();
		tumpukan[6] = new String();
		tumpukan[7] = new String();
		tumpukan[8] = new String();
		tumpukan[9] = new String();	
		
										// Apa yang bisa aku pahami dari praktik 1 dan fungsi 'PUSH'.
		PUSH (tumpukan, "BUKU A"); // cara berikut merupakan cara untuk memasukan sebuah data kedalam array
		PUSH (tumpukan, "BUKU B"); // yang lebih simpel dan ringkas, efisien, dan mudah dibaca.
		PUSH (tumpukan, "BUKU C"); // 'PUSH' merupakan fungsi untuk memasukan data kedalam array, 
		PUSH (tumpukan, "BUKU D"); PUSH (tumpukan, "BUKU F"); PUSH (tumpukan, "BUKU G"); PUSH (tumpukan, "BUKU H"); POP(tumpukan); // 'tumpukan' merupakan array yang akan dimanipulasi.
		LihatTumpukan(tumpukan);		// 'BUKU A' merupakan data yang akan dimasukan kedalam array tumpukan.
	}

	}

	/*
	 * Praktik 1 Mencoba memasukan 5 buku kedalam tumpukan.
	 * Semua buku berhasil dipush kedalam tumpukan.
	 * Dan didalam praktik pertama 'atas' berada pada index ke-4 dalam array tumpukan.
	 */ 

	 /*
	  * Praktik 2 Ditambahkan lagi 3 buku namun karena sebelumnya sudah memasukan 4 buku
	  * dan sementara jumlah tumpukan dibatasi hanya sampai 5, maka ke buku ke-5 bermasil masuk
	  * yakni 'buku F' dan ke-6 dan ke-7 akan ditolak karena tumpukan sudah penuh. 
	  */


	  /*
	   * Praktik ke-3 merupakan praktik untuk menghapus / POP tumpukan dan dengan ini
	   * Maka ditambahkan fungsi pop kedalam main utama Karena data atas sebelumnya diisi indek ke-4 dan
	   * pada index tersebut diisi oleh BUKU F yang sebelumnya dimasukan di praktik 2 
	   */

