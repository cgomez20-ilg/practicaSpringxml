package cat.ilg.springdemo;

public class VoleibolGameStatsService implements GameStatsService{

    @Override
    public String getLastGameStats() {
        return "Volei stats: 19 sacs 23 tirs lliures, 9 fora de joc, 25 faltes personals.";
    }
}
