package HackerRank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        //find duplicate numbers in the list
       /*List<Integer> integerList =  Arrays.asList(1,2,2,4,5,88,88,6,9);
        Set<Integer> uniqueList  = new HashSet<Integer>();
      integerList.stream().filter(i-> !uniqueList.add(i)).forEach(j -> System.out.println(j));*/
      // find no of occurrence of word
        String word = "1 2 3 2 1 5 6";
        String[] str = word.split(" ");
        List<String> wordList = Arrays.asList(str);
        List<Integer> integerList =  Arrays.asList(1,2,2,4,5,88,88,6,9);
        Map map = Arrays.stream(str).sequential().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        System.out.println(map);

        Set<String> uniqueList =
                wordList.stream().filter(i ->
                        Collections.frequency(wordList,i)>1)
                        .peek(i->System.out.println(wordList)).collect(Collectors.toSet());
        System.out.println(uniqueList);
    }
}
