package examples.quickstart.mysql.pojo;

import java.io.IOException;
import java.util.Date;

import org.junit.Test;
import org.plasma.runtime.DataAccessProviderName;
import org.plasma.sdo.PlasmaDataGraph;
import org.plasma.sdo.access.client.PojoDataAccessClient;
import org.plasma.sdo.access.client.SDODataAccessClient;
import org.plasma.sdo.helper.PlasmaDataFactory;
import org.plasma.sdo.helper.PlasmaTypeHelper;

import quickstart.pojo.model.OrgCat;
import quickstart.pojo.model.Organization;
import quickstart.pojo.model.Person;
import quickstart.pojo.model.query.QPerson;
import commonj.sdo.DataGraph;
import commonj.sdo.Type;

public class PojoTest {
	@Test
	public void insertTest() throws IOException {
		SDODataAccessClient client = new SDODataAccessClient(
			new PojoDataAccessClient(DataAccessProviderName.JDBC));
		
	    DataGraph dataGraph = PlasmaDataFactory.INSTANCE.createDataGraph();
	    dataGraph.getChangeSummary().beginLogging();  
	    Type rootType = PlasmaTypeHelper.INSTANCE.getType(Organization.class);
	    String randomSuffix = String.valueOf(System.nanoTime()).substring(10);
	    
	    Organization org = (Organization) dataGraph.createRootObject(rootType);
	    org.setName("Best Buy Corporation Inc. ("+randomSuffix+")");
	    org.setCategory(OrgCat.RETAIL.getInstanceName());
	    org.setCreatedDate(new Date());
	    
	    Organization child = org.createChild();
	    child.setName("Best Buy Sales ("+randomSuffix+")");	    
	    child.setCategory(OrgCat.RETAIL.getInstanceName());
	    child.setCreatedDate(new Date());
		
	    Person pers = child.createEmployee();
	    pers.setFirstName("Mark");
	    pers.setLastName("Hamburg ("+randomSuffix+")");
	    pers.setAge(55);
	    pers.setCreatedDate(new Date());
	    
	    client.commit(dataGraph, PojoTest.class.getSimpleName());
	    
	    QPerson query = QPerson.newQuery();
	    query.select(query.wildcard())
	         .select(query.employer().name()) 
             .select(query.employer().parent().name())
             .select(query.employer().parent().category());
	    query.where(query.firstName().eq("Mark")
	    	 .and(query.lastName().like("Ham*")));
	    
	    DataGraph[] results = client.find(query);
	    System.out.println((((PlasmaDataGraph)results[0]).asXml()));
	}
}
