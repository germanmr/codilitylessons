//// you can also use imports, for example:
//// import java.util.*;
//
//// you can write to stdout for debugging purposes, e.g.
//// System.out.println("this is a debug message");
//
//import java.util.Set;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//import java.util.Map;
//
//public class Solution {
//
//    public int solution(int[] A) {
//
//        // one-LINER Streams Solution, this could have been made
//        // with loops and individual Java Collections!
//        Integer foundNumber =IntStream.of(A)
//                .boxed()
//                .collect(Collectors.toSet())
//                .stream()
//                .collect(Collectors.groupingBy(integer -> integer < 0 ? integer * -1 : integer, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(integerLongEntry -> integerLongEntry.getValue()>1)
//                .sorted((o1, o2) -> o2.getKey().compareTo(o1.getKey()))
//                .limit(1)
//                .map(Map.Entry::getKey)
//                .findFirst()
//                .orElse(0);
//
//
//        return foundNumber;
//
//    }
//}