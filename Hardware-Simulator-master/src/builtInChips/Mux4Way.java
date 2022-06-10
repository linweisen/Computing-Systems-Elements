/********************************************************************************
 * The contents of this file are subject to the GNU General Public License      *
 * (GPL) Version 2 or later (the "License"); you may not use this file except   *
 * in compliance with the License. You may obtain a copy of the License at      *
 * http://www.gnu.org/copyleft/gpl.html                                         *
 *                                                                              *
 * Software distributed under the License is distributed on an "AS IS" basis,   *
 * without warranty of any kind, either expressed or implied. See the License   *
 * for the specific language governing rights and limitations under the         *
 * License.                                                                     *
 ********************************************************************************/

package builtInChips;

import Hack.Gates.BuiltInGate;

/**
 * 1-bit 4-way multiplexor.
 * if sel=0 out=a.
 * if sel=1 out=b.
 * if sel=2 out=.
 * if sel=3 out=d.
 */
public class Mux4Way extends BuiltInGate {

    protected void reCompute() {
        short a = inputPins[0].get();
        short b = inputPins[1].get();
        short c = inputPins[2].get();
        short d = inputPins[3].get();
        short sel = inputPins[4].get();
        if (sel == 0)
            outputPins[0].set(a);
        else if (sel == 1)
            outputPins[0].set(b);
        else if (sel == 2)
            outputPins[0].set(c);
        else
            outputPins[0].set(d);
    }
}
