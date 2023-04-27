package array;

import java.util.Arrays;

public class ArrayOne {
    public static void main(String[] args) {
//        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
//        System.out.println(date);

        /* practise one */
//        int[] arr = new int[]{};
//        System.out.println(arr.length);
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        System.out.println(Arrays.toString(arr));
//        int k = 0;
//        for (int i = 0; i < 10; i++) {
//            arr[k] = i;
//            k++;
//        }

        /* practise two */
//        List<Integer> lists = List.of(-1, -3, 1, 2, 4);
//        Integer max = Collections.min(lists.stream().filter(v -> v > 0).filter(v -> v % 2 == 0).collect(Collectors.toList()));
//        System.out.println("min = " + max);

        String abc = "ram__::__0-4__::__AbdDis__::__count_cardinality";
        System.out.println(Arrays.toString(abc.split("__::__")));
        int value = 3;
        switch (value) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            default:
                System.out.println("Value is neither 1 nor 2");
                break;
        }

        System.out.println("End of switch statement");


    }
}
