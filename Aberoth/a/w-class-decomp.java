package a;

public final class w
  implements u
{
  private int jdField_a_of_type_Int;
  private int b;
  private char jdField_a_of_type_Char;
  
  public w(String paramString, int paramInt)
  {
    jdField_a_of_type_Int = f.a(paramString, paramInt + 1);
    b = f.a(paramString, paramInt + 3);
    jdField_a_of_type_Char = paramString.charAt(paramInt + 5);
  }
  
  public final int b()
  {
    return jdField_a_of_type_Int;
  }
  
  public final int c()
  {
    return b;
  }
  
  public final boolean a()
  {
    return (jdField_a_of_type_Char & 0x1) != 0;
  }
  
  public final boolean b()
  {
    return (jdField_a_of_type_Char & 0x2) != 0;
  }
  
  public final int a()
  {
    return 6;
  }
  
  public final char b()
  {
    return '\031';
  }
  
  public final String a()
  {
    return "\031" + f.a(jdField_a_of_type_Int) + f.a(b) + jdField_a_of_type_Char;
  }
