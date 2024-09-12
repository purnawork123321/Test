package HackerRank;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num =-1;

        String binaryString = Integer.toBinaryString(num);
        System.out.println(binaryString);
            String s = ((num&num-1)==0)?"power of 2":"not a power of 2";
        System.out.println(s);

    }
}
