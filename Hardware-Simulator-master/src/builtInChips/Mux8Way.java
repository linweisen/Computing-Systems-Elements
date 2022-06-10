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
 * 1-bit 8-way multiplexor.
 * if sel=0 out=a.
 * if sel=1 out=b.
 * if sel=2 out=c.
 * if sel=3 out=d.
 * if sel=4 out=e.
 * if sel=5 out=f.
 * if sel=6 out=g.
 * if sel=7 out=h.
 */
public class Mux8Way extends BuiltInGate {

    protected void reCompute() {
        short a = inputPins[0].get();
        short b = inputPins[1].get();
        short c = inputPins[2].get();
        short d = inputPins[3].get();
        short e = inputPins[4].get();
        short f = inputPins[5].get();
        short g = inputPins[6].get();
        short h = inputPins[7].get();
        short sel = inputPins[8].get();
        if (sel == 0)
            outputPins[0].set(a);
        else if (sel == 1)
            outputPins[0].set(b);
        else if (sel == 2)
            outputPins[0].set(c);
        else if (sel == 3)
            outputPins[0].set(d);
        else if (sel == 4)
            outputPins[0].set(e);
        else if (sel == 5)
            outputPins[0].set(f);
        else if (sel == 6)
            outputPins[0].set(g);
        else
            outputPins[0].set(h);
    }
}
