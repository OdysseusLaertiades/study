package study.oop.searcher.service;

import study.oop.searcher.model.Comment;
import study.oop.searcher.model.Post;

import java.util.Arrays;

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
        String[] postTitles = new String[0];
        int i = 0;
        for (Comment comment : findUserWhoLeaveComment(userId)) {
            Post post = postService.findById(comment.getPostId());
            if (post != null) {
                postTitles = Arrays.copyOf(postTitles, i + 1);
                postTitles[i] = post.getTitle();
                i++;
            }
        }
        return postTitles;
    }

    public Comment[] findUserWhoLeaveComment(String userId) {
        return commentService.findAllByUserEmail(userService.findUserById(userId).getEmail());
    }
}
