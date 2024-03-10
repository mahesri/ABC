package realL.EveryMethod;
// Fungsi pengurutan isi elemen heap / elemen simpul

public class sortDataBubble {

public static void tukarNilai(simpul x, simpul y){

	simpul sementara = new simpul();

	sementara.nama = x.nama;
	sementara.alamat = x.alamat;
	sementara.umur = x.umur;
	sementara.jekel = x.jekel;
	sementara.hobi[0] = x.hobi[0];
	sementara.hobi[1] = x.hobi[1];
	sementara.hobi[2] = x.hobi[2];
	sementara.ipk = x.ipk;

	x.nama = y.nama;
	x.alamat = y.alamat;
	x.umur = y.umur;
	x.jekel = y.jekel;
	x.hobi[0] = y.hobi[0];
	x.hobi[1] = y.hobi[1];
	x.hobi[2] = y.hobi[2];
	x.ipk = y.ipk;

	y.nama = sementara.nama;
	y.alamat = sementara.alamat;
	y.umur = sementara.umur;
	y.jekel = sementara.jekel;
	y.hobi[0] = sementara.hobi[0];
	y.hobi[1] = sementara.hobi[1];
	y.hobi[2] = sementara.hobi[2];
	y.ipk = sementara.ipk;

	}

//-------------------------------------------------
// bisa untuk single LL dan double LL
//-------------------------------------------------

public static void mengurutkanDataBubble_TeknikTukarNilai(){

int N = hitungJumlahSimpul();
simpul A = null;
simpul B = null;
simpul berhenti = akhir.kanan;

System.out.println("Banyaknya simpul = "+ hitungJumlahSimpul());
for(int i){

	A = awal;
	B = awal.kanan;
	int nomor = 1;
while(B != berhenti){
	if(A.nama.compareTo(B.nama)>0){
		// Tukarkan elemen dari simpul A dan elemen dari simpul B
		tukarNilai(A,B);
	}
	A = A.kanan;
	B = B.kanan;
	nomor++;
}
berhenti = A;
}
System.out.println("===PROSES PENGURUTAN BUBBLE SELESAI======");

}

}
