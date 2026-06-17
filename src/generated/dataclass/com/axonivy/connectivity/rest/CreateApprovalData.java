package com.axonivy.connectivity.rest;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class CreateApprovalData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CreateApprovalData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -6342821006684732037L;

  private transient com.axonivy.connectivity.rest.Approval approval;

  /**
   * Gets the field approval.
   * @return the value of the field approval; may be null.
   */
  public com.axonivy.connectivity.rest.Approval getApproval()
  {
    return approval;
  }

  /**
   * Sets the field approval.
   * @param _approval the new value of the field approval.
   */
  public void setApproval(com.axonivy.connectivity.rest.Approval _approval)
  {
    approval = _approval;
  }

  private transient ch.ivyteam.ivy.workflow.ITask approvalTask;

  /**
   * Gets the field approvalTask.
   * @return the value of the field approvalTask; may be null.
   */
  public ch.ivyteam.ivy.workflow.ITask getApprovalTask()
  {
    return approvalTask;
  }

  /**
   * Sets the field approvalTask.
   * @param _approvalTask the new value of the field approvalTask.
   */
  public void setApprovalTask(ch.ivyteam.ivy.workflow.ITask _approvalTask)
  {
    approvalTask = _approvalTask;
  }

}
