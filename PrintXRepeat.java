/* NIM  : 13020210231
   NAMA : INDRIANA TAIB
   SABTU, 25 MARET 2023
 */
package printxrepeat;

import java.util.Scanner;
public class PrintXRepeat {

   
    public static void main(String[] args) {
        
   int Sum;
int x;
Scanner masukan=new Scanner(System.in);
/* Program */
System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
x = masukan.nextInt(); /* First Elmt */
if (x == 999){
System.out.print("Kasus kosong \n");
}else {  /* MInimal ada satu data yang dijumlahkan
*/
Sum = 0; /* Inisialisasi; invariant !! */
do{
Sum = Sum + x; /* Proses */
System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
x = masukan.nextInt(); /* Next Elmt */
} while (x != 999); /* Kondisi pengulangan */
System.out.println ("Hasil penjumlahan = "+Sum);
/* Terminasi */     
    }
    
}
}
    
