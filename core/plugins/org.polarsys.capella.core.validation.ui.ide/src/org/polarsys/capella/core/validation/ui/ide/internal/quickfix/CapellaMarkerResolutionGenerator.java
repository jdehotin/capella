/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.validation.ui.ide.internal.quickfix;

import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.ui.IMarkerResolution;
import org.eclipse.ui.IMarkerResolutionGenerator2;
import org.polarsys.capella.common.tools.report.appenders.reportlogview.MarkerViewHelper;

/**
 * Marker resolution generator for Capella markers
 *
 */
final public class CapellaMarkerResolutionGenerator implements IMarkerResolutionGenerator2 {
  
  /**
   * 
   * @param marker_p
   * @return
   */
  public IMarkerResolution[] getResolutions(IMarker marker_p) {
    
    IMarkerResolution[] result = null;
    
    String ruleId = MarkerViewHelper.getRuleID(marker_p, true);

    if ( null != ruleId ) {
      result = MarkerResolutionCache.INSTANCE.getResolutionsFor(ruleId);
    } else {
      
      /* Ecore markers don't have rule id's attached. We use the diagnostic source + code as a 'virtual' rule id to find the resolution */
      if (MarkerViewHelper.isEcore(marker_p)){      
        Diagnostic diagnostic = MarkerViewHelper.getDiagnostic(marker_p);
        result = MarkerResolutionCache.INSTANCE.getResolutionsFor(diagnostic.getSource() + "." + diagnostic.getCode());
      } else {
        result = MarkerResolutionCache.NO_RESOLUTIONS;
      }
    }
    
    return result;
  }

  /**
   * {@inheritDoc}
   */
  public boolean hasResolutions(IMarker marker_p) {
    IMarkerResolution[] resolutions = getResolutions(marker_p);
    return (
        ( null != resolutions ) &&
        ( resolutions != MarkerResolutionCache.NO_RESOLUTIONS )
    );
  }
  

}
