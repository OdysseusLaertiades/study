package study.oop.searcher.service;

import study.oop.searcher.model.Comment;

public class JsonCommentService implements CommentService {

  @Override
  public void saveComment(Comment comment) {

  }

  @Override
  public void deleteComment(String id) {

  }

  @Override
  public Comment findCommentById(String id) {
    return null;
  }

  @Override
  public Comment[] findAllComments() {
    return new Comment[0];
  }

  @Override
  public Comment[] findAllByUserEmail(String email) {
    return new Comment[0];
  }
}
