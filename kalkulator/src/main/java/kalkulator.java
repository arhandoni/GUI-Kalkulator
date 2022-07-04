import java.util.Scanner;
 
public class kalkulator {
 
    public static void main(String[] args) {
        kalkulatorProgram();
    }
 
    public static void kalkulatorProgram(){
        int pilihan = 0;
        int nilai_a = 0;
        int nilai_b = 0;
        double hasil;
        String jawab;
        boolean pilihan_ngulang = true;
        Scanner x = new Scanner(System.in);
 
        System.out.println("===================");
        System.out.println("Program Kalkulator ");
        System.out.println("===================");
        System.out.print("Masukan nilai A : ");
        nilai_a = x.nextInt();
        System.out.print("Masukan Nilai B : ");
        nilai_b = x.nextInt();
        System.out.println("Pilih Operasi Aritmatika");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        System.out.println("5. Perpangkatan");
        System.out.print("Masukan Pilihan : ");
        pilihan = x.nextInt();
        if (pilihan == 1) {
            while (pilihan_ngulang) {
                hasil = nilai_a + nilai_b;
                System.out.println("Hasil nilai A " + nilai_a + " ditambah nilai B " + nilai_b + " menjadi " + hasil);
                System.out.print("Apakah Anda ingin Melanjutkan Ke Program Kalkulator?Y/N ");
                jawab = x.next();
                if(jawab.equalsIgnoreCase("n")) {
                    break;
                }else if(jawab.equalsIgnoreCase("y")){
                    kalkulatorProgram();
                }
            }
        }
    }
}
