import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Date;

public class DateExample {
  public static void main(String[] args) {
    ObjectMapper objectMapper = new ObjectMapper();

    // Example 1: Convert a java.util.Date object to JSON
    Date dateValue = new Date();
    try {
      String json = objectMapper.writeValueAsString(dateValue);
      System.out.println(json); // Output: "2023-04-26T10:15:30.123Z" (example)
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Example 2: Convert a JSON string (ISO 8601 format) to a java.util.Date object
    String json = "\"2023-04-26T10:15:30.123Z\"";
    try {
      Date dateValueFromJson = objectMapper.readValue(json, Date.class);
      System.out.println(dateValueFromJson); // Output: Wed Apr 26 10:15:30 UTC 2023 (example)
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
