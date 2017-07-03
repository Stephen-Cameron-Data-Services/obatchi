package au.com.scds.obatchi.dom.base.mixins;

import javax.inject.Inject;

import org.apache.isis.applib.annotation.Action;
import org.apache.isis.applib.annotation.ActionLayout;
import org.apache.isis.applib.annotation.Contributed;
import org.apache.isis.applib.annotation.Mixin;

import au.com.scds.obatchi.dom.base.Batch;
import au.com.scds.obatchi.dom.base.BatchComponent;
import au.com.scds.obatchi.dom.base.Ingredient;
import au.com.scds.obatchi.dom.base.IngredientSupply;
import au.com.scds.obatchi.dom.base.SiUnit;
import au.com.scds.obatchi.dom.base.repository.BatchRepository;

public class IngredientMixins {
	
	@Mixin
	public static class Batch_addComponent{

		private final Batch batch;

		public Batch_addComponent(Batch batch) {
			this.batch = batch;
		}

		@Action()
		@ActionLayout(contributed = Contributed.AS_ACTION)
		public void $$(Ingredient ingredient, IngredientSupply supply, float quantity, SiUnit unit) {
			BatchComponent component = batchRepo.createComponent(this.batch, supply, ingredient, quantity, unit);
			this.batch.getBatchComponents().add(component);
			return;
		}

		@Inject
		BatchRepository batchRepo;
	}
}
