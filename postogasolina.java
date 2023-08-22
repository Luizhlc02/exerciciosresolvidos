import java.util.Scanner;
public class postogasolina {
    public static void main(String[] args) {
        System.out.println("1.Álcool \n2.Gasolina \n3.Diesel \n4.Fim");
        Scanner sc = new Scanner (System.in); 
        int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
        
        int x = sc.nextInt();
        while(x != 4){
            if (x == 1 ){
                alcool = alcool + 1 ;     
                System.out.println("Álcool: " + alcool );
            }
            else if (x == 2){
                gasolina = gasolina + 1;
                System.out.println("Gasolina: " + gasolina);
            }
            else if (x == 3) {
                diesel = diesel + 1;
                System.out.println("Diesel: " + diesel);
            }
            x = sc.nextInt();
    }
     sc.close();
    }
}
