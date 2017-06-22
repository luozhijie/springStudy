package com.lzj.springtest15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lzj.springtest4.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("testBean")
public class Test {

    private Map<String, String> map;
    private List<String> list;

    public Test() {
        map = new HashMap<String, String>();
        map.put("MapA", "This is MapA");
        map.put("MapB", "This is MapB");
        map.put("MapC", "This is MapC");

        list = new ArrayList<String>();
        list.add("List0");
        list.add("List1");
        list.add("List2");

    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }


    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/lzj/springtest15/beans.xml");
        Customer c = (Customer) applicationContext.getBean("customerBean");
        System.out.println(c.toString());
    }
}