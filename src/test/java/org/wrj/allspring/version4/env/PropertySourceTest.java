package org.wrj.allspring.version4.env;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.Environment;

/**
 * Created by wangrenjun on 2017/3/13.
 */
public class PropertySourceTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new GenericApplicationContext();
        Environment env = ctx.getEnvironment();
        boolean containsFoo = env.containsProperty("PATH");
        System.out.println("Does my environment contain the 'foo' property? " + containsFoo);
    }
}
