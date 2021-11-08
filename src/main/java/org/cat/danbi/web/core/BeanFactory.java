package org.cat.danbi.web.core;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {

    private Map<String, Object> map;


    /**
     * 미리 빈을 생성해 놓는다
     */
    public BeanFactory() {
        map = new HashMap<>();
        map.put("samsung", new SamsungTV());
        map.put("lg", new LgTV());
    }


    /**
     * 미리 생성해 놓은 빈을 리턴한다.
     */
    public Object getBean(String name) {
        return map.get(name);
    }
}
