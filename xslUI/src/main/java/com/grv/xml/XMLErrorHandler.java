package com.grv.xml;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLErrorHandler extends DefaultHandler {
    public boolean validationError = false;
    public SAXParseException saxParseException = null;

    @Override
    public void error(SAXParseException exception) throws SAXException {
	this.validationError = true;
	this.saxParseException = exception;
    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {
	this.validationError = true;
	this.saxParseException = exception;
    }

    @Override
    public void warning(SAXParseException exception) throws SAXException {
    }
}