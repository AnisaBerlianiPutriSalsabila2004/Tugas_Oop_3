public class persegipanjang {
    double panjang, lebar;

    public persegipanjang(double panjang, Double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public Double luaspers(){
        return panjang*lebar;
    }
    public Double kelilingpers(){
        return 2*(panjang+lebar);
    }
}
