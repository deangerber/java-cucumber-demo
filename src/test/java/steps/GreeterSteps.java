package steps;

import com.deangerber.demo.Greeter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterSteps implements cucumber.api.java8.En {
  private Greeter greeter;
  private String greeting = "";

  public GreeterSteps() {
    Given("^a greeter$", () -> {
      greeter = new Greeter();
    });

    When("^given the name \"([^\"]*)\"$", (String name) -> {
      System.out.println(name);
      greeting = greeter.greet(name);
    });

    Then("^it returns the greeting \"([^\"]*)\"$", (String expectedGreeting) -> {
      assertEquals(expectedGreeting, greeting);
    });
  }
}
