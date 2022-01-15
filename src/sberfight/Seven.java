package sberfight;

import java.util.*;

public class Seven {
    /*
    Аргумент
        // 1: fightersStamina: Integer[]
        [1, 0, 3, 4]
        Ожидаемое значение
        [17, 0, 17, 67]
     */


    public static void main(String[] args) {
        List<Integer> fighters_stamina = new ArrayList<>();
        fighters_stamina.add(1); //1
        fighters_stamina.add(0); //0
        fighters_stamina.add(3); //3
        fighters_stamina.add(4); //4

        System.out.println(getResult(fighters_stamina));
    }


    public static List<Integer> getResult(List<Integer> fightersStamina) {
        Integer[] arr = fightersStamina.toArray(new Integer[0]);
        int n = arr.length;
        List<Pair> pairs = new ArrayList<>();
        Tournament tournament = new Tournament();
        List<Fighter> winners = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (i != j) {
                    Fighter fighter1 = new Fighter(i, arr[i]);
                    Fighter fighter2 = new Fighter(j, arr[j]);

                    Pair pair = new Pair(fighter1, fighter2);
                    pairs.add(pair);
                }
            }
        }
        System.out.println(pairs);

        tournament.matches.add(new Match(List.of(pairs.get(0), pairs.get(1))));
        tournament.matches.add(new Match(List.of(pairs.get(2), pairs.get(3))));
        tournament.matches.add(new Match(List.of(pairs.get(4), pairs.get(5))));

        for(Match m : tournament.matches){
            List<Fighter> localWinners = new ArrayList<>();
            for (Pair p : m.pairs){
                if(p.fighter1.stamina > p.fighter2.stamina) {
                    p.fighter1.stamina = p.fighter1.stamina - p.fighter2.stamina;
                    p.fighter1.score += 17;
                    localWinners.add(p.fighter1);
                } else {
                    p.fighter2.stamina = p.fighter2.stamina - p.fighter1.stamina;
                    p.fighter2.score += 17;
                    localWinners.add(p.fighter2);
                }
            }
            winners.add( (localWinners.get(0).stamina > localWinners.get(1).stamina) ? localWinners.get(0) : localWinners.get(1));
        }

        List<Integer> result = new ArrayList<>(4);
        for (int i = 0; i < 4; i++){
            result.add(0);
        }

        for (Fighter f : winners){
            result.set(f.index, f.score);
        }
        return result;
    }

    private static class Fighter {
        int index;
        int stamina;
        int score;

        public Fighter(int index, int stamina) {
            this.index = index;
            this.stamina = stamina;
        }
    }

    private static class Pair {
        Fighter fighter1;
        Fighter fighter2;

        public Pair(Fighter fighter1, Fighter fighter2) {
            this.fighter1 = fighter1;
            this.fighter2 = fighter2;
        }

        @Override
        public String toString() {
            return "(" + fighter1.stamina +
                    ", " + fighter2.stamina +
                    ')';
        }
    }

    private static class Match {
        List<Pair> pairs = new ArrayList<>();

        public Match(List<Pair> pairs) {
            this.pairs = pairs;
        }
    }

    private static class Tournament {
        List<Match> matches = new ArrayList<>();
    }
}
