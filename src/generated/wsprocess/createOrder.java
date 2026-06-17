package com.axonivy.connectivity;

/**
 * 
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(
  comments="This class implements the WS endpoints of the process 'createOrder'. The class can be customized by moving it to the src-folder. See Designer Guide for more information.", 
  value = { "ch.ivyteam.ivy.webservice.process.restricted.WebserviceSourceGenerator" })
@javax.jws.WebService
public class createOrder extends ch.ivyteam.ivy.webservice.process.restricted.AbstractWebServiceProcess
{

  public createOrder(ch.ivyteam.ivy.webservice.process.restricted.IWebServiceProcessBeanRuntime webServiceProcessBeanRuntime)
  {
    super(webServiceProcessBeanRuntime);
  }

  /**
   * @param order 
   * @return 
   * @throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
   */
  @javax.jws.WebMethod
  @javax.jws.WebResult(name="task")
  public com.axonivy.connectivity.soap.service.Task call(@javax.jws.WebParam(name="order") com.axonivy.connectivity.soap.service.Order order)
    throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
  {
    java.util.Map<String, Object> params = new java.util.HashMap<String, Object>();
    ch.ivyteam.ivy.scripting.objects.Tuple processResult;

    params.put("order", order);

    processResult = executeProcess("call(com.axonivy.connectivity.soap.service.Order)", params);

    return (com.axonivy.connectivity.soap.service.Task)getTupleField(processResult, "task");
  }

}