public class Mastermind {

    private Logic logic;

    public Mastermind(Logic logic){
        this.logic = logic;
    }

    public void play() {

    }

    public static void main(String[] args) {
        new Mastermind(new LocalLogic()).play();
    }
}
