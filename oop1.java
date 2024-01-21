class Details{
    Details(String name,int roll){
        name=name;
        roll=roll;
        System.out.println("Constructor has "+name+roll);
}
}

public class oop1{
    public static void main(String[] args){
        Details o=new Details("Arjun",22);
    }
}