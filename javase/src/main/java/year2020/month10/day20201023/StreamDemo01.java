package year2020.month10.day20201023;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author koubs
 * @date 2020/10/22
 */
@Slf4j
public class StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("world");
        list.add("!");
        list.forEach(str -> log.info(str + " "));
        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        collect.forEach(log::info);
    }
}
