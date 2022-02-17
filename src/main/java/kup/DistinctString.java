package kup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctString {
    public static List<String> getDistinctStrings(List<String> stringList){
        // writing lambda expression according to the given requirement
        Function<List<String>, List<String>> distinctStrings = str -> str.stream()
                .distinct() // to get distinct elements
                .sorted() // for sorting the list
                .collect(Collectors.toList()); // collecting it as a list
       return distinctStrings.apply(stringList);
    }
    public static void main(String[] args) {

        List<String> list= new ArrayList<>();
        System.out.println("Type words in single line using space and press enter");
        Scanner input =new Scanner(System.in);
        String line = input.nextLine();

        String[] stringList3= line.split("\\s");
        for (String str:stringList3) {
            list.add(str);
        }
//        Your output
        System.out.println("Distinct Values"+DistinctString.getDistinctStrings(list));
    }

}
