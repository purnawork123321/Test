public class TestSingleTon {

    public static void main(String[] args) {
        SingleTonClass singleTonClass = SingleTonClass.getInstance();
        SingleTonClass singleTonClass1 = SingleTonClass.getInstance();

        if (singleTonClass.hashCode() == singleTonClass.hashCode()){
            System.out.println("objects are same");
        } else {
            System.out.println("Objects are different");
        }
    }
}
