package designpatterns;

public class SubjectObserverClass{
    public static void main(String[] args) {
        Subject subject=new SubjectClass();
        Observer observer =new ObserverClass();
        Observer observer1 =new Observer1Class();
        subject.attach(observer);
        subject.attach(observer1);
       // subject.detach(observer);
        subject.notifyUpdate(new Message("Hello Purna"));
    }
}
