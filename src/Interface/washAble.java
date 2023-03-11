package Interface;

public interface washAble {// only the class same name with file name can have public 
    void wash();
}

class Smartwatch implements washAble {// only the class same name with file name can have public


    @Override
    public void wash() {
        System.out.println("you can wash this smartwatch without any issue");
    }
}
class Phone implements washAble {
   public void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
    void turnOn(){
        System.out.println("Press the power button to turn me on");
    }
}
class Inverter implements washAble {
public     void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
}