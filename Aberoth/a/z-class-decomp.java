package a;

public final class z
  extends o
{
  private int jdField_a_of_type_Int;
  private k jdField_a_of_type_AK;
  
  public z(String paramString)
  {
    jdField_a_of_type_Int = paramString.charAt(1);
    jdField_a_of_type_AK = new k(paramString, 2);
  }
  
  public z(int paramInt, k paramK)
  {
    jdField_a_of_type_Int = paramInt;
    jdField_a_of_type_AK = paramK;
  }
  
  public final int a()
  {
    return jdField_a_of_type_AK.a() + 2;
  }
  
  public final char b()
  {
    return '\016';
  }
  
  public final String a()
  {
    return "\016" + (char)jdField_a_of_type_Int + jdField_a_of_type_AK.a();
  }
}
