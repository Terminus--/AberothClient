
package a;

public final class i implements u
{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private char a;
    
    public i(final String s, final int n) {
        this.e = 1;
        switch (this.a = s.charAt(n)) {
            case '\0': {
                this.c = 1;
            }
            case '\u0003': {
                this.d = 1;
            }
            case '\u0002': {
                this.c = s.charAt(n + 1);
            }
            case '\u0004': {
                this.d = s.charAt(n + 1);
            }
            case '\u0005': {
                this.a = f.a(s, n + 1);
                this.b = f.a(s, n + 3);
            }
            case '\u0001': {
                this.a = s.charAt(n + 1);
                this.b = s.charAt(n + 2);
            }
            case '\u001b': {
                this.c = 1;
                this.e = s.charAt(n + 1);
                break;
            }
        }
    }
    
    public final boolean a() {
        return this.a != '\u0005';
    }
    
    public final boolean b() {
        return this.a == '\u0005' || this.a == '\u0001';
    }
    
    public final boolean c() {
        return this.a == '\u0002' || this.a == '\0' || this.a == '\u001b';
    }
    
    public final boolean d() {
        return this.a == '\u0004' || this.a == '\u0003';
    }
    
    public final char b() {
        return this.a;
    }
    
    public final int b() {
        return this.c;
    }
    
    public final int c() {
        return this.d;
    }
    
    public final int d() {
        return this.a;
    }
    
    public final int e() {
        return this.b;
    }
    
    public final int f() {
        return this.e;
    }
    
    public final int a() {
        switch (this.a) {
            case '\0':
            case '\u0003': {
                return 1;
            }
            case '\u0002':
            case '\u0004': {
                return 2;
            }
            case '\u0005': {
                return 5;
            }
            case '\u0001': {
                return 3;
            }
            case '\u001b': {
                return 2;
            }
            default: {
                return 1;
            }
        }
    }
    
    public final String a() {
        switch (this.a) {
            case '\0': {
                return "\u0000";
            }
            case '\u0003': {
                return "\u0003";
            }
            case '\u0002': {
                return "\u0002" + (char)this.c;
            }
            case '\u0004': {
                return "\u0004" + (char)this.d;
            }
            case '\u0005': {
                return "\u0005" + f.a(this.a) + f.a(this.b);
            }
            case '\u0001': {
                return "\u0001" + (char)this.a + (char)this.b;
            }
            case '\u001b': {
                return "\u001b" + (char)this.e;
            }
            default: {
                System.out.println("Bad fill rect command!");
                return "";
            }
        }
    }
}
