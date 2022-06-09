package cat.ilg.springdemo;

public class Main {
    public static void main(String[] args) {

        //Creacio de l'objecte
        Coach coach = new VoleibolCoach();
        //Coach coach = new BasketballCoach();

        //Utilitzacio de l'objecte
        System.out.println(coach.getDailyPractice());
    }
}