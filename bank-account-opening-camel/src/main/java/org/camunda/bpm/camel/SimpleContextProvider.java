/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.camel;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;

/**
 * copied from camunda fox ee 6.2.3 / activiti-camel module. It is not yet decided 
 * if we have a comparable module in camunda BPM or do integration differently.
 * 
 * Let us know your oppinion in the <a href="http://www.camunda.org/community/forum.html">forum</a>
 * 
 * @author ruecker
 */
public class SimpleContextProvider implements ContextProvider {

  private Map<String, CamelContext> contexts = new HashMap<String, CamelContext>();

  public SimpleContextProvider(Map<String, CamelContext> contexts) {
    this.contexts = contexts;
  }

  public SimpleContextProvider(String processName, CamelContext ctx) {
    this(Collections.singletonMap(processName, ctx));
  }

  public CamelContext getContext(String processName) {
    return contexts.get(processName);
  }
}
