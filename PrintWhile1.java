/* NIM  : 13020210231
 * NAMA : INDRIANA TAIB
   SABTU, 25 MARET 2023
 */
package printwhile1;
import java.util.Scanner;
public class PrintWhile1 {

    
    public static void main(String[] args) {
        
        int N;
int i = 1;
Scanner masukan=new Scanner(System.in);
/* Program */
System.out.print ("Nilai N >0 = "); 
N = masukan.nextInt();
System.out.print ("Print i dengan WHILE (ringkas): \n");
while (i <= N){
System.out.println (i++);
} 
    }
    
}
