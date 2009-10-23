/*
 * Copyright (c) 2006 Thomas Weise for sigoa
 * Simple Interface for Global Optimization Algorithms
 * http://www.sigoa.org/
 *
 * E-Mail           : info@sigoa.org
 * Creation Date    : 2006-12-29
 * Creator          : Thomas Weise
 * Original Filename: test.org.sigoa.dmc.Tester.java
 * Last modification: 2006-12-29
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

package test.org.sigoa.dmc.dmc07;

/**
 * the dummy test class
 *
 * @author Thomas Weise
 */
public class Tester {

  /**
   * the main routine
   *
   * @param args
   *          the arguments
   */
  public static void main(final String[] args) {

    ClassifierSystem m;
    ClassificationSimulation s;

    m =
     new ClassifierSystem(new byte[][] {
     { 0, 3, 3, 3, 0, 3, 3, 1, 3, 1, 1, 1, 1, 3, 1, 0, 0 },
     { 0, 1, 0, 1, 1, 0, 3, 3, 3, 3, 1, 3, 0, 0, 3, 3, 2 },
     { 1, 1, 3, 3, 1, 3, 0, 3, 3, 1, 0, 1, 1, 0, 2, 3, 0 },
     { 0, 2, 1, 1, 1, 3, 0, 3, 3, 3, 3, 3, 0, 1, 3, 3, 0 },
     { 3, 1, 0, 0, 0, 3, 1, 3, 3, 2, 2, 0, 1, 3, 0, 3, 2 },
     { 3, 1, 3, 3, 3, 3, 3, 0, 0, 1, 1, 1, 3, 0, 3, 3, 1 },
     { 1, 2, 0, 1, 3, 1, 0, 3, 1, 3, 1, 0, 2, 3, 0, 1, 3 },
     { 0, 1, 3, 0, 1, 2, 2, 0, 2, 3, 1, 0, 1, 0, 2, 3, 2 },
     { 0, 0, 0, 3, 3, 0, 0, 0, 2, 1, 0, 1, 3, 2, 0, 0, 3 },
     { 2, 3, 2, 2, 0, 3, 1, 1, 3, 1, 2, 2, 1, 3, 1, 0, 2 },
     { 3, 3, 0, 0, 1, 0, 0, 1, 3, 3, 0, 2, 3, 3, 1, 3, 0 },
     { 2, 2, 0, 3, 0, 1, 2, 0, 2, 1, 3, 3, 2, 3, 3, 3, 1 },
     { 1, 3, 1, 1, 1, 3, 0, 3, 3, 0, 0, 3, 1, 0, 1, 3, 3 },
     { 2, 0, 2, 1, 0, 0, 0, 0, 3, 3, 2, 2, 2, 2, 2, 2, 0 },
     { 0, 3, 3, 3, 3, 0, 0, 0, 0, 2, 0, 3, 1, 0, 1, 3, 1 },
     { 3, 1, 3, 3, 3, 3, 3, 0, 0, 1, 1, 1, 3, 0, 3, 3, 1 },
     { 3, 2, 1, 1, 2, 3, 3, 3, 1, 0, 1, 2, 1, 0, 1, 3, 3 },
     { 0, 1, 2, 2, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 3, 0, 3 },
     { 1, 3, 3, 3, 3, 0, 0, 0, 0, 2, 0, 3, 1, 0, 1, 3, 1 },
     { 3, 2, 1, 1, 2, 3, 3, 3, 3, 3, 0, 3, 1, 0, 1, 3, 3 },
     { 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 3, 0, 0, 0, 3 },
     { 0, 1, 1, 1, 0, 3, 2, 3, 3, 1, 2, 2, 1, 3, 0, 0, 0 },
     { 0, 3, 3, 3, 0, 0, 1, 2, 0, 2, 0, 1, 3, 3, 2, 3, 0 },
     { 0, 3, 3, 3, 0, 1, 0, 2, 3, 1, 1, 2, 3, 3, 1, 0, 0 },
     { 3, 3, 1, 0, 0, 1, 0, 1, 1, 1, 2, 2, 3, 3, 2, 0, 0 },
     { 3, 3, 1, 2, 1, 1, 3, 3, 1, 0, 3, 0, 1, 0, 3, 1, 3 },
     { 3, 3, 1, 2, 1, 1, 0, 3, 1, 0, 0, 2, 1, 0, 3, 1, 3 },
     { 3, 0, 2, 3, 1, 3, 1, 3, 2, 0, 1, 3, 1, 3, 3, 1, 0 },
     { 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0 },
     { 0, 1, 1, 2, 3, 0, 0, 0, 0, 0, 3, 0, 2, 3, 0, 0, 3 },
     { 2, 3, 0, 0, 3, 2, 1, 0, 0, 1, 3, 3, 3, 0, 1, 0, 2 },
     { 3, 0, 3, 2, 3, 1, 1, 0, 2, 0, 3, 1, 3, 3, 0, 2, 2 },
     { 0, 2, 0, 1, 0, 2, 0, 3, 1, 1, 3, 3, 0, 2, 0, 2, 1 },
     { 1, 0, 1, 3, 1, 3, 3, 3, 1, 0, 1, 0, 3, 3, 1, 0, 0 },
     { 3, 0, 0, 1, 3, 3, 2, 1, 1, 3, 2, 3, 1, 3, 1, 0, 3 },
     { 0, 1, 0, 0, 2, 0, 0, 1, 0, 0, 3, 2, 2, 0, 0, 1, 3 },
     { 0, 0, 2, 2, 3, 1, 3, 1, 3, 2, 0, 3, 1, 0, 0, 3, 3 },
     { 1, 3, 2, 1, 3, 3, 3, 0, 1, 2, 1, 2, 1, 3, 0, 0, 3 },
     { 1, 0, 3, 0, 0, 0, 0, 0, 0, 3, 0, 2, 1, 0, 3, 3, 2 },
     { 3, 0, 3, 1, 2, 3, 3, 3, 0, 1, 2, 2, 0, 0, 0, 0, 3 },
     { 0, 3, 3, 1, 3, 3, 1, 1, 3, 2, 3, 3, 3, 2, 2, 3, 3 },
     { 3, 0, 3, 1, 0, 1, 3, 0, 0, 1, 2, 0, 0, 2, 0, 0, 3 },
     { 0, 3, 3, 2, 0, 2, 3, 0, 3, 1, 0, 2, 0, 0, 3, 3, 3 } },
     new EClasses[] { EClasses.B, EClasses.B, EClasses.A, EClasses.A,
     EClasses.B, EClasses.B, EClasses.B, EClasses.A, EClasses.B,
     EClasses.A, EClasses.N, EClasses.B, EClasses.A, EClasses.N,
     EClasses.N, EClasses.B, EClasses.A, EClasses.N, EClasses.N,
     EClasses.A, EClasses.N, EClasses.B, EClasses.B, EClasses.B,
     EClasses.B, EClasses.A, EClasses.A, EClasses.B, EClasses.A,
     EClasses.N, EClasses.B, EClasses.A, EClasses.N, EClasses.A,
     EClasses.A, EClasses.B, EClasses.N, EClasses.A, EClasses.N,
     EClasses.N, EClasses.N, EClasses.N, EClasses.N });

    s = new ClassificationSimulation();

    s.beginIndividual(m);
    System.out.println(s);
  }

}
