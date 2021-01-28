package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import javax.naming.Context;

public class CustomListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {

        System.out.println("Starts Test execution "+iTestResult.getName());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println("Test execution Success "+iTestResult.getName());

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        System.out.println("Test execution FAILED "+iTestResult.getName());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

        System.out.println("Skips Test execution "+iTestResult.getName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

        System.out.println("Test execution fails but success percentage "+iTestResult.getName());

    }

    @Override
    public void onStart(ITestContext iTestContext) {

        System.out.println("Starts Test execution "+iTestContext.getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {

        System.out.println("Finishes Test execution "+iTestContext.getName());
    }

}
