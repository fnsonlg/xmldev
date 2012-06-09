package com.grv.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLValidator extends DefaultHandler {
    public static void main(String[] argv) {
	System.out.println("Verma");
	long startTime = System.currentTimeMillis();
	String SchemaUrl = "aseXMLR16/aseXML_r16.xsd";
	String XmlDocumentUrl = "asexml.xml";
	XMLValidator validator = new XMLValidator();
	validator.validateSchema(SchemaUrl, XmlDocumentUrl);
	System.out.println("Gaurav");
	System.out.println("Time taken " + (System.currentTimeMillis() - startTime));
    }

    public boolean validationError = false;

    public SAXParseException saxParseException = null;

    @Override
    public void error(SAXParseException exception) throws SAXException {
	validationError = true;
	saxParseException = exception;
    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {
	validationError = true;
	saxParseException = exception;
    }

    public void validateSchema(String SchemaUrl, String XmlDocumentUrl) {
	try {
	    System.setProperty("javax.xml.parsers.DocumentBuilderFactory", "org.apache.xerces.jaxp.DocumentBuilderFactoryImpl");
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    factory.setNamespaceAware(true);
	    factory.setValidating(true);
	    factory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaLanguage", "http://www.w3.org/2001/XMLSchema");
	    factory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaSource", SchemaUrl);
	    DocumentBuilder builder = factory.newDocumentBuilder();

	    builder.setErrorHandler(this);
	    builder.parse(XmlDocumentUrl);
	    if (this.validationError == true) {
		System.out.println("XML Document has Error:" + this.validationError + " " + this.saxParseException.getMessage());
	    } else {
		System.out.println("XML Document is valid");
	    }
	} catch (java.io.IOException ioe) {
	    System.out.println("IOException " + ioe.getMessage());
	} catch (SAXException e) {
	    System.out.println("SAXException" + e.getMessage());
	} catch (ParserConfigurationException e) {
	    System.out.println("ParserConfigurationException                    " + e.getMessage());
	}
    }

    @Override
    public void warning(SAXParseException exception) throws SAXException {
    }
}
