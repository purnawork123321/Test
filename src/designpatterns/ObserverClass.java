package designpatterns;

public class ObserverClass implements Observer{
    @Override
    public void update(Message message) {
        System.out.println(message.getMessage()+" "+"chandra1");
    }
}
