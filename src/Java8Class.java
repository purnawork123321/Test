import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Stream;

public class Java8Class {
    
    int number;

    //i/p->["abc","cba","bca","pqr","qrp","rqp","lmn","mnl","abcd"]
    // o/p->[["abc","cba","bca"]["pqr","qrp","rqp"]["lmn","mnl"]["abcd"]]

    public static void main(String[] args) {
        int number=0;
        
        Java8Class java8 = new Java8Class();
        int number1 = java8.number;

        switch (number){

            case 1: System.out.println(""+number);
            default: System.out.println(""+number);
        }

        List list =new ArrayList();
        list.add("abc");
        list.add("cba");
        list.add("bca");
        list.add("pqr");
        list.add("qrp");
        list.add("rqp");
        list.add("lmn");
        list.add("mnl");
        list.add("abcd");
        //list.stream().flatMap(s-> Stream.of(s))
        Hashtable ht =new Hashtable();

     //   list.stream().










    }
}
