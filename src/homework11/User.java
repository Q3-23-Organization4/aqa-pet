package homework11;

import java.util.*;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User ("John","Bin",25));
        users.add(new User ("Vicas","Trav",5));
        users.add(new User ("Borys","Kac",67));
        users.add(new User ("Ula","Surmak",2));
        users.add(new User ("Nika","Kitty",54));
        users.add(new User ("Kira","Arum",18));
        users.add(new User ("Oleg","Biba",35));
        users.add(new User ("Joshua","Boba",35));
        users.add(new User ("Jim","Bim",13));
        users.add(new User ("Marco","Polo",45));

        List<User> sortedByAge = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();
        sortedByAge.forEach(System.out::println);

        double averageAge = users.stream()
                .mapToDouble(User::getAge)
                .average()
                .orElse(0);
        System.out.println("Average Age " + averageAge);

        List<User> sortedByFirstNameAndAge = users.stream()
                .sorted(Comparator.comparing(User::getFirstName).thenComparingInt(User::getAge))
                .toList();

        System.out.println("Sorted by firstName and age:");
        for (User user : sortedByFirstNameAndAge) {
            System.out.println(user.getFirstName() + " " + ", age: " + user.getAge());
        }

        boolean hasUserWithSOrA = users.stream()
                .anyMatch(user -> user.getLastName().startsWith("S") || user.getLastName().startsWith("A"));
        System.out.println("Users with 'A' or 'S' in Lastname - " + hasUserWithSOrA);

        boolean allUsersAbove18 = users.stream()
                .allMatch(user -> user.getAge() >= 18);
        System.out.println("All user under 18? -  " + allUsersAbove18);
    }

}


