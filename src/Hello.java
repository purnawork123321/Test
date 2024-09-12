import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class Hello{
    public static void main(String[] args) {

        ConcurrentMap concurrentMap=new ConcurrentHashMap();
        concurrentMap.put(new Hello(),"");
        Hashtable hashtable=new Hashtable();
        hashtable.put(new Hello(),"");
        Map map=new HashMap();
        map.put(new Hello(),"");

        Properties properties=new Properties();


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("purna");
            }
        });
        thread.start();

    }

        }

class OutOfMemoryErrorExample {
    public static void main(String[] args) {

        try {
            Integer[] myArray = new Integer[1000 * 1000 * 1000];
        } catch (OutOfMemoryError oome) {
            //Log the info
            System.err.println("Array size too large");
            System.err.println("Max JVM memory: " + Runtime.getRuntime().maxMemory());
        }
    }
}