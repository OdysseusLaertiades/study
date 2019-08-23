package study.oop.searcher.model;

import study.oop.searcher.service.CommentService;

import java.util.ArrayList;

public class Comment implements CommentService {
    int postId = 51;
    String id = "254";
    String email = "Ardella@khalid.biz";
    String body = "laboriosam voluptas aut quibusdam mollitia sunt non dolores illum fugiat ex vero nemo aperiam porro quam " +
            "expedita est vel voluptatem sit voluptas consequuntur quis eligendi omnis id nisi ducimus sapiente odit quam";

    ArrayList<Comment> comment = new ArrayList<Comment>();
    ArrayList idArr = new ArrayList();
    Comment[] comArray = new Comment[comment.size()];

    public void saveComment(Comment comment) {
        this.comment.add(comment);
        idArr.add(id);
    }

    public void deleteComment(String id) {
        comment.remove(idArr.indexOf(id));
        idArr.remove(idArr.indexOf(id));
    }

    public Comment findCommentById(String id) {
        return comment.get(idArr.indexOf(id));
    }

    public Comment[] findAllComments() {
        for (int i = 0; i < comment.size(); i++) {
            comArray[i] = comment.get(i);
        }
        return comArray;
    }
}
