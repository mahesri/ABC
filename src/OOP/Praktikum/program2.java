package OOP.Praktikum;

class nasabah
{	//atribut
	 private String	nama;
	 private String	norek;
	 private int saldo;

	//method
	public void ubahNama(String NAMA)
	{	this.nama = NAMA;						}
	public void ubahNorek(String NOREK)
	{	this.norek = NOREK;						}
	public void ubahSaldo(int SALDO)
	{	this.saldo = SALDO;						}

	public String ambilNama()
	{	return (this.nama);
	}
	public String ambilNorek()
	{	return (this.norek);
	}
	public int ambilSaldo()
	{	return (this.saldo);
	}
}

class program2
{	public static void main(String[] args)
	{	nasabah	N1 = new nasabah();
		nasabah N2 = new nasabah();
		nasabah N3 = new nasabah();

		//N1.nama = "Amir";
		//N1.norek = "1111";
		//N1.saldo = 5000;
		N1.ubahNama("Amir");
		N1.ubahNorek("1111");
		N1.ubahSaldo(5000);
        
		//N2.nama  = "Budi";
		//N2.norek = "2222";
		//N2.saldo = 6000;

		N2.ubahNama("Budi");
		N2.ubahNorek("2222");
		N2.ubahSaldo(6000);
        
		//N3.nama  = "Cucuk";
		//N3.norek = "3333";
		//N3.saldo = 7000;

		N3.ubahNama("Cucuk");
		N3.ubahNorek("3333");
		N3.ubahSaldo(7000);

		//System.out.println("Nasabah 1 : " + N1.nama + " - " + N1.norek + " - " + N1.saldo);
		System.out.println("Nasabah 1 : " + N1.ambilNama() + " - " + N1.ambilNorek() + " - " + N1.ambilSaldo()  );
        
		//System.out.println("Nasabah 2 : " + N2.nama + " - " + N2.norek + " - " + N2.saldo);
		System.out.println("Nasabah 2 : " + N2.ambilNama() + " - " + N2.ambilNorek() + " - " + N2.ambilSaldo()  );
        
		//System.out.println("Nasabah 3 : " + N3.nama + " - " + N3.norek + " - " + N3.saldo);
		System.out.println("Nasabah 3 : " + N3.ambilNama() + " - " + N3.ambilNorek() + " - " + N3.ambilSaldo()  );
	}
}