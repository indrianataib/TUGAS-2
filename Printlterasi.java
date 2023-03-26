/* NIM  : 13020210231
 * NAMA : INDRIANA TAIB
   JUM'AT, 24 MARET 2023
 */
package printlterasi;
import java.util.Scanner;

public class Printlterasi {

    public static void main(String[] args) {
        
    int N;
int i;
Scanner masukan=new Scanner(System.in);
/* Program */
System.out.print ("Nilai N >0 = "); /* Inisialisasi*/
N = masukan.nextInt();
i = 1; /* First Elmt */
System.out.print ("Print i dengan ITERATE : \n");
for (;;){
System.out.println(i); /* Proses */
if (i == N)
/* Kondisi Berhenti */ break;
else {
i++;
}
} 
        
    }
    
}
