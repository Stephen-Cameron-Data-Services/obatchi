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

package au.com.scds.obatchi.dom.base.menu;

import java.util.List;

import org.apache.isis.applib.annotation.Action;
import org.apache.isis.applib.annotation.ActionLayout;
import org.apache.isis.applib.annotation.BookmarkPolicy;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.NatureOfService;
import org.apache.isis.applib.annotation.Optionality;
import org.apache.isis.applib.annotation.Parameter;
import org.apache.isis.applib.annotation.ParameterLayout;
import org.apache.isis.applib.annotation.SemanticsOf;

import au.com.scds.obatchi.dom.base.Ingredient;
import au.com.scds.obatchi.dom.base.Person;
import au.com.scds.obatchi.dom.base.Producer;
import au.com.scds.obatchi.dom.base.ProductLine;
import au.com.scds.obatchi.dom.base.ProductType;
import au.com.scds.obatchi.dom.base.repository.IngredientRepository;

@DomainService(
		nature = NatureOfService.VIEW_MENU_ONLY,
		objectType = "obatchi.IngredientMenu")
@DomainServiceLayout(
		named = "Ingredients",
		menuOrder = "50")
public class IngredientMenu50 {

	@Action()
	@MemberOrder(sequence = "1")
	public Ingredient createIngredient(@ParameterLayout(named = "Ingredient Name") String name,
			@Parameter(optionality = Optionality.OPTIONAL) @ParameterLayout(named = "Ingredient Name") String description) {
		return ingredientRepo.createIngredient(name, description);
	}

	@javax.inject.Inject
	IngredientRepository ingredientRepo;
}
