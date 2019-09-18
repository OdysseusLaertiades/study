package study.oop.searcher.service;

import static java.lang.String.format;

import java.util.ArrayList;
import java.util.List;
import study.oop.searcher.model.Comment;

public class JsonCommentService implements CommentService {

  private List<Comment> commentsList = new ArrayList<>();

  @Override
  public void saveComment(Comment comment) {
    if (commentsList.contains(comment)) {
      throw new RuntimeException(format("comment %s already contained  in list", comment));
    }
    commentsList.add(comment);
  }

  @Override
  public void deleteComment(String id) {
    Comment commentToDelete = searchCommentById(id);
    if (commentToDelete == null) {
      throw new RuntimeException(format("ist doesn't contain comment with id %s ", id));
    }
    commentsList.remove(commentToDelete);
  }

  @Override
  public Comment findCommentById(String id) {
    return searchCommentById(id);
  }

  @Override
  public Comment[] findAllComments() {
    return commentsList.toArray(new Comment[0]);
  }

  @Override
  public Comment[] findAllByUserEmail(String email) {
    return searchCommentsThatContainsEmail(email).toArray(new Comment[0]);
  }

  private List<Comment> searchCommentsThatContainsEmail(String email) {
    List<Comment> resultList = new ArrayList<>();
    for (Comment comment : commentsList) {
      if (comment.getEmail().equals(email)) {
        resultList.add(comment);
      }
    }
    return resultList;
  }

  private Comment searchCommentById(String id) {
    Comment result = null;
    for (Comment comment : commentsList) {
      if (comment.getId().equals(id)) {
        result = comment;
        break;
      }
    }
    return result;
  }
}
