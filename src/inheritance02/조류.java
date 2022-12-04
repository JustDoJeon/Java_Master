package inheritance02;

public class 조류 extends 동물 implements 날수있는{

    조류() {
       myClass = "조류";
    }

    @Override
    public void fly() {
        System.out.println(myClass + " 날수있음");
    }
}
