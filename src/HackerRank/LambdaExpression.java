package HackerRank;

import java.io.*;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    PerformOperationImpl performOperation= new PerformOperationImpl();
    public PerformOperation isOdd(){
        performOperation.isOdd = true;
        return performOperation;
    }
    public PerformOperation isPrime(){
        performOperation.isPrime = true;
        return performOperation;
    }
    public PerformOperation isPalindrome(){
        performOperation.isPalindrome = true;
        return performOperation;
    }

}

class PerformOperationImpl implements PerformOperation{
    public boolean isOdd =false;
    public boolean isPrime,isPalindrome =false;
    @Override
    public boolean check(int a) {
        if(isOdd) {
            Predicate<Integer> lesserthan = (j -> j % 2 != 0);
            return lesserthan.test(a);
        }
        if(isPrime) {
            return Stream.of(2,3,4,5,6,7,8,9).filter(n ->a%n == 0).count()<0;            
        }
        if(isPalindrome) {
            StringBuilder sb=new StringBuilder(""+a);
            int b = Integer.valueOf(sb.reverse().toString());
            BiPredicate<Integer,Integer> bipredicate = (i,j) -> i.equals(j);
            return bipredicate.test(a,b);
        }

        return false;
    }
}
// Write your code here

public class LambdaExpression {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}

