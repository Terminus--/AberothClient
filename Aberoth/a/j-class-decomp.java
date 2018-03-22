
package a;

public final class j implements u
{
    private int a;
    private int b;
    
    public j(final String s, final int n) {
        this.a = f.a(s, n + 1);
        this.b = f.a(s, n + 3);
    }
    
    public final int a() {
        return 5;
    }
    
    public final int b() {
        return this.a;
    }
    
    public final int c() {
        return this.b;
    }
    
    public final char b() {
        return '\u0012';
    }
    
    public final String a() {
        return "\u0012" + f.a(this.a) + f.a(this.b);
    }
}

