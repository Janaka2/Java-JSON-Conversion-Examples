import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {
    ObjectMapper objectMapper = new ObjectMapper();

    // Example 1: Convert a Map to JSON
    Map<String, Object> mapValue = new HashMap<>();
    mapValue.put("key1", "value1");
    mapValue.put("key2", 42);
    mapValue.put("key3", true);
    try {
      String json = objectMapper.writeValueAsString(mapValue);
      System.out.println(json); // Output: {"key1":"value1","key2":42,"key3":true}
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Example 2: Convert a JSON object to a Map
    String json = "{\"key1\":\"value1\", \"key2\":42, \"key3\":true}";
    try {
      Map<String, Object> mapValueFromJson = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {});
      System.out.println(mapValueFromJson); // Output: {key1=value1, key2=42, key3=true}
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
