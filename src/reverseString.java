import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reverseString {
    public static void main(String[] args) {
        int j=0;
        String s = "HelloWorld";
      char[] chars =  s.toCharArray();
      StringBuilder vowels = new StringBuilder("");
      for (int i=0; i<chars.length;i++){
          if(isvowel(chars[i])){
              vowels.append(chars[i]);
              j++;
          }
      }
       /* List<String> sttrr = Stream.of(s).filter(c -> {
            System.out.println(s);
            return  (c.equals("a") || c.equals("A") || c.equals("e") || c.equals("E") ||
                    c.equals('i') || c.equals('I') ||
                    c.equals('o') || c.equals('O') ||
                    c.equals('u') || c.equals('U'));
      //  return b;
        }).collect(Collectors.toList());

       System.out.println(sttrr);*/

        for (int i=0; i<chars.length;i++){
            if(isvowel(chars[i])){
                chars[i]=vowels.charAt(--j);
            }
        }

        System.out.println(s);
System.out.println(String.valueOf(chars));

    }

    public static boolean isvowel(char c){


    return (c == 'a' || c == 'A' || c == 'e' || c == 'E' ||
            c == 'i' || c == 'I' ||
            c == 'o' || c == 'O' ||
            c == 'u' || c == 'U');
    }
}
