package study.oop.searcher.service;

import study.oop.searcher.model.Post;

public interface PostService {

    void savePost(Post post);

    Post findById(String id);

    Post[] findAllByUserEmail(String email);

    Post[] findAllPosts();

}
