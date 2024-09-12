import java.util.*;

public class ArrayClass {

    public  static int size ;

    public static void main(String[] args) {

        Integer[] arr = {5,2,3,1,3};



        List list = Arrays.asList(arr);

        size = list.size();

        // n is the size
        // find the duplicate value and missed value.
        //
        Set sett =  findDuplicates(list);

        System.out.println(sett);
    }

    public static Set findDuplicates(List list){

        Set hashSetForDuplicate = new HashSet<>();
        Set hashset = new HashSet();
        for (int i=0;i<list.size();i++) {
            if (!hashset.add(list.get(i))) {
                hashSetForDuplicate.add(list.get(i));
            }
        }
        System.out.println(hashset.size());
        for(int i=1;i<=size;i++) {
           if(!hashset.contains(i)){
              System.out.println(i);
           }
        }

    return hashSetForDuplicate;
    }

}
