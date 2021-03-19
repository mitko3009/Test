package Heroes;

public class Player implements ISuperHero{

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println(this.name + " is helping.");
    }

    @Override
    public void jump() {
        System.out.println(this.name + " is jumping.");
    }

    @Override
    public void run() {
        System.out.println(this.name + " is running.");
    }

    @Override
    public void walk() {
        System.out.println(this.name + " is walking.");
    }
}
