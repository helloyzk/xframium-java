//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.31 at 07:32:37 AM EDT 
//


package org.xframium.page.element.provider.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.xframium.page.element.provider.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ElementDefinition_QNAME = new QName("http://www.xframium.org/pageRegistry", "elementDefinition");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.xframium.page.element.provider.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistryRoot }
     * 
     */
    public RegistryRoot createRegistryRoot() {
        return new RegistryRoot();
    }

    /**
     * Create an instance of {@link Import }
     * 
     */
    public Import createImport() {
        return new Import();
    }

    /**
     * Create an instance of {@link Site }
     * 
     */
    public Site createSite() {
        return new Site();
    }

    /**
     * Create an instance of {@link Page }
     * 
     */
    public Page createPage() {
        return new Page();
    }

    /**
     * Create an instance of {@link Element }
     * 
     */
    public Element createElement() {
        return new Element();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryRoot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xframium.org/pageRegistry", name = "elementDefinition")
    public JAXBElement<RegistryRoot> createElementDefinition(RegistryRoot value) {
        return new JAXBElement<RegistryRoot>(_ElementDefinition_QNAME, RegistryRoot.class, null, value);
    }

}
