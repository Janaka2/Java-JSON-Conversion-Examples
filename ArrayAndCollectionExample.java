import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ArrayAndCollectionExample {
  public static void main(String[] args) {
    ObjectMapper objectMapper = new ObjectMapper();

    // Example 1: Convert a List to JSON
    List<String> listValue = Arrays.asList("apple", "banana", "orange");
    try {
      String json = objectMapper.writeValueAsString(listValue);
      System.out.println(json); // Output: ["apple", "banana", "orange"]
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Example 2: Convert a JSON array to a List
    String json = "[\"apple\", \"banana\", \"orange\"]";
    try {
      List<String> listValueFromJson = objectMapper.readValue(json, new TypeReference<List<String>>() {});
      System.out.println(listValueFromJson); // Output: [apple, banana, orange]
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
