import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("John", "Bin", 25));
        users.add(new User("Vicas", "Trav", 5));
        users.add(new User("Borys", "Kac", 67));
        users.add(new User("Ula", "Surmak", 2));
        users.add(new User("Nika", "Kitty", 54));
        users.add(new User("Kira", "Arum", 18));
        users.add(new User("Oleg", "Biba", 35));
        users.add(new User("Joshua", "Boba", 35));
        users.add(new User("Jim", "Bim", 13));
        users.add(new User("Marco", "Polo", 45));

        List<User> sortedByAge = UserMethods.sortByAge(users);
        sortedByAge.forEach(System.out::println);

        double averageAge = UserMethods.calculateAverageAge(users);
        System.out.println("Average Age " + averageAge);

        List<User> sortedByFirstNameAndAge = UserMethods.sortByFirstNameAndAge(users);
        System.out.println("Sorted by firstName and age:");
        sortedByFirstNameAndAge.forEach(user -> System.out.println(user.getFirstName() + ", age: " + user.getAge()));

        boolean hasUserWithSOrA = UserMethods.hasUserWithSOrA(users);
        System.out.println("Users with 'A' or 'S' in Lastname - " + hasUserWithSOrA);

        boolean allUsersAbove18 = UserMethods.areAllUsersAbove18(users);
        System.out.println("All user under 18? -  " + allUsersAbove18);
    }
}
