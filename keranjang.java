import java.util.Scanner;
import java.io.Console;
public class keranjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("berapa banyak barang yang ingin anda masukan : ");
        int jmlbarang = sc.nextInt();
        daftarbelanja []listbarang = new daftarbelanja[jmlbarang];
        String []listnama = new String[jmlbarang];
        int totalharga = 0;
        for(int i = 0; i<listnama.length; i++){
            System.out.println("barang ke "+(i+1)+" : ");
            System.out.print("nama barang : ");
            String namabarang = sc.next();
            System.out.print("merk barang : ");
            String merekbarang = sc.next();
            System.out.print("berat barang : ");
            int beratbarang = sc.nextInt();
            System.out.print("harga barang : ");
            int hargabarang = sc.nextInt();
            listbarang[i] = new daftarbelanja(namabarang, merekbarang,  beratbarang, hargabarang);
            listnama[i] = listbarang[i].nama;
            totalharga+=listbarang[i].harga;
            System.out.println(totalharga);
        }
        System.out.println("\n berikut list barang yang anda beli : ");
        for(int i = 0; i<listnama.length;i++){
            System.out.println((i+1)+"."+listnama[i]);
        }System.out.println("total biaya yang harus di bayar adalah Rp."+ totalharga);
    }
}