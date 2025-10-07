package my.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext a1 = new ClassPathXmlApplicationContext("Beans.xml");
        Employee emp = (Employee) a1.getBean("aa");
        System.out.println(emp);
    }
}
