package org.example.example.a1;

import org.example.game.GameRunner;
import org.example.game.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass {
//    @Autowired
    Depenedency1 depenedency1;
// @Autowired
    Depenedenency2 depenedency2;

    //@Autowired
    public YourBusinessClass(Depenedency1 depenedency1, Depenedenency2 depenedency2) {
        super();
        System.out.println("Constructor injection " + depenedency1 + " and " + depenedency2);
        this.depenedency1 = depenedency1;
        this.depenedency2 = depenedency2;
    }

//    @Autowired
//    public void setDepenedency1(Depenedency1 depenedency1) {
//        System.out.println("Setting injection " + depenedency1);
//        this.depenedency1 = depenedency1;
//    }
//
//    @Autowired
//    public void setDepenedency2(Depenedenency2 depenedenency2) {
//        this.depenedency2 = depenedency2;
//    }
//
//    public String toString() {
//        return "Using " + depenedency1 + " and " + depenedency2;
//    }
}
@Component
class Depenedency1 {
}

@Component
class Depenedenency2 {
}
@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (DepInjectionLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}
