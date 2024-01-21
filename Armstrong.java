import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){

            Scanner o=new Scanner(System.in);
            System.out.print("Enter a number=");
            int a=o.nextInt();
            // int temp,sum=0,count=a.length();
            // int num=Integer.parseInt(a);
            // int number=num;
            // for(int i=0;i<count;i++){
            //     temp=num%10;
            //     sum+=Math.pow(temp,count);
            //     num/=10;
            // }
            // if(number==sum){
            //     System.out.println("Armstrong");
            // }
            // else{
            //     System.out.println("Not Armstrong");
            // }

            int temp,num,count=0,random=10,r=1,sum=0;
            num=a;
            while(r!=0){
                r=a/random;
                count++;
                random*=10;
            }
            for(int i=0;i<count;i++){
                temp=a%10;
                sum+=Math.pow(temp,count);
                a/=10;
            }
            if(sum==num){
                System.out.println("Armstrong number");
            }
            else{
                System.out.println("Not Armstrong Number");
            }
    }
    
}
