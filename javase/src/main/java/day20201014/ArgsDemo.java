package day20201014;

import java.util.Arrays;

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
        int[] arr = {1,2,3,4,5};
        Person xiaoming = new Person("xiaoming");

        change(a,str,i,arr,xiaoming);


        System.out.println(a);
        System.out.println(str);
        System.out.println(i);
        System.out.println(Arrays.toString(arr));
        System.out.println(xiaoming);

    }

    public static void change(int a,String str,Integer i,int[] arr,Person person){
        a+=i;
        str = str + "world!";
        i = i + 1;
        arr[0] += 1;
        person.name = "xiaohuang";
    }

    static class Person{
        private String name;
        public Person(String name){
            this.name = name;
        }
    }
}
