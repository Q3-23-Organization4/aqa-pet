package homework8.task1;

public abstract class MobilePhone implements Mobile{
    protected String phoneNumber;

    public abstract void mobilePhone();

    public void makeCall(){
        System.out.println("call to " + phoneNumber);
    }
}
