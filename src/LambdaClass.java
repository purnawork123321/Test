import java.util.function.BiConsumer;

public class LambdaClass {

    public static void main(String[] args) {
        BiConsumer<Integer,Integer>  biConsumer = (a,b) -> {System.out.println(a+b);};
        biConsumer.accept(1,2);
    }
}
