package a;

public final class r implements u
{
    private String a;
    private int a;
    private char a;
    private char b;
    private char c;
    private int b;
    private int c;
    private char d;
    
    public r(final String a) {
        this.a = '\b';
        this.a = 3;
        this.b = 0;
        this.c = 0;
        this.d = '\b';
        if (this.b < 0) {
            this.b = 0;
        }
        if (this.c < 0) {
            this.c = 0;
        }
        this.a = a;
        if (this.a == null) {
            this.a = "";
        }
        this.b = '\0';
        this.c = '\0';
    }
    
    public r(final String s, final int n) {
        this.a = s.charAt(n);
        this.a = f.a(s, n + 1);
        this.b = f.a(s, n + 3);
        this.c = f.a(s, n + 5);
        this.d = s.charAt(n + 7);
        if (this.a == '\b') {
            this.b = s.charAt(n + 8);
            this.c = s.charAt(n + 9);
            this.a = f.a(s, n + 10);
        }
    }
    
    public final int b() {
        return this.c;
    }
    
    public final int c() {
        return this.a;
    }
    
    public final int d() {
        return this.b;
    }
    
    public final boolean a() {
        return this.c == 65535;
    }
    
    public final int e() {
        return this.c;
    }
    
    public final int f() {
        return this.d;
    }
    
    public final char a() {
        return this.b;
    }
    
    public final String b() {
        return this.a;
    }
    
    public final int a() {
        switch (this.a) {
            case '\b': {
                return this.a.length() + 12;
            }
            case '\t': {
                return 8;
            }
            default: {
                System.out.println("Bad on screen text command!");
                return 0;
            }
        }
    }
    
    public final char b() {
        return this.a;
    }
    
    public final String a() {
        switch (this.a) {
            case '\b': {
                return "\b" + f.a(this.a) + f.a(this.b) + f.a(this.c) + this.d + this.b + this.c + f.a(this.a.length()) + this.a;
            }
            case '\t': {
                return "\t" + f.a(this.a) + f.a(this.b) + f.a(this.c) + this.d;
            }
            default: {
                System.out.println("Bad on screen text command!");
                return "";
            }
        }
    }
}
