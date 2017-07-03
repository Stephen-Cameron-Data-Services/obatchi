package au.com.scds.obatchi.dom.base.mixins;

import java.util.List;

import javax.inject.Inject;

import org.apache.isis.applib.annotation.Action;
import org.apache.isis.applib.annotation.ActionLayout;
import org.apache.isis.applib.annotation.Contributed;
import org.apache.isis.applib.annotation.Mixin;

import au.com.scds.obatchi.dom.base.Producer;
import au.com.scds.obatchi.dom.base.ProductItem;
import au.com.scds.obatchi.dom.base.ProductLine;
import au.com.scds.obatchi.dom.base.ProductType;
import au.com.scds.obatchi.dom.base.Sale;
import au.com.scds.obatchi.dom.base.SaleLine;
import au.com.scds.obatchi.dom.base.repository.SaleRepository;

public class SalesMixins {
	
	@Mixin
	public static class Sale_addSaleLine {

		private final Sale sale;

		public Sale_addSaleLine(Sale sale) {
			this.sale = sale;
		}

		@Action()
		@ActionLayout(contributed = Contributed.AS_ACTION)
		public SaleLine $$(ProductLine product) {
			SaleLine line = saleRepo.createSaleLine(this.sale, product);
			this.sale.getLines().add(line);
			return line;
		}

		@Inject
		SaleRepository saleRepo;
	}
}
