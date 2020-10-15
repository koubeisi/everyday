package day20201014;

/**
 * @author KouBeisi
 * @date 2020/10/13
 * 值传递
 */
public class ArgsDemo {
    public static void main(String[] args) {

        int a = 2;

        String s1 = "hello world";
        Integer i = 10;

        Person xiaoming = new Person("xiaoming");


        change(xiaoming);

    }

    public static void change(Person person){
        person.name = "xiaohuang";
    }

static class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }
}
}
