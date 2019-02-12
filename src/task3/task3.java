package task3;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class task3 {


    public static void main(String[] args) {
        List list = getFillArry();
        System.out.println(list);
        listInfo(list);
    }

    public static List<Integer> getFillArry() {
        return new Random().ints( 1, 20).limit(20).boxed().collect(Collectors.toList());
    }

    public static void listInfo(List<Integer> list){
        IntSummaryStatistics stats = list
                .stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("max value is "+stats.getMax());
        System.out.println("min value is "+stats.getMin());
        System.out.println("sum value is "+stats.getSum());
        System.out.println("sum value is "+list.stream().reduce(0,(a,b) ->a+b));
        System.out.println("average value is "+stats.getAverage());
        System.out.println("bigger then average values "+list.stream().filter(p -> p>stats.getAverage()).collect(Collectors.toList()));
        System.out.println("count bigger then average values "+list.stream().filter(p -> p>stats.getAverage()).count());
    }
}
