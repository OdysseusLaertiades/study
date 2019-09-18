package study.oop.searcher.model;

import java.util.Objects;

public class Comment {

  private String postId;
  private String id;
  private String email;
  private String body;

  public Comment(String postId, String id, String email, String body) {
    this.postId = postId;
    this.id = id;
    this.email = email;
    this.body = body;
  }

  public Comment() {
  }

  public String getPostId() {
    return postId;
  }

  public void setPostId(String postId) {
    this.postId = postId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(postId, comment.postId) &&
        Objects.equals(id, comment.id) &&
        Objects.equals(email, comment.email) &&
        Objects.equals(body, comment.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postId, id, email, body);
  }

  @Override
  public String toString() {
    return "Comment{" +
        "postId='" + postId + '\'' +
        ", id='" + id + '\'' +
        ", email='" + email + '\'' +
        ", body='" + body + '\'' +
        '}';
  }
}
