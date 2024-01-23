

/**
 *
 * @author ARMELIOTA
 */
public class Persegi extends BangunDatar {
    double sisi;
    
    
    @Override
            
    float luas(){double hasil = sisi * sisi;
        System.out.println("Luas persegi"
                + "= " + hasil);
        return (float) hasil;
    }
    
    @Override
    float keliling(){
        double hasil = 4*sisi;
        System.out.println("Keliling persegi"
                       + "= " + hasil);
        return (float) hasil;
    }
}
