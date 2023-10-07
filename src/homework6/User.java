package homework6;

public class User {
    public String userName;
    private int age;
    public String email;
    private String password;
    public boolean isActive;
    public double amountSpentMoney;

    public User() {
    } //construstor

    public User(String userName) {
        this.userName = userName; //construstor

    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;//construstor

    }
    public User(String userName, int age, String email, String password,boolean isActive,double amountSpentMoney) {
        this.userName = userName;
        this.age = age;
        this.email = email;
        setPassword(password);
        this.isActive = isActive;
        this.amountSpentMoney = amountSpentMoney;
    }

    public void setAge(int age) {
       this.age=age;
    }

    public void setPassword(String password) {
       this.password=password;
    }

    public int getAge() {
        if(age<18){
            System.out.println("Incorrect age");
        }else {
            this.age = age;
        }
        return age;
    }

    public String getPassword() {
        if (password.length() <= 9) {
            this.password = password;
        } else {
            System.out.println("Incorrect password");
        }
        return password;
    }

    public void makePurchase(double purchasePrice) {
        System.out.println("Purchase " + purchasePrice);
        amountSpentMoney += purchasePrice;
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Total amount " + amountSpentMoney);
    }}