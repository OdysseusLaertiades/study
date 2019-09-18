package study.oop.searcher.service;

import java.util.ArrayList;
import java.util.List;
import study.oop.searcher.model.Comment;
import study.oop.searcher.model.Post;

public class JsonPostSearchService implements SearchService {

  private final CommentService commentService;
  private final PostService postService;
  private final UserService userService;

  public JsonPostSearchService(CommentService commentService, PostService postService, UserService userService) {
    this.commentService = commentService;
    this.postService = postService;
    this.userService = userService;
  }

  @Override
  public String[] findAllPostTitlesWhereUserLeaveComment(String userId) {
    List<String> postTitles = new ArrayList<>();
    for (Comment comment : findAllCommentsByUserEmail(userId)) {
      Post post = postService.findById(comment.getPostId());
      if (post != null) {
        postTitles.add(post.getTitle());
      }
    }
    return postTitles.toArray(new String[0]);
  }

  private Comment[] findAllCommentsByUserEmail(String userId) {
    return commentService.findAllByUserEmail(userService.findUserById(userId).getEmail());
  }
}
