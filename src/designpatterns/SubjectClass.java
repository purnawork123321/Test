package designpatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubjectClass implements Subject{

   List<Observer> observerList =new ArrayList<>();

    public void attach(Observer oberserver) {
        observerList.add(oberserver);
    }

    @Override
    public void detach(Observer oberserver) {
        observerList.remove(oberserver);
    }

    @Override
    public void notifyUpdate(Message message) {
        for (Observer observer : observerList){
            observer.update(message);
        }

    }
}
