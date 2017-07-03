package au.com.scds.obatchi.dom.base.menu;

import java.util.List;

import org.apache.isis.applib.annotation.Action;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.NatureOfService;

import au.com.scds.obatchi.dom.base.Batch;
import au.com.scds.obatchi.dom.base.BatchComponent;
import au.com.scds.obatchi.dom.base.IngredientSupply;
import au.com.scds.obatchi.dom.base.Producer;
import au.com.scds.obatchi.dom.base.ProductItem;
import au.com.scds.obatchi.dom.base.Sample;
import au.com.scds.obatchi.dom.base.TestGroup;
import au.com.scds.obatchi.dom.base.TestSingle;
import au.com.scds.obatchi.dom.base.TestSuite;

@DomainService(nature = NatureOfService.VIEW_MENU_ONLY)
@DomainServiceLayout(named = "Tests", menuOrder = "70")
public class TestMenu70 {

	@Action()
	@MemberOrder(sequence = "1")
	public TestSingle createTestSingle(String name) {
		return testRepo.createTestSingle(name);
	}
	
	@Action()
	@MemberOrder(sequence = "2")
	public TestGroup createTestGroup(String name) {
		return testRepo.createTestGroup(name);
	}
	
	@Action()
	@MemberOrder(sequence = "3")
	public TestSuite createTestSuite(String name) {
		return testRepo.createTestSuite(name);
	}

	@javax.inject.Inject
	TestRepository testRepo;
}
