package JavaNewPackage;

import java.util.Scanner;

public class FunctionSample {
    public static void main(String[] args)
    {
        System.out.println("enter 2 numbers: ");
        Scanner sc=new Scanner(System.in);

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int result=sum(num1, num2);
        System.out.println("result is "+result);
    } 

    static int sum(int num1,int num2)
    {
        int s=num1+num2;
        return s;
    }
}
