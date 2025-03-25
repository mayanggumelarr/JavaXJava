class Product{
    String name;
    int stock;
    double price;

    // constructor
    public Product(String name, int stock, double price){
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    // display produk
    public void displayProductInfo(){
        System.out.println("Produk: " + name);
        System.out.println("Stok: " + stock);
        System.out.println("Harga: Rp " + String.format("%.2f", price));
        if (isLowStock()){
            System.out.println("PERINNGATAN: Stok " + name + " Menipis! Segera restok!");
        }
        System.out.println();
    }

    // Update stok
    public void updateStock(int qty){
        System.out.println("Melakukan update stok: ");
        stock += qty;
        System.out.println("Menambahkan " + name + " " + qty + " unit");
        System.out.println("Stok " + name + " baru: " + stock);
        System.out.println();
    }

    // Count total nilai stok produk
    public double calculateTotalValue(){
        System.out.println("Cek total nilai stok produk: ");
        return stock*price;
    }

    // Cek jumlah limit stok
    public boolean isLowStock(){
        return stock < 5;
    }

    
}

public class InventoryApp {
    public static void main(String[] args) {
        System.out.println("\nSISTEM INVENTORI TOKO TANI SAHID JAYA");
        System.out.println("=====================================\n");
        // buat objek baru
        Product product1 = new Product("Sabit", 4, 25000);
        Product product2 = new Product("Cangkul", 15, 45000);

        // display produk
        product1.displayProductInfo();
        product2.displayProductInfo();

        // update stok
        product1.updateStock(2);
        product2.updateStock(12);

        // total nilai stok
        System.out.println("Total nilai stock " + product1.name + " Rp " + String.format("%.2f", product1.calculateTotalValue()));
        System.out.println("Total nilai stock " + product2.name + " Rp " + String.format("%.2f", product2.calculateTotalValue()));
        System.out.println();

        // cek stok
        if (product1.isLowStock()){
            System.out.println("stok " + product1.name + " menipis");
        } else{
            System.out.println("Stok " + product1.name +  " dalam range aman!");
        }

        if (product2.isLowStock()){
            System.out.println("stok " + product2.name + " menipis");
        } else{
            System.out.println("Stok " + product2.name +  " dalam range aman!");
        }
    }
}
