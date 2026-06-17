package com.axonivy.connectivity.soap;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class PersonClientData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PersonClientData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2565795931252338754L;

  private transient ch.ivyteam.ivy.scripting.objects.List<com.axonivy.connectivity.soap.service.client.Person> persons;

  /**
   * Gets the field persons.
   * @return the value of the field persons; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<com.axonivy.connectivity.soap.service.client.Person> getPersons()
  {
    return persons;
  }

  /**
   * Sets the field persons.
   * @param _persons the new value of the field persons.
   */
  public void setPersons(ch.ivyteam.ivy.scripting.objects.List<com.axonivy.connectivity.soap.service.client.Person> _persons)
  {
    persons = _persons;
  }

}
