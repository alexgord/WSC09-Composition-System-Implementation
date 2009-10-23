/*
 * Copyright (c) 2008 Thomas Weise for sigoa
 * Simple Interface for Global Optimization Algorithms
 * http://www.sigoa.org/
 * 
 * E-Mail           : info@sigoa.org
 * Creation Date    : 2008-04-22
 * Creator          : Thomas Weise
 * Original Filename: org.sigoa.refimpl.utils.testSeries.multi.ITestSeriesFactory.java
 * Last modification: 2008-04-22
 *                by: Thomas Weise
 * 
 * License          : GNU LESSER GENERAL PUBLIC LICENSE
 *                    Version 2.1, February 1999
 *                    You should have received a copy of this license along
 *                    with this library; if not, write to theFree Software
 *                    Foundation, Inc. 51 Franklin Street, Fifth Floor,
 *                    Boston, MA 02110-1301, USA or download the license
 *                    under http://www.gnu.org/licenses/lgpl.html or
 *                    http://www.gnu.org/copyleft/lesser.html.
 *                    
 * Warranty         : This software is provided "as is" without any
 *                    warranty; without even the implied warranty of
 *                    merchantability or fitness for a particular purpose.
 *                    See the Gnu Lesser General Public License for more
 *                    details.
 */

package org.sigoa.refimpl.utils.testSeries.multi;

import org.sigoa.refimpl.utils.testSeries.TestSeries;

/**
 * A test series factory
 * 
 * @author Thomas Weise
 */
public interface ITestSeriesFactory {
  /**
   * create a new gcd test series
   * 
   * @param dir
   *          the directory
   * @return the new test series
   */
  public abstract TestSeries create(final Object dir);

  /**
   * obtain the name of the series
   * 
   * @return the name of the series
   */
  public abstract String getName();

}
