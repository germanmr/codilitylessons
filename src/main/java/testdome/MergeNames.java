package testdome;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {


        Stream<String> stream1 = Stream.of(names1).distinct().peek(value-> System.out.println(value));
        System.out.println(stream1);
        Stream<String> stream2 = Stream.of(names2).distinct().peek(value-> System.out.println(value));
        System.out.println(stream2);

        String[] uniquesArray = Stream.concat(
                                    stream1,
//                                    stream2.filter(value -> stream1.anyMatch(value2-> value2.equals(value)) ))
                                    stream2.anyMatch(value -> stream1.))
                .toArray( String[]::new);

        return uniquesArray;


    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}