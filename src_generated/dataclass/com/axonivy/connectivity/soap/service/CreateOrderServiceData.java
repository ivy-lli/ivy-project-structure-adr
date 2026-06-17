package com.axonivy.connectivity.soap.service;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class CreateOrderServiceData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CreateOrderServiceData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2225311380392847297L;

  private com.axonivy.connectivity.soap.service.Order order;

  /**
   * Gets the field order.
   * @return the value of the field order; may be null.
   */
  public com.axonivy.connectivity.soap.service.Order getOrder()
  {
    return order;
  }

  /**
   * Sets the field order.
   * @param _order the new value of the field order.
   */
  public void setOrder(com.axonivy.connectivity.soap.service.Order _order)
  {
    order = _order;
  }

  private com.axonivy.connectivity.soap.service.Task task;

  /**
   * Gets the field task.
   * @return the value of the field task; may be null.
   */
  public com.axonivy.connectivity.soap.service.Task getTask()
  {
    return task;
  }

  /**
   * Sets the field task.
   * @param _task the new value of the field task.
   */
  public void setTask(com.axonivy.connectivity.soap.service.Task _task)
  {
    task = _task;
  }

}
