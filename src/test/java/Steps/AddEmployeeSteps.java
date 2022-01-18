package Steps;

import Utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
        pimOption.click();

        WebElement employeeListOption = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        employeeListOption.click();
    }

    @When("user clicks on Add employee button")
    public void user_clicks_on_add_employee_button() {
        WebElement addEmployee=driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployee.click();
    }
    @When("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname() {

    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        WebElement saveBtn=driver.findElement(By.id("btnSave"));
        saveBtn.click();
    }
    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee added successfully");
    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String firstName, String lastName) {
        WebElement firstNameLoc=driver.findElement(By.id("firstName"));
        firstNameLoc.sendKeys(firstName);
        WebElement lastNameLoc=driver.findElement(By.id("lastName"));
        lastNameLoc.sendKeys(lastName);

    }
    @When("user add multiple employees and verify they are added")
    public void user_add_multiple_employees_and_verify_they_are_added(DataTable dataTable) throws InterruptedException { //import datatable here
       List<Map<String,String>> employeeNames = dataTable.asMaps();

       for(Map<String,String> emp : employeeNames){
           String firstNameValue = emp.get("firstName");
           String lastNameValue = emp.get("lastName");

           WebElement firstNameLoc=driver.findElement(By.id("firstName"));
           firstNameLoc.sendKeys(firstNameValue);
           WebElement lastNameLoc=driver.findElement(By.id("lastName"));
           lastNameLoc.sendKeys(lastNameValue);

           WebElement saveBtn=driver.findElement(By.id("btnSave"));
           saveBtn.click();

           //Assertions
           Thread.sleep(1000);
           //to come back again and add employee bcuz hooks and backround work just one time and it will be faster then oppening the browser again
           WebElement addEmployee=driver.findElement(By.id("menu_pim_addEmployee"));
           addEmployee.click();


       }
    }

}
