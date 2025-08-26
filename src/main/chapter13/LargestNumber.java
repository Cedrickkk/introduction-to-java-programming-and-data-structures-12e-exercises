package main.chapter13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(3445.53);
        list.add(new BigInteger("3432323234344343101"));
        list.add(new BigInteger("3432323234344343102"));
        list.add(new BigDecimal("2.0909090989091343433344343"));

        System.out.println("The largest number is " + getLargestNumber(list));
    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        Number currentMaxNum = list.get(0);

        for (Number item : list) {
            if (new BigDecimal(currentMaxNum + "").compareTo(new BigDecimal(item + "")) < 0) {
                currentMaxNum = item;
            }
        }

        return currentMaxNum;
    }
}
