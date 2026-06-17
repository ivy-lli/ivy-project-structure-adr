package com.axonivy.connectivity.soap.service;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class ExceptionData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ExceptionData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2613529676476796449L;

  private java.lang.Boolean throwException;

  /**
   * Gets the field throwException.
   * @return the value of the field throwException; may be null.
   */
  public java.lang.Boolean getThrowException()
  {
    return throwException;
  }

  /**
   * Sets the field throwException.
   * @param _throwException the new value of the field throwException.
   */
  public void setThrowException(java.lang.Boolean _throwException)
  {
    throwException = _throwException;
  }

  private java.lang.String exceptionMessage;

  /**
   * Gets the field exceptionMessage.
   * @return the value of the field exceptionMessage; may be null.
   */
  public java.lang.String getExceptionMessage()
  {
    return exceptionMessage;
  }

  /**
   * Sets the field exceptionMessage.
   * @param _exceptionMessage the new value of the field exceptionMessage.
   */
  public void setExceptionMessage(java.lang.String _exceptionMessage)
  {
    exceptionMessage = _exceptionMessage;
  }

}
