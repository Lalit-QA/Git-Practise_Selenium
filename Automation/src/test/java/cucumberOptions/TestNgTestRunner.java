package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
	//	features="src/test/java/features/Login.feature",
		glue="stepDefination")
       //glue --> binds stepDefination with features
//stepNotifications=true --->in testNg we dont use stepNotif
//in testngrunner --> we dont use @RunWith(Cucumber.class) (if use gives error)
//in glue ---> mention the package name i.e stepDefination
//in glue -->if mention file name i.e "loginStepDefination" then we will encounter error
//features="src/test/java/features", --> will select all feature files present in features package
//If features="src/test/java/features/Login.feature", --->will select only Login.feature present in features package
//Q.What is the difference between testNg runner and junit runner
//In junit we use → runwith annotation to trigger our feature files 
//Nd in TestNg → we extends class AbstractTestNgcucmberTests

//Q.Which runner you have used to run cucumber test
//--> testNg test runner or Junit test runner
//---> either use junit or testng dependencies in pom. if used both may cause error in prog
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
