package linkedlist;

class tipePointer { // tipePointer merupakan heab/obyek
	String teks; // "String teks" dan "int Angka" merupakan
	int Angka;  // attribute dari obyek tipePointer

	}

	class Mpraktik1 {

@SuppressWarnings("unused")
public static void main(String[]args){

		tipePointer P; // Deklarasi sebuah pointer/instance
		P = new tipePointer(); // "new tipePointer()" merupakan pembuatan heap didalam memori,
								// yang mana heap tersebut secara teknis bertipe data tipePointer yang memiliki tipe data int bernama angka dan string bernama teks
								// "P =" merupakan penunjuk untuk mengakses heap tersebut.
		if(P== null){
			System.out.println("Pinter P mengarah ke Null");
		}else{
			System.out.println("Pointer P mengarah ke tempat lain");
		}

		}
		}