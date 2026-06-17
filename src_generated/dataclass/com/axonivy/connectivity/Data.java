package com.axonivy.connectivity;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class Data", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class Data extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 3355036992991222917L;

  private transient java.util.List<com.axonivy.connectivity.Person> persons;

  /**
   * Gets the field persons.
   * @return the value of the field persons; may be null.
   */
  public java.util.List<com.axonivy.connectivity.Person> getPersons()
  {
    return persons;
  }

  /**
   * Sets the field persons.
   * @param _persons the new value of the field persons.
   */
  public void setPersons(java.util.List<com.axonivy.connectivity.Person> _persons)
  {
    persons = _persons;
  }

  private transient java.lang.String result;

  /**
   * Gets the field result.
   * @return the value of the field result; may be null.
   */
  public java.lang.String getResult()
  {
    return result;
  }

  /**
   * Sets the field result.
   * @param _result the new value of the field result.
   */
  public void setResult(java.lang.String _result)
  {
    result = _result;
  }

  private transient java.io.File file;

  /**
   * Gets the field file.
   * @return the value of the field file; may be null.
   */
  public java.io.File getFile()
  {
    return file;
  }

  /**
   * Sets the field file.
   * @param _file the new value of the field file.
   */
  public void setFile(java.io.File _file)
  {
    file = _file;
  }

}
