package year2020.month11.day10;

/**
 * @author KouBeisi
 * @date 2020/11/10
 */
public class InnerClass {

    class Person{
        private String name;
        private Integer age;

        public Person(String name,Integer age){
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        // 创建普通内部类方式一
        InnerClass ic = new InnerClass();
        InnerClass.Person person = ic.new Person("Jack",32);
        // 创建普通内部类方式二
        new InnerClass().new Person("Tom",24);
    }
}
