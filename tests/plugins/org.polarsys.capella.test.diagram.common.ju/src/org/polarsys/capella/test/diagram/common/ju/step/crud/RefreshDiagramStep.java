/*******************************************************************************
 * Copyright (c) 2006, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.diagram.common.ju.step.crud;

import org.eclipse.osgi.util.NLS;
import org.junit.Assert;
import org.polarsys.capella.common.ef.command.AbstractReadWriteCommand;
import org.polarsys.capella.test.diagram.common.ju.context.DiagramContext;
import org.polarsys.capella.test.diagram.common.ju.step.AbstractDiagramStep;
import org.polarsys.capella.test.diagram.common.ju.step.Messages;
import org.polarsys.capella.test.diagram.common.ju.wrapper.utils.DiagramHelper;
import org.polarsys.capella.test.framework.helpers.TestHelper;

/**
 * Test case that refreshes a given diagram.
 */
public class RefreshDiagramStep extends AbstractDiagramStep<DiagramContext> {

  public RefreshDiagramStep(DiagramContext executionContext) {
    super(executionContext);
  }

  /**
   * @see org.polarsys.capella.test.common.AbstractExtendedTest#preTestRun()
   */
  @Override
  protected void preRunTest() {
    super.preRunTest();
    Assert.assertNotNull(Messages.nullDiagram, getExecutionContext().getDiagram());
  }

  /**
   * Implement a diagram creation.
   */
  @Override
  protected void runTest() {
    TestHelper.getExecutionManager(getExecutionContext().getSession()).execute(new AbstractReadWriteCommand() {
      public void run() {
        boolean ret = DiagramHelper.refreshDiagram(getExecutionContext().getDiagram());
        Assert.assertTrue(
            NLS.bind(Messages.failToRefreshDiagram, new Object[] { getExecutionContext().getDiagram().getName() }), ret);
      }
    });

  }

  @Override
  public DiagramContext getResult() {
    return getExecutionContext();
  }
}
