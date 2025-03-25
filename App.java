/*
 * MEMBUAT KALKULATOR STATISTIC
 * Dimana terdapat 5 fungsi yaitu:
 * Mean, Median, Modus, Varian, dan Standar Deviasi
 * 
 * Yang kita butuhkan adalah:
 * fungsi masing-masing menu
 * kelas utama untuk eksekusi
 */

 // import
 import java.util.Arrays;
 import java.util.HashMap;
 import java.util.Map;
 import java.util.Scanner;

 // kelas perhitungan statistka
 class KalkuatorStatistic{

    private int[] data;                                               // array untuk menyimpan data, private (encapsulation)
    public KalkuatorStatistic(int[] data){                            // adalah konstruktor        
        this.data = data;       
    }

    // fungsi hitung nilai tengah
    public double nilaiRataRata(){
        double jumlah = 0;                                            // penjumlahan awalnya berisi 0
        for(int x : data){
            jumlah += x;
        }

        return jumlah / data.length;
    }

    //fungsi hitung nilai tengah
    public double nilaiTengah(){
        Arrays.sort(data);
        int tengah = data.length/2;
        if (data.length %2 == 0){
            return (data[tengah - 1] + data[tengah]/2.0);
        } else {
            return data[tengah];
        }
    }

    //fungsi cari nilai sering muncul
    public int nilaiSeringMuncul(){
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : data) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = data[0], maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }

    // fungsi varian
    public double cariVarian(){
        double mean = nilaiRataRata();
        double sum = 0 ;
        for (int x : data){
            sum += Math.pow(x - mean, 2);
        }
        return sum/data.length;
    }

    // fungsi standar deviasi
    public double standarDeviasi(){
        return Math.sqrt(cariVarian());
    }
}
 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input jumlah elemen data: ");
        int jumlahData = scanner.nextInt();
        int[] data = new int[jumlahData];

        System.out.print("input elemen array: ");
        for (int i = 0; i < jumlahData; i++){
            data[i] = scanner.nextInt();
        }

        KalkuatorStatistic kalkulator =  new KalkuatorStatistic(data);
        System.out.println("\nHasil Pencarian Anda: \n");
        System.out.println("Rata-rata: " + String.format("%.2f",kalkulator.nilaiRataRata()));
        System.out.println("Nilai tengah: " + String.format("%.2f",kalkulator.nilaiRataRata()));
        System.out.println("Nilai sering muncul: " + kalkulator.nilaiSeringMuncul());
        System.out.println("Variansi: " + String.format("%.2f",kalkulator.nilaiRataRata()));
        System.out.println("standar deviasi: " + String.format("%.2f",kalkulator.nilaiRataRata()));
        scanner.close();
    }
}
