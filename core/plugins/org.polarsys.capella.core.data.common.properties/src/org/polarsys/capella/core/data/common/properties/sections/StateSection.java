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
package org.polarsys.capella.core.data.common.properties.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.common.properties.Messages;
import org.polarsys.capella.core.data.common.properties.controllers.StateController;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.ui.properties.controllers.SimpleSemanticFieldController;
import org.polarsys.capella.core.ui.properties.fields.AbstractSemanticField;
import org.polarsys.capella.core.ui.properties.fields.MultipleSemanticField;
import org.polarsys.capella.core.ui.properties.fields.SimpleSemanticField;

/**
 * The State section.
 */
public class StateSection extends AbstractStateSection {

  private MultipleSemanticField functionsField;
  private SimpleSemanticField activityField;
  private SimpleSemanticField entryField;
  private SimpleSemanticField exitField;

  @Override
  public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
    super.createControls(parent, aTabbedPropertySheetPage);

    Group main = getWidgetFactory().createGroup(_rootParentComposite, ""); //$NON-NLS-1$
    main.setLayout(new GridLayout(6, false));
    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    gd.horizontalSpan = 2;
    main.setLayoutData(gd);

    boolean displayedInWizard = isDisplayedInWizard();

    activityField = new SimpleSemanticField(main, Messages.getString("State.Activity"), getWidgetFactory(), new SimpleSemanticFieldController()); //$NON-NLS-1$
    activityField.setDisplayedInWizard(displayedInWizard);

    entryField = new SimpleSemanticField(main, Messages.getString("State.Entry"), getWidgetFactory(), new SimpleSemanticFieldController()); //$NON-NLS-1$
    entryField.setDisplayedInWizard(displayedInWizard);

    exitField = new SimpleSemanticField(main, Messages.getString("State.Exit"), getWidgetFactory(), new SimpleSemanticFieldController()); //$NON-NLS-1$
    exitField.setDisplayedInWizard(displayedInWizard);

    functionsField = new MultipleSemanticField(main, Messages.getString("State.Functions"), getWidgetFactory(), new StateController()) { //$NON-NLS-1$
          /**
           * {@inheritDoc}
           */
          @SuppressWarnings("unchecked")
          @Override
          protected void removeAllDataValue(EObject object, EStructuralFeature feature) {
            for (EObject referencer : EObjectExt.getReferencers(object, (EReference) feature)) {
              ((List<EObject>) referencer.eGet(feature)).remove(object);
            }
          }
        };
    functionsField.setDisplayedInWizard(displayedInWizard);

  }

  /**
   * @see org.polarsys.capella.core.ui.properties.sections.AbstractSection#loadData(org.polarsys.capella.core.data.capellacore.CapellaElement)
   */
  @Override
  public void loadData(CapellaElement capellaElement) {
    super.loadData(capellaElement);

    activityField.loadData(capellaElement, CapellacommonPackage.Literals.STATE__DO_ACTIVITY);
    entryField.loadData(capellaElement, CapellacommonPackage.Literals.STATE__ENTRY);
    exitField.loadData(capellaElement, CapellacommonPackage.Literals.STATE__EXIT);

    functionsField.loadData(capellaElement, FaPackage.Literals.ABSTRACT_FUNCTION__AVAILABLE_IN_STATES);
  }

  /**
   * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
   */
  @Override
  public boolean select(Object toTest) {
    EObject eObjectToTest = super.selection(toTest);
    return ((eObjectToTest != null) && (eObjectToTest.eClass() == CapellacommonPackage.eINSTANCE.getState()));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<AbstractSemanticField> getSemanticFields() {
    List<AbstractSemanticField> fields = new ArrayList<AbstractSemanticField>();

    fields.addAll(super.getSemanticFields());
    fields.add(activityField);
    fields.add(entryField);
    fields.add(exitField);
    fields.add(functionsField);

    return fields;
  }
}
