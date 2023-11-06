import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        System.out.println("Task 2");
        List<Integer> nums2 = new ArrayList<>(List.of(8, 1, 2, 3, 4, 4, 5, 5, 6, 2));
        List<Integer> end = new ArrayList<>();
        for (Integer num : nums2) {
            if (num % 2 == 0) {
                if (!end.contains(num)) {
                    end.add(num);
                }
            }
        }
        Collections.sort(end);
        System.out.println(end);

        System.out.println("Task 3");
        List<String> words = new ArrayList<>(List.of("hi", "hello", "hi", "world", "world"));
        Set<String> end2 = new HashSet<String>(words);
        for (String s : end2) {
            System.out.println(s);
        }
        System.out.println("Task 4");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> end3 = new HashSet<String>(strings);
        for (String r : end3) {
            System.out.println(r + ": " + Collections.frequency(strings, r));
        }

    }

}