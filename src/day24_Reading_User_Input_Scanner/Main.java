package day24_Reading_User_Input_Scanner;

class Student {
    String name;
    static String school = "XYZ Koleji";
}
class deneme2{

}
class Person {

}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ahmet";

        Student s2 = new Student();
        s2.name = "Elif";

        System.out.println(s1.name + " -> " + Student.school);
        System.out.println(s2.name + " -> " + Student.school);
    }

    public static void deneme(){

    }

}
