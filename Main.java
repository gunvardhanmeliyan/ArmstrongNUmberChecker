import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check for Armstrong Number: ");
        int n=sc.nextInt();
        int n2=n;
        int sum=0;
        while(n2!=0){
            int t1=n2%10;
            sum=sum+(t1*t1*t1);
            n2=n2/10;
        }
        if(sum==n)
        System.out.printf("%d is an Armstrong Number",n);
        else
        System.out.printf("%d is not an Armstrong Number",n);
    }
}