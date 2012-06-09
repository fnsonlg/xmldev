package com.grv.xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLValidator extends DefaultHandler {

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

    public void validateSchema(String SchemaUrl, String XmlDocumentUrl) throws IOException, SAXException, ParserConfigurationException {
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
	    throw ioe;

	} catch (SAXException saxe) {
	    System.out.println("SAXException" + saxe.getMessage());
	    throw saxe;

	} catch (ParserConfigurationException e) {
	    System.out.println("ParserConfigurationException" + e.getMessage());
	    throw e;
	}
    }

    @Override
    public void warning(SAXParseException exception) throws SAXException {
    }
}
