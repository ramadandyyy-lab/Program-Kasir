# Program-Kasir
  package Belajar1;
import java.util.Scanner;
public class beras {
public static void main(String[] args) {
    Double totalsebelumdiskon, diskon, totalsetelahdiskon, bayar, kembalian;
    Scanner input = new Scanner(System.in);
    System.out.println("Harga /kg :Rp.14000");
    System.out.print("Masukkan jumlah beras yang dibeli (kg): ");
    int jumlah = input.nextInt();
    System.out.println("diskon 5%: ");
    totalsebelumdiskon = 14000.0 * jumlah;
    diskon = totalsebelumdiskon * 0.05;
    totalsetelahdiskon = totalsebelumdiskon - diskon;
    System.out.println("Total sebelum diskon: Rp." + totalsebelumdiskon);
    System.out.println("Total setelah diskon: Rp." + totalsetelahdiskon);
    System.out.println("Diskon: Rp." + diskon);
    System.out.print("Masukkan uang yang dibayarkan: Rp.");
    bayar = input.nextDouble();
    System.out.println("Total yang dibayar: Rp." + bayar);
    System.out.println("bayar: Rp." + bayar);
    kembalian = bayar - totalsetelahdiskon;
    System.out.println("Kembalian: Rp." + kembalian);
    input.close();
    }

}
