package polymorphism01;

/**
 * 상위클래스 타입의 객체 참조 변수를 사용하더라도 하위 클래스에서 오버라이딩한 메서드가 호출된다는 사실을 꼭 기억하자
 */
public class Penguin extends Animal {
    public String habitat;

    public void showHabitat() {
        System.out.printf("%s는 %s에 살아 \n", name, habitat);
    }
        //오버라이딩 - 재정의 : 상위클래스의 메서드와 같은 메서드 이름, 같은 인자 리스트
        public void showName() {
            System.out.println("내이름은 알아서 뭐하게요?????");
        }
        //오버로딩 - 중복정의 : 같은 메서드 이름, 다른 인자 리스트
        public void showName(String yourName){
            System.out.printf("%s 안녕, 내이름은 %s라고해\n", yourName,name);
    }

}
