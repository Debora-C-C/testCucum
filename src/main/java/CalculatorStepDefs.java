import calculator.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorStepDefs {

    @Test
    public void myTest() {

    }

    Calculator calculator;
    @Given("I have first number {int}")
    public void iHaveFirstNumber(int first) {

        calculator = new Calculator();
        calculator.insertFirst(first);
    }

    @Given("I have second number {int}")
    public void iHaveSecondNumber(int second) {

        calculator.insertSecond(second);
    }

    @When("I add the numbers")
    public void iAddTheNumbers() {

        calculator.add();

    }

    @Then("I get {int} as result")
    public void iGetAsResult(int expected) {

        int actual = calculator.getResult();

        assertEquals(expected, actual);
    }
}
