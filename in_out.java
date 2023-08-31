import java.util.Scanner;
public class in_out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i <=n;){
            if(10 < n && n < 20){
                System.out.println("In");
            }
            else {
                System.out.println("Out");
            }
            n = sc.nextInt();
        }
        sc.close();
    }
}
