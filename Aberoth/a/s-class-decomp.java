public final class s extends o
{
    private l a;
    private k a;
    private char a;
    
    public s(final String s) {
        this.a = s.charAt(0);
        this.a = new k(s, 1);
        this.a = null;
        if (this.a == '\f') {
            this.a = new l(s, 1 + this.a.a());
        }
    }
    
    public final k a() {
        return this.a;
    }
    
    public final l a() {
        return this.a;
    }
    
    public final int a() {
        int a = 0;
        if (this.a == '\f') {
            a = this.a.a();
        }
        return this.a.a() + a + 1;
    }
    
    public final char b() {
        return this.a;
    }
    
    @Override
    public final String a() {
        if (this.a == '\u0017') {
            return "\u0017" + this.a.a();
        }
        return "\f" + this.a.a() + this.a.a();
    }
}
