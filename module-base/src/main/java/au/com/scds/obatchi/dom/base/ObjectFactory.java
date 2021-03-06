/*
MIT License

Copyright (c) 2017 Alexander Stephen Cameron (http://stephencamerondataservices.com.au/)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package au.com.scds.obatchi.dom.base;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.scds.agric.fixture.xml.generated package. 
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

    private final static QName _Producer_QNAME = new QName("http://www.example.org/AgricProducerSchema", "producer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.scds.agric.fixture.xml.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Batches }
     * 
     */
    public Batches createBatches() {
        return new Batches();
    }

    /**
     * Create an instance of {@link Batch }
     * 
     */
    public Batch createBatch() {
        return new Batch();
    }

    /**
     * Create an instance of {@link Clients }
     * 
     */
    public Clients createClients() {
        return new Clients();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link Formulations }
     * 
     */
    public Formulations createFormulations() {
        return new Formulations();
    }

    /**
     * Create an instance of {@link Formulation }
     * 
     */
    public Formulation createFormulation() {
        return new Formulation();
    }

    /**
     * Create an instance of {@link Producer }
     * 
     */
    public Producer createProducer() {
        return new Producer();
    }

    /**
     * Create an instance of {@link Samples }
     * 
     */
    public Samples createSamples() {
        return new Samples();
    }

    /**
     * Create an instance of {@link Sample }
     * 
     */
    public Sample createSample() {
        return new Sample();
    }
    
    /**
     * Create an instance of {@link Sample2 }
     * 
     */
    public Sample2 createSample2() {
        return new Sample2();
    }

    /**
     * Create an instance of {@link Sales }
     * 
     */
    public Sales createSales() {
        return new Sales();
    }

    /**
     * Create an instance of {@link Sale }
     * 
     */
    public Sale createSale() {
        return new Sale();
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link CompletedOrderLine }
     * 
     */
    public CompletedOrderLine createCompletedOrderLine() {
        return new CompletedOrderLine();
    }

    /**
     * Create an instance of {@link SaleLine }
     * 
     */
    public SaleLine createSaleLine() {
        return new SaleLine();
    }

    /**
     * Create an instance of {@link SiUnit }
     * 
     */
    public SiUnit createSiUnit() {
        return new SiUnit();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }


    /**
     * Create an instance of {@link Consumer }
     * 
     */
    public Consumer createConsumer() {
        return new Consumer();
    }

    /**
     * Create an instance of {@link TestSuite }
     * 
     */
    public TestSuite createTestSuite() {
        return new TestSuite();
    }

    /**
     * Create an instance of {@link IngredientSupplier }
     * 
     */
    public IngredientSupplier createIngredientSupplier() {
        return new IngredientSupplier();
    }

    /**
     * Create an instance of {@link BatchComponent }
     * 
     */
    public BatchComponent createBatchComponent() {
        return new BatchComponent();
    }

    /**
     * Create an instance of {@link IngredientManufacturer }
     * 
     */
    public IngredientManufacturer createIngredientManufacturer() {
        return new IngredientManufacturer();
    }

    /**
     * Create an instance of {@link IngredientSupply }
     * 
     */
    public IngredientSupply createIngredientSupply() {
        return new IngredientSupply();
    }

    /**
     * Create an instance of {@link ScheduledOrderLine }
     * 
     */
    public ScheduledOrderLine createScheduledOrderLine() {
        return new ScheduledOrderLine();
    }

    /**
     * Create an instance of {@link ProductLine }
     * 
     */
    public ProductLine createProductLine() {
        return new ProductLine();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Receipt }
     * 
     */
    public Receipt createReceipt() {
        return new Receipt();
    }

    /**
     * Create an instance of {@link FormulationComponent }
     * 
     */
    public FormulationComponent createFormulationComponent() {
        return new FormulationComponent();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }
    
    /**
     * Create an instance of {@link TestMultiple }
     * 
     */
    public TestMultiple createTestMultiple() {
        return new TestMultiple();
    }

    /**
     * Create an instance of {@link TestGroup }
     * 
     */
    public TestGroup createTestGroup() {
        return new TestGroup();
    }

    /**
     * Create an instance of {@link TestSingle }
     * 
     */
    public TestSingle createTestSingle() {
        return new TestSingle();
    }

    /**
     * Create an instance of {@link Specification }
     * 
     */
    public Specification createSpecification() {
        return new Specification();
    }

    /**
     * Create an instance of {@link FormulationStep }
     * 
     */
    public FormulationStep createFormulationStep() {
        return new FormulationStep();
    }

    /**
     * Create an instance of {@link Ingredient }
     * 
     */
    public Ingredient createIngredient() {
        return new Ingredient();
    }

    /**
     * Create an instance of {@link ProductPack }
     * 
     */
    public ProductPack createProductPack() {
        return new ProductPack();
    }

    /**
     * Create an instance of {@link PurchaseOrder }
     * 
     */
    public PurchaseOrder createPurchaseOrder() {
        return new PurchaseOrder();
    }

    /**
     * Create an instance of {@link Delivery }
     * 
     */
    public Delivery createDelivery() {
        return new Delivery();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link ProductItem }
     * 
     */
    public ProductItem createProductItem() {
        return new ProductItem();
    }

    /**
     * Create an instance of {@link FormulationMethod }
     * 
     */
    public FormulationMethod createFormulationMethod() {
        return new FormulationMethod();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Producer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/AgricProducerSchema", name = "producer")
    public JAXBElement<Producer> createProducer(Producer value) {
        return new JAXBElement<Producer>(_Producer_QNAME, Producer.class, null, value);
    }

}
