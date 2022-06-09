package cat.ilg.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {
        //carregar arxiu xml de configuracio
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //obtenir els beans del contenidor spring
        Coach coach = context.getBean("basketCoach", Coach.class);

        System.out.println(coach.getLastGameStats());

        //tancar el contexte
        context.close();
    }
}
