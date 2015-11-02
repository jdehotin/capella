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
package org.polarsys.capella.core.data.core.properties.controllers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.business.queries.capellacore.BusinessQueriesProvider;
import org.polarsys.capella.core.data.helpers.capellacore.services.GeneralizableElementExt;
import org.polarsys.capella.core.data.capellacore.GeneralizableElement;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.ui.properties.controllers.AbstractMultipleSemanticFieldController;

/**
 */
public class GeneralizableElementController extends AbstractMultipleSemanticFieldController {
  /**
   * @see org.polarsys.capella.core.ui.properties.controllers.custom.properties.controllers.AbstractMultipleSemanticFieldController#getReadOpenValuesQuery()
   */
  @Override
  protected IBusinessQuery getReadOpenValuesQuery(CapellaElement semanticElement) {
    return BusinessQueriesProvider.getInstance().getContribution(semanticElement.eClass(),
        CapellacorePackage.Literals.GENERALIZABLE_ELEMENT__SUPER_GENERALIZATIONS);
  }

  /**
   * @see org.polarsys.capella.core.ui.properties.controllers.custom.properties.controllers.AbstractMultipleSemanticFieldController#doAddOperationInWriteOpenValues(org.polarsys.capella.core.data.capellacore.CapellaElement,
   *      org.eclipse.emf.ecore.EStructuralFeature, org.eclipse.emf.ecore.EObject)
   */
  @Override
  protected void doAddOperationInWriteOpenValues(CapellaElement semanticElement, EStructuralFeature semanticFeature, EObject object) {
    GeneralizableElementExt.addSuperGeneralizableElement((GeneralizableElement) semanticElement, (GeneralizableElement) object);
  }

  /**
   * @see org.polarsys.capella.core.ui.properties.controllers.custom.properties.controllers.AbstractMultipleSemanticFieldController#doRemoveOperationInWriteOpenValues(org.polarsys.capella.core.data.capellacore.CapellaElement,
   *      org.eclipse.emf.ecore.EStructuralFeature, org.eclipse.emf.ecore.EObject)
   */
  @Override
  protected void doRemoveOperationInWriteOpenValues(CapellaElement semanticElement, EStructuralFeature semanticFeature, EObject object) {
    GeneralizableElementExt.removeSuperGeneralizableElement((GeneralizableElement) semanticElement, (GeneralizableElement) object);
  }
}
