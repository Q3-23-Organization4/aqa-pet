package homework6;


public class UsersValidation {
    public static void main(String[] args) {
        User user1 = new User("Ola",25,"test@gmail.com","test53",true,234.5);
        User user2 = new User("Kara",5,"test13@gmail.com","tes33333t666",true,100.6);


        user1.makePurchase(50.0);
        user2.makePurchase(60.0);
        user1.printTotalAmountOfSpentMoney();

        System.out.println("User 1");
        System.out.println("Name: " + user1.userName);
        System.out.println("A/I " + user1.isActive);
        System.out.println("Age: " + user1.getAge());
        System.out.println("Email: " + user1.email);
        System.out.println("Password: " + user1.getPassword());
        user1.printTotalAmountOfSpentMoney();

        System.out.println("User 2");
        System.out.println("Name: " + user2.userName);
        System.out.println("A/I " + user2.isActive);
        System.out.println("Age: " + user2.getAge());
        System.out.println("Email: " + user2.email);
        System.out.println("Password: " + user2.getPassword());
        user2.printTotalAmountOfSpentMoney();
    }
}
