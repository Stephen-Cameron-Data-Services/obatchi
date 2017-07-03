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

package au.com.scds.obatchi.dom.base.repository;

import java.util.List;

import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.NatureOfService;
import org.apache.isis.applib.query.QueryDefault;
import org.apache.isis.applib.services.registry.ServiceRegistry2;
import org.apache.isis.applib.services.repository.RepositoryService;

import au.com.scds.obatchi.dom.base.Result;
import au.com.scds.obatchi.dom.base.Sample;
import au.com.scds.obatchi.dom.base.TestMultiple;
import au.com.scds.obatchi.dom.base.TestSingle;

@DomainService(nature = NatureOfService.DOMAIN, repositoryFor = Result.class)
public class ResultRepository {

	public Result createResult(Sample sample, TestSingle test, String testResult) {
		if (sample == null || test == null)
			return null;
		final Result result = new Result();
		result.setSample(sample);
		result.setTest(test);
		result.setTestResult(testResult);
		serviceRegistry.injectServicesInto(result);
		repositoryService.persistAndFlush(result);
		return result;
	}
	
	public Result createResult(Sample sample, TestMultiple multiple, TestSingle test, String testResult) {
		if (sample == null || test == null)
			return null;
		final Result result = new Result();
		result.setSample(sample);
		result.setSampleTest(multiple);
		result.setTest(test);
		result.setTestResult(testResult);
		serviceRegistry.injectServicesInto(result);
		repositoryService.persistAndFlush(result);
		return result;
	}
	
	public List<Result> listAll() {
		return repositoryService.allInstances(Result.class);
	}
	
	public Result findById(final String id) {
		return repositoryService.firstMatch(new QueryDefault<>(Result.class, "findById", "id", id));
	}

	@javax.inject.Inject
	RepositoryService repositoryService;
	@javax.inject.Inject
	ServiceRegistry2 serviceRegistry;

}