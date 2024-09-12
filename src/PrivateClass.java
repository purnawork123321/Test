 class PrivateClass {
    private static class test{
        public  void main(String[] args) {


        }

        static void access(){};
    };

    private void test(){   test pc =new test();};

    public static void main(String[] args) {
        PrivateClass pc =new PrivateClass();
        pc.test();
        test.access();
    }
}
