package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayOne {
    public static void main(String[] args) {
//        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
//        System.out.println(date);

        int[] arr = new int[]{};
        System.out.println(arr.length);
//        arr[0] = 1;
        //arr[1] = 2;
        //arr[2] = 3;
        System.out.println(Arrays.toString(arr));
//        int k = 0;
//        for (int i = 0; i < 10; i++) {
//            arr[k] = i;
//            k++;
//        }

        List<Integer> lists = List.of(-1, -3, 1, 2, 4);
        Integer max = Collections.min(lists.stream().filter(v -> v > 0).filter(v -> v % 2 == 0).collect(Collectors.toList()));
        System.out.println("min = " + max);
    }
}
