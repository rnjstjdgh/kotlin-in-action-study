package java_code.part1;

public class 코틀린_맛보기 {
    static class Person{
        private String name;
        private int age;

        Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("영희", 12);
        Person person2 = new Person("철수", 29);

    }

    public void crate(){
        Person person1 = new Person("영희", 12);
        Person person2 = new Person("철수", 29);
    }
}
