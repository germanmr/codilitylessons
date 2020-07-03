package com.javainuse;

public class TestPhoneBill {

    public static void main(String[] args) {

//        String phoneBill = "00:01:07,400-234-090\n" +
//                "00:05:01,701-080-080\n" +
//                "00:05:00,400-234-090";
//
//        System.out.println("calculatePhoneBill(phoneBill): " + calculatePhoneBill(phoneBill));



//        System.out.println(Integer.parseInt("00:05:01".substring(1,5)));
//        System.out.println(Integer.parseInt("00:05:01".substring(1,8)));
        System.out.println("00:05:01".substring(0,8));

    }

    private static int calculatePhoneBill(String phoneBill) {

        // We have a String with maximun 100 lines

//        phoneBill.isEmpty()
//
//        LocalTime
//
//        String[] calls = phoneBill.split("\\n");
//
//        calls.length>100;

        System.out.println();

        // we can use Split two get lines
        // If we get more than 100 lines we can throw an error


        //Here we separate the maximums calls!!

        //for each remaining line we have to
        // parse for:
        // the phone number
        // the duration

        // We have to divide into two charge strategies

        return 1;



    }


    class Call {

        private final long phoneNumber;
        private final String duration;

        public Call(long phoneNumber,String duration){
            this.phoneNumber=phoneNumber;
            this.duration=duration;
        }


        public long getPhoneNumber() {
            return phoneNumber;
        }

        public String getDuration() {
            return duration;
        }
    }


    // We use strategy poattern Here, but
    abstract class Rateer{

        private final double cost;

        public Rateer (double cost){
            this.cost=cost;

        }


        abstract double calculateRate(Call call);

    }

    class RateerLessThanFiveMinutes extends Rateer{

        public RateerLessThanFiveMinutes(double cost) {
            super(cost);
        }

        @Override
        public double calculateRate(Call call) {
            return 0;
        }
    }

    class RateerMoreThanFiveMinutes extends Rateer{

        public RateerMoreThanFiveMinutes(double cost) {
            super(cost);
        }

        @Override
        public double calculateRate(Call call) {
            return 0;
        }
    }

}
