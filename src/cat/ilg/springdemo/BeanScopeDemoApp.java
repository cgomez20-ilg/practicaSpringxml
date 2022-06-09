package cat.ilg.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {


        //carregar el fitxer de configuracio de spring
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //obtenir els beans del contenidor spring
        Coach coach = context.getBean("basketCoach", Coach.class);

        Coach coach2 = context.getBean("basketCoach", Coach.class);

        //comprobar si els dos beans son el matiex
        boolean result = (coach == coach2);

        //print resultat
        System.out.println("\nPointing to the same object?" + result);

        System.out.println("\nMemory location for coach is:" + coach);

        System.out.println("\nMemory location for coach2 is:" + coach2);

    }
}
