package study.oop.searcher.model;

import java.util.Objects;

public class Post {

  private String authorId;
  private String id;
  private String title;
  private String body;

  public Post(String authorId, String id, String title, String body) {
    this.authorId = authorId;
    this.id = id;
    this.title = title;
    this.body = body;
  }

  public Post() {
  }

  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
    Post post = (Post) o;
    return Objects.equals(authorId, post.authorId) &&
        Objects.equals(id, post.id) &&
        Objects.equals(title, post.title) &&
        Objects.equals(body, post.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorId, id, title, body);
  }

  @Override
  public String toString() {
    return "Post{" +
        "authorId='" + authorId + '\'' +
        ", id='" + id + '\'' +
        ", title='" + title + '\'' +
        ", body='" + body + '\'' +
        '}';
  }
}
