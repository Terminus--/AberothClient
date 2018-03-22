
package a;

public final class h extends o
{
    private int a;
    private int b;
    private String a;
    private int c;
    private int d;
    
    public h(final String s) {
        this.a = 0;
        this.b = 0;
        this.c = s.charAt(1);
        this.a = f.a(s, 2);
        int n = 2 + (this.a.length() + 2);
        this.a = f.a(s, n);
        n += 2;
        this.b = f.a(s, n);
        n += 2;
        this.d = s.charAt(n);
    }
    
    public final int b() {
        return this.a;
    }
    
    public final int c() {
        return this.b;
    }
    
    public final int d() {
        return this.c;
    }
    
    public final boolean a() {
        return this.d != 0;
    }
    
    public final boolean b() {
        return this.d == 1 || this.d == 3;
    }
    
    public final boolean c() {
        return this.d != 1;
    }
    
    public final int a() {
        return this.a.length() + 9;
    }
    
    public final char b() {
        return '\u0014';
    }
    
    public final String a() {
        return "\u0014" + (char)this.c + f.a(this.a) + f.a(this.a) + f.a(this.b) + (char)this.d;
    }
}


