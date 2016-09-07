package mainpackage;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Create Configuration class
 * Created by vijitha on 07/09/16.
 */
@Configuration
@ComponentScan(basePackages ="mainpackage")
@EnableAspectJAutoProxy
public class AppConfig {
}
