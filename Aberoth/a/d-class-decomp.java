package a;

import a.b;
import a.c;
import a.o;

final class d
extends Thread {
    private /* synthetic */ c a;

    d(c c2) {
        this.a = c2;
    }

    @Override
    public final void run() {
        while (this.a.a() && c.a(this.a)) {
            long l = c.a(this.a);
            if (this.isInterrupted()) {
                return;
            }
            try {
                d.sleep(30000);
                if (!c.a(this.a)) {
                    return;
                }
            }
            catch (Exception exception) {
                return;
            }
            if (!this.a.a() || l != c.a(this.a)) continue;
            b b2 = new b(65000);
            this.a.a((o)b2);
        }
    }
}

