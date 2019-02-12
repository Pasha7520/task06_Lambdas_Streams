package task4;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    static List<String> readLines(){
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String str;
        while (!(str = scanner.nextLine()).equals("")){
            strings.add(str);
        }
        return strings;
    }

    public static void main(String[] args) {
        List list = readLines();
        System.out.println(list);
        printInfo(list);
    }
    static void printInfo(List<String> list){
        System.out.println("count unique words of list : "+list
                .stream()
                .flatMap((str) -> Arrays.stream(str.split(" ")))
                .distinct()
                .count());
        System.out.println("Sorted unique words of list : "+list
                .stream()
                .flatMap((str) -> Arrays.stream(str.split(" ")))
                .sorted()
                .distinct()
                .collect(Collectors.toList()));
        System.out.println("Group unique words of list : "+list
                .stream()
                .flatMap((str) -> Arrays.stream(str.split(" ")))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        System.out.println("Characters group : "+list
                .stream()
                .flatMap(str -> Stream.of(str.split(" ")))
                .flatMap(w -> Stream.of(w.split("")))
                        .filter(c -> Character.isLowerCase(c.charAt(0)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }
}
