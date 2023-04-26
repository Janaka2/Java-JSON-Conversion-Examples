import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class PrimitiveTypesExample {
  public static void main(String[] args) {
    ObjectMapper objectMapper = new ObjectMapper();

    // Example 1: Convert an int to JSON
    int intValue = 42;
    try {
      String json = objectMapper.writeValueAsString(intValue);
      System.out.println(json); // Output: 42
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Example 2: Convert a JSON number to an int
    String json = "42";
    try {
      int intValueFromJson = objectMapper.readValue(json, int.class);
      System.out.println(intValueFromJson); // Output: 42
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
