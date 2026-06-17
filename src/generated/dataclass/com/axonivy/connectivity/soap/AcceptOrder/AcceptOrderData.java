package com.axonivy.connectivity.soap.AcceptOrder;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class AcceptOrderData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class AcceptOrderData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -7734384098737551538L;

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

}
