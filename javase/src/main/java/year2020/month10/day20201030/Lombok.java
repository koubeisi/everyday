package year2020.month10.day20201030;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import lombok.var;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author KouBeisi
 * @date 2020/10/29
 */
@Slf4j
public class Lombok {

    public String val() {
        val example = new ArrayList<String>();
        example.add("Hello");
        example.add("World");
        val foo = example.get(0);

        for(val item:example){
            log.info(item);
        }
        return foo.toLowerCase();
    }

    public String var() {
        var example = new ArrayList<String>();
        example.add("Hello");
        example.add("World");
        val foo = example.get(0);

        for(var item:example){
            log.info(item);
        }
        return foo.toLowerCase();
    }

}
