package realL.EveryMethod;

public class sortDataBubble {

public static void tukarNilai(simpul x, simpul y){

	simpul sementara = new simpul();

	sementara.nama = x.nama;
	sementara.alamat = x.alamat;
	sementara.umur = x.umur;
	sementara.jekel = x.jekel;
	sementara.ipk = x.ipk;

	x.nama = y.nama;
	x.alamat = y.alamat;
	x.umur = y.umur;
	x.jekel = y.jekel;
	x.ipk = y.ipk;

	y.nama = sementara.nama;
	y.alamat = sementara.alamat;
	y.umur = sementara.umur;
	y.jekel = sementara.jekel;
	y.ipk = sementara.ipk;
	}

//-------------------------------------------------
// bisa untuk single LL dan double LL
//-------------------------------------------------

public static void mengurutkanDataBubble_TeknikTukarNilai(){



}


}
