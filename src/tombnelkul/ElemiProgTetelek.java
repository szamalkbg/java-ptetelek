package tombnelkul;

import java.time.Clock;
import java.util.Scanner;


public class ElemiProgTetelek {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        //ÖSSZEGZÉS TÉTELE
        int n = -1;
        while(n < 0){
            System.out.print("Kérek egy számot: ");
            n = sc.nextInt();
        }
        
        int ossz = 0;
        for (int i = 0; i < n+1; i++) {
            ossz += i;
        }
        System.out.printf("Az első %d szám összege: %d\n",n,ossz );
        
        //MEGSZÁMLÁLÁS TÉTELE
        int db = 0;
        for (int i = 10; i <= 100; i++) {
            if(i % 2 == 0){
                db++;
            }
        }
        System.out.printf("Kétjegyű párosak száma: %d\n",db);
        System.out.println("NEM VAGYOK ROBOT");
        
        
        //MINIMUMKIVÁLASZTÁS TÉTELE
        final int VEGE = 0;
        db = 0;
        int min = Integer.MAX_VALUE;
        System.out.print("Kérek egy számot: ");
        int szam;
        System.out.print("0-ra kilép a program: ");
        while((szam = sc.nextInt())!= VEGE){
            if(szam < min){
                min = szam;
            }
          db++;
    }
        System.out.printf("%d számból a legkissebb: %d\n",db,min);
        
        
        // ELDÖNTÉS TÉTELE
        System.out.print("szám: ");
        n = sc.nextInt();
        boolean prim;
        
        if (n < 2){
           prim = false; 
        }else{
            int i = 2;
            while(i <= Math.sqrt(n) && n % i != 0){
                i++;
            }
            prim = i > Math.sqrt(n);
        }
        if(prim == true){
            System.out.println("Prim");
        }else{
            System.out.println("Nem prim");
        }
    }
    
}