import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class StringExample {
  public static void main(String[] args) {
    ObjectMapper objectMapper = new ObjectMapper();

    // Example 1: Convert a String to JSON
    String stringValue = "Hello, World!";
    try {
      String json = objectMapper.writeValueAsString(stringValue);
      System.out.println(json); // Output: "Hello, World!"
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Example 2: Convert a JSON string to a String
    String json = "\"Hello, World!\"";
    try {
      String stringValueFromJson = objectMapper.readValue(json, String.class);
      System.out.println(stringValueFromJson); // Output: Hello, World!
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
