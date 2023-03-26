/* NIM  : 1302010231
 * NAMA : INDRIANA TAIB
   SABTU, 25 MARET 2023
 */
package if3;

import java.util.Scanner;
public class If3 {

    
    public static void main(String[] args) {
        
     int a;
Scanner masukan=new Scanner(System.in);
/* Program */
System.out.println ("Contoh IF tiga kasus \n"); 
System.out.println ("Ketikkan suatu nilai integer :"); 
a=masukan.nextInt();
if (a > 4){
System.out.println ("Nilai a positif "+ a);
}else if (a == 4){
System.out.println ("Nilai Nol "+ a);
}else if (a == -4) {
System.out.println ("Nilai a negatif "+ a);   
    }
    }
    
}
