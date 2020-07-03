package com.javainuse;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {

        int[] rotate = {1, 2, 3};
//        System.out.println("Expected: {2, 3, 1}: " + cyclicRotation(rotate, 2));
//        System.out.println("Expected: {1, 2, 3}: " + cyclicRotation(rotate, 0));
//        System.out.println("Expected: {1, 2, 3}: " + cyclicRotation(rotate, 1));
//        System.out.println("Expected: {1, 2, 3}: " + cyclicRotation(rotate, 2));
//        System.out.println("Expected: {1,2,3,4,5,6}: " + cyclicRotation(rotate, 2));

        System.out.println("Expected: {1, 2, 3}: " + cyclicRotation2(rotate, 2));


        //collect( Collectors.toMap(p -> p[0], p -> p[1]));
//        IntStream.range(0, 100).collect(Collectors.toMap(value -> value, value -> Integer.toBinaryString((Integer) value)));
//        Map<Integer, String> integerStringMap = IntStream.range(0, 100).boxed().collect(Collectors.toMap(Integer::valueOf, Integer::toBinaryString));

//        integerStringMap.forEach((integer, s) -> System.out.println(integer + " / " + s));

    }

    private static int[] cyclicRotation(int[] rotate, int times) {

        if (times == 0) {
            return rotate;
        }

        int boundaryPosition = rotate.length - 1;

        int[] rotated = Arrays.copyOf(rotate, rotate.length);
        int length = rotate.length;

        for (int i = 0; i < length; i++) {

            // Split into two sentences just for cleaner code
            int newPosition = i + 1;
            int rotatedPosition = (newPosition > boundaryPosition) ? newPosition - length : newPosition;

            rotated[rotatedPosition] = rotate[i];

        }

        cyclicRotation(rotated, times - 1);

        return rotated;
    }

    private static int[] cyclicRotation2(int[] rotate, int times) {

        int boundaryPosition = rotate.length - 1;

        int[] rotated = Arrays.copyOf(rotate, rotate.length);
        int length = rotate.length;

        for (int i = 0; i < length; i++) {

            // Split into two sentences just for cleaner code
            int newPosition = i + times;
            int rotatedPosition = (newPosition > boundaryPosition) ? newPosition - length : newPosition;

            rotated[rotatedPosition] = rotate[i];

        }

        return rotated;
    }


}
