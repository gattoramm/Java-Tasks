package XML.DOMParser;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class DOMxmlWriter {
    public static void main(String[] args) {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            // add elements to Document
            Element rootElement = doc.createElement("document");
            // add xmlns
            rootElement.setAttribute( "xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            rootElement.setAttribute("xmlns:xs", "http://www.w3.org/2001/XMLSchema");
            rootElement.setAttribute("xmlns:tns", "http://www.airtaero.com/Alyoshka");
            // append root element to document
            doc.appendChild(rootElement);

            Element nodeHeader = doc.createElement("header");
            //nodeHeader.appendChild(rootElement);

            // append first child element to root element
            rootElement.appendChild(createUserElement(doc, "ar", "dataType"));
            rootElement.appendChild(createUserElement(doc, "1", "version"));
            rootElement.appendChild(createUserElement(doc, "0", "subversion"));

            // write to console or file
            printConsoleXML(doc);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Node createUserElement(Document doc, String tagName, String firstName) {
        Element node = doc.createElement(firstName);
        node.appendChild(doc.createTextNode(tagName));
        return node;
    }

    private static void printConsoleXML(Document doc) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult console = new StreamResult(System.out);
        //StreamResult file = new StreamResult(new File("E:\\1.xml"));
        transformer.transform(source, console);
    }
}
