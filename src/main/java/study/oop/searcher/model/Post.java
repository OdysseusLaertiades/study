package study.oop.searcher.model;

public class Post {
    private String authorId = "1";
    private String id = "2";
    private String title = "qui est esse";
    private String body = "est rerum tempore vitae sequi sint nihil reprehenderit dolor beatae ea dolores neque fugiat blanditiis " +
            "voluptate porro vel nihil molestiae ut reiciendis qui aperiam non debitis possimus qui neque nisi nulla";

    public Post() {
    }

    public Post(String authorId, String id, String title, String body) {
        this.authorId = authorId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
