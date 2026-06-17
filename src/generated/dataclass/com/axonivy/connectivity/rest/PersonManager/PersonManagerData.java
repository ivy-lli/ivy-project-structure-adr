package com.axonivy.connectivity.rest.PersonManager;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class PersonManagerData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PersonManagerData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8021926785524819650L;

  private transient com.axonivy.connectivity.Person editPerson;

  /**
   * Gets the field editPerson.
   * @return the value of the field editPerson; may be null.
   */
  public com.axonivy.connectivity.Person getEditPerson()
  {
    return editPerson;
  }

  /**
   * Sets the field editPerson.
   * @param _editPerson the new value of the field editPerson.
   */
  public void setEditPerson(com.axonivy.connectivity.Person _editPerson)
  {
    editPerson = _editPerson;
  }

  private java.lang.String firstName;

  /**
   * Gets the field firstName.
   * @return the value of the field firstName; may be null.
   */
  public java.lang.String getFirstName()
  {
    return firstName;
  }

  /**
   * Sets the field firstName.
   * @param _firstName the new value of the field firstName.
   */
  public void setFirstName(java.lang.String _firstName)
  {
    firstName = _firstName;
  }

  private java.lang.String lastName;

  /**
   * Gets the field lastName.
   * @return the value of the field lastName; may be null.
   */
  public java.lang.String getLastName()
  {
    return lastName;
  }

  /**
   * Sets the field lastName.
   * @param _lastName the new value of the field lastName.
   */
  public void setLastName(java.lang.String _lastName)
  {
    lastName = _lastName;
  }

  private transient javax.ws.rs.core.Response response;

  /**
   * Gets the field response.
   * @return the value of the field response; may be null.
   */
  public javax.ws.rs.core.Response getResponse()
  {
    return response;
  }

  /**
   * Sets the field response.
   * @param _response the new value of the field response.
   */
  public void setResponse(javax.ws.rs.core.Response _response)
  {
    response = _response;
  }

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

}
