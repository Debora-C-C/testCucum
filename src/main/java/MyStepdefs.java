import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("My family wanted to have tacos on Friday")
    public void myFamilyWantedToHaveTacosOnFriday() {
        System.out.println("It´s taco Friday with family!");
    }

    @Given("I bought all the ingredients to prepare tacos")
    public void iBoughtAllTheIngredientsToPrepareTacos() {
        System.out.println("We have all the ingredients ;)");
    }

    @When("I have cooked all the ingredients")
    public void iHaveCookedAllTheIngredients() {
        System.out.println("All cooked, set and done!");
    }

    @Then("We make and eat tacos")
    public void weMakeAndEatTacos() {
        System.out.println("Time to make and eat some tacos!");
    }
}
