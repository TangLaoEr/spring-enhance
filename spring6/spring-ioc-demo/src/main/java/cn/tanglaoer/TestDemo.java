package cn.tanglaoer;

import cn.tanglaoer.annotation.AppConfig;
import cn.tanglaoer.component.TestIndexer;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="https://github.com/TangLaoEr">tks</a>
 * @Date 2023/5/27
 */
public class TestDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotation = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(annotation);
    }

    @Test
    public void testRegister() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class, TestIndexer.class);
        ctx.refresh(); // 一定要执行这个函数、刷新容器
        TestIndexer bean = ctx.getBean(TestIndexer.class);
        System.out.println(bean);
    }
}
