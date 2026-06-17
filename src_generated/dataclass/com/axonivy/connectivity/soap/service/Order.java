package com.axonivy.connectivity.soap.service;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class Order", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class Order extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 5884608179497164680L;

  private java.lang.String product;

  /**
   * Gets the field product.
   * @return the value of the field product; may be null.
   */
  public java.lang.String getProduct()
  {
    return product;
  }

  /**
   * Sets the field product.
   * @param _product the new value of the field product.
   */
  public void setProduct(java.lang.String _product)
  {
    product = _product;
  }

  private java.lang.Integer amount;

  /**
   * Gets the field amount.
   * @return the value of the field amount; may be null.
   */
  public java.lang.Integer getAmount()
  {
    return amount;
  }

  /**
   * Sets the field amount.
   * @param _amount the new value of the field amount.
   */
  public void setAmount(java.lang.Integer _amount)
  {
    amount = _amount;
  }

  private java.lang.String requester;

  /**
   * Gets the field requester.
   * @return the value of the field requester; may be null.
   */
  public java.lang.String getRequester()
  {
    return requester;
  }

  /**
   * Sets the field requester.
   * @param _requester the new value of the field requester.
   */
  public void setRequester(java.lang.String _requester)
  {
    requester = _requester;
  }

  private java.lang.Double unitPrice;

  /**
   * Gets the field unitPrice.
   * @return the value of the field unitPrice; may be null.
   */
  public java.lang.Double getUnitPrice()
  {
    return unitPrice;
  }

  /**
   * Sets the field unitPrice.
   * @param _unitPrice the new value of the field unitPrice.
   */
  public void setUnitPrice(java.lang.Double _unitPrice)
  {
    unitPrice = _unitPrice;
  }

}
