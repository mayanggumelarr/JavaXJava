package ProductTask;

public class Main {
    public static void main(String[] args) {

        Product parentObj = new Product();
        Makanan makanan = new Makanan();
        Elektronik elektronik = new Elektronik();
        Pakaian pakaian = new Pakaian();

        // Produk Makanan
        System.out.println("\nProduct Makanan : \n=============================");
        parentObj.kodeProduct = "M1005";
        parentObj.nameProduct = "Pie Susu";        
        parentObj.priceProduct = 5000;
        makanan.tglExpired = "10/8/2025";
        makanan.freezerNeed = false;
        parentObj.display_Product();
        makanan.display_Product_makanan();

        // Produk Elektronik
        System.out.println("\nProduct Elektronik : \n=============================");
        parentObj.kodeProduct = "E3001";
        parentObj.nameProduct = "Samsung UHD Smart TV";
        parentObj.priceProduct = 10500000;
        elektronik.guarantee = 12;
        elektronik.daya = 350;
        parentObj.display_Product();
        elektronik.display_Product_elektronik();

        // Produk Pakaian;
        System.out.println("\nProduct Pakaian : \n=============================");
        parentObj.kodeProduct = "P0008";
        parentObj.nameProduct = "Turtleneck Sweater";
        parentObj.priceProduct = 150000;
        pakaian.size = "XL";
        pakaian.bahan = "Woll";
        parentObj.display_Product();
        pakaian.display_Product_pakaian();
    }
}

class Product{
    String kodeProduct;
    String nameProduct;
    int priceProduct;

    void display_Product(){
        System.out.println("Kode Produk = " + kodeProduct);
        System.out.println("Nama Produk = " + nameProduct);
        System.out.println("Harga Produk = Rp " + priceProduct);
    }
}

class Makanan extends Product{
    String tglExpired;
    boolean freezerNeed;

    void display_Product_makanan(){
        System.out.println("Tanggal Kadaluwarsa = " + tglExpired);
        System.out.println("Butuh Pendingin (True/False) = " + freezerNeed);
    }
}

class Elektronik extends Product{
    int guarantee;
    int daya;

    void display_Product_elektronik(){
        System.out.println("Garansi Produk = " + guarantee + " bulan");
        System.out.println("Besar Daya = " + daya + " watt");
    }
}

class Pakaian extends Product{
    String size;
    String bahan;

    void display_Product_pakaian(){
        System.out.println("Ukuran Produk (S/M/L/XL) = " + size);
        System.out.println("Bahan Produk = " + bahan);
    }
}
