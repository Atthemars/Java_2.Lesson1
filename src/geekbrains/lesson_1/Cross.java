package geekbrains.lesson_1;

public class Cross extends Obstacle{
    private int length;
    public Cross (int length) {
        this.length = length;
    }

    @Override
    String doIt(Competitor competitor) {
        return competitor.run(length);
    }
}
