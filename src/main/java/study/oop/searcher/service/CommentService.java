package study.oop.searcher.service;

import study.oop.searcher.model.Comment;

public interface CommentService {

    void saveComment(Comment comment);

    void deleteComment(String id);

    Comment findCommentById(String id);

    Comment[] findAllComments();

    Comment[] findAllByUserEmail(String email);

}
