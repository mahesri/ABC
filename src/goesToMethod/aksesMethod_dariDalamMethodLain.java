package goesToMethod;

class persegiPanjang {
    public String namaPersegiPanjang;
    public int panjang;
    public int lebar;
}

public void ubahNilai(String NAMAPERSEGIPANJANG, int PANJANG, int LEBAR){

this.namaPersegiPanjang = NAMAPERSEGIPANJANG;
this.panjang = PANJANG;
this.lebar = LEBAR;

}

public int hitungKeliling(){
    int keliling;
    keliling = 2 * (this.panjang + this.lebar);
    return(keliling);
}

public int hitungLuas(){
    int luas;
    luas = this.panjang * this.lebar;
    return(luas);
}



public class aksesMethod_dariDalamMethodLain {
    


}
