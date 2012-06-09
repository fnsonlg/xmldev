package com.grv.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all of
 * the tests within its package as well as within any subpackages of its
 * package.
 * 
 * @generatedBy CodePro at 9/06/12 12:49 PM
 * @author gauravve
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ XMLValidatorTest.class, XMLFormaterTest.class, XSLTransformerTest.class, })
public class TestAll {

    /**
     * Launch the test.
     * 
     * @param args
     *            the command line arguments
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */
    public static void main(String[] args) {
	JUnitCore.runClasses(new Class[] { TestAll.class });
    }
}
