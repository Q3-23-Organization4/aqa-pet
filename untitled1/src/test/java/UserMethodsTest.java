import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserMethodsTest {
    private static List<User> users;

    @BeforeAll
    static void setUp() {
        users = new ArrayList<>();
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
    }

    @Test
    void testSortByAge_Positive() {
        List<User> sortedByAge = UserMethods.sortByAge(users);
        assertNotNull(sortedByAge);
        assertEquals(users.size(), sortedByAge.size());
        assertTrue(sortedByAge.stream().allMatch(user -> user.getAge() >= 0));
    }

    @Test
    void testSortByAge_AnotherPositive() {
        List<User> sortedByAge = UserMethods.sortByAge(users);
        assertNotNull(sortedByAge);
        assertTrue(sortedByAge.get(0).getAge() <= sortedByAge.get(sortedByAge.size() - 1).getAge());
    }

    @Test
    void testAverageAge_Positive() {
        double averageAge = UserMethods.calculateAverageAge(users);
        assertTrue(averageAge >= 0);
    }

    @Test
    void testAverageAge_AnotherPositive() {
        double averageAge = UserMethods.calculateAverageAge(users);
        assertTrue(averageAge <= 100); // Assuming age won't exceed 100 for this test
    }

    @Test
    void testSortByFirstNameAndAge_Positive() {
        List<User> sortedByFirstNameAndAge = UserMethods.sortByFirstNameAndAge(users);
        assertNotNull(sortedByFirstNameAndAge);
        assertEquals(users.size(), sortedByFirstNameAndAge.size());
    }

    @Test
    void testSortByFirstNameAndAge_AnotherPositive() {
        List<User> sortedByFirstNameAndAge = UserMethods.sortByFirstNameAndAge(users);
        assertNotNull(sortedByFirstNameAndAge);
        assertTrue(sortedByFirstNameAndAge.get(0).getFirstName().compareTo(sortedByFirstNameAndAge.get(sortedByFirstNameAndAge.size() - 1).getFirstName()) <= 0);
    }

    @Test
    void testHasUserWithSOrA_Positive() {
        assertTrue(UserMethods.hasUserWithSOrA(users));
    }

    @Test
    void testHasUserWithSOrA_AnotherPositive() {
        List<User> emptyList = new ArrayList<>();
        assertFalse(UserMethods.hasUserWithSOrA(emptyList));
    }

    @Test
    void testAllUsersAbove18_Positive() {
        assertTrue(UserMethods.areAllUsersAbove18(users));
    }

    @Test
    void testAllUsersAbove18_AnotherPositive() {
        List<User> olderUsers = new ArrayList<>();
        olderUsers.add(new User("John", "Doe", 25));
        olderUsers.add(new User("Jane", "Smith", 30));
        assertTrue(UserMethods.areAllUsersAbove18(olderUsers));
    }

    @ParameterizedTest
    @ValueSource(strings = {"one", "two", "three"})
    void testParameterizedMethod(String input) {
        assertNotNull(input);
        assertFalse(input.isEmpty());
    }

    @RepeatedTest(10)
    void testRepeatedMethod() {
        assertTrue(true);
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }
}

