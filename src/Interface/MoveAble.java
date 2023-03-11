package Interface;

public interface MoveAble {

    void move();


}
interface Ownable{
    void own();
}
class Car implements MoveAble,Ownable {
   public void move(){
       System.out.println("I can move");
   }

    @Override
    public void own() {
        System.out.println("You can own me");
    }
}
class Dog implements MoveAble,Ownable{

    @Override
    public void move() {
        System.out.println("I can move");

    }

    @Override
    public void own() {
        System.out.println("You can own me");
    }
}