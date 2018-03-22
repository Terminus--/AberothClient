package a;

import a.b;
import a.d;
import a.e;
import a.f;
import a.h;
import a.m;
import a.o;
import a.q;
import a.s;
import a.z;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class c {
    private Socket a;
    private InputStream a;
    private OutputStream a;
    private ArrayList a;
    private Object a;
    private long a;
    private long b;
    private int a;
    private int b;
    private String a;
    private Deflater a;
    private Inflater a;
    private ByteArrayOutputStream a;
    private ByteArrayOutputStream b;
    private byte[] a;
    private byte[] b;
    private boolean a;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private Thread a = true;
    private volatile boolean e = true;
    private static final byte[] c = new byte[0];

    public c(String string, int n) {
        try {
            this.a = new Socket(string, n);
            return;
        }
        catch (AccessControlException accessControlException) {
            this.a = "Invalid security to connect to " + string + " port " + n;
            return;
        }
        catch (Exception exception) {
            System.out.println("Socket exception: Could not connect to server.");
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            this.a = "Could not connect to server at " + string + " port " + n + ". Please try again later.";
            return;
        }
    }

    public final String a() {
        return this.a;
    }

    public final boolean a(String object, String string, int object2, q q2, int n, int n2, int n3, String string2, String string3, boolean bl, int n4, boolean bl2, boolean bl3) {
        try {
            String string4 = string;
            if (bl3) {
                string4 = "encryptMD5";
            }
            this.a = this.a.getOutputStream();
            object = (String)object + '\u0000' + string4 + '\u0000' + (int)object2 + '\u0000' + n + '\u0000' + n2 + '\u0000' + n3 + '\u0000' + string2 + '\u0000' + string3 + '\u0000' + true + '\u0000' + bl + '\u0000' + n4 + '\u0000' + bl2 + '\u0000';
            this.a.write(object.getBytes());
            this.a = this.a.getInputStream();
            object = "";
            while (!this.b && this.a.isConnected()) {
                object2 = "";
                n = this.a.read();
                if (n == -1) {
                    return false;
                }
                do {
                    if ((n2 = this.a.read()) == -1) {
                        return false;
                    }
                    if (n2 == 0) break;
                    object2 = (String)object2 + (char)n2;
                } while (true);
                switch (n) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 5: {
                        object = object2;
                        break;
                    }
                    case 3: {
                        String string5 = "";
                        int n5 = Integer.parseInt((String)object2);
                        if (n5 == 0) {
                            string5 = "You are at the front of the line to get in.";
                        }
                        if (n5 == 1) {
                            string5 = "There is one player in line ahead of you.";
                        }
                        if (n5 > 1) {
                            string5 = "There are " + n5 + " players in line ahead of you.";
                        }
                        object = "Aberoth is filled to capacity. " + string5 + "  Please wait...";
                        break;
                    }
                    case 4: {
                        int n6 = Integer.parseInt((String)object2);
                        object = "The line to get in to Aberoth is full (" + n6 + " players). Please try again later.";
                    }
                }
                if (n != 5) {
                    q2.a((String)object);
                }
                if (n == 0 || n == 0) {
                    try {
                        this.a.close();
                    }
                    catch (Exception exception) {
                        System.out.println("Socket close handshake exception.");
                    }
                    return false;
                }
                if (n == 5) {
                    object2 = f.b((String)(string + (String)object));
                    this.a.write(object2.getBytes());
                }
                this.a.write(0);
                if (n != 1) continue;
            }
            this.a(this.a);
        }
        catch (Exception exception) {
            System.out.println("Socket exception: Could not complete handshake.");
            q2.a("Connection has been lost.");
            return false;
        }
        return true;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c();
        c c2 = this;
        if (c2.a != null && !c2.a.isInputShutdown()) {
            try {
                c2.a.shutdownInput();
            }
            catch (Exception exception) {
                c2.b();
            }
        }
        if (!this.d) {
            this.b();
            return;
        }
        this.a(c);
    }

    private void c() {
        if (this.a != null) {
            this.e = false;
            this.a = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void b() {
        if (this.c) {
            return;
        }
        this.c();
        this.b = true;
        this.c = true;
        try {
            if (!this.a.isOutputShutdown()) {
                this.a.shutdownOutput();
            }
            if (this.a != null && !this.a.isClosed()) {
                this.a.close();
            }
        }
        catch (Exception exception) {
            System.out.println("Socket exception: Could not close socket.");
        }
        Object object = this.a;
        synchronized (object) {
            this.a.notifyAll();
            return;
        }
    }

    public final boolean a() {
        if (this.a == null) {
            return false;
        }
        if (!this.a.isClosed()) {
            return true;
        }
        return false;
    }

    private boolean a(Socket socket) {
        this.a = socket;
        this.a = 0;
        this.b = 0;
        this.a = 0;
        this.b = 0;
        try {
            if (this.a != null) {
                this.a.setTcpNoDelay(true);
            }
            if (this.a == null) {
                this.a = this.a.getInputStream();
            }
            if (this.a == null) {
                this.a = this.a.getOutputStream();
            }
            this.a = new d(this);
            this.a.start();
            new e(this).start();
        }
        catch (Exception exception) {
            System.out.println("Socket exception: Could not initialize the connection. " + exception.getMessage());
            return false;
        }
        this.d = true;
        return true;
    }

    public final o a() {
        String string = this.b();
        if (string == null) {
            return null;
        }
        switch (string.charAt(0)) {
            case '\u0014': {
                return new h(string);
            }
            case '\f': 
            case '\u0017': {
                return new s(string);
            }
            case '\r': {
                return new m(string);
            }
            case '\u000e': {
                return new z(string);
            }
            case '\u0016': {
                return new b(string);
            }
        }
        System.out.println("Unknown message from server. Exiting.");
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final boolean a(o arrby) {
        if (this.c) {
            return false;
        }
        arrby = arrby.a();
        Deflater deflater = this.a;
        synchronized (deflater) {
            arrby = this.a((String)arrby);
            this.a += arrby.length;
            this.b += arrby.length;
        }
        this.a(arrby);
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(byte[] arrby) {
        Object object = this.a;
        synchronized (object) {
            this.a.add(arrby);
        }
        object = this.a;
        synchronized (object) {
            this.a.notifyAll();
            return;
        }
    }

    private byte[] a(byte[] object) {
        this.a.reset();
        this.a.setInput((byte[])object);
        this.b.reset();
        try {
            while (!this.a.finished()) {
                object = this.a.inflate(this.b);
                this.b.write(this.b, 0, (int)object);
            }
            this.b.close();
        }
        catch (Exception exception) {
            System.out.println("Socket exception: Problem decompressing the data!");
        }
        return this.b.toByteArray();
    }

    private byte[] a(String arrby) {
        boolean bl;
        boolean bl2 = bl = arrby.length() < 100;
        if (!this.a && arrby.length() < 65535) {
            bl = true;
        }
        this.a.reset();
        try {
            this.a.write(new byte[3]);
            if (bl) {
                this.a.write(f.a((String)arrby));
            } else {
                this.a.reset();
                this.a.setInput(f.a((String)arrby));
                this.a.finish();
                while (!this.a.finished()) {
                    int n = this.a.deflate(this.a);
                    this.a.write(this.a, 0, n);
                }
            }
            this.a.close();
        }
        catch (Exception exception) {
            System.out.println("Problem compressing!");
        }
        arrby = this.a.toByteArray();
        char[] arrc = f.b((int)(arrby.length - 3)).toCharArray();
        if (bl) {
            arrc[0] = 255;
        }
        byte[] arrby2 = f.a((char[])arrc);
        arrby[0] = arrby2[0];
        arrby[1] = arrby2[1];
        arrby[2] = arrby2[2];
        return arrby;
    }

    private boolean a(byte[] arrby) {
        try {
            this.a.write(arrby);
            this.b += (long)arrby.length;
        }
        catch (Exception exception) {
            System.out.println("Socket exception: Could not send message. Length:" + arrby.length);
            System.out.println(exception.getMessage());
            this.b();
            return false;
        }
        return true;
    }

    private String b() {
        if (this.b) {
            return null;
        }
        boolean bl = true;
        try {
            int n = this.a.read();
            int n2 = this.a.read();
            int n3 = this.a.read();
            if (n == -1 || n2 == -1 || n3 == -1) {
                this.b = true;
                this.b();
                return null;
            }
            this.a += 3;
            if (n == 255) {
                bl = false;
                n = 0;
            }
            n = ((n << 8) + n2 << 8) + n3;
            byte[] arrby = new byte[n];
            int n4 = 0;
            n2 = 0;
            while (n4 < n) {
                n2 = this.a.read(arrby, n4, n - n4);
                if (n2 == -1) {
                    System.out.println("Connection closed by client.");
                    break;
                }
                n4 += n2;
                this.a += (long)n2;
            }
            if (n2 == -1) {
                return null;
            }
            if (bl) {
                arrby = this.a(arrby);
            }
            return new String(f.a((byte[])arrby));
        }
        catch (Exception exception) {
            if (!this.b) {
                this.b();
            }
            return null;
        }
    }

    static /* synthetic */ boolean a(c c2) {
        return c2.e;
    }

    static /* synthetic */ long a(c c2) {
        return c2.b;
    }

    static /* synthetic */ ArrayList a(c c2) {
        return c2.a;
    }

    static /* synthetic */ byte[] a() {
        return c;
    }

    static /* synthetic */ OutputStream a(c c2) {
        return c2.a;
    }

    static /* synthetic */ boolean a(c c2, byte[] arrby) {
        return c2.a(arrby);
    }

    static /* synthetic */ Object a(c c2) {
        return c2.a;
    }

    static {
        byte[] arrby = new byte[]{-1, 0, 3, 22, -3, -24};
    }
}
