import java.util.Scanner;

public class operadora{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int minutos_cosumidos = sc.nextInt();

        double conta = 50.0;
    if (minutos_cosumidos > 100){
        conta = conta + (minutos_cosumidos - 100) * 2;
   }

    System.out.printf("Valor da conta = R$ %.2f%n",conta);

    sc.close();
}
}