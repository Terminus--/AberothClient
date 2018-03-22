
package a;

public final class l implements u
{
    private char a;
    private char b;
    private char c;
    
    public l(final String s, final int n) {
        this.a = s.charAt(n + 1);
        this.c = s.charAt(n + 2);
        this.b = s.charAt(n + 3);
    }
    
    public final int b() {
        return this.b;
    }
    
    public final boolean a() {
        return this.b != '\0';
    }
    
    public final int a() {
        return 4;
    }
    
    public final char b() {
        return '\u000b';
    }
    
    public final String a() {
        return "\u000b" + this.a + this.c + this.b;
    }
}
