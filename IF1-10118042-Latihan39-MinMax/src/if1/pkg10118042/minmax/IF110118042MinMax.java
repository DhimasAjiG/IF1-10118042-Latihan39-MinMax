
package if1.pkg10118042.minmax;
import java.util.Scanner;
/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk mencari Nilai Terkecil Dan Terbesar
 * 
 */
public class IF110118042MinMax {

    public static void main(String[] args) {
     MinMax nilai = new MinMax();
        String Petugas;
        int jmlMhs;

        Scanner masuk = new Scanner(System.in);

        System.out.println("====Program Nilai Terbesar dan Terkecil Mahasiswa====");
        System.out.print("Masukkan Nama Petugas\t\t\t: ");
        Petugas = masuk.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa\t: ");
        jmlMhs = masuk.nextInt();
        System.out.println();
        
        nilai.input(jmlMhs);
        System.out.println();
        nilai.tampil(jmlMhs);
        
        nilai.tentukanMinMax(jmlMhs);
        
        System.out.printf("%nNilai terbesar adalah : %.1f%n",nilai.max);
        System.out.printf("Nilai terkecil adalah : %.1f%n",nilai.min);
        System.out.printf("%nPetugas\t: %s%n",Petugas);
    }

}
