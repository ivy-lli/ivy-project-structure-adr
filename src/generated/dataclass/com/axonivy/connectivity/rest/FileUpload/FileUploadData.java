package com.axonivy.connectivity.rest.FileUpload;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class FileUploadData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class FileUploadData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 5074743286262994057L;

  private java.lang.String resourceName;

  /**
   * Gets the field resourceName.
   * @return the value of the field resourceName; may be null.
   */
  public java.lang.String getResourceName()
  {
    return resourceName;
  }

  /**
   * Sets the field resourceName.
   * @param _resourceName the new value of the field resourceName.
   */
  public void setResourceName(java.lang.String _resourceName)
  {
    resourceName = _resourceName;
  }

  private ch.ivyteam.ivy.scripting.objects.File file;

  /**
   * Gets the field file.
   * @return the value of the field file; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.File getFile()
  {
    return file;
  }

  /**
   * Sets the field file.
   * @param _file the new value of the field file.
   */
  public void setFile(ch.ivyteam.ivy.scripting.objects.File _file)
  {
    file = _file;
  }

  private transient org.primefaces.model.StreamedContent fileDownload;

  /**
   * Gets the field fileDownload.
   * @return the value of the field fileDownload; may be null.
   */
  public org.primefaces.model.StreamedContent getFileDownload()
  {
    return fileDownload;
  }

  /**
   * Sets the field fileDownload.
   * @param _fileDownload the new value of the field fileDownload.
   */
  public void setFileDownload(org.primefaces.model.StreamedContent _fileDownload)
  {
    fileDownload = _fileDownload;
  }

  private java.util.List<java.lang.String> listFile;

  /**
   * Gets the field listFile.
   * @return the value of the field listFile; may be null.
   */
  public java.util.List<java.lang.String> getListFile()
  {
    return listFile;
  }

  /**
   * Sets the field listFile.
   * @param _listFile the new value of the field listFile.
   */
  public void setListFile(java.util.List<java.lang.String> _listFile)
  {
    listFile = _listFile;
  }

  private java.lang.String downloadName;

  /**
   * Gets the field downloadName.
   * @return the value of the field downloadName; may be null.
   */
  public java.lang.String getDownloadName()
  {
    return downloadName;
  }

  /**
   * Sets the field downloadName.
   * @param _downloadName the new value of the field downloadName.
   */
  public void setDownloadName(java.lang.String _downloadName)
  {
    downloadName = _downloadName;
  }

  private java.lang.String fileName;

  /**
   * Gets the field fileName.
   * @return the value of the field fileName; may be null.
   */
  public java.lang.String getFileName()
  {
    return fileName;
  }

  /**
   * Sets the field fileName.
   * @param _fileName the new value of the field fileName.
   */
  public void setFileName(java.lang.String _fileName)
  {
    fileName = _fileName;
  }

}
