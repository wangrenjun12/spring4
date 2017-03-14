package org.wrj.allspring.version4.hook;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by wangrenjun on 2017/3/14.
 */
@Component
public class UserModel extends  BaseModel{

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
