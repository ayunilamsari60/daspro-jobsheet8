
import java.util.Scanner;

public class Tugas305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalBarangSemuaToko = 0;
            int barangTerbanyak = -1;
            int tokoTerbaik = 0;

            for (int toko = 1; toko <= jumlahToko; toko++) {
                System.out.print("Masukkan jumlah pelanggan toko " + toko + ": ");
                int jumlahPelanggan = sc.nextInt();

                while (jumlahPelanggan < 0) {
                    System.out.print("Jumlah pelanggan tidak boleh negatif. Masukkan ulang: ");
                    jumlahPelanggan = sc.nextInt();
                }

                int totalBarangToko = 0;

                for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                    System.out.print("Jumlah barang pelanggan " + pelanggan + " di toko " + toko + ": ");
                    int jumlahBarang = sc.nextInt();

                    while (jumlahBarang < 0) {
                        System.out.print("Jumlah barang tidak boleh negatif. Masukkan ulang: ");
                        jumlahBarang = sc.nextInt();
                    }

                    totalBarangToko += jumlahBarang;
                }

                System.out.println("Toko " + toko + " - pelanggan: "
                        + jumlahPelanggan + ", total barang: " + totalBarangToko);

                totalBarangSemuaToko += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbaik = toko;
                }
            }

            System.out.println("Total barang seluruh toko: " + totalBarangSemuaToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        }

        sc.close();
    }
}
