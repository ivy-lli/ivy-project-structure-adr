package com.axonivy.connectivity.soap;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class DataMappingData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DataMappingData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -5652385807296855246L;

  private ch.ivyteam.ivy.scripting.objects.DateTime time;

  /**
   * Gets the field time.
   * @return the value of the field time; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.DateTime getTime()
  {
    return time;
  }

  /**
   * Sets the field time.
   * @param _time the new value of the field time.
   */
  public void setTime(ch.ivyteam.ivy.scripting.objects.DateTime _time)
  {
    time = _time;
  }

  private transient com.axonivy.connectivity.soap.service.client.Person person;

  /**
   * Gets the field person.
   * @return the value of the field person; may be null.
   */
  public com.axonivy.connectivity.soap.service.client.Person getPerson()
  {
    return person;
  }

  /**
   * Sets the field person.
   * @param _person the new value of the field person.
   */
  public void setPerson(com.axonivy.connectivity.soap.service.client.Person _person)
  {
    person = _person;
  }

}
