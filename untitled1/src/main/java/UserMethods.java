import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserMethods {
    public static List<User> sortByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
    }

    public static double calculateAverageAge(List<User> users) {
        return users.stream()
                .mapToDouble(User::getAge)
                .average()
                .orElse(0);
    }

    public static List<User> sortByFirstNameAndAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getFirstName).thenComparingInt(User::getAge))
                .collect(Collectors.toList());
    }

    public static boolean hasUserWithSOrA(List<User> users) {
        if (users == null) {
            throw new IllegalArgumentException("User list cannot be null");
        }

        return users.stream()
                .anyMatch(user -> user.getLastName().startsWith("S") || user.getLastName().startsWith("A"));
    }

    public static boolean areAllUsersAbove18(List<User> users) {
        return users.stream()
                .allMatch(user -> user.getAge() >= 18);
    }
}
