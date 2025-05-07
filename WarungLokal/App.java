interface FoodOrder {
    void order(String customerName);
    void deliver(String customerName);
    
}

class WartegOrder implements FoodOrder {
    @Override
    public void order(String customerName) {
        System.out.println(customerName + " memesan nasi uduk dengan ayam goreng dari Warteg.");
    }

    public void deliver(String customerName) {
        System.out.println("Pesanan Warteg untuk " + customerName + " sedang dikirim.\n");
    }
}

class BurjoOrder implements FoodOrder {
    @Override
    public void order(String customerName) {
        System.out.println(customerName + " memesan nasi goreng spesial dari Burjo.");
    }

    public void deliver(String customerName) {
        System.out.println("Pesanan Burjo untuk " + customerName + " dalam perjalanan.\n");
    }
}

class SateResto implements FoodOrder {
    @Override
    public void order(String customerName) {
        System.out.println(customerName + " memesan sate ayam dari Sate Resto.");
    }

    public void deliver(String customerName) {
        System.out.println("Pesanan Sate Resto untuk " + customerName + " telah diterima.\n");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        FoodOrder warteg = new WartegOrder();
        FoodOrder burjo = new BurjoOrder();
        FoodOrder sate = new SateResto();

        // pemesanan pelanggan
        warteg.order("BangChan");
        warteg.deliver("BangChan");

        burjo.order("Hyunjin");
        burjo.deliver("Hyunjin");

        sate.order("Felix");
        sate.deliver("Felix");
    }
}
