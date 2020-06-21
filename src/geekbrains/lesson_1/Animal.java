package geekbrains.lesson_1;

public class Animal implements Competitor  {
private String type;
private String name;

private int maxRunDistance;
private int maxSwimDistance;
private int maxJumpHeight;

private boolean onDistance;

public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance){
    this.type =  type;
    this.name = name;
    this.maxRunDistance = maxRunDistance;
    this.maxJumpHeight = maxJumpHeight;
    this.maxSwimDistance = maxSwimDistance;
    this.onDistance = true;
}
@Override
    public String run(int distance){
    if (distance <= maxRunDistance){
        return (type + " " + name + " пробежал кросс, малаца!");
    }
    else {
        onDistance = false;
        return (type + " " + name + " не подфортило, так далеко не бегает :'(");

    }
}
@Override
    public String jump(int height){
    if(height <= maxJumpHeight){
        return (type + " " + name + " без шеста перепрыгнул " + height + " meters");
    }
    else{
        onDistance = false;
        return (type + " " + name + " осознал что можно просто обойти, умный!");
    }
}
@Override
    public String swim(int distance){
    if (distance <= maxSwimDistance){
        return (type + " " + name + " справился с заплывом и готов бросить вызов Майклу Фелпсу!");
    }
    else    {
        onDistance = false;
        return  (type + " " + name + " решил что вода слишком холодная, лучше по суще передвигаться");
    }
}
@Override
    public boolean isOnDistance(){
    return onDistance;
}

@Override
    public void info(){
    System.out.println(type + " " + name + " " + onDistance);
}
}
