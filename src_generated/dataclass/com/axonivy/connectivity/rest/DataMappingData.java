package com.axonivy.connectivity.rest;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class DataMappingData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DataMappingData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 1128610860195317000L;

  private transient com.axonivy.connectivity.rest.Post myPost;

  /**
   * Gets the field myPost.
   * @return the value of the field myPost; may be null.
   */
  public com.axonivy.connectivity.rest.Post getMyPost()
  {
    return myPost;
  }

  /**
   * Sets the field myPost.
   * @param _myPost the new value of the field myPost.
   */
  public void setMyPost(com.axonivy.connectivity.rest.Post _myPost)
  {
    myPost = _myPost;
  }

  private transient java.lang.Number userId;

  /**
   * Gets the field userId.
   * @return the value of the field userId; may be null.
   */
  public java.lang.Number getUserId()
  {
    return userId;
  }

  /**
   * Sets the field userId.
   * @param _userId the new value of the field userId.
   */
  public void setUserId(java.lang.Number _userId)
  {
    userId = _userId;
  }

  private transient java.util.List<com.axonivy.connectivity.rest.Post> posts;

  /**
   * Gets the field posts.
   * @return the value of the field posts; may be null.
   */
  public java.util.List<com.axonivy.connectivity.rest.Post> getPosts()
  {
    return posts;
  }

  /**
   * Sets the field posts.
   * @param _posts the new value of the field posts.
   */
  public void setPosts(java.util.List<com.axonivy.connectivity.rest.Post> _posts)
  {
    posts = _posts;
  }

  private transient com.axonivy.connectivity.rest.User user;

  /**
   * Gets the field user.
   * @return the value of the field user; may be null.
   */
  public com.axonivy.connectivity.rest.User getUser()
  {
    return user;
  }

  /**
   * Sets the field user.
   * @param _user the new value of the field user.
   */
  public void setUser(com.axonivy.connectivity.rest.User _user)
  {
    user = _user;
  }

  private transient com.typicode.jsonplaceholder.User userGenerated;

  /**
   * Gets the field userGenerated.
   * @return the value of the field userGenerated; may be null.
   */
  public com.typicode.jsonplaceholder.User getUserGenerated()
  {
    return userGenerated;
  }

  /**
   * Sets the field userGenerated.
   * @param _userGenerated the new value of the field userGenerated.
   */
  public void setUserGenerated(com.typicode.jsonplaceholder.User _userGenerated)
  {
    userGenerated = _userGenerated;
  }

}
