package array;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 11/9/21 - 9:00 PM
 */
public class PracticeOne {

    static int countFreq(int[] arr) {
        int n = arr.length;
//        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
//            if (visited[i]) {
//                continue;
//            }
            int count = 1;
//            System.out.println(Arrays.toString(visited));
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
//                    visited[i] = true;
                    count++;
                }
            }
            if (count >= 3) {
                return 0;
            }
        }
        return 1;
    }

    static int countFreqTwo(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count >= 3) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(countFreq(new int[]{1, 2, 5, 2, 1, 5, 9}));
//        int goodSpread[] = new int[]{2, 1, 2, 5, 2, 1, 5, 9};
    }

}
