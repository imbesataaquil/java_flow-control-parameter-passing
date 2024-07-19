import java.util.Scanner;

public class ArmstrongNumber {
   public static boolean isArmstrong(int number){//method to check armstrong number
        int real=number;
        int result=0;
        int n=0;

        while (real!=0){
            real=real/10;
            n++;
        }
        real=number;
        while (real!=0){
            int digit=real%10;
            int pow=1;
            for (int i=0;i<n;i++){
                pow=pow*digit;
            }
            result=result+pow;
            real=real/10;
        }
        return result==number;
    }

    public static void printArmstrongNumber(int start,int end){
    for (int i = start;i<=end;i++){
        if (isArmstrong(i)){
            System.out.println(i);
        }
    }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the starting range: ");
        int start=sc.nextInt();
        System.out.println("enter the ending range: ");
        int end=sc.nextInt();
        System.out.println("Armstrong number between " + start + " and " + end + ":");
        printArmstrongNumber(start,end);
    }
}
