import java.util.Arrays;
import java.util.Comparator;

public class Problem9 {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "grape", "kiwi", "pineapple"};

        // Sort the array
        Arrays.sort(strings, new StringLengthComparator().thenComparing(new AlphabeticalComparator()));

        // Print the sorted array
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
        }
    }

    static class AlphabeticalComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s1.compareTo(s2);
        }
    }
}
