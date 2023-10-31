/**
 * program untuk menghitung luas persegiempat
 * @author lisa
 */
public class PersegiEmpat {
    /**
     * mathos untuk menghitung luas persegiempat dan mengoutputkan nilai panjang dan lebar persegiempat
     *
     *
     */
    private double panjang;
    private  double lebar;
    public PersegiEmpat(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double hitungluas(){
        return panjang * lebar;
    }

    /**
     * menginputkan panjang dan lebar
     * @param args hitungluas
     */

    public static void main(String[] args) {
        PersegiEmpat persegi = new PersegiEmpat(6.0, 4.0);
        double luas = persegi.hitungluas();
        System.out.println("Luas Peregi: " + luas);

    }
}
