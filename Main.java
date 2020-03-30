import bst.*;

/**
 * implementasi Binary Search Tree
 * 
 * @author Aqil Fiqran Dzi'Ul Haq
 * @version 1.0
 * @since 31-Maret-2020
 */
public class Main {
    public static void main(String a[]) {
        Bst b = new Bst();

        b.add(new Data("namun"));
        b.add(new Data("dan"));
        b.add(new Data("kan"));
        b.add(new Data("oke"));
        b.add(new Data("yee"));

        b.display();
        Node tes = b.search(new Data("tes"));

        if (tes != null)
            System.out.println("Nama yang anda cari ditemukan");
        else
            System.out.println("Nama yang anda cari tidak ditemukan");

        System.out.println("Jumlah nama : " + b.getSize());
    }
}