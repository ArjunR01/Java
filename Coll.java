import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
public class Coll{
    /**
     * @param args
     */
    public static void main(String[] args){
        Comparator<String> o1=new Comparator<String>(){
            public int compare(String a,String b){
                if(a.length()>b.length()){
                    return 1;
                }
                else{
                    return -1;
                }

            }
        };
        List<String> o=new ArrayList<String>();
        o.add("Arjun");
        o.add("Mahesh");
        o.add("Sai");
        o.add("Siddartha");
        Collections.sort(o,o1);
        System.out.println(o);
    }
}
