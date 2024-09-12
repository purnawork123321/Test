import lombok.Builder;
import lombok.Data;

public class LombokTest {
    @Data
    @Builder
     static class Employee {

        private int id;
        private String name;


    }

    public static void main(String[] args) {
        LombokTest s=new LombokTest();
        s.extracted();
    }

    private  void extracted() {
        /*Employee employee=new Employee(1,"fd");
        employee.setId(2);
        employee.setName("purna");*/
        Employee employee1=Employee.builder().id(3).name("chandra").build();
        System.out.println(employee1);
    }
}
