package Heroes;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Kitcho");

        player.help();
        player.jump();
        player.run();
        player.walk();
    }
}
