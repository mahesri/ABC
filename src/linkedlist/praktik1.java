package linkedlist;

class tipePointer { // tipePointer merupakan heab/obyek
	String teks; // "String teks" dan "int Angka" merupakan
	int Angka;  // attribute dari obyek tipePointer

	}

	class praktik1 {

@SuppressWarnings("unused")
public static void main(String[]args){

		tipePointer P; // Deklarasi sebuah pointer/instance
		P = null; // "new tipePointer()" merupakan pembuatan heap didalam memori,
								// yang mana heap tersebut secara teknis bertipe data tipePointer
								// "P =" merupakan penunjuk untuk mengakses heap tersebut.
		if(P== null){
			System.out.println("Pinter P mengarah ke Null");
		}else{
			System.out.println("Pointer P mengarahke tempat lain");
		}

		}
		}