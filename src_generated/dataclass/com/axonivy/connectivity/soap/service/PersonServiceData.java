package com.axonivy.connectivity.soap.service;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class PersonServiceData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PersonServiceData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8888999833179070017L;

  private transient ch.ivyteam.ivy.scripting.objects.List<com.axonivy.connectivity.Person> persons;

  /**
   * Gets the field persons.
   * @return the value of the field persons; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<com.axonivy.connectivity.Person> getPersons()
  {
    return persons;
  }

  /**
   * Sets the field persons.
   * @param _persons the new value of the field persons.
   */
  public void setPersons(ch.ivyteam.ivy.scripting.objects.List<com.axonivy.connectivity.Person> _persons)
  {
    persons = _persons;
  }

  private transient com.axonivy.connectivity.Person person;

  /**
   * Gets the field person.
   * @return the value of the field person; may be null.
   */
  public com.axonivy.connectivity.Person getPerson()
  {
    return person;
  }

  /**
   * Sets the field person.
   * @param _person the new value of the field person.
   */
  public void setPerson(com.axonivy.connectivity.Person _person)
  {
    person = _person;
  }

}
