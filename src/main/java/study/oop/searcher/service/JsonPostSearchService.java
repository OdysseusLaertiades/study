package study.oop.searcher.service;

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
        return new String[0];
    }
}
