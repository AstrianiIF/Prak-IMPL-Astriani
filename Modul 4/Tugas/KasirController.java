package main;

public class KasirController {
    private Barang model;
    private KasirView view;

    public KasirController(Barang model, KasirView view) {
        this.model = model;
        this.view = view;
    }

    public void displayBarang() {
        view.printBarangDetails(model.getNama(), model.getHarga(), model.getStok());
    }

    public void processTransaction() {
        int qty = view.inputJumlahBeli();
        int totalBayar = qty * model.getHarga();

        int stokBaru = model.getStok() - qty;
        model.setStok(stokBaru);

        view.printTotalBayar(totalBayar);
        view.printUpdatedStock(model.getStok());
    }
}

