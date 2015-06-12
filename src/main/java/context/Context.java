package context;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<Class<?>, Object> context = new HashMap<Class<?>, Object>();

    public void add(Class<?> clazz, Object object) {
        if(context.containsKey(clazz))
            throw new RuntimeException("Element already added!");
        context.put(clazz, object);
    }

    public Object get(Class<?> clazz) {
        return context.get(clazz);
    }
}
