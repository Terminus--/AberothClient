package gameclient;

import a.b;
import a.c;
import a.h;
import a.k;
import a.q;
import a.s;
import a.u;
import a.z;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.ImageCapabilities;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GameClient
  extends Applet
  implements q
{
  private int jdField_a_of_type_Int;
  private Font jdField_a_of_type_JavaAwtFont;
  private boolean jdField_a_of_type_Boolean = false;
  private int jdField_b_of_type_Int = -1;
  private boolean jdField_b_of_type_Boolean = false;
  private boolean jdField_c_of_type_Boolean = false;
  private boolean jdField_d_of_type_Boolean = false;
  private String jdField_a_of_type_JavaLangString = "";
  private boolean jdField_e_of_type_Boolean = false;
  private boolean jdField_f_of_type_Boolean = false;
  private boolean jdField_g_of_type_Boolean = false;
  private a jdField_a_of_type_GameclientA = null;
  private c jdField_a_of_type_AC = null;
  private String jdField_b_of_type_JavaLangString;
  private String jdField_c_of_type_JavaLangString;
  private boolean jdField_h_of_type_Boolean = false;
  private volatile boolean jdField_i_of_type_Boolean = false;
  private volatile boolean jdField_j_of_type_Boolean = false;
  public static ResourceBundle a;
  private LinkedList jdField_a_of_type_JavaUtilLinkedList = new LinkedList();
  private boolean jdField_k_of_type_Boolean = true;
  private int jdField_c_of_type_Int = 0;
  private int jdField_d_of_type_Int = 0;
  private boolean jdField_l_of_type_Boolean = false;
  private String jdField_d_of_type_JavaLangString = null;
  private int jdField_e_of_type_Int;
  private int jdField_f_of_type_Int;
  private int jdField_g_of_type_Int;
  private int jdField_h_of_type_Int;
  private int jdField_i_of_type_Int;
  private int jdField_j_of_type_Int;
  private int jdField_k_of_type_Int;
  private boolean jdField_m_of_type_Boolean;
  private String jdField_e_of_type_JavaLangString;
  private String jdField_f_of_type_JavaLangString;
  private Integer jdField_a_of_type_JavaLangInteger = null;
  private String jdField_g_of_type_JavaLangString;
  private JDialog jdField_a_of_type_JavaxSwingJDialog;
  private JLabel jdField_a_of_type_JavaxSwingJLabel;
  private boolean n;
  private GraphicsConfiguration jdField_a_of_type_JavaAwtGraphicsConfiguration;
  private String jdField_h_of_type_JavaLangString;
  private String jdField_i_of_type_JavaLangString;
  private boolean o;
  private boolean p;
  private String jdField_j_of_type_JavaLangString;
  private int jdField_l_of_type_Int;
  private int jdField_m_of_type_Int;
  private ArrayList jdField_a_of_type_JavaUtilArrayList;
  private boolean q;
  
  public GameClient()
  {
    getInsets();
    jdField_g_of_type_JavaLangString = "";
    n = false;
    jdField_h_of_type_JavaLangString = "Normal";
    jdField_i_of_type_JavaLangString = "Auto";
    o = true;
    p = true;
    jdField_j_of_type_JavaLangString = "";
    jdField_l_of_type_Int = -1;
    jdField_m_of_type_Int = -1;
    jdField_a_of_type_JavaUtilArrayList = new ArrayList();
    q = false;
  }
  
  public void init()
  {
    setLayout(new BorderLayout());
    jdField_b_of_type_JavaLangString = getParameter("serverIpAddress");
    jdField_c_of_type_JavaLangString = getParameter("serverPort");
    jdField_e_of_type_JavaLangString = getParameter("playerName");
    jdField_f_of_type_JavaLangString = getParameter("password");
    try
    {
      jdField_a_of_type_JavaLangInteger = Integer.valueOf(Integer.parseInt(getParameter("screenDefinition")));
    }
    catch (Exception localException1)
    {
      jdField_a_of_type_JavaLangInteger = Integer.valueOf(0);
    }
    try
    {
      jdField_e_of_type_Int = Integer.parseInt(getParameter("scaleUp"));
    }
    catch (Exception localException2)
    {
      jdField_e_of_type_Int = 1;
    }
    try
    {
      jdField_f_of_type_Int = Integer.parseInt(getParameter("scaleDown"));
    }
    catch (Exception localException3)
    {
      jdField_f_of_type_Int = 1;
    }
    String str = "Auto";
    GameClient localGameClient = this;
    jdField_h_of_type_Int = 1;
    jdField_i_of_type_Int = 1;
    if (str.equals("Auto"))
    {
      if ((jdField_e_of_type_Int == 1) && (jdField_f_of_type_Int == 2))
      {
        jdField_h_of_type_Int = 1;
        jdField_i_of_type_Int = 2;
      }
      if ((jdField_e_of_type_Int == 3) && (jdField_f_of_type_Int == 4))
      {
        jdField_h_of_type_Int = 3;
        jdField_i_of_type_Int = 4;
      }
      if ((jdField_e_of_type_Int == 1) && (jdField_f_of_type_Int == 1))
      {
        jdField_h_of_type_Int = 1;
        jdField_i_of_type_Int = 1;
      }
      if ((jdField_e_of_type_Int == 5) && (jdField_f_of_type_Int == 4))
      {
        jdField_h_of_type_Int = 1;
        jdField_i_of_type_Int = 1;
      }
      if ((jdField_e_of_type_Int == 3) && (jdField_f_of_type_Int == 2))
      {
        jdField_h_of_type_Int = 1;
        jdField_i_of_type_Int = 1;
      }
      if ((jdField_e_of_type_Int == 7) && (jdField_f_of_type_Int == 4))
      {
        jdField_h_of_type_Int = 1;
        jdField_i_of_type_Int = 1;
      }
      if ((jdField_e_of_type_Int == 2) && (jdField_f_of_type_Int == 1))
      {
        jdField_h_of_type_Int = 2;
        jdField_i_of_type_Int = 1;
      }
      if ((jdField_e_of_type_Int == 5) && (jdField_f_of_type_Int == 2))
      {
        jdField_h_of_type_Int = 2;
        jdField_i_of_type_Int = 1;
      }
      if ((jdField_e_of_type_Int == 3) && (jdField_f_of_type_Int == 1))
      {
        jdField_h_of_type_Int = 3;
        jdField_i_of_type_Int = 1;
      }
    }
    else
    {
      if (str.equals("Half"))
      {
        jdField_h_of_type_Int = 1;
        jdField_i_of_type_Int = 2;
      }
      if (str.equals("3/4"))
      {
        jdField_h_of_type_Int = 3;
        jdField_i_of_type_Int = 4;
      }
      if (str.equals("Normal"))
      {
        jdField_h_of_type_Int = 1;
        jdField_i_of_type_Int = 1;
      }
      if (str.equals("1.25"))
      {
        jdField_h_of_type_Int = 5;
        jdField_i_of_type_Int = 4;
      }
      if (str.equals("1.5"))
      {
        jdField_h_of_type_Int = 3;
        jdField_i_of_type_Int = 2;
      }
      if (str.equals("1.75"))
      {
        jdField_h_of_type_Int = 7;
        jdField_i_of_type_Int = 4;
      }
      if (str.equals("Double"))
      {
        jdField_h_of_type_Int = 2;
        jdField_i_of_type_Int = 1;
      }
      if (str.equals("2.5"))
      {
        jdField_h_of_type_Int = 5;
        jdField_i_of_type_Int = 2;
      }
      if (str.equals("Triple"))
      {
        jdField_h_of_type_Int = 3;
        jdField_i_of_type_Int = 1;
      }
    }
    jdField_a_of_type_Int = (32 * jdField_h_of_type_Int / jdField_i_of_type_Int);
    try
    {
      jdField_g_of_type_Int = Integer.parseInt(getParameter("fontSize"));
    }
    catch (Exception localException4)
    {
      jdField_g_of_type_Int = 14;
    }
    try
    {
      jdField_j_of_type_Int = Integer.parseInt(getParameter("mouseAdjustX"));
    }
    catch (Exception localException5)
    {
      jdField_j_of_type_Int = 0;
    }
    try
    {
      jdField_k_of_type_Int = Integer.parseInt(getParameter("mouseAdjustY"));
    }
    catch (Exception localException6)
    {
      jdField_k_of_type_Int = 0;
    }
    jdField_l_of_type_Boolean = true;
    localGameClient = this;
    jdField_a_of_type_JavaLangString = (System.getProperty("os.name") + " " + System.getProperty("os.version") + " " + System.getProperty("os.arch"));
    jdField_d_of_type_Boolean = (jdField_a_of_type_JavaLangString.toUpperCase().indexOf("OS X") != -1);
    jdField_c_of_type_Boolean = (jdField_a_of_type_JavaLangString.toUpperCase().indexOf("WINDOWS") != -1);
    if ((jdField_d_of_type_Boolean) || (jdField_c_of_type_Boolean)) {
      jdField_b_of_type_Boolean = false;
    } else {
      jdField_b_of_type_Boolean = true;
    }
    setFocusable(true);
    setBackground(Color.black);
    jdField_m_of_type_Boolean = c();
    new l(this).start();
  }
  
  public void stop()
  {
    jdField_j_of_type_Boolean = true;
    jdField_e_of_type_Boolean = true;
    if (jdField_a_of_type_AC != null) {
      jdField_a_of_type_AC.a();
    }
    SwingUtilities.invokeLater(new m(this));
    jdField_i_of_type_Boolean = true;
  }
  
  public void start()
  {
    if (!isVisible()) {
      setVisible(true);
    }
    requestFocus();
    requestFocusInWindow();
    requestFocus();
    jdField_a_of_type_JavaAwtGraphicsConfiguration = getGraphicsConfiguration();
    GameClient localGameClient = this;
    jdField_a_of_type_Boolean = jdField_a_of_type_JavaAwtGraphicsConfiguration.getImageCapabilities().isAccelerated();
    jdField_b_of_type_Int = jdField_a_of_type_JavaAwtGraphicsConfiguration.getDevice().getAvailableAcceleratedMemory();
    jdField_h_of_type_Boolean = true;
  }
  
  private boolean b()
  {
    return (jdField_a_of_type_Boolean) && (jdField_b_of_type_Int != -1) && (p);
  }
  
  public void paint(Graphics paramGraphics)
  {
    if (jdField_a_of_type_GameclientA == null)
    {
      Object localObject = paramGraphics.getClipBounds();
      paramGraphics.setColor(Color.black);
      paramGraphics.fillRect(x, y, width, height);
      if ((localObject = a()).length() > 0)
      {
        GameClient localGameClient = this;
        if (jdField_a_of_type_JavaAwtFont == null) {
          jdField_a_of_type_JavaAwtFont = new Font("Dialog", 0, jdField_g_of_type_Int);
        }
        paramGraphics.setFont(jdField_a_of_type_JavaAwtFont);
        a.a(paramGraphics, (String)localObject, 0);
      }
      return;
    }
    jdField_a_of_type_GameclientA.paint(paramGraphics);
  }
  
  public void update(Graphics paramGraphics)
  {
    paint(paramGraphics);
  }
  
  public final void a(String paramString)
  {
    if (paramString == null)
    {
      if (jdField_d_of_type_JavaLangString != null) {}
    }
    else if (paramString.equals(jdField_d_of_type_JavaLangString)) {
      return;
    }
    jdField_d_of_type_JavaLangString = paramString;
    paramString = this;
    if (jdField_a_of_type_GameclientA != null) {
      jdField_a_of_type_GameclientA.a(paramString.a());
    }
    if (jdField_a_of_type_JavaxSwingJLabel != null)
    {
      jdField_a_of_type_JavaxSwingJLabel.setText(paramString.a());
      if ((jdField_a_of_type_JavaxSwingJDialog != null) && (jdField_a_of_type_JavaxSwingJDialog.isVisible())) {
        jdField_a_of_type_JavaxSwingJDialog.pack();
      }
    }
    paramString.repaint();
  }
  
  private String a()
  {
    String str;
    if ((str = jdField_d_of_type_JavaLangString) == null) {
      str = "";
    }
    return str + jdField_g_of_type_JavaLangString;
  }
  
  private void a(Window paramWindow)
  {
    Dimension localDimension1 = Toolkit.getDefaultToolkit().getScreenSize();
    int i2 = 0;
    int i1 = 0;
    int i3 = null.length;
    for (int i4 = 0; i4 < i3; i4++) {
      if (null.contains(jdField_l_of_type_Int, jdField_m_of_type_Int))
      {
        localDimension1 = new Dimension(width, height);
        i2 = x;
        i1 = y;
      }
    }
    Dimension localDimension2 = paramWindow.getSize();
    i3 = i2 + width / 2 - width / 2;
    i4 = i1 + height / 2 - height / 2;
    if (i3 < 0) {
      i3 = 0;
    }
    if (i4 < 0) {
      i4 = 0;
    }
    paramWindow.setBounds(i3, i4, width, height);
  }
  
  private static boolean c()
  {
    try
    {
      File localFile = a();
      if ((localFile = new File(localFile, "test.txt")).exists())
      {
        localFile.delete();
      }
      else
      {
        localFile.createNewFile();
        localFile.delete();
      }
    }
    catch (Exception localException)
    {
      return false;
    }
    return true;
  }
  
  public final boolean a()
  {
    return jdField_d_of_type_Boolean;
  }
  
  public final void a()
  {
    jdField_g_of_type_Boolean = false;
    do
    {
      if ((jdField_j_of_type_Boolean) || (jdField_g_of_type_Boolean)) {
        return;
      }
      if (jdField_l_of_type_Boolean) {
        while (!jdField_h_of_type_Boolean)
        {
          if (jdField_j_of_type_Boolean) {
            return;
          }
          try
          {
            Thread.sleep(100L);
          }
          catch (Exception localException) {}
        }
      }
      if (!jdField_l_of_type_Boolean)
      {
        String str = "Connecting to the Aberoth server...";
        localObject1 = "Connecting";
        Object localObject2 = this;
        jdField_a_of_type_JavaxSwingJDialog = new JDialog(null, (String)localObject1, false);
        (localObject1 = new JPanel()).setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        ((JPanel)localObject1).setLayout(new BorderLayout());
        jdField_a_of_type_JavaxSwingJLabel = new JLabel();
        jdField_a_of_type_JavaxSwingJLabel.setText(str);
        ((JPanel)localObject1).add(jdField_a_of_type_JavaxSwingJLabel, "North");
        jdField_a_of_type_JavaxSwingJDialog.getContentPane().add((Component)localObject1);
        n = false;
        jdField_a_of_type_JavaxSwingJDialog.addWindowListener(new o((GameClient)localObject2));
        localObject2 = jdField_a_of_type_JavaxSwingJDialog;
        localObject1 = localObject2;
        ((JDialog)localObject2).pack();
        ((GameClient)localObject1).a((Window)localObject2);
        ((JDialog)localObject2).setVisible(true);
      }
      jdField_a_of_type_AC = new c(jdField_b_of_type_JavaLangString, Integer.parseInt(jdField_c_of_type_JavaLangString));
      if (jdField_j_of_type_Boolean) {
        return;
      }
      if (!jdField_a_of_type_AC.a())
      {
        if (!jdField_l_of_type_Boolean)
        {
          n = false;
          jdField_a_of_type_JavaxSwingJDialog.dispose();
        }
        a(jdField_a_of_type_AC.a());
        return;
      }
      Object localObject1 = System.getProperty("java.version") + " " + System.getProperty("java.vendor");
      boolean bool2 = true;
      if (jdField_l_of_type_Boolean) {
        bool2 = false;
      } else {
        localObject1 = (String)localObject1 + " (Stand Alone)";
      }
      int i1;
      if (o) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (jdField_a_of_type_JavaLangInteger != null) {
        i1 = jdField_a_of_type_JavaLangInteger.intValue();
      }
      boolean bool1 = jdField_a_of_type_AC.a(jdField_e_of_type_JavaLangString, jdField_f_of_type_JavaLangString, i1, this, jdField_e_of_type_Int, jdField_f_of_type_Int, jdField_g_of_type_Int, jdField_a_of_type_JavaLangString, (String)localObject1, b(), jdField_b_of_type_Int, jdField_m_of_type_Boolean, bool2);
      Object localObject3 = this;
      if (jdField_a_of_type_JavaxSwingJDialog != null)
      {
        n = true;
        jdField_a_of_type_JavaxSwingJDialog.dispose();
        jdField_a_of_type_JavaxSwingJDialog = null;
      }
      if (!bool1) {
        return;
      }
      localObject3 = this;
      jdField_k_of_type_Boolean = true;
      new n((GameClient)localObject3).start();
      a.o localO;
      Object localObject4;
      while (((localO = a()) != null) && (!jdField_j_of_type_Boolean) && (!jdField_g_of_type_Boolean) && (localO != null) && (!jdField_g_of_type_Boolean))
      {
        if (jdField_c_of_type_Int != jdField_d_of_type_Int)
        {
          localObject4 = new b(jdField_c_of_type_Int);
          jdField_a_of_type_AC.a((a.o)localObject4);
          jdField_d_of_type_Int = jdField_c_of_type_Int;
        }
        if ((localO instanceof h))
        {
          jdField_a_of_type_GameclientA = new a(this, (h)localO, jdField_e_of_type_Int, jdField_f_of_type_Int, jdField_g_of_type_Int, jdField_j_of_type_Int, jdField_k_of_type_Int, jdField_a_of_type_JavaAwtGraphicsConfiguration, b(), jdField_b_of_type_Boolean, jdField_m_of_type_Boolean, jdField_a_of_type_Int);
          if (jdField_j_of_type_Boolean) {
            return;
          }
          if (jdField_l_of_type_Boolean)
          {
            add(jdField_a_of_type_GameclientA);
            jdField_a_of_type_GameclientA.b();
            validate();
            jdField_a_of_type_GameclientA.requestFocus();
          }
          else
          {
            null.getContentPane().remove(null);
            null.getContentPane().add(jdField_a_of_type_GameclientA);
            jdField_a_of_type_GameclientA.b();
            null.pack();
            null.setVisible(true);
            null.getInsets().clone();
            jdField_a_of_type_GameclientA.requestFocus();
          }
        }
        else if ((localO instanceof s))
        {
          if (((localObject3 = ((s)localO).a()) != null) && (((a.l)localObject3).a()))
          {
            localObject4 = new a.m((a.l)localObject3);
            jdField_a_of_type_AC.a((a.o)localObject4);
          }
          if (jdField_j_of_type_Boolean) {
            return;
          }
          if (jdField_a_of_type_GameclientA != null) {
            jdField_a_of_type_GameclientA.a(((s)localO).a().a());
          }
        }
      }
      if ((!jdField_j_of_type_Boolean) && (!jdField_g_of_type_Boolean))
      {
        localObject4 = "Session has ended.";
        if (!jdField_l_of_type_Boolean)
        {
          if (q) {
            localObject4 = "";
          } else {
            localObject4 = (String)localObject4 + " ";
          }
          localObject4 = (String)localObject4 + "Press R to respawn, or Q to quit to the main menu.";
        }
        a((String)localObject4);
      }
    } while (d());
  }
  
  private boolean d()
  {
    if (jdField_l_of_type_Boolean) {
      return false;
    }
    if (jdField_g_of_type_Boolean) {
      return true;
    }
    jdField_e_of_type_Boolean = false;
    jdField_f_of_type_Boolean = false;
    while ((!jdField_e_of_type_Boolean) && (!jdField_f_of_type_Boolean)) {
      try
      {
        Thread.sleep(100L);
      }
      catch (Exception localException)
      {
        return false;
      }
    }
    jdField_c_of_type_Int = 0;
    jdField_d_of_type_Int = 0;
    jdField_d_of_type_JavaLangString = null;
    return false;
  }
  
  public GraphicsConfiguration getGraphicsConfiguration()
  {
    return super.getGraphicsConfiguration();
  }
  
  private a.o a()
  {
    synchronized (jdField_a_of_type_JavaUtilLinkedList)
    {
      if (jdField_a_of_type_JavaUtilLinkedList.isEmpty())
      {
        if (!jdField_k_of_type_Boolean) {
          return null;
        }
        try
        {
          jdField_a_of_type_JavaUtilLinkedList.wait();
        }
        catch (Exception localException) {}
        if (jdField_a_of_type_JavaUtilLinkedList.isEmpty()) {
          return null;
        }
      }
      jdField_c_of_type_Int = (jdField_a_of_type_JavaUtilLinkedList.size() - 1);
      return (a.o)jdField_a_of_type_JavaUtilLinkedList.removeFirst();
    }
  }
  
  public final void b(String paramString)
  {
    jdField_e_of_type_JavaLangString = paramString;
  }
  
  public final void c(String paramString)
  {
    jdField_f_of_type_JavaLangString = paramString;
  }
  
  public final void a(boolean paramBoolean)
  {
    q = paramBoolean;
  }
  
  public final void b()
  {
    jdField_f_of_type_Boolean = false;
    jdField_e_of_type_Boolean = true;
    if ((jdField_a_of_type_GameclientA != null) && (jdField_a_of_type_GameclientA.a())) {
      jdField_g_of_type_Boolean = true;
    }
  }
  
  public final void c()
  {
    jdField_e_of_type_Boolean = false;
    jdField_f_of_type_Boolean = true;
  }
  
  public final void a(int paramInt, u paramU)
  {
    if (jdField_j_of_type_Boolean) {
      return;
    }
    ArrayList localArrayList;
    (localArrayList = new ArrayList(1)).add(paramU);
    paramU = new k(localArrayList);
    paramInt = new z(paramInt, paramU);
    jdField_a_of_type_AC.a(paramInt);
  }
  
  public static File a()
  {
    Object localObject = "resource";
    if ((localObject = new File((String)localObject)).exists()) {
      return localObject;
    }
    if (!(localObject = new File(System.getProperty("user.home"), "Downloads")).exists()) {
      ((File)localObject).mkdir();
    }
    if (!(localObject = new File((File)localObject, "aberoth")).exists()) {
      ((File)localObject).mkdir();
    }
    return localObject;
  }
  
  static
  {
    { "Half", "3/4", "Normal", "1.25", "1.5", "1.75", "Double", "2.5" }[8] = "Triple";
    new Color(75, 61, 47);
    new Color(227, 200, 109);
  }
}
