package a;

public final class y
  extends o
{
  private int jdField_a_of_type_Int;
  private int jdField_b_of_type_Int;
  private char jdField_a_of_type_Char;
  private int c;
  private byte[] jdField_a_of_type_ArrayOfByte;
  private int d;
  private int e;
  private double jdField_a_of_type_Double;
  private double jdField_b_of_type_Double;
  
  public y(String paramString, int paramInt)
  {
    jdField_a_of_type_Int = f.a(paramString, paramInt + 1);
    jdField_a_of_type_Char = paramString.charAt(paramInt + 3);
    if (a())
    {
      d = f.a(paramString, paramInt + 4);
      e = f.a(paramString, paramInt + 6);
    }
    if (b())
    {
      jdField_a_of_type_Double = f.a(paramString.charAt(paramInt + 4), 0.8D);
      jdField_b_of_type_Double = f.a(paramString.charAt(paramInt + 5), 80.0D);
      jdField_b_of_type_Int = f.a(paramString, paramInt + 6);
    }
    if (c())
    {
      c = f.a(paramString, paramInt + 8);
      jdField_a_of_type_ArrayOfByte = f.a(paramString.substring(paramInt + 10, paramInt + 10 + c));
      return;
    }
    c = 0;
    jdField_a_of_type_ArrayOfByte = null;
  }
  
  public final boolean a()
  {
    return (jdField_a_of_type_Char == '\001') || (jdField_a_of_type_Char == '\005') || (jdField_a_of_type_Char == 0);
  }
  
  public final boolean b()
  {
    return (jdField_a_of_type_Char == '\003') || (jdField_a_of_type_Char == '\002') || (jdField_a_of_type_Char == '\006');
  }
  
  private boolean c()
  {
    return (jdField_a_of_type_Char != 0) && (jdField_a_of_type_Char != '\002') && (jdField_a_of_type_Char != '\006');
  }
  
  public final char a()
  {
    return jdField_a_of_type_Char;
  }
  
  public final byte[] a()
  {
    return jdField_a_of_type_ArrayOfByte;
  }
  
  public final int b()
  {
    return jdField_a_of_type_Int;
  }
  
  public final int c()
  {
    return jdField_b_of_type_Int;
  }
  
  public final double a()
  {
    return jdField_a_of_type_Double;
  }
  
  public final double b()
  {
    return jdField_b_of_type_Double;
  }
  
  public final int d()
  {
    return d;
  }
  
  public final int e()
  {
    return e;
  }
  
  public final int a()
  {
    if (!c()) {
      return 8;
    }
    return 10 + c;
  }
  
  public final char b()
  {
    return '\032';
  }
  
  public final String a()
  {
    String str = "\032" + f.a(jdField_a_of_type_Int) + jdField_a_of_type_Char;
    if (a()) {
      str = str + f.a(d) + f.a(e);
    }
    if (b()) {
      str = str + f.a(jdField_a_of_type_Double, 0.8D) + f.a(jdField_b_of_type_Double, 80.0D) + f.a(jdField_b_of_type_Int);
    }
    if (c()) {
      str = str + f.a(c) + new String(f.a(jdField_a_of_type_ArrayOfByte));
    }
    return str;
  }
}
