import java.util.Scanner;

public class Toko {
    public static void main(String[] args) {
        double angka;
        Scanner s = new Scanner (System.in);
        System.out.println("Masukkan Jumlah Makanan:  ");
    
        int jumlahMakanan = s.nextInt();
        String namaMakanan[] = new String[jumlahMakanan];

        for (int i = 0; i< namaMakanan.length; i++) {
            System.out.println("Inputkan Nama Makanan "+(i+1));
            namaMakanan[i]=s.next();
        }

        System.out.println("--------Daftar Nama-------");
        for (int i = 0; i < namaMakanan.length; i++) {
            System.out.println(namaMakanan[i]);
        }

        for (int i = 0; i< namaMakanan.length; i++) {
            System.out.println("Inputkan Harga Makanan "+(i+1));
            namaMakanan[i]=s.next();
        }

        System.out.println("--------Jumlah harga-------");
        for (int i = 0; i < namaMakanan.length; i++) {
            System.out.println(namaMakanan[i]);
        }

        
    }
}
