 class SingleTonClass {

    private static SingleTonClass singleTonClass = null;

    private SingleTonClass(){

    }

    public static SingleTonClass getInstance(){

        if (null == singleTonClass)
            return new SingleTonClass();
        else
            return singleTonClass;


    }


}
