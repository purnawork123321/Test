package HackerRank;

import java.util.Scanner;

 class MyCalculator {

   /* public static void main(String[] args) throws Exception {
        int N=new Integer(args[0]).intValue();
        int p=new Integer(args[1]).intValue();
        if(N<0 || p<0 ){
            throw new Exception("java.lang.Exception: n or p should not be negative.");
        } else if(N ==0 || p==0){
            throw new Exception("java.lang.Exception: n and p should not be zero.");
        } else {
            int powerValofN= 1;
            for (int i=1;i<=p;i++) {
                powerValofN=powerValofN*N;
            }
            System.out.println(powerValofN);
        }
    }*/

    /*
     * Create the method long power(int, int) here.
     */
    public  long power(int n,int p)throws Exception{

        if(n<0 || p<0 ){
            throw new Exception("java.lang.Exception: n or p should not be negative.");
        } else if(n ==0 || p==0){
            throw new Exception("java.lang.Exception: n and p should not be zero.");
        } else {
            int powerValofN= 1;
            for (int i=1;i<=p;i++) {
                powerValofN=powerValofN*n;
            }
            return powerValofN;
        }

    }

}

 public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
