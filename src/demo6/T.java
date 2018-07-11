package demo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("demo6/applicationContext.xml");
        User user1 = (User) ac.getBean("user1");
        user1.setName("张三");
        System.out.println(user1.toString());
        User user2 = (User) ac.getBean("user2");
        user2.setName("李四");
        System.out.println(user2.toString());
    }
}
