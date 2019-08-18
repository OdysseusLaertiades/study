package study.oop.searcher.service;

public class PostSearchService implements SearchService {

    public final CommentService commentService;
    public final PostService postService;
    public final UserService userService;

    public PostSearchService(CommentService commentService, PostService postService, UserService userService) {
        this.commentService = commentService;
        this.postService = postService;
        this.userService = userService;
    }

    @Override
    public String[] findAllPostTitlesWhereUserLeaveComment(String userId) {
        return new String[0];
    }
}
