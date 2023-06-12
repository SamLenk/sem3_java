import java.util.ArrayList;
import java.util.List;

public class Merge {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(5);
        arr.add(1);
        arr.add(8);
        arr.add(2);
        arr.add(7);
        arr.add(3);

        List<Integer> sortedArr = mergeSort(arr);
        System.out.println(sortedArr);
    }

    public static List<Integer> mergeSort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        int mid = arr.size() / 2;
        List<Integer> leftHalf = arr.subList(0, mid);
        List<Integer> rightHalf = arr.subList(mid, arr.size());

        leftHalf = mergeSort(leftHalf);
        rightHalf = mergeSort(rightHalf);

        return merge(leftHalf, rightHalf);
    }

    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}
