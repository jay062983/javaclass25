package Interface;

public class WashableTester {
    public static void main(String[] args) {
        washAble[]washAbles={new Smartwatch(),new Phone(),new Inverter()};
    for(washAble was:washAbles){
        was.wash();
    }
    }
}
