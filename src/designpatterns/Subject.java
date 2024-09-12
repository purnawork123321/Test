package designpatterns;

public interface Subject {
   void attach(Observer oberserver);
   void detach(Observer oberserver);
   void notifyUpdate(Message message);
}
