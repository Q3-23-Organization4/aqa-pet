package homeworks.homework8.task1;

public class Model extends MobilePhone implements Mobile{
    protected String phoneNumber = "76856656";

    protected String modelType = "IOS";

    protected String modelYear = "05-01-2021";

    protected String message = "Hello";

    @Override
    public void mobilePhone() {
        System.out.println("mobile phone  " + phoneNumber);
    }

    @Override
    public void makeCall() {
        System.out.println("call to " + phoneNumber);
    }

    @Override
    public void sendTextMessage() {
        System.out.println("message sending " + message);
    }

    public void modelName(){
        System.out.println("mobile type " + modelType);
    }

}
