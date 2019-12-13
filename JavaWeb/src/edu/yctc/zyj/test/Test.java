package edu.yctc.zyj.test;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import edu.yctc.zyj.bean.Person;

/**
 * 测试类
 * 
 * @author 赵宜珺
 *
 */
public class Test {

    public static void main(String[] args)
        throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Person person = new Person();
        BeanUtils.setProperty(person, "name", "Tom");
        BeanUtils.setProperty(person, "age", 31);
        String name = BeanUtils.getProperty(person, "name");
        String age = BeanUtils.getProperty(person, "age");
        System.out.print(name + " is " + age);
    }

}
