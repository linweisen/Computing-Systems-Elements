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
 * 1 bit 32-way demultiplexor.
 * The 5-bit sel choose to which output to channel the input (0->a .. 31->af).
 * The other outputs are set to 0.
 */
public class DMux32Way extends BuiltInGate {

    protected void reCompute() {
        short in = inputPins[0].get();
        short sel = inputPins[1].get();
        outputPins[ 0].set((short)(sel ==  0 ? in : 0));
        outputPins[ 1].set((short)(sel ==  1 ? in : 0));
        outputPins[ 2].set((short)(sel ==  2 ? in : 0));
        outputPins[ 3].set((short)(sel ==  3 ? in : 0));
        outputPins[ 4].set((short)(sel ==  4 ? in : 0));
        outputPins[ 5].set((short)(sel ==  5 ? in : 0));
        outputPins[ 6].set((short)(sel ==  6 ? in : 0));
        outputPins[ 7].set((short)(sel ==  7 ? in : 0));
        outputPins[ 8].set((short)(sel ==  8 ? in : 0));
        outputPins[ 9].set((short)(sel ==  9 ? in : 0));
        outputPins[10].set((short)(sel == 10 ? in : 0));
        outputPins[11].set((short)(sel == 11 ? in : 0));
        outputPins[12].set((short)(sel == 12 ? in : 0));
        outputPins[13].set((short)(sel == 13 ? in : 0));
        outputPins[14].set((short)(sel == 14 ? in : 0));
        outputPins[15].set((short)(sel == 15 ? in : 0));
        outputPins[16].set((short)(sel == 16 ? in : 0));
        outputPins[17].set((short)(sel == 17 ? in : 0));
        outputPins[18].set((short)(sel == 18 ? in : 0));
        outputPins[19].set((short)(sel == 19 ? in : 0));
        outputPins[20].set((short)(sel == 20 ? in : 0));
        outputPins[21].set((short)(sel == 21 ? in : 0));
        outputPins[22].set((short)(sel == 22 ? in : 0));
        outputPins[23].set((short)(sel == 23 ? in : 0));
        outputPins[24].set((short)(sel == 24 ? in : 0));
        outputPins[25].set((short)(sel == 25 ? in : 0));
        outputPins[26].set((short)(sel == 26 ? in : 0));
        outputPins[27].set((short)(sel == 27 ? in : 0));
        outputPins[28].set((short)(sel == 28 ? in : 0));
        outputPins[29].set((short)(sel == 29 ? in : 0));
        outputPins[30].set((short)(sel == 30 ? in : 0));
        outputPins[31].set((short)(sel == 31 ? in : 0));
    }
}
