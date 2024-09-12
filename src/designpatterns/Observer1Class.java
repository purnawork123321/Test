package designpatterns;

public class Observer1Class implements Observer{
    @Override
    public void update(Message message) {
        System.out.println(message.getMessage()+" "+"chandra");
    }
}
