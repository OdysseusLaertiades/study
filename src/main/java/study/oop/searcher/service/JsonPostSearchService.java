package study.oop.searcher.service;

import study.oop.searcher.model.Comment;

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

        Comment comment = new Comment();
        if (Integer.getInteger(userId) > 0) {
            commentService.saveComment(comment);
            postService.findById(userId);
            return new String[0];
        }
        return new String[0];
    }
}
