package cat.ilg.springdemo;

public class VoleibolCoach implements Coach {

    private GameStatsService gameStatsService;

    public VoleibolCoach(){
        System.out.println("Voleibol coach: Dins del constructor per defecte");
    }

    public void setGameStatsService(GameStatsService gameStatsService){
        System.out.println("Voleibol coach: Dins del setter");
        this.gameStatsService = gameStatsService;
    }

    //public VoleibolCoach(GameStatsService gameStatsService){ this.gameStatsService = gameStatsService;}


    @Override
    public String getDailyPractice(){
        return "Volei practice: Fes 10 sques i 50 remats.";
    }

    @Override
    public String getLastGameStats() {
        return "Voleibol stats:" + gameStatsService.getLastGameStats();
    }
}
