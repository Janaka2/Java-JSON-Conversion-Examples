import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

class Person {
  private String name;
  private int age;

  public Person() {}

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

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

  @Override
  public String toString() {
    return "Person{name='" + name + "', age=" + age + '}';
  }
}

public class CustomObjectExample {
  public static void main(String[] args) {
    ObjectMapper objectMapper = new ObjectMapper();

    // Example 1: Convert a custom Java object to JSON
    Person personValue = new Person("Alice", 30);
    try {
      String json = objectMapper.writeValueAsString(personValue);
      System.out.println(json); // Output: {"name":"Alice","age":30}
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Example 2: Convert a JSON object to a custom Java object
    String json = "{\"name\":\"Alice\", \"age\":30}";
    try {
      Person personValueFromJson = objectMapper.readValue(json, Person.class);
      System.out.println(personValueFromJson); // Output: Person{name='Alice', age=30}
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
