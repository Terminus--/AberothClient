
package a;

public final class n implements u
{
    private int a;
    private int b;
    
    public n(final char a, final char b) {
        this.a = a;
        this.b = b;
    }
    
    public n(final String s, final int n) {
        this.a = s.charAt(n + 1);
        this.b = s.charAt(n + 2);
    }
    
    public final int a() {
        return 3;
    }
    
    public final char b() {
        return '\u0010';
    }
    
    public final String a() {
        return "\u0010" + (char)this.a + (char)this.b;
    }
}

