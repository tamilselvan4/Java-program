package Tasks.JSONtoObject;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class JSONConverter<T> {

    public String toJSON(T obj) throws IllegalAccessException {
        Class<?> cls = obj.getClass();
        Map<String, Object> jsonMap = new HashMap<>();

        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            jsonMap.put(field.getName(), field.get(obj));
        }

        return JSONUtils.mapToJSON(jsonMap);
    }

    public T fromJSON(String json, Class<T> cls) throws InstantiationException, IllegalAccessException {
        Map<String, Object> jsonMap = JSONUtils.jsonToMap(json);
        T obj = cls.newInstance();

        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            if (jsonMap.containsKey(field.getName())) {
                Object value = jsonMap.get(field.getName());
                if (field.getType() == int.class) {
                    int intValue = Integer.parseInt(value.toString());
                    field.set(obj, intValue);
                } else {
                    field.set(obj, value);
                }
            }
        }

        return obj;
    }
}
