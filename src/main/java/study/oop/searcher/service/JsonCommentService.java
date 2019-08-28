package study.oop.searcher.service;

import study.oop.searcher.model.Comment;

import java.util.ArrayList;

public class JsonCommentService implements CommentService {

  ArrayList<Comment> comment = new ArrayList<Comment>();
  ArrayList idArr = new ArrayList();
  Comment comm = new Comment();

  @Override
  public void saveComment(Comment comment) {
    this.comment.add(comment);
    idArr.add(comm.id);
  }

  @Override
  public void deleteComment(String id) {
    comment.remove(idArr.indexOf(id));
    idArr.remove(idArr.indexOf(id));
  }

  @Override
  public Comment findCommentById(String id) {
    return comment.get(idArr.indexOf(id));
  }

  @Override
  public Comment[] findAllComments() {
    Comment[] comArray = new Comment[comment.size()];
    for (int i = 0; i < comment.size(); i++) {
      comArray[i] = comment.get(i);
    }
    return comArray;
  }

  @Override
  public Comment[] findAllByUserEmail(String email) {
    return new Comment[0];
  }
}
