package main;

public class KasirDemo {

    public static void main(String[] args) {
        Barang model = new Barang("GeForce GTC 1060Ti", 3000, 10);
        KasirView view = new KasirView();
        KasirController controller = new KasirController(model, view);

        controller.displayBarang();
        System.out.println("\nTransaksi Pembelian");
        controller.processTransaction();

        System.out.println("\nData Barang Setelah Transaksi:");
        controller.displayBarang();
    }
}

