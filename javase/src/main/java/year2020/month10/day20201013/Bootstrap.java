package year2020.month10.day20201013;

/**
 * @author KouBeisi
 * @date 2020/10/13
 */
public class Bootstrap {

    public static void main(String[] args) {
        /*
         * 初始化一个类的方法：
         * - 调用类的静态方法
         * - 动态加载该类
         *
         * 所谓初始化该类即调用该类的<clint>方法，该方法包括：
         * - 静态代码块
         * - 静态变量
         *  注意：静态代码块和静态变量的执行顺序依代码的顺序
         */
//        Father.method();
        try {
            Class.forName(Father.class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

//         new 一个对象时，会实例化该类
//        Father father = new Father();

        // 调用子类的静态方法时，会先初始化父类的静态方法
//        Son.method();

//        new Son();
//        System.out.println();
//        new Son();

    }
}
