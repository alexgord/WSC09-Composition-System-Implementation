/*
 * Copyright (c) 2006 Thomas Weise for sigoa
 * Simple Interface for Global Optimization Algorithms
 * http://www.sigoa.org/
 *
 * E-Mail           : info@sigoa.org
 * Creation Date    : 2006-11-26 10:19:28
 * Creator          : Thomas Weise
 * Original Filename: org.sigoa.spec.go.evaluation.IEvaluator.java
 * Version          : 1.0.0
 * Last modification: 2006-11-26
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
package org.sigoa.spec.go.evaluation;

import java.io.Serializable;

import org.sigoa.spec.go.IIndividual;

/**
 * The <code>IEvaluator</code>-interface is used to evaluate
 * individuals, i.e. assign objective values to them.
 *
 * @param <PP>
 *          The phenotype of the individuals to be evaluated.
 */
public interface IEvaluator<PP extends Serializable> extends Serializable {
  /**
   * Evaluate an individual by computing all its objective values.
   *
   * @param individual
   *          The individual to be evaluated.
   * @throws NullPointerException
   *           if the individual or its phenotype or the host is
   *           <code>null</code> or if no simulation manager is
   *           available.
   */
  public abstract void evaluate(final IIndividual<?, PP> individual);

  /**
   * Obtain the count of the objective values which are set by this
   * evaluator.
   *
   * @return The count of objective functions applied.
   */
  public abstract int getObjectiveValueCount();
}
