package study.oop.searcher.model;

public class Comment {
    public String postId;
    public String id;
    public String email;
    public String body;

    public Comment(String postId, String id, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.email = email;
        this.body = body;
    }

    public Comment() {
    }

    public String getPostId() {
        return getPostId();
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
}
