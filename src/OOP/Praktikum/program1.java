package OOP.Praktikum;

class nasabah
{	//atribut
	String	nama;
	String	norek;
	int		saldo;

	//method
	//
	//
}

class program1
{	public static void main(String[] args)
	{
		int		a;
		nasabah	N1 = new nasabah();
		nasabah N2 = new nasabah();
		nasabah N3 = new nasabah();

		a = 5;
		N1.nama = "Amir";
		N1.norek = "1111";
		N1.saldo = 5000;

		N2.nama  = "Budi";
		N2.norek = "2222";
		N2.saldo = 6000;

		N3.nama  = "Cucuk";
		N3.norek = "3333";
		N3.saldo = 7000;

		System.out.println("nilai a = " + a);
		System.out.println("Nasabah 1 : " + N1.nama + " - " + N1.norek + " - " + N1.saldo);
		System.out.println("Nasabah 2 : " + N2.nama + " - " + N2.norek + " - " + N2.saldo);
		System.out.println("Nasabah 3 : " + N3.nama + " - " + N3.norek + " - " + N3.saldo);
	}
}