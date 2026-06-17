package com.axonivy.connectivity.soap.service;

/**
 * 
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(
  comments="This class implements the WS endpoints of the process 'PersonService'. The class can be customized by moving it to the src-folder. See Designer Guide for more information.", 
  value = { "ch.ivyteam.ivy.webservice.process.restricted.WebserviceSourceGenerator" })
@javax.jws.WebService
public class PersonService extends ch.ivyteam.ivy.webservice.process.restricted.AbstractWebServiceProcess
{

  public PersonService(ch.ivyteam.ivy.webservice.process.restricted.IWebServiceProcessBeanRuntime webServiceProcessBeanRuntime)
  {
    super(webServiceProcessBeanRuntime);
  }

  /**
   * @return 
   * @throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
   */
  @javax.jws.WebMethod
  @javax.jws.WebResult(name="persons")
  public java.util.List<com.axonivy.connectivity.Person> getPersons()
    throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
  {
    java.util.Map<String, Object> params = new java.util.HashMap<String, Object>();
    ch.ivyteam.ivy.scripting.objects.Tuple processResult;


    processResult = executeProcess("getPersons()", params);

    return (java.util.List<com.axonivy.connectivity.Person>)getTupleField(processResult, "persons");
  }

  /**
   * @param person 
   * @return 
   * @throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
   */
  @javax.jws.WebMethod
  @javax.jws.WebResult(name="created")
  public com.axonivy.connectivity.Person addPerson(@javax.jws.WebParam(name="person") com.axonivy.connectivity.Person person)
    throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
  {
    java.util.Map<String, Object> params = new java.util.HashMap<String, Object>();
    ch.ivyteam.ivy.scripting.objects.Tuple processResult;

    params.put("person", person);

    processResult = executeProcess("addPerson(com.axonivy.connectivity.Person)", params);

    return (com.axonivy.connectivity.Person)getTupleField(processResult, "created");
  }

  /**
   * @param person 
   * @return 
   * @throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
   */
  @javax.jws.WebMethod
  @javax.jws.WebResult(name="deleted")
  public com.axonivy.connectivity.Person deletePerson(@javax.jws.WebParam(name="person") com.axonivy.connectivity.Person person)
    throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
  {
    java.util.Map<String, Object> params = new java.util.HashMap<String, Object>();
    ch.ivyteam.ivy.scripting.objects.Tuple processResult;

    params.put("person", person);

    processResult = executeProcess("deletePerson(com.axonivy.connectivity.Person)", params);

    return (com.axonivy.connectivity.Person)getTupleField(processResult, "deleted");
  }

}