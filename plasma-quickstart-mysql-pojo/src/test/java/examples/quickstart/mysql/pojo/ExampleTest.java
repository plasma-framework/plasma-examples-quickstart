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
package examples.quickstart.mysql.pojo;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.plasma.sdo.PlasmaDataGraph;

import examples.quickstart.ExampleRunner;
import quickstart.pojo.model.Person;

public class ExampleTest {
  @Test
  public void testExample() throws IOException {
    PlasmaDataGraph graph = ExampleRunner.runExample();
    System.out.println(graph.asXml());
    Person root = (Person) graph.getRootObject();
    assertTrue("Mark".equals(root.getFirstName()));
    assertTrue(root.getLastName().startsWith("Hamburg"));
  }
}
