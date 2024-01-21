import java.util.Scanner;


class sample{
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        try{
        System.out.print("Enter your age=");
        int age=s.nextInt();
        if(age<18){
        throw new Except();
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
}

}

class Except extends Exception{
    Except(String s){
            System.out.println(s);
    }
    Except(){
        System.out.print("Something went wrong ! :Age Error Enter valid age!");

}}

