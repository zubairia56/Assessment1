class Student {
    String name;
    int age;

     Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Person {
    public static void main(String agrs[]) {
        Student S= new Student("Zubairia",21);
        System.out.println(S.name);
        System.out.println(S.age);
    }
}

