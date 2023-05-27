package cn.tanglaoer.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="https://github.com/TangLaoEr">tks</a>
 * @Date 2023/5/27
 */
@Configuration
@ComponentScan(basePackages = "cn.tanglaoer.component")
public class AppConfig {
}
