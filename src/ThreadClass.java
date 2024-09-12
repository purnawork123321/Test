import designpatterns.Composite.Employee;

class ThreadClass{


    public static void main(String[] args) throws InterruptedException {
        Employee employee=new Employee();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(employee.salary = employee.salary+10);
            }
        });
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                employee.setSalary(employee.getSalary()+10);
                System.out.println(employee.getSalary());
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                employee.setSalary(employee.getSalary()+10);
                System.out.println(employee.getSalary());
            }
        });
        thread.start();


        //Thread.sleep(1000);
        Thread.yield();
        thread.join();
        thread1.start();
        thread1.join();
        thread2.start();
        //thread.stop();


    }

    static class Employee{

        public synchronized int getSalary() {
            return salary;
        }

        public synchronized void setSalary(int salary) {
            this.salary = salary;
        }

        private int salary;
    }
}
class TestThread extends Thread{
   /* @Override
    public void run() {
       System.out.println("test :"+Thread.currentThread());
    }*/

    public static void main(String[] args) {
        TestThread thread=new TestThread();
        thread.start();
    }
}
class TestInheritedThread extends TestThread{
    private volatile int count;
    @Override
    public void run() {
       System.out.println("test1 :"+Thread.currentThread());
    }

    @Override
    public synchronized void start() {
        System.out.println("start1 ");
    }

    public static void main(String[] args) {
        TestInheritedThread thread=new TestInheritedThread();
        thread.start();
    }
}