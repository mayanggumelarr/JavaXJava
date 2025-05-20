import java.util.ArrayList;

/* class Siswa {
    String nama;
    Integer nilai;

    public Siswa(String nama, Integer nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
}

public class RekamHasilBelajar {
    public static void main(String[] args) {
        Siswa[] daftarSiswa = {
            new Siswa("Ayu", 90),
            null,
            new Siswa("Budi", 110),   // nilai tidak valid
            new Siswa("Citra", 75)
        };

        for (int i = 0; i <= daftarSiswa.length; i++) {  // indeks i bisa melebihi panjang array
            try {
                Siswa s = // .... isi bagian ini

                if (s == null) {
                    // .... lemparkan exception yang sesuai jika objek null
                }

                if (s.nilai < 0 || s.nilai > 100) {
                    // .... lemparkan exception yang sesuai jika nilai tidak valid
                }

                System.out.println("Nama: " + s.nama + ", Nilai: " + s.nilai);

            } catch (NullPointerException e) {
                // .... tampilkan pesan error jika objek siswa null
            } catch (IllegalArgumentException e) {
                // .... tampilkan pesan error untuk nilai tidak valid
            } catch (ArrayIndexOutOfBoundsException e) {
                // .... tampilkan pesan saat mengakses indeks di luar batas
            } catch (Exception e) {
                // .... tangani error tak terduga lainnya
            }
        }

        System.out.println("Proses selesai.");
    }
}
 */

 // PEMBENARAN :
 
class Siswa {
    String nama;
    Integer nilai;

    public Siswa(String nama, Integer nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
    
}

public class App {
    public static void main(String[] args) throws Exception {
        Siswa[] daftarSiswa = {
            new Siswa("Ayuk", 90),
            null,
            new Siswa("Budi", 110),
            new Siswa("Citra", 75),
        };

        for (int i = 0; i < daftarSiswa.length; i++) {
            try {
                Siswa s = daftarSiswa[i];

                if (s == null) {
                    throw new IllegalAccessException("Nilai siswa kosong\n");
                }

                if (s.nilai < 0 || s.nilai > 100){
                    throw new IllegalAccessException("Nilai kurang atau lebih dari rentang batas\n");
                }  
                
                System.out.println("Nama: " + s.nama + " , Nilai: " + s.nilai + "\n");
            }

            catch (IllegalAccessException e) {
                System.out.println("Data tidak valid: " + e.getMessage());
            }
        }
    }
}
