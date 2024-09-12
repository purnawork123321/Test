import java.util.Arrays;
import java.util.Comparator;

public class SequentialOrder {

    public static void main(String[] args) {

        java.lang.String str = "Java is a programming language";

        java.lang.String[] strs = str.split(" ");

       Arrays.sort(strs, Comparator.comparing(s->s.length()));

      PrintArrayString(strs,strs.length);

    }

    private static void PrintArrayString(String[] s,int n) {

        for(int i=0;i<n;i++){
            System.out.println(s[i]+" ");
        }

    }
}