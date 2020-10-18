package day20201014;

/**
 * @author KouBeisi
 * @date 2020/10/13
 * 值传递
 */
public class ArgsDemo {
    public static void main(String[] args) {

        int a = 2;

        String str = "hello";
        Integer i = 10;

        Person xiaoming = new Person("xiaoming");

        change(a, str, i, xiaoming);

        System.out.println(a);
        System.out.println(str);
        System.out.println(i);
        System.out.println(xiaoming);
    }

    public static void change(int a,String str,Integer i,Person person){
        a = 3;
        str = str + "world";
        i =20;
        person.name = "xiaohuang";
    }

    static class Person{
        private String name;
        public Person(String name){
            this.name = name;
        }
    }
}
