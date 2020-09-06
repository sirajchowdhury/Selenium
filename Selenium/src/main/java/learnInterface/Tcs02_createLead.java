package learnInterface;

import org.testng.annotations.Test;

public class Tcs02_createLead extends Tcs01_login {

	@Test
	public void createlead() {
		
	clickByLinkText("Create Lead");
	enterById("createLeadForm_companyName", "Sylhet Computer Institute");
	enterById("createLeadForm_firstName", "Daiyan");
	enterById("createLeadForm_lastName", "Chowdhury");
	SelectValueById("createLeadForm_industryEnumId", "IND_SOFTWARE");
	clickByClassName("smallSubmit");
		
	}
}
