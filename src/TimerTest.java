import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

    int allowRequests=1;

    void serviceRequest(){
        if(allowRequests<5) {
            allowRequests = allowRequests + 1;
            System.out.println("serviceRequest Called :" + allowRequests);
        } else {
            System.out.println("serviceRequest rejected :");
        }
    }

    TimerTest() {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                allowRequests = 1;
                System.out.println(allowRequests +":reset");
            }
        }, 0,4000);

    }

    public static void main(String[] args) {
        TimerTest tt=new TimerTest();
        tt.serviceRequest();

        tt.serviceRequest();
        tt.serviceRequest();
        tt.serviceRequest();

        tt.serviceRequest();
        tt.serviceRequest();
        tt.serviceRequest();

        tt.serviceRequest();
        tt.serviceRequest();
        tt.serviceRequest();

        tt.serviceRequest();
        tt.serviceRequest();

    }
}


