package cn.tanglaoer.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author <a href="https://github.com/TangLaoEr">tks</a>
 * @Date 2023/5/27
 */
public class MyInitializingBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("bean.xml");
        TestDemo bean = application.getBean(TestDemo.class);
        System.out.println(bean);

        application.close();
    }
}