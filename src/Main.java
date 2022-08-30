import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("участие", "хлеб", "успокоиться", "проходить", "участие", "рассмеяться",
                "непосредственный", "общаться", "общаться", "общаться", "намерен", "иной", "непосредственный", "интимный"));
        task1(nums);
        task2(nums);
        task3(words);
        task4(words, "общаться");
    }

    private static void task4(List<String> words, String wordToFind) {
        int count = 0;
        for (String word : words) {
            if (Objects.equals(word, wordToFind)) {
                count++;
            }
        }
        System.out.println("Слово " + "\"" + wordToFind + "\"" + " повторяется в списке слов " + count + " раза");
        System.out.println();
    }

    private static void task3(List<String> words) {
        List<String> newList = new ArrayList<>();
        for (String word : words) {
            if (!newList.contains(word)) {
                newList.add(word);
            }
        }
        System.out.println(newList);
        System.out.println();
    }

    private static void task2(List<Integer> nums) {
        List<Integer> newList = new ArrayList<>();
        for (Integer number : nums) {
            if (number % 2 == 0 && !newList.contains(number)) {
                newList.add(number);
            }
        }
        newList.sort(Integer::compareTo);
        System.out.println(newList);
        System.out.println();

    }

    private static void task1(List<Integer> nums) {
        for (Integer number : nums) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

}

