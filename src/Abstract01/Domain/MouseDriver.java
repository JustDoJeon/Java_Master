package Abstract01.Domain;

public class MouseDriver {
    public static void main(String[] args) {
        Mouse mickey = new Mouse();
        mickey.name = "혜슈";
        mickey.age = 26;
        mickey.countOftail = 1;


        mickey.sing();

        mickey = null;

        Mouse jerry = new Mouse();

        jerry.name = "도현";
        jerry.age = 29;
        jerry.countOftail = 0;

        jerry.sing();

    }
}
