/*
 * Copyright (c) 2007 Thomas Weise for sigoa
 * Simple Interface for Global Optimization Algorithms
 * http://www.sigoa.org/
 *
 * E-Mail           : info@sigoa.org
 * Creation Date    : 2007-03-01
 * Creator          : Thomas Weise
 * Original Filename: org.dgpf.machine.hl.constructs.CallFactory.java
 * Last modification: 2007-03-01
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

package org.dgpf.hlgp.base.constructs;


import org.dgpf.hlgp.base.ConstructFactory;
import org.dgpf.hlgp.base.Expression;
import org.sigoa.refimpl.genomes.tree.INodeFactory;
import org.sigoa.refimpl.genomes.tree.Node;
import org.sigoa.spec.stoch.IRandomizer;

/**
 * This factory creates high-level function call
 *
 * @author Thomas Weise
 */
public class CallFactory extends ConstructFactory {
  /**
   * the serial version uid
   */
  private static final long serialVersionUID = 1;

  /**
   * The globally shared default call factory
   */
  public static final INodeFactory CALL_FACTORY = new CallFactory(
      Call.class);

  /**
   * Create a new call factory.
   *
   * @param clazz
   *          the class
   */
  protected CallFactory(final Class<? extends Call> clazz) {
    super(Call.class, 0, Integer.MAX_VALUE);
  }

  /**
   * read resolve
   *
   * @return the resolved factory
   */
  @Override
  protected Object readResolve() {
    return CALL_FACTORY;
  }

  /**
   * Checks whether the given class of child nodes is allowed.
   *
   * @param clazz
   *          the child node class we want to know about
   * @param pos
   *          the position where the child should be placed
   * @return <code>true</code> if and only if the node-typed managed by
   *         this factory allows children that are instances of
   *         <code>clazz</code>
   */
  @Override
  public boolean isChildAllowed(final Class<? extends Node> clazz,
      final int pos) {
    return (super.isChildAllowed(clazz, pos) && (Expression.class
        .isAssignableFrom(clazz)));
  }

  /**
   * Create a new node using the specified children.
   *
   * @param children
   *          the children of the node to be, or <code>null</code> if no
   *          children are wanted
   * @param random
   *          the randomizer to be used for the node's creation
   * @return the new node
   */
  public Node create(final Node[] children, final IRandomizer random) {
    return new Call(random.nextInt(), children);
  }
}
