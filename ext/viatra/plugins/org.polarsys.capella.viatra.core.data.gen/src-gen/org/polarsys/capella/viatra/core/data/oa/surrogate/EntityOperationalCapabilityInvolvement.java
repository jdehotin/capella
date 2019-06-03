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
package org.polarsys.capella.viatra.core.data.oa.surrogate;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.polarsys.capella.viatra.core.data.oa.surrogate.EntityOperationalCapabilityInvolvement__capability;
import org.polarsys.capella.viatra.core.data.oa.surrogate.EntityOperationalCapabilityInvolvement__entity;

/**
 * A pattern group formed of all public patterns defined in EntityOperationalCapabilityInvolvement.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file EntityOperationalCapabilityInvolvement.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.polarsys.capella.viatra.core.data.oa.surrogate, the group contains the definition of the following patterns: <ul>
 * <li>EntityOperationalCapabilityInvolvement__entity</li>
 * <li>EntityOperationalCapabilityInvolvement__capability</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class EntityOperationalCapabilityInvolvement extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static EntityOperationalCapabilityInvolvement instance() {
    if (INSTANCE == null) {
        INSTANCE = new EntityOperationalCapabilityInvolvement();
    }
    return INSTANCE;
  }
  
  private static EntityOperationalCapabilityInvolvement INSTANCE;
  
  private EntityOperationalCapabilityInvolvement() {
    querySpecifications.add(EntityOperationalCapabilityInvolvement__entity.instance());
    querySpecifications.add(EntityOperationalCapabilityInvolvement__capability.instance());
  }
  
  public EntityOperationalCapabilityInvolvement__entity getEntityOperationalCapabilityInvolvement__entity() {
    return EntityOperationalCapabilityInvolvement__entity.instance();
  }
  
  public EntityOperationalCapabilityInvolvement__entity.Matcher getEntityOperationalCapabilityInvolvement__entity(final ViatraQueryEngine engine) {
    return EntityOperationalCapabilityInvolvement__entity.Matcher.on(engine);
  }
  
  public EntityOperationalCapabilityInvolvement__capability getEntityOperationalCapabilityInvolvement__capability() {
    return EntityOperationalCapabilityInvolvement__capability.instance();
  }
  
  public EntityOperationalCapabilityInvolvement__capability.Matcher getEntityOperationalCapabilityInvolvement__capability(final ViatraQueryEngine engine) {
    return EntityOperationalCapabilityInvolvement__capability.Matcher.on(engine);
  }
}
