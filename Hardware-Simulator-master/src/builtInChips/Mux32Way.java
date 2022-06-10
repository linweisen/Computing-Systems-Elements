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
 * 1-bit 32-way multiplexor.
 * if sel=0 out=a.
 * if sel=1 out=b.
 * if sel=2 out=c.
 * if sel=3 out=d.
 * if sel=4 out=e.
 * if sel=5 out=f.
 * if sel=6 out=g.
 * if sel=7 out=h.
 * if sel=8 out=i.
 * if sel=9 out=j.
 * if sel=10 out=k.
 * if sel=11 out=l.
 * if sel=12 out=m.
 * if sel=13 out=n.
 * if sel=14 out=o.
 * if sel=15 out=p.
 * if sel=16 out=q.
 * if sel=17 out=r.
 * if sel=18 out=s.
 * if sel=19 out=t.
 * if sel=20 out=u.
 * if sel=21 out=v.
 * if sel=22 out=w.
 * if sel=23 out=x.
 * if sel=24 out=y.
 * if sel=25 out=z.
 * if sel=26 out=aa.
 * if sel=27 out=ab.
 * if sel=28 out=ac.
 * if sel=29 out=ad.
 * if sel=30 out=ae.
 * if sel=31 out=af.
 */
public class Mux32Way extends BuiltInGate {

    protected void reCompute() {
        short a = inputPins[0].get();
        short b = inputPins[1].get();
        short c = inputPins[2].get();
        short d = inputPins[3].get();
        short e = inputPins[4].get();
        short f = inputPins[5].get();
        short g = inputPins[6].get();
        short h = inputPins[7].get();
        short i = inputPins[8].get();
        short j = inputPins[9].get();
        short k = inputPins[10].get();
        short l = inputPins[11].get();
        short m = inputPins[12].get();
        short n = inputPins[13].get();
        short o = inputPins[14].get();
        short p = inputPins[15].get();
        short q = inputPins[16].get();
        short r = inputPins[17].get();
        short s = inputPins[18].get();
        short t = inputPins[19].get();
        short u = inputPins[20].get();
        short v = inputPins[21].get();
        short w = inputPins[22].get();
        short x = inputPins[23].get();
        short y = inputPins[24].get();
        short z = inputPins[25].get();
        short aa = inputPins[26].get();
        short ab = inputPins[27].get();
        short ac = inputPins[28].get();
        short ad = inputPins[29].get();
        short ae = inputPins[30].get();
        short af = inputPins[31].get();
        short sel = inputPins[32].get();
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
        else if (sel == 7)
            outputPins[0].set(h);
        else if (sel == 8)
            outputPins[0].set(i);
        else if (sel == 9)
            outputPins[0].set(j);
        else if (sel == 10)
            outputPins[0].set(k);
        else if (sel == 11)
            outputPins[0].set(l);
        else if (sel == 12)
            outputPins[0].set(m);
        else if (sel == 13)
            outputPins[0].set(n);
        else if (sel == 14)
            outputPins[0].set(o);
        else if (sel == 15)
            outputPins[0].set(p);
        else if (sel == 16)
            outputPins[0].set(q);
        else if (sel == 17)
            outputPins[0].set(r);
        else if (sel == 18)
            outputPins[0].set(s);
        else if (sel == 19)
            outputPins[0].set(t);
        else if (sel == 20)
            outputPins[0].set(u);
        else if (sel == 21)
            outputPins[0].set(v);
        else if (sel == 22)
            outputPins[0].set(w);
        else if (sel == 23)
            outputPins[0].set(x);
        else if (sel == 24)
            outputPins[0].set(y);
        else if (sel == 25)
            outputPins[0].set(z);
        else if (sel == 26)
            outputPins[0].set(aa);
        else if (sel == 27)
            outputPins[0].set(ab);
        else if (sel == 28)
            outputPins[0].set(ac);
        else if (sel == 29)
            outputPins[0].set(ad);
        else if (sel == 30)
            outputPins[0].set(ae);
        else
            outputPins[0].set(af);
    }
}
