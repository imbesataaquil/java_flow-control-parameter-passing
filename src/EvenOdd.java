import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int even=0;
        int odd=0;
        int number;
        System.out.println("enter number to odd and even number or enter -1 to stop : ");
        while (true){
            System.out.println("enter the number : ");
            number = sc.nextInt();
            if (number==-1){
                break;
            }
            else if (number%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("total even number : "+even);
        System.out.println("total odd number : "+odd);
    }
}
