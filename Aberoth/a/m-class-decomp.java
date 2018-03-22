
package a;

import java.util.Random;

public final class m extends o
{
    private l a;
    private String a;
    
    public m(final l a) {
        this.a = a;
        this.a = "";
        final int b;
        if ((b = this.a.b()) > 0 && b <= 3) {
            final Random random = new Random();
            final int a2;
            final char[] array = new char[a2 = a(b)];
            for (int i = 0; i < a2; ++i) {
                array[i] = (char)random.nextInt(256);
            }
            this.a = new String(array);
        }
    }
    
    public m(final String s) {
        this.a = new l(s, 1);
        this.a = "";
        final int b;
        final int n;
        if ((n = (b = this.a.b())) > 0 && n <= 3) {
            this.a = s.substring(1, 1 + a(b));
        }
    }
    
    public final int a() {
        return this.a.a() + 1 + this.a.length();
    }
    
    public final char b() {
        return '\r';
    }
    
    public final String a() {
        return "\r" + this.a.a() + this.a;
    }
    
    private static int a(final int n) {
        int n2 = 1024;
        for (int i = 0; i < n - 1; ++i) {
            n2 <<= 1;
        }
        return n2;
    }
}
