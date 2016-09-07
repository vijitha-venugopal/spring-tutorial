package mainpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Create Main Class
 * Created by vijitha on 07/09/16.
 */
@Component
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        Car ritz = (Car) ctx.getBean("Ritz");
        Car swiftdzire= (Car) ctx.getBean("Swiftdzire");
        ritz.carName();
        swiftdzire.carName();
        System.out.println("Exit");
    }
}
