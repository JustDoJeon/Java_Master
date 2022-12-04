package inheritance02;

public class 참새 extends 동물 implements 헤엄칠수있는{

    참새() {
       myClass = "참새";
    }

    @Override
    public void swim() {
        System.out.println(myClass + " 헤엄칠수있는");
    }
}
