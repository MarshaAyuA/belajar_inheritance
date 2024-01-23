

/**
 *
 * @author ARMELIOTA
 */
public class Belajar_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BangunDatar bangunDatar = new BangunDatar();
        
        Persegi persegi = new Persegi ();
        persegi.sisi = 2;
        
        Lingkaran lingkaran = new Lingkaran ();
        lingkaran.r = 22;
        
        PersegiPanjang PersegiPanjang = new PersegiPanjang ();
        PersegiPanjang.panjang = 8;
        PersegiPanjang.lebar = 4;
        
        Segitiga segitiga= new Segitiga ();
        segitiga.alas = 3;
        segitiga.tinggi = 6;
        
        bangunDatar.luas();
        bangunDatar.keliling();
        
        lingkaran.luas ();
        lingkaran.keliling();
        
        PersegiPanjang.luas();
        PersegiPanjang.keliling();
        
        segitiga.luas();
        segitiga.keliling();
    }
    
}
