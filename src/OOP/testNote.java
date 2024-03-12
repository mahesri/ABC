package OOP;

class data{
	String judul;
	String penerbit;
	String thnTerbit;
}

public class testNote{

	static void inisialisasiData(data dataBuku[]){

		
		dataBuku[0] = new data();
		dataBuku[0].judul = "Data Mining Algoritma Klasifikasi";
		dataBuku[0].penerbit = "Graha Ilmu";
		dataBuku[0].thnTerbit = "2019";
		
		dataBuku[1] = new data();
		dataBuku[1].judul = "Kepemimpinan Manajemen Strategik";
		dataBuku[1].penerbit = "Expert";
		dataBuku[1].thnTerbit = "2018";
	}

	static void cetakData(data dataBuku[]){

		for(int i = 0;i <=2-1;i++){
			System.out.print("buku \t");
			System.out.printf(i+1+"\n");
			System.out.println("Judul : "+dataBuku[i].judul);
			System.out.println("Penerbit : "+dataBuku[i].penerbit);
			System.out.println("Tahun terbit : "+dataBuku[i].thnTerbit);
			System.out.println(" ");
		}
	}
	
	public static void main(String[]args){
		
		data dataBuku[] = new data[2];
		inisialisasiData(dataBuku);
		cetakData(dataBuku);
	}
	
}