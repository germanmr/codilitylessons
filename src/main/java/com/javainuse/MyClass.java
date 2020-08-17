package com.javainuse;

import java.util.Objects;

//// you can also use imports, for example:
//// import java.util.*;
//
//// you can write to stdout for debugging purposes, e.g.
//// System.out.println("this is a debug message");
//
class Solution {
    private final Integer name;
    private final String code;

    public Solution(Integer name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return Objects.equals(name, solution.name) &&
                Objects.equals(code, solution.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code);
    }
}
//    public int solution(String S) {
//
//        // Clearer API on validation, null here
//        if( S==null ){
//            System.out.println("The phone bill must not be null");
//            return 0;
//        }
//        // Clearer API on validation empty here
//        if( S.isEmpty() ){
//            System.out.println("The phone bill must not be empty");
//            return 0;
//        }
//
//        // We have a String with maximun 100 calls
//        String[] calls = S.split("\\n");
//
//        // we can use Split two get lines
//
//
//        //Here we separate the maximums number with free calls!
//        String callsFiltered =removeFreeCalls(calls);
//
//
//        Rateer rateerLess5 = new RateerLessThanFiveMinutes(3);
//        Rateer rateerMore5 = new RateerLessThanFiveMinutes(150);
//
//        double totalRate=0;
//
//
//        for( String stringCall : callsFiltered){
//
//            Call call = getCall(stringCall);
//
//            String phonenumber  =getPhoneNumber(call);
//            String duration     =getDuation(call);
//
//
//            //for each remaining line we have to
//            // parse for:
//            // the phone number
//            // the duration
//
//            if (call.getDurationMinutes()<5){
//
//                double rate = rateerLess5.calculate(call);
//
//            }else{
//                double rate = rateerMore5.calculate(call);
//            }
//
//
//            totalRate = totalRate + rate;
//
//
//        }
//
//        return totalRate;
//
//
//    }
//
//
//    private static String removeFreeCalls(String calls){
//        return calls;
//    }
//
//
//    class Call {
//
//        private final long phoneNumber;
//        private final String duration;
//
//        public Call(long phoneNumber,String duration){
//            this.phoneNumber=phoneNumber;
//            this.duration=duration;
//        }
//
//
//        public long getPhoneNumber() {
//            return phoneNumber;
//        }
//
//        public String getDuration() {
//            return duration;
//        }
//
//
//        public int getDurationMinutes(){
//            return Integer.parseInt(duration.substring(3,5));
//        }
//
//        public int getDurationInSeconds(){
//            return (getDurationMinutes>0 ? getDurationMinutes * 60 : 0 ) + (Integer.parseInt(duration.substring(7,8)) ) ;
//        }
//
//    }
//
//
//
//
//
//// We use strategy poattern Here
//abstract class Rateer{
//
//    private final double cost;
//
//    public Rateer (double cost){
//        this.cost=cost;
//
//    }
//
//
//    public double getCost(){
//        return cost;
//    }
//
//
//    abstract double calculateRate(Call call);
//
//}
//
//class RateerLessThanFiveMinutes extends Rateer{
//
//    public RateerLessThanFiveMinutes(double cost) {
//        super(cost);
//    }
//
//    @Override
//    public double calculateRate(Call call) {
//        return call.getDurationInSeconds() * getCost();
//    }
//}
//
//class RateerMoreThanFiveMinutes extends Rateer{
//
//    public RateerMoreThanFiveMinutes(double cost) {
//        super(cost);
//    }
//
//    @Override
//    public double calculateRate(Call call) {
//        return 0;
//    }
//}
//
//
//}
//
//
