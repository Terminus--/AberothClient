// 

package a;

import java.security.MessageDigest;
import java.io.InputStream;

public final class f
{
    private static final String[] a;
    
    public static char a(final byte b) {
        if (b >= 0) {
            return (char)b;
        }
        return (char)(b + 256);
    }
    
    public static byte a(final char c) {
        if (c > '\u00ff') {
            System.out.println("Warning, char greater than 255!");
        }
        if (c < '\u0080') {
            return (byte)c;
        }
        return (byte)(c - '\u0100');
    }
    
    public static char[] a(final byte[] array) {
        final int length;
        final char[] array2 = new char[length = array.length];
        for (int i = 0; i < length; ++i) {
            array2[i] = a(array[i]);
        }
        return array2;
    }
    
    public static byte[] a(final String s) {
        return a(s.toCharArray());
    }
    
    public static byte[] a(final char[] array) {
        final int length;
        final byte[] array2 = new byte[length = array.length];
        for (int i = 0; i < length; ++i) {
            array2[i] = a(array[i]);
        }
        return array2;
    }
    
    public static String a(final int n) {
        if (n > 65535) {
            System.out.println("Warning, int greater than 65535!");
        }
        return new StringBuilder().append((char)(n / 256 & 0xFF)).append((char)(n & 0xFF)).toString();
    }
    
    public static int a(final String s, final int n) {
        return (s.charAt(n) << 8) + s.charAt(n + 1);
    }
    
    public static double a(final char c, final double n) {
        int a;
        if ((a = a(c)) == -128) {
            a = -127;
        }
        return a * n / 127.0;
    }
    
    public static char a(double n, final double n2) {
        if (n > n2) {
            n = n2;
        }
        if (n < -n2) {
            n = -n2;
        }
        return a((byte)Math.round(n / n2 * 127.0));
    }
    
    public static String b(int n) {
        if (n > 16777215) {
            System.out.println("Warning, int greater than 16777215!");
        }
        final int n2 = n & 0xFF;
        final int n3 = (n /= 256) & 0xFF;
        n = (n / 256 & 0xFF);
        return new StringBuilder().append((char)n).append((char)n3).append((char)n2).toString();
    }
    
    public static int b(final String s, final int n) {
        return (s.charAt(n) << 16) + (s.charAt(n + 1) << 8) + s.charAt(n + 2);
    }
    
    public static String a(final String s, final int n) {
        return s.substring(n + 2, n + 2 + a(s, n));
    }
    
    public static String a(final String s) {
        if (s == null) {
            return a(0);
        }
        return a(s.length()) + s;
    }
    
    public static int a(final InputStream inputStream, final byte[] array) {
        int i;
        int n;
        int read;
        for (i = array.length, n = 0; i > 0; i -= read, n += read) {
            if ((read = inputStream.read(array, n, i)) == -1) {
                return -1;
            }
        }
        return n;
    }
    
    public static int a(final InputStream inputStream, final byte[] array, final Long n) {
        if (n == null) {
            return a(inputStream, array);
        }
        int i;
        int n2;
        int read;
        for (i = array.length, n2 = 0; i > 0; i -= read, n2 += read) {
            int n3;
            if ((n3 = i) > 8192L) {
                n3 = 8192;
            }
            final long nanoTime = System.nanoTime();
            if ((read = inputStream.read(array, n2, n3)) == -1) {
                return -1;
            }
            final long n4;
            if ((n4 = read * 8000L / n - (System.nanoTime() - nanoTime) / 1000000L) > 0L) {
                try {
                    Thread.sleep(n4);
                }
                catch (Exception ex) {}
            }
        }
        return n2;
    }
    
    public static String b(final String s) {
        try {
            final byte[] digest;
            if ((digest = MessageDigest.getInstance("MD5").digest(s.getBytes())) == null || digest.length <= 0) {
                return null;
            }
            final StringBuilder sb = new StringBuilder(digest.length << 1);
            for (int i = 0; i < digest.length; ++i) {
                sb.append(f.a[(byte)((byte)((byte)(digest[i] & 0xF0) >>> 4) & 0xF)]);
                sb.append(f.a[(byte)(digest[i] & 0xF)]);
            }
            return new String(sb);
        }
        catch (Exception ex) {
            return "MD5 Failure exception.";
        }
    }
    
    static {
        a = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
    }
}
