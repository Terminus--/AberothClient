     

package a;

import java.awt.Color;

public final class v
  implements u
{
  private Color jdField_a_of_type_JavaAwtColor;
  private char jdField_a_of_type_Char;
  private char b;
  private char c;
  
  public v(String paramString, int paramInt)
  {
    b = paramString.charAt(paramInt);
    switch (b)
    {
    case '\034': 
      jdField_a_of_type_Char = paramString.charAt(paramInt + 1);
      c = paramString.charAt(paramInt + 2);
      return;
    case '\006': 
      jdField_a_of_type_JavaAwtColor = new Color(paramString.charAt(paramInt + 1), paramString.charAt(paramInt + 2), paramString.charAt(paramInt + 3));
      return;
    case '\035': 
      jdField_a_of_type_JavaAwtColor = new Color(paramString.charAt(paramInt + 1), paramString.charAt(paramInt + 2), paramString.charAt(paramInt + 3), paramString.charAt(paramInt + 4));
      return;
    }
    jdField_a_of_type_Char = ((char)(paramString.charAt(paramInt) - '\036'));
  }
  
  public final Color a()
  {
    return jdField_a_of_type_JavaAwtColor;
  }
  
  public final int a()
  {
    if (b == '\006') {
      return 4;
    }
    if (b == '\035') {
      return 5;
    }
    if (b == '\034') {
      return 3;
    }
    return 1;
  }
  
  public final char a()
  {
    return jdField_a_of_type_Char;
  }
  
  public final Color a(Color paramColor)
  {
    int i = (c >> '\005') - 4;
    int j = ((c & 0x1F) >> '\002') - 4;
    int k = (c & 0x3) - '\002';
    return new Color(paramColor.getRed() + i, paramColor.getGreen() + j, paramColor.getBlue() + k);
  }
  
  public final char b()
  {
    return b;
  }
  
  public final String a()
  {
    switch (b)
    {
    case '\006': 
      return "\006" + (char)jdField_a_of_type_JavaAwtColor.getRed() + (char)jdField_a_of_type_JavaAwtColor.getGreen() + (char)jdField_a_of_type_JavaAwtColor.getBlue();
    case '\035': 
      return "\035" + (char)jdField_a_of_type_JavaAwtColor.getRed() + (char)jdField_a_of_type_JavaAwtColor.getGreen() + (char)jdField_a_of_type_JavaAwtColor.getBlue() + (char)jdField_a_of_type_JavaAwtColor.getAlpha();
    case '\034': 
      return "\034" + jdField_a_of_type_Char + c;
    }
    return b;
  }
  
  static
  {
    new Color(3, 2, 7, 121);
  }
}

