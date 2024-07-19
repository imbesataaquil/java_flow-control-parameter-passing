import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int choice=-1;
        do {
            System.out.println("enter the basic salary of the employee : ");
            double basicSalary = sc.nextDouble();
            double HRA;
            double DA;
            double grossSalary;
            if (basicSalary>15000){
                HRA = basicSalary * 0.20;
                DA = basicSalary * 0.60;
            }
            else {
                HRA = 3000;
                DA = basicSalary * 0.70;
            }
            grossSalary = basicSalary + HRA + DA;
            System.out.println("gross salary of the employee is : "+grossSalary);
            System.out.println("if you want to calculate another gross salary then enter -1 ");
            choice=sc.nextInt();
        }
        while (choice==-1);
    }
}
