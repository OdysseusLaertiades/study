package study.oop.searcher.service;

import study.oop.searcher.model.Comment;

import java.util.ArrayList;

public class JsonCommentService implements CommentService {

  ArrayList<Comment> comments = new ArrayList();
  ArrayList idComment = new ArrayList();
  ArrayList emailList = new ArrayList();
  Comment comm = new Comment();
  Comment[] comArray = new Comment[comments.size()];

  @Override
  public void saveComment(Comment comment) {
    comments.add(comment);
    idComment.add(comm.id);
    emailList.add(comm.email);
  }

  @Override
  public void deleteComment(String id) {
    comments.remove(idComment.indexOf(id));
    idComment.remove(idComment.indexOf(id));
  }

  @Override
  public Comment findCommentById(String id) {
    return comments.get(idComment.indexOf(id));
  }

  @Override
  public Comment[] findAllComments() {
    for (int i = 0; i < comments.size(); i++) {
      comArray[i] = comments.get(i);
    }
    return comArray;
  }

  @Override
  public Comment[] findAllByUserEmail(String email) {
    return new Comment[]{comments.get(emailList.indexOf(email))};
  }
}
