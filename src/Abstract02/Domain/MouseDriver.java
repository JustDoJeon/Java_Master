package Abstract02.Domain;

public class MouseDriver {
    public static void main(String[] args) {
        Mouse.countOftail = 2;

        Mouse mickey = new Mouse();
        Mouse jerry = new Mouse();
        Mouse mightyMouse = new Mouse();
        System.out.println(mickey.getCountOfTail());
        System.out.println(jerry.getCountOfTail());
        System.out.println(mightyMouse.getCountOfTail());

        System.out.println(Mouse.countOftail);

    }
}
/**
 * 클래스 멤버 vs 객체 멤버  = static 멤버 vs 인스턴스 멤버
 *
 *
 */
