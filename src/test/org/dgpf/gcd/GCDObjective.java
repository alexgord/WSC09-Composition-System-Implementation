/*
 * Copyright (c) 2007 Thomas Weise for sigoa
 * Simple Interface for Global Optimization Algorithms
 * http://www.sigoa.org/
 * 
 * E-Mail           : info@sigoa.org
 * Creation Date    : 2007-09-22
 * Creator          : Thomas Weise
 * Original Filename: test.org.dgpf.gcd.objectives.MinimizeAbsErrorObjective.java
 * Last modification: 2007-09-22
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

package test.org.dgpf.gcd;

import java.io.Serializable;

import org.dgpf.vm.base.VirtualMachineProgram;
import org.sigoa.refimpl.go.objectives.HysteresisObjectiveFunction;
import org.sigoa.refimpl.go.objectives.ObjectiveState;
import org.sigoa.spec.simulation.ISimulation;

/**
 * This objective function puts pressure into the direction of programs
 * with smaller errors.
 * 
 * @author Thomas Weise
 */
public class GCDObjective
    extends
    HysteresisObjectiveFunction<VirtualMachineProgram<Serializable>, ObjectiveState, Serializable, //
    ISimulation<VirtualMachineProgram<Serializable>>> {

  /**
   * The serial version uid.
   */
  private static final long serialVersionUID = 1;

  /**
   * the required steps
   */
  private final int m_requiredSteps;

  /**
   * Create the objective function
   * 
   * @param requiredSteps
   *          the steps required
   */
  public GCDObjective(final int requiredSteps) {
    this(requiredSteps, true);
  }

  /**
   * Create the objective function
   * 
   * @param requiredSteps
   *          the steps required
   * @param usesHysteresis
   *          <code>true</code> if and only if hysteresis should be used,
   *          <code>false</code> otherwise
   */
  public GCDObjective(final int requiredSteps, final boolean usesHysteresis) {
    super(null, usesHysteresis);
    this.m_requiredSteps = requiredSteps;
  }

  /**
   * Append this object's textual representation to a string builder.
   * 
   * @param sb
   *          The string builder to append to.
   * @see #toString()
   */
  @Override
  public void toStringBuilder(final StringBuilder sb) {
    sb.append("gcd"); //$NON-NLS-1$
  }

  /**
   * Obtain the id of the required simulator. If <code>null</code> is
   * returned, no simulation will be needed/performed for objective
   * function.
   * 
   * @return The id of the simulator required for the evaluation of this
   *         objective function.
   */
  @Override
  public Serializable getRequiredSimulationId() {
    return IGCDResultInfo.class;
  }

  /**
   * This method is called after any simulation/evaluation is performed.
   * After this method returns, an objective value must have been stored in
   * the state record.
   * 
   * @param individual
   *          The individual that should be evaluated next.
   * @param state
   *          The state record.
   * @param staticData
   *          not used, <code>null</code>
   * @param simulation
   *          The simulation (<code>null</code> if no simulation is
   *          required as indivicated by
   *          <code>getRequiredSimulationSteps</code>).
   * @throws NullPointerException
   *           if <code>individual==null</code> or
   *           <code>state==null</code> or if
   *           <code>simulator==null</code> but a simulation is required.
   */
  @Override
  public void endEvaluation(
      final VirtualMachineProgram<Serializable> individual,
      final ObjectiveState state, final Serializable staticData,
      final ISimulation<VirtualMachineProgram<Serializable>> simulation) {

    IGCDResultInfo f;
    int a, b, r, r2, d;

    f = ((IGCDResultInfo) (simulation));

    r = f.getGCDResult();
    r2 = f.getGCD();

    d = 0;
    if (r2 != r) {
      d++;
      a = f.getA();
      b = f.getB();

      if (r2 != GCDProvider.gcd(a, r))
        d++;
      if (r2 != GCDProvider.gcd(b, r))
        d++;

      if (r <= 0)
        d += 2;
      else {
        if (r >= a)
          d++;
        if (r >= b)
          d++;
      }
    }

    state.setObjectiveValue(d);
  }

  /**
   * Obtain the count of simulation steps that will be needed in order to
   * evaluate the specified individual.
   * 
   * @param individual
   *          The individual to be evaluated.
   * @param state
   *          The state container.
   * @param staticState
   *          the static state record
   * @return The count of simulation steps needed. Values 0 indidicate that
   *         no simulation needs to be performed for this objective
   *         function.
   * @throws NullPointerException
   *           if <code>individual==null</code> or
   *           <code>state==null</code>
   */
  @Override
  public long getRequiredSimulationSteps(
      final VirtualMachineProgram<Serializable> individual,
      final ObjectiveState state, final Serializable staticState) {
    return this.m_requiredSteps;
  }
}
