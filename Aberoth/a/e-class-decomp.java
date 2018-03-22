package a;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

final class e
  extends Thread
{
  e(c paramC) {}
  
  public final void run()
  {
    while (a.a())
    {
      while (!c.a(a).isEmpty())
      {
        synchronized (c.a(a))
        {
          byte[] arrayOfByte1 = (byte[])c.a(a).remove(0);
        }
        if (arrayOfByte2 == c.a())
        {
          try
          {
            c.a(a).flush();
            sleep(250L);
          }
          catch (Exception localException1) {}
          a.b();
          return;
        }
        if (!a.a()) {
          return;
        }
        if (!c.a(a, arrayOfByte2)) {
          return;
        }
      }
      synchronized (c.a(a))
      {
        try
        {
          c.a(a).wait();
        }
        catch (Exception localException2)
        {
          System.out.println("Socket exception: Waiting exception!");
          a.b();
        }
      }
    }
  }
}
