import java.io.Console;
import java.util.Scanner;
public class tugasoop3 {
    public static void main(String[] args) {
        Double totalluaslingk = 0d;
        Double totalkelllingk = 0d;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<4;i++){
            System.out.print("masukan jari jari lingkaran ke " + (i+1) + " : ");
            double jari2 = sc.nextDouble();
            totalluaslingk+=new lingkaran(jari2).luas();
            totalkelllingk+=new lingkaran(jari2).keliling();
        }
        System.out.print("\nmasukan Panjang dari persegi panjang : ");
        Double panjang = sc.nextDouble();
        System.out.print("masukan lebar dari persegi panjang : ");
        Double lebar = sc.nextDouble();
        Double luaspers = new persegipanjang(panjang, lebar).luaspers();
        Double kellpers = new persegipanjang(panjang, lebar).kelilingpers();
        System.out.println("\nluas daerah yang di arsir adalah : " + (luaspers-totalluaslingk));
        System.out.println("keliling daerah yang di arsir adalah : " + (kellpers+totalkelllingk));
    }
}