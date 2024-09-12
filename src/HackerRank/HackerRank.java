package HackerRank;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRank {
    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        String userStr = (String) sc.next();

        if(null != userStr &&
                (1<= userStr.length()) && userStr.length()<= 100){
            String username = userStr;
            String regex = "^[A-Za-z]\\w{7,31}$";

           Boolean isVal = regex.matches(username);
           
            if(isVal) {
                System.out.println("Valid");
            }else {
                System.out.println("Invalid");
            }
        }

        /*int N=new Integer(args[0]).intValue();
        for (int i = 1; i <= 10; i++) {
            System.out.println(N+" * "+i+" ="+N*i);
        }*/

       /* int[] seq = new int[10];
        for (int i : seq) {
            System.out.println(N+" * "+i+" ="+N*i);
        }*/

/*
        Integer[] integers= {1,2,3,4,5,6,7,8,9,10};
     List<Integer> seq =   Arrays.asList(integers);
        ListIterator itr = seq.listIterator(10);
        while (itr.hasPrevious()) {
            Integer inte = (Integer) itr.previous();
            System.out.println(N+" * "+inte+" ="+N*inte);
        }*/
        //seq.forEach(i ->System.out.println(N+" * "+i+" ="+N*i));

       /* Scanner sc=new Scanner(System.in);

        String A=sc.next();
        *//* Enter your code here. Print output to STDOUT. *//*
        if (A.length()<50){
            int j=0;
            char[] ch = new char[A.length()];
            for (int i = A.length()-1; i > -1; i--) {
                ch[j] = A.charAt(i);
                j++;
            }
            String B= new String(ch);
            if (A.equalsIgnoreCase(B)){
                System.out.print("Yes");
            }
        }*/

    }
  /*  static int B, H;
    static boolean flag = true;
    static {

        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        try {
            if (B <= 0 || H <= 0)
                throw new Exception("Breadth and height must be positive");
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }

    }*/
}
