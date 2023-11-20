package homeworks.homework6.user;

public class User {
    public String userName;
    private int age;
    public String email;
    private String password;
    public boolean isActive;
    public double amountSpentMoney;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;

    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }
    public User(String userName,int age, String email,String password, boolean isActive,double amountSpentMoney) {
        this.userName = userName;
        this.age = age;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
        this.amountSpentMoney = amountSpentMoney;
    }

    public void setAge(int age) {
        if(age<18){
            System.out.println("Incorrect age");
        }else {
            this.age = age;
        }
    }

    public void setPassword(String password) {
        if (password.length() < 9) {
            System.out.println("Incorrect password");
        } else {
            this.password = password;
        }
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public void makePurchase(double purchasePrice) {
        System.out.println("Purchase " + purchasePrice);
        amountSpentMoney += purchasePrice;
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Total amount " + amountSpentMoney);
    }}