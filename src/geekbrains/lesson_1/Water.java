package geekbrains.lesson_1;

public class Water extends Obstacle {
    private int length;
    public Water(int length){
        this.length = length;
    }
    @Override
    String doIt(Competitor competitor){
        return competitor.swim(length);
    }
}
