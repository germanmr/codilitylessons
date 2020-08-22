package com.javainuse;

public class DivisorsTest {

    public static void main(String[] args) {

        int A = 6;
        int B = 11;
        int K = 2;

        divisors(A, B, K);
    }

    private static int divisors(int A, int B, int K) {

        // double testumber = Math.round( (((double)11)-6) / 2);
        // System.out.println( "testumber: " + testumber );

        // double testumber = Math.round( (((double)11)-6) / 2);
        // System.out.println( "testumber: " + testumber );

        double range = (double) B - (double) A;

        //System.out.println( "range: " + range );

        double divs = range / (double) K;

        // System.out.println( "divs: " + divs );

        if (divs < 1) {
            return 0;
        }

        return (int) Math.round(divs);

        // double divs = ((double) B - A ) / K;

        // double testumber = Math.round( (((double)11)-6) / 2);
        // System.out.println( "testumber: " + testumber );

        // double decimalPart = divs - (int) divs;

        // if ( divs < 1 ){
        //     return 0;
        // }

        // // if there is any mod bigger than 5 we add one,
        // // round basing on .50
        // int divisions = ( int ) divs;
        // int difference = (decimalPart < 0.5 ? 0 : 1 );

        // return divisions + difference;
    }
}
