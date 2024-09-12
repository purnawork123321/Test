public class TestPrintNumbers {

    public static void main(String[] args) {

        //1 to 100 without using loop
        int i =0;
        printNumbers(i);


        }



    static void printNumbers(int i){
        i++;
        System.out.println(i);
        if (i == 100){
            return;
        }
        printNumbers(i);
    }
    }

