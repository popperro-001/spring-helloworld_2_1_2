import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println("Are HelloWorld beans the same, true or false? Answer is: " + (bean == bean2));

        Cat cat1=applicationContext.getBean("cat", Cat.class);
        Cat cat2=applicationContext.getBean("cat", Cat.class);

        System.out.println("Are Cat beans the same, true or false? Answer is: " + (cat1 == cat2));
    }
}