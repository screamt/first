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

	@Given("^�ҽ������� \"(.*?)\"$")
	public void �ҽ�������(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^�Ұ����� \"(.*?)\"���$")
	public void �Ұ�����_���(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^�ҵ�δ��������� \"(.*?)\"$")
	public void �ҵ�δ���������(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}