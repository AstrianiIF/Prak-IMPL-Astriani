package main;

import java.util.Scanner;

public class KasirView {
    private Scanner scanner = new Scanner(System.in);

    public void printBarangDetails(String nama, int harga, int stok) {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga Barang: " + harga);
        System.out.println("Stok Barang: " + stok);
    }

    public int inputJumlahBeli() {
        System.out.print("Jumlah Barang yang ingin dibeli: ");
        return scanner.nextInt();
    }

    public void printTotalBayar(int total) {
        System.out.println("Jumlah Bayar: " + total);
    }

    public void printUpdatedStock(int stok) {
        System.out.println("Stok Barang Tersisa: " + stok);
    }
}

