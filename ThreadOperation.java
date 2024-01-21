import java.util.Random;

class Threadoperations{
    public static void main(String[] args)throws InterruptedException{
            Thread t=Thread.currentThread();
            System.out.println(t);
            t.setName("User given");
            System.out.println(t);
            for(int i=1;i<5;i++){
                System.out.println(i);
                Thread.sleep(2000);
            }
           Random r=new Random();
           for(int i=0;i<5;i++)
           System.out.println(r.nextInt(3));


    }
}