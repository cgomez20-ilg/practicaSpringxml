package cat.ilg.springdemo;

public class BasketballCoach implements Coach {

    private String emailAddress;

    private String team;

    private  GameStatsService gameStatsService;

    public BasketballCoach(GameStatsService gameStatsService){
        this.gameStatsService = gameStatsService;
    }

    public BasketballCoach(){}

    //Getters
    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    //Setters
    public void setEmailAddress(String emailAddres) {
        System.out.println("Basket coach: dins del setter de l'email");
        this.emailAddress = emailAddres;
    }

    public void setTeam(String team) {
        System.out.println("Basket coach: dins del setter de team");
        this.team = team;
    }

    @Override
    public String getDailyPractice() {
        return "Baket practice: Entrena defensa mitja hora i 100 tirs llures.";
    }

    @Override
    public String getLastGameStats() {
        return gameStatsService.getLastGameStats();
    }

    //afegir metode init
    public void doMyStartupStuff() {
        System.out.println("Basket coach: dins del metode init");
        System.out.println("Obrint connexions a BD...");
    }

    //afegir metode distroy
    public void doMyCleanupStuff() {
        System.out.println("Basket coach: dins del metode destroy");
        System.out.println("Tancant connexions a BD...");
    }


}
