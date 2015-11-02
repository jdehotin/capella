/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.data.common.properties.controllers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.business.queries.capellacore.BusinessQueriesProvider;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.ui.properties.controllers.AbstractMultipleSemanticFieldController;

/**
 */
public class StateController extends AbstractMultipleSemanticFieldController {
  /**
   * @see org.polarsys.capella.core.ui.properties.controllers.custom.properties.controllers.AbstractMultipleSemanticFieldController#getReadOpenValuesQuery(org.polarsys.capella.core.data.capellacore.CapellaElement)
   */
  @Override
  protected IBusinessQuery getReadOpenValuesQuery(CapellaElement semanticElement) {
    return BusinessQueriesProvider.getInstance().getContribution(semanticElement.eClass(), FaPackage.Literals.ABSTRACT_FUNCTION__AVAILABLE_IN_STATES);
  }

  /**
   * @see org.polarsys.capella.core.ui.properties.controllers.custom.properties.controllers.AbstractMultipleSemanticFieldController#loadValues(org.polarsys.capella.core.data.capellacore.CapellaElement, org.eclipse.emf.ecore.EStructuralFeature)
   */
  @Override
  public List<EObject> loadValues(CapellaElement semanticElement, EStructuralFeature semanticFeature) {
    return EObjectExt.getReferencers(semanticElement, FaPackage.Literals.ABSTRACT_FUNCTION__AVAILABLE_IN_STATES);
  }

  /**
   * @see org.polarsys.capella.core.ui.properties.controllers.custom.properties.controllers.AbstractMultipleSemanticFieldController#doAddOperationInWriteOpenValues(org.polarsys.capella.core.data.capellacore.CapellaElement, org.eclipse.emf.ecore.EStructuralFeature, org.eclipse.emf.ecore.EObject)
   */
  @SuppressWarnings("unchecked")
  @Override
  protected void doAddOperationInWriteOpenValues(CapellaElement semanticElement, EStructuralFeature semanticFeature, EObject object) {
    ((List<EObject>) object.eGet(semanticFeature)).add(semanticElement);
  }

  /**
   * Do the remove operation in {@link #writeOpenValues(CapellaElement, EStructuralFeature, List)}
   * @param semanticElement
   * @param semanticFeature
   * @param object
   */
  @Override
  protected void doRemoveOperationInWriteOpenValues(CapellaElement semanticElement, EStructuralFeature semanticFeature, EObject object) {
    super.doRemoveOperationInWriteOpenValues((CapellaElement) object, semanticFeature, semanticElement);
  }
}
