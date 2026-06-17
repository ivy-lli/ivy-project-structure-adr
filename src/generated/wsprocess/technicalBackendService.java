package com.axonivy.connectivity;

/**
 * 
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(
  comments="This class implements the WS endpoints of the process 'technicalBackendService'. The class can be customized by moving it to the src-folder. See Designer Guide for more information.", 
  value = { "ch.ivyteam.ivy.webservice.process.restricted.WebserviceSourceGenerator" })
@javax.jws.WebService
public class technicalBackendService extends ch.ivyteam.ivy.webservice.process.restricted.AbstractWebServiceProcess
{

  public technicalBackendService(ch.ivyteam.ivy.webservice.process.restricted.IWebServiceProcessBeanRuntime webServiceProcessBeanRuntime)
  {
    super(webServiceProcessBeanRuntime);
  }

  /**
   * @param blockSeconds 
   * @return 
   * @throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
   */
  @javax.jws.WebMethod
  @javax.jws.WebResult(name="message")
  public java.lang.String longRunningBatchOperation(@javax.jws.WebParam(name="blockSeconds") java.lang.Integer blockSeconds)
    throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
  {
    java.util.Map<String, Object> params = new java.util.HashMap<String, Object>();
    ch.ivyteam.ivy.scripting.objects.Tuple processResult;

    params.put("blockSeconds", blockSeconds);

    processResult = executeProcess("longRunningBatchOperation(Integer)", params);

    return (java.lang.String)getTupleField(processResult, "message");
  }

}