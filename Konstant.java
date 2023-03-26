/* NIM  : INDRIANA TAIB
 * NAMA : INDRIANA TAIB
   KAMIS, 23 MARET 2023
 */
package konstant;
import java.util.Scanner;

public class Konstant {

    
    public static void main(String[] args) {
        
        final float PHI = 3.14f;
float r;


Scanner masukan=new Scanner(System.in);
/* program */ /* baca data */
System.out.print ("Jari-jari lingkaran ="); 
r = masukan.nextFloat();

/* Hitung dan tulis hasil */
System.out.print ("Luas lingkaran = "+ (PHI * r * r)+"\n");
System.out.print ("Akhir program \n");
    }
    
}
