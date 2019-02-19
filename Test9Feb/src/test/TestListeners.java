package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener
{
	
	@Override
	public void onFinish(ITestContext arg0)
	{
		System.out.println("Completed");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Name of Test Case: "+result.getName()+" PASS");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Name of Test Case: "+result.getName()+" FAIL");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Name of Test Case: "+result.getName()+" SKIP");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Started");
	}

}
