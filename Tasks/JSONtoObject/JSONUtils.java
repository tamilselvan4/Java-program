package Tasks.JSONtoObject;

import java.util.HashMap;
import java.util.Map;

class JSONUtils {
    public static String mapToJSON(Map<String, Object> map) {
        StringBuilder json = new StringBuilder("{");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            json.append("\"").append(entry.getKey()).append("\":");
            if (entry.getValue() instanceof String) {
                json.append("\"").append(entry.getValue()).append("\",");
            } else {
                json.append(entry.getValue()).append(",");
            }
        }
        if (json.length() > 1) {
            json.deleteCharAt(json.length() - 1);
        }
        json.append("}");
        return json.toString();
    }

    public static Map<String, Object> jsonToMap(String json) {
        Map<String, Object> map = new HashMap<>();
        String[] keyValuePairs = json.substring(1, json.length() - 1).split(",");
        for(String pair : keyValuePairs) {
            String[] keyValue = pair.split(":");
            String key = keyValue[0].replaceAll("\"", "").trim();
            String value = keyValue[1].trim();
            if (value.startsWith("\"") && value.endsWith("\"")) {
                value = value.substring(1, value.length() - 1);
            }
            map.put(key, value);
        }
        return map;
    }
}
