
package test.soal.pkg2_var.data.pkg1.java;

import java.util.Scanner;

public class TestSoal2_VarData1Java {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Masukan Nama anda : Jesika48 ");
        System.out.print ("Tulis ya disamping ini:...");
        String masukannama = sc.nextLine();
        System.out.println ("Sistem kami menolak untuk inputan berisi angka");
        System.out.println ("Masukan Nama anda tanpa angka : Jesika"); 
        System.out.print ("Tulis ya disamping ini:...")
        String masukannamatanpaangka = sc.nextLine();
        System.out.println ("Sistem memeriksa data anda valid dengan ketentuan "
                + "kami");
   
    }
    
}
