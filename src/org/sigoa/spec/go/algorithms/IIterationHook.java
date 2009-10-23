/*
 * Copyright (c) 2007 Thomas Weise for sigoa
 * Simple Interface for Global Optimization Algorithms
 * http://www.sigoa.org/
 *
 * E-Mail           : info@sigoa.org
 * Creation Date    : 2007-07-31
 * Creator          : Thomas Weise
 * Original Filename: org.sigoa.spec.go.algorithms.IIterationHook.java
 * Last modification: 2007-07-31
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

package org.sigoa.spec.go.algorithms;

import java.io.Serializable;

/**
 * The iteration hook interface
 *
 * @author Thomas Weise
 */
public interface IIterationHook extends Serializable {

  /**
   * This method is invoked before the iteration with index
   * <code>iteration</code>.
   *
   * @param iteration
   *          the index of the iteration
   */
  public abstract void beforeIteration(final long iteration);

  /**
   * This method is invoked after the iteration with index
   * <code>iteration</code>.
   *
   * @param iteration
   *          the index of the iteration
   */
  public abstract void afterIteration(final long iteration);

}
