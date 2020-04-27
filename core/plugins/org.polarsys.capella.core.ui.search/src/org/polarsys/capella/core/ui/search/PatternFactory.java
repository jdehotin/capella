/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.ui.search;

import java.util.regex.Pattern;

/**
 */
public class PatternFactory {

  /**
   * @param regex_p
   * @param ignoreCase_p
   * @param ignoreWildCards_p
   * @return
   */
  public static Pattern createPattern(String regex_p, boolean ignoreCase_p, boolean ignoreWildCards_p) {
    int options = ignoreCase_p ? Pattern.CASE_INSENSITIVE : 0;
    if (ignoreWildCards_p) {
      options |= Pattern.LITERAL;
    }
    return PatternFactory.createPattern(regex_p, options);
  }

  public static Pattern createPattern(String regex_p, int option_p) {

    return Pattern.compile(regex_p, option_p);

  }
}
