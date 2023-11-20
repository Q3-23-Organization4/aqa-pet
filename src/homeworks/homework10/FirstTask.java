package homeworks.homework10;

import java.util.*;
import java.util.stream.Collectors;

public class FirstTask {
    public static void main(String[] args) {
        List<Integer> intergerList = new ArrayList<>();
        firstColl(intergerList);
        printOriginList(intergerList);
        printWithoutDup(intergerList);
        numDeletedValue(intergerList);
    }

    public static void firstColl(List<Integer> intergerList) {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int randomValue = random.nextInt(40) - 20;
            intergerList.add(randomValue);
        }
    }

    public static void printOriginList(List<Integer> intergerList) {
        System.out.println("Origin list: " + intergerList);
    }

    public static void printWithoutDup(List<Integer> intergerList) {
        List distinctList = intergerList.stream().distinct().collect(Collectors.toList());
        System.out.println("ArrayList without duplicates: " + distinctList);
    }

    public static void numDeletedValue(List<Integer> intergerList) {
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        intergerList.forEach(n ->{
            if (!set.add(n)){
                duplicates.add(n);
            }
        });
        System.out.println("Duplicates: " + duplicates.size());
    }
}
