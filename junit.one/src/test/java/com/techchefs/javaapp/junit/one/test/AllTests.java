package com.techchefs.javaapp.junit.one.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestBooleanOperation.class, TestMathOperation.class, TestStringOperation.class })
public class AllTests {

}
