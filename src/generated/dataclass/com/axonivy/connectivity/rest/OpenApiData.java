package com.axonivy.connectivity.rest;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class OpenApiData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class OpenApiData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3334581586062183628L;

  private transient java.util.List<io.swagger.petstore3.client.Pet> pets;

  /**
   * Gets the field pets.
   * @return the value of the field pets; may be null.
   */
  public java.util.List<io.swagger.petstore3.client.Pet> getPets()
  {
    return pets;
  }

  /**
   * Sets the field pets.
   * @param _pets the new value of the field pets.
   */
  public void setPets(java.util.List<io.swagger.petstore3.client.Pet> _pets)
  {
    pets = _pets;
  }

}
