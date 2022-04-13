public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Андрей", 1);
        Player player2 = new Player("Виктор", 2);
        Player player3 = new Player("Сергей", 3);
        Player player4 = new Player("Андрей", 4);

        ClassDistribution.distribution(player1);
        ClassDistribution.distribution(player2);
        //ClassDistribution.distribution(player3);

        ClassDistribution.win(player1);
        ClassDistribution.win(player2);
       // ClassDistribution.win(player3);
    }
}
