添加Lombok依赖，编译如下程序，在IDEA中找到编译后的class文件，双击打开
IDEA会自动反编译class文件，对比原文件，了解`@AllArgsConstructor`与`@RequiredArgsConstructor`的
区别，认识`@RequiredArgsConstructor`与`final`关键字的关系

```java
public class Lombok {

}

@AllArgsConstructor
class Dog{
    private String name;
    private Integer age;
}

@RequiredArgsConstructor
class Cat{
    private String name;
    private Integer age;
}

@RequiredArgsConstructor
class Car{
    private final String name;
    private final BigDecimal price;
}
```

然后阅读这篇文章[相见恨晚，一个架构师也不会用的Lombok注解](https://juejin.im/post/6888985072129540103)
学习Lombok与SpringBoot自动注入的最佳实践