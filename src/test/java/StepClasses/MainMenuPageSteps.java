package StepClasses;

import PageMethods.MainMenuMethods;
import cucumber.api.java.en.Given;

public class MainMenuPageSteps {

    @Given("^the user selects (.*) Subcategory in (.*) Category$")
    public void selectSubCategory(String subCategory , String category) throws Exception {

        MainMenuMethods.MainCategoory(category);
        MainMenuMethods.SubCategoory(subCategory).click();
    }



}
