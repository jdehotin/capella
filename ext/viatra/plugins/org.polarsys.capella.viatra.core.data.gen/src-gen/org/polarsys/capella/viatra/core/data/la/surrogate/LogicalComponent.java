/**
 * 
 *   Copyright (c) 2006, 2019 THALES DMS FRANCE.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *  
 *   Contributors:
 *      Thales - initial API and implementation
 *  
 */
package org.polarsys.capella.viatra.core.data.la.surrogate;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.polarsys.capella.viatra.core.data.la.surrogate.LogicalComponent__allocatedLogicalFunctions;
import org.polarsys.capella.viatra.core.data.la.surrogate.LogicalComponent__realizedSystems;
import org.polarsys.capella.viatra.core.data.la.surrogate.LogicalComponent__realizingPhysicalComponents;
import org.polarsys.capella.viatra.core.data.la.surrogate.LogicalComponent__subLogicalComponents;
import org.polarsys.capella.viatra.core.data.la.surrogate.LogicalComponent__systemRealizations;

/**
 * A pattern group formed of all public patterns defined in LogicalComponent.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file LogicalComponent.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.polarsys.capella.viatra.core.data.la.surrogate, the group contains the definition of the following patterns: <ul>
 * <li>LogicalComponent__systemRealizations</li>
 * <li>LogicalComponent__subLogicalComponents</li>
 * <li>LogicalComponent__allocatedLogicalFunctions</li>
 * <li>LogicalComponent__realizingPhysicalComponents</li>
 * <li>LogicalComponent__realizedSystems</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class LogicalComponent extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static LogicalComponent instance() {
    if (INSTANCE == null) {
        INSTANCE = new LogicalComponent();
    }
    return INSTANCE;
  }
  
  private static LogicalComponent INSTANCE;
  
  private LogicalComponent() {
    querySpecifications.add(LogicalComponent__systemRealizations.instance());
    querySpecifications.add(LogicalComponent__subLogicalComponents.instance());
    querySpecifications.add(LogicalComponent__allocatedLogicalFunctions.instance());
    querySpecifications.add(LogicalComponent__realizingPhysicalComponents.instance());
    querySpecifications.add(LogicalComponent__realizedSystems.instance());
  }
  
  public LogicalComponent__systemRealizations getLogicalComponent__systemRealizations() {
    return LogicalComponent__systemRealizations.instance();
  }
  
  public LogicalComponent__systemRealizations.Matcher getLogicalComponent__systemRealizations(final ViatraQueryEngine engine) {
    return LogicalComponent__systemRealizations.Matcher.on(engine);
  }
  
  public LogicalComponent__subLogicalComponents getLogicalComponent__subLogicalComponents() {
    return LogicalComponent__subLogicalComponents.instance();
  }
  
  public LogicalComponent__subLogicalComponents.Matcher getLogicalComponent__subLogicalComponents(final ViatraQueryEngine engine) {
    return LogicalComponent__subLogicalComponents.Matcher.on(engine);
  }
  
  public LogicalComponent__allocatedLogicalFunctions getLogicalComponent__allocatedLogicalFunctions() {
    return LogicalComponent__allocatedLogicalFunctions.instance();
  }
  
  public LogicalComponent__allocatedLogicalFunctions.Matcher getLogicalComponent__allocatedLogicalFunctions(final ViatraQueryEngine engine) {
    return LogicalComponent__allocatedLogicalFunctions.Matcher.on(engine);
  }
  
  public LogicalComponent__realizingPhysicalComponents getLogicalComponent__realizingPhysicalComponents() {
    return LogicalComponent__realizingPhysicalComponents.instance();
  }
  
  public LogicalComponent__realizingPhysicalComponents.Matcher getLogicalComponent__realizingPhysicalComponents(final ViatraQueryEngine engine) {
    return LogicalComponent__realizingPhysicalComponents.Matcher.on(engine);
  }
  
  public LogicalComponent__realizedSystems getLogicalComponent__realizedSystems() {
    return LogicalComponent__realizedSystems.instance();
  }
  
  public LogicalComponent__realizedSystems.Matcher getLogicalComponent__realizedSystems(final ViatraQueryEngine engine) {
    return LogicalComponent__realizedSystems.Matcher.on(engine);
  }
}
