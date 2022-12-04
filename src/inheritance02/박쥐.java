package inheritance02;

public class 박쥐 extends 동물 implements 날수있는{

    박쥐() {
        myClass = "박쥐";
    }

    @Override
    public void fly() {
        System.out.println(myClass + "날수있음 ");
    }
}
