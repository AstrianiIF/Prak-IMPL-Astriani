package counter;

import java.io.*;
import java.util.Vector;

public class ListOfNumbers2 {
    private Vector<Integer> victor;
    private static final int size = 10;

    public ListOfNumbers2() {
        victor = new Vector<>(size);  
        for (int i = 0; i < size; i++) {
            victor.addElement(i);  
        }
        
        this.readList("infile.txt");
        this.writeList();
    }

    public void readList(String fileName) {
        String line = null;
        RandomAccessFile raf = null;
        
        try {
            raf = new RandomAccessFile(fileName, "r"); 
            while ((line = raf.readLine()) != null) { 
                Integer i = Integer.parseInt(line); 
                System.out.println(i); 
                victor.addElement(i);  
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File " + fileName + " tidak ditemukan.");
        } catch (IOException e) {
            System.out.println("Error: Terjadi kesalahan saat membaca file.");
        } finally {
            try {
                if (raf != null) {
                    raf.close(); 
                }
            } catch (IOException e) {
                System.out.println("Error: Gagal menutup file.");
            }
        }
    }

    public void writeList() {
        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter("outfile.txt")); 
            for (int i = 0; i < victor.size(); i++) {
                out.println("Value at: " + i + " = " + victor.elementAt(i));
            }
        } catch (IOException e) {
            System.out.println("Error: Terjadi kesalahan saat menulis ke file.");
        } finally {
            if (out != null) {
                out.close();  
            } else {
                System.out.println("Error: PrintWriter tidak terbuka.");
            }
        }
    }

    public static void main(String[] args) {
        new ListOfNumbers2(); 
    }
}
