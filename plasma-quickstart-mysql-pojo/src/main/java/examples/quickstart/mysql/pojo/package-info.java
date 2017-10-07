@Alias(physicalName = "HR")
@Namespace(uri = "http://plasma-quickstart-pojo/humanresources")
@NamespaceProvisioning(rootPackageName = "quickstart.pojo.model")
@NamespaceService(storeType = DataStoreType.RDBMS, 
providerName = DataAccessProviderName.JDBC, 
properties = {
	"org.plasma.sdo.access.provider.jdbc.ConnectionURL=jdbc:mysql://localhost:3306/hr?autoReconnect=true",
	"org.plasma.sdo.access.provider.jdbc.ConnectionUserName=root",
	"org.plasma.sdo.access.provider.jdbc.ConnectionPassword=phoenix",
	"org.plasma.sdo.access.provider.jdbc.ConnectionDriverName=com.mysql.jdbc.Driver",
	"org.plasma.sdo.access.provider.jdbc.ConnectionProviderName=examples.quickstart.connect.DBCPConnectionPoolProvider",
	"org.plasma.sdo.access.provider.jdbc.ConnectionPoolMinSize=1",
	"org.plasma.sdo.access.provider.jdbc.ConnectionPoolMaxSize=10",
	"org.apache.commons.dbcp.validationQuery=SELECT COUNT(*) FROM person",  
	"org.apache.commons.dbcp.testOnBorrow=false",  
	"org.apache.commons.dbcp.testOnReturn=false",  
	"org.apache.commons.dbcp.maxWait=30000",
	"org.apache.commons.dbcp.testWhileIdle=false",
	"org.apache.commons.dbcp.timeBetweenEvictionRunsMillis=30000",
	"org.apache.commons.dbcp.minEvictableIdleTimeMillis=40000"	
})
package examples.quickstart.mysql.pojo;
import org.plasma.runtime.DataAccessProviderName;
import org.plasma.runtime.DataStoreType;
import org.plasma.runtime.annotation.NamespaceService;
import org.plasma.runtime.annotation.NamespaceProvisioning;
import org.plasma.sdo.annotation.Namespace;
import org.plasma.sdo.annotation.Alias;

