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
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            factory.setNamespaceAware(true);
            builder = factory.newDocumentBuilder();
            // создаем пустой объект Document, в котором будем создавать наш xml-файл
            Document doc = builder.newDocument();
            // создаем корневой элемент
            Element rootElement = doc.createElement("document");
            // добавляем namespace
            rootElement.setAttribute( "xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            rootElement.setAttribute("xmlns:xs", "http://www.w3.org/2001/XMLSchema");
            rootElement.setAttribute("xmlns:tns", "http://www.airtaero.com/Alyoshka");
            // добавляем корневой элемент в объект Document
            doc.appendChild(rootElement);
            // добавим header
            Element node1 = doc.createElement("header");
            rootElement.appendChild(node1);
            node1.appendChild(doc.createTextNode("value"));

            Element node2 = doc.createElement("feader");

//            String node3 = doc.getNodeName("header");
//
//            System.out.println(node3);

            //rootElement.appendChild(getNode(doc, "header"));
//            rootElement.appendChild(getNodeElements(doc, "header","456"));
//            rootElement.appendChild(getNode(doc, "header","dataType","ar"));
//            rootElement.appendChild(getNode(doc, "header","version","1"));
//            rootElement.appendChild(getNode(doc, "header","subversion","0"));

            printConsoleXML(doc);
        } catch (Exception e) { e.printStackTrace(); }
    }

    private static void setNode(Document doc, String nodeName) {
        doc.createElement(nodeName);
    }

    private static void setNodeElements(Document doc, Node node, String value) {
        node.appendChild(doc.createTextNode(value));
    }

//    private static Node getNodeElements(Document doc, Node node, String value) {
//        node.appendChild(doc.createTextNode(value));
//        return node;
//    }

//    private static Node getNode(Node node, String value) {
//        node.getNodeValue(value);
//        return node;
//    }


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
