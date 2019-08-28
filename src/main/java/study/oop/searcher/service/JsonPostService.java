package study.oop.searcher.service;

import study.oop.searcher.model.Post;

public class JsonPostService implements PostService {

  @Override
  public void savePost(Post post) {

  }

  @Override
  public Post findById(String id) {
    return null;
  }

  @Override
  public Post[] findAllPosts() {
    return new Post[0];
  }
}
