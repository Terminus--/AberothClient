package a;

public final class g implements u
{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    
    public g(final String s, final int n) {
        this.a = a.f.a(s, n + 1);
        this.b = a.f.a(s, n + 3);
        this.c = a.f.a(s, n + 5);
        this.d = a.f.a(s, n + 7);
        this.e = a.f.a(s, n + 9);
        this.f = a.f.a(s, n + 11);
        if (s.charAt(n + 13) != '\0') {
            this.e = -this.e;
        }
        if (s.charAt(n + 14) != '\0') {
            this.f = -this.f;
        }
    }
    
    public final int a() {
        return 15;
    }
    
    public final int b() {
        return this.a;
    }
    
    public final int c() {
        return this.b;
    }
    
    public final int d() {
        return this.e;
    }
    
    public final int e() {
        return this.f;
    }
    
    public final int f() {
        return this.c;
    }
    
    public final int g() {
        return this.d;
    }
    
    public final char b() {
        return '\u0015';
    }
    
    public final String a() {
        char c;
        if (this.e < 0) {
            c = '\u0001';
            this.e = -this.e;
        }
        else {
            c = '\0';
        }
        char c2;
        if (this.f < 0) {
            c2 = '\u0001';
            this.f = -this.f;
        }
        else {
            c2 = '\0';
        }
        return "\u0015" + a.f.a(this.a) + a.f.a(this.b) + a.f.a(this.c) + a.f.a(this.d) + a.f.a(this.e) + a.f.a(this.f) + c + c2;
    }
}

