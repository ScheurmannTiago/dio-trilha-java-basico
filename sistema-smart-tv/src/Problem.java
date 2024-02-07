import java.util.Scanner;
import java.util.Locale;

public class Problem {
   public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

 //TODO: Complete os espaços em branco com uma possível solução para o desafio 
        media = ((3.5* A) + (7.5* B))/11; 

        System.out.printf("MEDIA = %.5f", media);

        sc.close();
    
    }
    
}
