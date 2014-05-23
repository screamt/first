package ngpanwei.bdd.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BacklogStepDefs {
	Backlog backlog = null ;
    @Before
    public void setup() {
        backlog = new Backlog() ;
    }

	@Given("^我建立任务 \"(.*?)\"$")
	public void 我建立任务(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^我把任务 \"(.*?)\"完成$")
	public void 我把任务_完成(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^我的未完成任务有 \"(.*?)\"$")
	public void 我的未完成任务有(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
