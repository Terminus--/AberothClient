package launcher;

import a.f;
import gameclient.GameClient;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class AberothLauncher
{
  private static String a = "AberothClient.exe";
  private static String b = "AberothClient.jar";
  
  public AberothLauncher() {}
  
  public static void main(String[] paramArrayOfString)
  {
    paramArrayOfString = GameClient.a();
    int i;
    String str;
    if ((i = (System.getProperty("os.name") + " " + System.getProperty("os.version") + " " + System.getProperty("os.arch")).toUpperCase().indexOf("WINDOWS") != -1 ? 1 : 0) != 0) {
      str = a;
    } else {
      str = b;
    }
    Object localObject1 = new File(paramArrayOfString, str);
    int j = 0;
    if (((File)localObject1).exists()) {
      j = (int)((File)localObject1).length();
    }
    Object localObject2;
    try
    {
      int k = (localObject2 = (HttpURLConnection)new URL("http://www.aberoth.com/resource/" + str).openConnection()).getContentLength();
      if (j != k)
      {
        byte[] arrayOfByte = new byte[k];
        f.a(localObject2 = ((HttpURLConnection)localObject2).getInputStream(), arrayOfByte);
        (localObject1 = new FileOutputStream((File)localObject1, false)).write(arrayOfByte);
        ((FileOutputStream)localObject1).close();
        ((InputStream)localObject2).close();
      }
    }
    catch (Exception localException2)
    {
      JOptionPane.showMessageDialog(null, "Unable to check for Aberoth update.", "Warning", 2);
    }
    try
    {
      if (i != 0)
      {
        localObject2 = new String[] { paramArrayOfString.getAbsolutePath() + "\\" + str };
        Runtime.getRuntime().exec((String[])localObject2);
      }
      else
      {
        Runtime.getRuntime().exec("java -jar " + str, null, paramArrayOfString);
      }
      System.exit(0);
      return;
    }
    catch (Exception localException1)
    {
      System.out.println("Can't launch new Aberoth: " + localException1.getMessage());
      localException1.printStackTrace();
      JOptionPane.showMessageDialog(null, "Unable to launch Aberoth client.", "Error", 0);
    }
  }
}
