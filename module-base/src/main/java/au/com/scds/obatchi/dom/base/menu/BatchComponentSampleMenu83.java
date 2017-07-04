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
import au.com.scds.obatchi.dom.base.repository.SampleRepository;

@DomainService(
		nature = NatureOfService.VIEW_MENU_ONLY,
		objectType = "obatchi.BatchComponentSampleMenu")
@DomainServiceLayout(
		named = "Samples", 
		menuOrder = "83")
public class BatchComponentSampleMenu83 {

	@Action()
	@MemberOrder(sequence = "1")
	public Sample createSample(BatchComponent component) {
		return sampleRepo.createSample(component);
	}

	@javax.inject.Inject
	SampleRepository sampleRepo;
}
