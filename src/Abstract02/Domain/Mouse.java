package Abstract02.Domain;


public class Mouse {

    public String name;
    public int age;
    public static int countOftail = 1; //짜피 생성하는 객체의 개수가 다 1이니깐 메모리 낭비를 없애기 위해서

    public void sing() {
        System.out.println(name + "  : 찍찍찍찍찍 쥐새키가 뻔뻔하게 !!!!!!!");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCountOfTail() {
        return countOftail;
    }

    public void setCountOfTail(int countOfTail) {
        countOftail = countOfTail;
    }
}
