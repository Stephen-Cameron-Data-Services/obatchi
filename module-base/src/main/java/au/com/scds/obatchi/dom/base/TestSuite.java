//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 08:39:06 PM AEDT 
//

package au.com.scds.obatchi.dom.base;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.Join;
import javax.jdo.annotations.PersistenceCapable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

import org.apache.isis.applib.annotation.DomainObject;

/**
 * <p>
 * Java class for TestSuite complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="TestSuite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="test" type="{http://www.example.org/AgricProducerSchema}Test" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="test-group" type="{http://www.example.org/AgricProducerSchema}TestGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestSuite", propOrder = { "tests", "testGroups" })
@DomainObject(objectType = "TestSuite")
@PersistenceCapable(identityType = IdentityType.DATASTORE, schema="obatchi")
@Inheritance(strategy = InheritanceStrategy.NEW_TABLE)
public class TestSuite extends Test {
	
    @XmlElement(name = "test-single")
    @Join
    protected List<TestSingle> tests = new ArrayList<>();
    @XmlElement(name = "test-group")
    @Join
    protected List<TestGroup> testGroups = new ArrayList<>();


    /**
     * Gets the value of the testSingle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSingle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSingle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSingle }
     * 
     * 
     */
    public List<TestSingle> getTests() {
        return this.tests;
    }

    /**
     * Gets the value of the testGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestGroup }
     * 
     * 
     */
    public List<TestGroup> getTestGroups() {
        return this.testGroups;
    }
}