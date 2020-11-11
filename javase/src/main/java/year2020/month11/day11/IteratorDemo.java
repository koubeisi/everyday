package year2020.month11.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Iterator 与 ListIterator 的区别
 * @author KouBeisi
 * @date 2020/11/10
 */
public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Tom", "Jack", "Harry", "Trump"));

//        list.remove(1);
//        list.remove(2);

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            if ("Jack".equals(next)) {
//                iterator.remove();
                list.remove(next);
            }
        }

        System.out.println(list.toString());


        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            System.out.println(next);

        }
    }
}
