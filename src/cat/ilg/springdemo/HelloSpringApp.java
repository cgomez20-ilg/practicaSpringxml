package cat.ilg.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args){

        //carregar la configuracio del fitxer xml
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //constractor injection:
        //obtenir el bean del contenidor spring
        BasketballCoach basketballCoach = context.getBean("basketCoach", BasketballCoach.class);



        //cridar els metodes beans
        System.out.println(basketballCoach.getDailyPractice());
        System.out.println(basketballCoach.getLastGameStats());

        System.out.println(basketballCoach.getEmailAddress());
        System.out.println(basketballCoach.getTeam());

        System.out.println("------------------------------------------");

        //setter injection:
        Coach coach = context.getBean( "voleibolCoach" , Coach.class);
        System.out.println(coach.getDailyPractice());
        System.out.println(coach.getLastGameStats());

        //tanca el contenidor spring
        context.close();

    }

}
