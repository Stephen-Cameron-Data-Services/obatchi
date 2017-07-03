package au.com.scds.obatchi.dom.base.mixins;

import java.util.List;

import javax.inject.Inject;

import org.apache.isis.applib.annotation.Action;
import org.apache.isis.applib.annotation.ActionLayout;
import org.apache.isis.applib.annotation.Contributed;
import org.apache.isis.applib.annotation.Mixin;

import au.com.scds.obatchi.dom.base.Batch;
import au.com.scds.obatchi.dom.base.Producer;
import au.com.scds.obatchi.dom.base.ProductItem;
import au.com.scds.obatchi.dom.base.ProductLine;
import au.com.scds.obatchi.dom.base.ProductType;
import au.com.scds.obatchi.dom.base.repository.ProductItemRepository;
import au.com.scds.obatchi.dom.base.repository.ProductLineRepository;
import au.com.scds.obatchi.dom.base.repository.ProductTypeRepository;

public class ProductMixins {
	
	@Mixin
	public static class Producer_addProductLine {

		private final Producer producer;

		public Producer_addProductLine(Producer producer) {
			this.producer = producer;
		}

		@Action()
		@ActionLayout(contributed = Contributed.AS_ACTION)
		public ProductLine $$(String name, ProductType type) {
			ProductLine productLine = productLineRepo.createProductLine(this.producer, name, type);
			this.producer.getProductLines().add(productLine);
			return productLine;
		}

		public List<ProductType> choices1$$() {
			return productTypeRepo.listAllProductTypes();
		}

		@Inject
		ProductLineRepository productLineRepo;
		@Inject
		ProductTypeRepository productTypeRepo;
	}

	@Mixin
	public static class Batch_addProductItem {

		private final Batch batch;

		public Batch_addProductItem(Batch batch) {
			this.batch = batch;
		}

		@Action()
		@ActionLayout(contributed = Contributed.AS_ACTION)
		public void $$(String serialNumber) {
			ProductItem item = productItemRepo.createProductItem(this.batch.getProductLine(), serialNumber);
			item.setBatch(this.batch);
			this.batch.getProductItems().add(item);
			return;
		}

		@Inject
		ProductItemRepository productItemRepo;
	}
}
