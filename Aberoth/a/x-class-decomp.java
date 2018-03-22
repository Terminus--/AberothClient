package a;

public final class x
  implements u
{
  private int jdField_a_of_type_Int;
  private int jdField_b_of_type_Int;
  private int c;
  private int d;
  private char jdField_a_of_type_Char;
  private char jdField_b_of_type_Char;
  
  public static x a(char paramChar, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return new x(paramChar, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private x(char paramChar, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    jdField_a_of_type_Char = '\000';
    jdField_b_of_type_Char = paramChar;
    jdField_a_of_type_Int = paramInt1;
    jdField_b_of_type_Int = paramInt2;
    c = paramInt3;
    d = paramInt4;
  }
  
  public x(String paramString, int paramInt)
  {
    jdField_a_of_type_Char = paramString.charAt(paramInt + 1);
    jdField_b_of_type_Char = paramString.charAt(paramInt + 2);
    if (jdField_a_of_type_Char == 0)
    {
      jdField_a_of_type_Int = f.a(paramString, paramInt + 3);
      jdField_b_of_type_Int = f.a(paramString, paramInt + 5);
      c = f.a(paramString, paramInt + 7);
      d = f.a(paramString, paramInt + 9);
    }
  }
  
  public final int a()
  {
    switch (jdField_a_of_type_Char)
    {
    case '\000': 
      return 11;
    case '\001': 
    case '\002': 
    case '\003': 
      return 3;
    }
    return 0;
  }
  
  public final char b()
  {
    return '\030';
  }
  
  public final String a()
  {
    String str = "\030" + jdField_a_of_type_Char + jdField_b_of_type_Char;
    if (jdField_a_of_type_Char == 0) {
      str = str + f.a(jdField_a_of_type_Int) + f.a(jdField_b_of_type_Int) + f.a(c) + f.a(d);
    }
    return str;
  }
  
  public final char a()
  {
    return jdField_a_of_type_Char;
  }
  
  public final char c()
  {
    return jdField_b_of_type_Char;
  }
  
  public final int b()
  {
    return jdField_a_of_type_Int;
  }
  
  public final int c()
  {
    return jdField_b_of_type_Int;
  }
  
  public final int d()
  {
    return c;
  }
  
  public final int e()
  {
    return d;
  }
}
