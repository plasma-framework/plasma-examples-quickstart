/**
 * Copyright 2017 TerraMeta Software, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@Alias(physicalName = "HR")
@Namespace(uri = "http://plasma-quickstart-pojo/humanresources")
@NamespaceProvisioning(rootPackageName = "quickstart.pojo.model")
@NamespaceService(storeType = DataStoreType.RDBMS, providerName = DataAccessProviderName.JDBC, properties = {
    "org.plasma.sdo.access.provider.jdbc.ConnectionURL=jdbc:mysql://localhost:3306/hr?autoReconnect=true",
    "org.plasma.sdo.access.provider.jdbc.ConnectionUserName=root",
    "org.plasma.sdo.access.provider.jdbc.ConnectionPassword=phoenix",
    "org.plasma.sdo.access.provider.jdbc.ConnectionDriverName=com.mysql.jdbc.Driver",
    "org.plasma.sdo.access.provider.jdbc.ConnectionProviderName=examples.quickstart.DBCPConnectionPoolProvider",
    "org.plasma.sdo.access.provider.jdbc.ConnectionPoolMinSize=1",
    "org.plasma.sdo.access.provider.jdbc.ConnectionPoolMaxSize=10",
    "org.apache.commons.dbcp.validationQuery=SELECT COUNT(*) FROM person",
    "org.apache.commons.dbcp.testOnBorrow=false", "org.apache.commons.dbcp.testOnReturn=false",
    "org.apache.commons.dbcp.maxWait=30000", "org.apache.commons.dbcp.testWhileIdle=false",
    "org.apache.commons.dbcp.timeBetweenEvictionRunsMillis=30000",
    "org.apache.commons.dbcp.minEvictableIdleTimeMillis=40000" })
package examples.quickstart.mysql.pojo;

import org.plasma.runtime.DataAccessProviderName;
import org.plasma.runtime.DataStoreType;
import org.plasma.runtime.annotation.NamespaceProvisioning;
import org.plasma.runtime.annotation.NamespaceService;
import org.plasma.sdo.annotation.Alias;
import org.plasma.sdo.annotation.Namespace;

