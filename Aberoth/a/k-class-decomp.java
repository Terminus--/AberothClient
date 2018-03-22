
package a;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public final class k implements u
{
    private List a;
    
    public k(final List a) {
        this.a = a;
    }
    
    public k(final String s, int n) {
        final int b = f.b(s, n);
        n += 3;
        this.a = new ArrayList(b);
        for (int i = 0; i < b; ++i) {
            Object o = null;
            switch (s.charAt(n)) {
                case '\0':
                case '\u0001':
                case '\u0002':
                case '\u0003':
                case '\u0004':
                case '\u0005':
                case '\u001b': {
                    o = new i(s, n);
                    break;
                }
                case '\u0006':
                case '\u001c':
                case '\u001d': {
                    o = new v(s, n);
                    break;
                }
                case '\u0007': {
                    o = new a(s, n);
                    break;
                }
                case '\u0019': {
                    o = new w(s, n);
                    break;
                }
                case '\u0012': {
                    o = new j(s, n);
                    break;
                }
                case '\u0013': {
                    o = new p(s, n);
                    break;
                }
                case '\u0010': {
                    o = new n(s, n);
                    break;
                }
                case '\u0011': {
                    o = new t(s, n);
                    break;
                }
                case '\b':
                case '\t': {
                    o = new r(s, n);
                    break;
                }
                case '\u0018': {
                    o = new x(s, n);
                    break;
                }
                case '\u001a': {
                    o = new y(s, n);
                    break;
                }
                case '\u0015': {
                    o = new g(s, n);
                    break;
                }
                default: {
                    o = new v(s, n);
                    break;
                }
            }
            this.a.add(o);
            n += ((u)o).a();
        }
    }
    
    public final List a() {
        return this.a;
    }
    
    public final int a() {
        int n = 0;
        final Iterator<u> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().a();
        }
        return n + 3;
    }
    
    public final char b() {
        return '\n';
    }
    
    public final String a() {
        final StringBuffer sb;
        (sb = new StringBuffer()).append(f.b(this.a.size()));
        final Iterator<u> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().a());
        }
        return sb.toString();
    }
}

