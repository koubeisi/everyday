理解了虚拟机栈中栈帧与方法的关系后，来做一个虚拟机栈溢出的实验

运行如下代码

```java
public class StackOverflowErrorDemo {
    private static int count = 1;
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
```

由于程序中的`main方法`递归调用自己且没有终止点，虚拟机栈就会不停的创建栈帧，直至虚拟机栈溢出。

1. 查看程序出错后抛出的异常,找到该异常，使用 IDEA 的 Diagrams 工具查看异常所属类别；
2. 记下`count`的最终值，然后修改`VM option`为 `-Xss256k` 再次运行该程序，对比两次程序结束后的count值