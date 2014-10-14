package ua.com.juja.study.core.presentation.oop.nested;

import java.util.Arrays;

public class ChampionshipLeagueFootballGroup {
    public static final int TEAMS_COUNT = 4;
    private String[] teams = new String[TEAMS_COUNT];
    private int[] teamScores = new int[TEAMS_COUNT];
    private Team[] teamArray = new Team[TEAMS_COUNT];

    private int teamsAdded = 0;

    public void addTeam(String teamName) {
        if (teamsAdded < TEAMS_COUNT) {
            teams[teamsAdded] = teamName;
            teamArray[teamsAdded] = new Team(teamName, 0);
            teamsAdded++;
            System.out.println("Team " + teamName + " was added to group");
        } else {
            System.out.println("Group is already filled");
        }
    }

    public void teamWins(String teamName) {
        for (int i = 0; i < TEAMS_COUNT; i++) {
            if (teams[i].equals(teamName)) {
                teamScores[i] += 3;
                teamArray[i].score += 3;
            }
        }
    }

    public void teamDraw(String teamName) {
        for (int i = 0; i < TEAMS_COUNT; i++) {
            if (teams[i].equals(teamName)) {
                teamScores[i] += 1;
                teamArray[i].score += 1;
            }
        }
    }

    public String getTheLeader() {
        int maxScore = 0;
        int teamIndex = 0;
        for (int i = 0; i < TEAMS_COUNT; i++) {
            if (teamScores[i] > maxScore) {
                maxScore = teamScores[i];
                teamIndex = i;
            }
        }
        return teams[teamIndex];
    }

    public String getTeamListOrderedByScores() {
        Arrays.sort(teamScores);
        String result = "";
        for (int i = 0; i < TEAMS_COUNT; i++) {
            result = result + teams[i] + " " + teamScores[i] + "\n";
        }
        return result;
    }

    class Team implements Comparable{
        private String name;
        private int score;


        public Team(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public int compareTo(Object o) {
            Team team = (Team) o;
            return - score + team.score;
        }
    }


    public static void main(String[] args) {
        ChampionshipLeagueFootballGroup groupA = new ChampionshipLeagueFootballGroup();
        groupA.addTeam("Manchester");
        groupA.addTeam("Barcelona");
        groupA.addTeam("Juventus");
        groupA.addTeam("Dynamo FC");

        playGame(groupA);
        System.out.println(groupA.getTheLeader() + " is a Leader");
        System.out.println(groupA.getTeamListOrderedByScores());
    }

    private static void playGame(ChampionshipLeagueFootballGroup groupA) {
        //Manchester vs Barcelona 2:0
        groupA.teamWins("Manchester");

        //Dynamo FC vs Juventus 2:2
        groupA.teamDraw("Dynamo FC");
        groupA.teamDraw("Juventus");

        // ------- tour 2 --------
        //Dynamo FC vs Barcelona 1:2
        groupA.teamWins("Barcelona");

        //Juventus vs Manchester 1:0
        groupA.teamWins("Juventus");

        // ------- tour 2 --------
        //Dynamo FC vs Manchester 5:1
        groupA.teamWins("Dynamo FC");

        //Barcelona vs Juventus 2:2
        groupA.teamDraw("Barcelona");
        groupA.teamDraw("Juventus");
    }

}
