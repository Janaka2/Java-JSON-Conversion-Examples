import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Add getters and setters for name and age
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

public class Main2 {
  public static void main(String[] args) {
    // Create a HashMap with objects as values
    Map<String, Object> hashMap = new HashMap<>();
    hashMap.put("key1", new Person("Alice", 30));
    hashMap.put("key2", new Person("Bob", 25));

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
