package com.wang.beetl;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.StringTemplateResourceLoader;

import java.io.IOException;
import java.util.HashMap;

public class GroupTemplateTest {



        public static void main(String[] args) throws IOException {

            HashMap<String, String> map = new HashMap<>();
            Template t = getTemplate("a");
            map.put("name","123");
            map.put("age","000");
            t.binding(map);
            String str = t.render();
        System.out.println(str);
    }

    private static Template getTemplate(String s) throws IOException {
        StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template t=null;
        t=gt.getTemplate(com.wang.beetl.Template.abc);
        return t;
    }
}
