package year2020.month10.day20201030;

import lombok.*;

import java.math.BigDecimal;

/**
 * @author KouBeisi
 * @date 2020/11/4
 */
public class Lombok02 {

    public static void main(String[] args) {
        new Person();
        new Dog("小白",3);
        new Cat();
        new Car("蔚蓝",new BigDecimal(2400000));
    }

}

@NoArgsConstructor
class Person{
    private String name;
    private Integer age;
}

@AllArgsConstructor
class Dog{
    private String name;
    private Integer age;
}

@RequiredArgsConstructor
@EqualsAndHashCode
class Cat{
    private String name;
    private Integer age;
}

@RequiredArgsConstructor
@EqualsAndHashCode
class Car{
    private final String name;
    private final BigDecimal price;
}

@Setter
@Getter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
class Tree{
    private final String name;
    private Integer age;
}