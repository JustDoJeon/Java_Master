package inheritance02;

public class Driver {

    public static void main(String[] args) {
        날수있는 날라리1 = new 박쥐();
        날라리1.fly();

        날수있는 날라리2 = new 박쥐();
        날라리2.fly();

        헤엄칠수있는[] 헤헤헤 = new 헤엄칠수있는[2];

        헤헤헤[0] = new 고래();
        헤헤헤[1] = new 펭귄();

        for(헤엄칠수있는 aa : 헤헤헤) {
            aa.swim();
        }

    }
}
