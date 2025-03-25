package ProjectKilat;

import java.util.Scanner;

public class pinValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code;
        int percobaan = 0;
        final int maxTry = 3;

        do{
            System.out.println("Masukkan pin mu: ");
            code = scanner.nextLine();
            percobaan++;

            if (code.equals("YOURPIN")){
                System.err.println("Berhasil masuk");
                break;
            } else {
                System.err.println("PIN Anda salah");
                System.out.println("Percobaan "+percobaan+ " dari "+maxTry);
            }
        } while(percobaan < maxTry);

        if(!code.equals("YOURPIN")) {
            System.out.println("Kamu kehabisan percobaan! Coba lain kali");
        }
        scanner.close();
    }
}

