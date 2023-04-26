import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    // Create a HashMap
    Map<String, Object> hashMap = new HashMap<>();
    hashMap.put("key1", "value1");
    hashMap.put("key2", 42);
    hashMap.put("key3", true);

    // Convert the HashMap to JSON
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      String json = objectMapper.writeValueAsString(hashMap);
      System.out.println(json);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
