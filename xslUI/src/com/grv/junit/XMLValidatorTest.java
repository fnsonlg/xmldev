package com.grv.junit;

import org.apache.xerces.impl.XML11EntityScanner;
import org.apache.xerces.util.LocatorProxy;
import org.junit.After;
import org.junit.Before;
import org.xml.sax.SAXParseException;

import com.grv.xml.XMLValidator;

/**
 * The class <code>XMLValidatorTest</code> contains tests for the class
 * <code>{@link XMLValidator}</code>.
 * 
 * @generatedBy CodePro at 9/06/12 12:49 PM
 * @author gauravve
 * @version $Revision: 1.0 $
 */
public class XMLValidatorTest {
    /**
     * Launch the test.
     * 
     * @param args
     *            the command line arguments
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */
    public static void main(String[] args) {
	new org.junit.runner.JUnitCore().run(XMLValidatorTest.class);
    }

    /**
     * Perform pre-test initialization.
     * 
     * @throws Exception
     *             if the initialization fails for some reason
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */
    @Before
    public void setUp() throws Exception {
	// add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     * 
     * @throws Exception
     *             if the clean-up fails for some reason
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */
    @After
    public void tearDown() throws Exception {
	// Add additional tear down code here
    }

    /**
     * Run the void error(SAXParseException) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */

    public void testError_1() throws Exception {
	XMLValidator fixture = new XMLValidator();
	fixture.error(new SAXParseException("", new LocatorProxy(new XML11EntityScanner())));
	fixture.validationError = true;
	SAXParseException exception = new SAXParseException("", new LocatorProxy(new XML11EntityScanner()));

	fixture.error(exception);

	// add additional test code here
    }

    /**
     * Run the void fatalError(SAXParseException) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */

    public void testFatalError_1() throws Exception {
	XMLValidator fixture = new XMLValidator();
	fixture.error(new SAXParseException("", new LocatorProxy(new XML11EntityScanner())));
	fixture.validationError = true;
	SAXParseException exception = new SAXParseException("", new LocatorProxy(new XML11EntityScanner()));

	fixture.fatalError(exception);

	// add additional test code here
    }

    /**
     * Run the void main(String[]) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */

    public void testMain_1() throws Exception {
	String[] argv = new String[] {};

	XMLValidator.main(argv);

	// add additional test code here
    }

    /**
     * Run the void validateSchema(String,String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */

    public void testValidateSchema_1() throws Exception {
	XMLValidator fixture = new XMLValidator();
	fixture.error(new SAXParseException("", new LocatorProxy(new XML11EntityScanner())));
	fixture.validationError = true;
	String SchemaUrl = "";
	String XmlDocumentUrl = "";

	fixture.validateSchema(SchemaUrl, XmlDocumentUrl);

	// add additional test code here
    }

    /**
     * Run the void validateSchema(String,String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */

    public void testValidateSchema_2() throws Exception {
	XMLValidator fixture = new XMLValidator();
	fixture.error(new SAXParseException("", new LocatorProxy(new XML11EntityScanner())));
	fixture.validationError = true;
	String SchemaUrl = "";
	String XmlDocumentUrl = "";

	fixture.validateSchema(SchemaUrl, XmlDocumentUrl);

	// add additional test code here
    }

    /**
     * Run the void validateSchema(String,String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */

    public void testValidateSchema_3() throws Exception {
	XMLValidator fixture = new XMLValidator();
	fixture.error(new SAXParseException("", new LocatorProxy(new XML11EntityScanner())));
	fixture.validationError = false;
	String SchemaUrl = "";
	String XmlDocumentUrl = "";

	fixture.validateSchema(SchemaUrl, XmlDocumentUrl);

	// add additional test code here
    }

    /**
     * Run the void validateSchema(String,String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */

    public void testValidateSchema_4() throws Exception {
	XMLValidator fixture = new XMLValidator();
	fixture.error(new SAXParseException("", new LocatorProxy(new XML11EntityScanner())));
	fixture.validationError = true;
	String SchemaUrl = "";
	String XmlDocumentUrl = "";

	fixture.validateSchema(SchemaUrl, XmlDocumentUrl);

	// add additional test code here
    }

    /**
     * Run the void validateSchema(String,String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */

    public void testValidateSchema_5() throws Exception {
	XMLValidator fixture = new XMLValidator();
	fixture.error(new SAXParseException("", new LocatorProxy(new XML11EntityScanner())));
	fixture.validationError = true;
	String SchemaUrl = "";
	String XmlDocumentUrl = "";

	fixture.validateSchema(SchemaUrl, XmlDocumentUrl);

	// add additional test code here
    }

    /**
     * Run the void validateSchema(String,String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */

    public void testValidateSchema_6() throws Exception {
	XMLValidator fixture = new XMLValidator();
	fixture.error(new SAXParseException("", new LocatorProxy(new XML11EntityScanner())));
	fixture.validationError = true;
	String SchemaUrl = "";
	String XmlDocumentUrl = "";

	fixture.validateSchema(SchemaUrl, XmlDocumentUrl);

	// add additional test code here
    }

    /**
     * Run the void validateSchema(String,String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */

    public void testValidateSchema_7() throws Exception {
	XMLValidator fixture = new XMLValidator();
	fixture.error(new SAXParseException("", new LocatorProxy(new XML11EntityScanner())));
	fixture.validationError = true;
	String SchemaUrl = "";
	String XmlDocumentUrl = "";

	fixture.validateSchema(SchemaUrl, XmlDocumentUrl);

	// add additional test code here
    }

    /**
     * Run the void warning(SAXParseException) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */

    public void testWarning_1() throws Exception {
	XMLValidator fixture = new XMLValidator();
	fixture.error(new SAXParseException("", new LocatorProxy(new XML11EntityScanner())));
	fixture.validationError = true;
	SAXParseException exception = new SAXParseException("", new LocatorProxy(new XML11EntityScanner()));

	fixture.warning(exception);

	// add additional test code here
    }

    /**
     * Run the XMLValidator() constructor test.
     * 
     * @generatedBy CodePro at 9/06/12 12:49 PM
     */

    public void testXMLValidator_1() throws Exception {
	XMLValidator result = new XMLValidator();
	// assertNotNull(result);
	// add additional test code here
    }
}