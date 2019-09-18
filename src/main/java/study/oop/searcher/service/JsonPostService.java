package study.oop.searcher.service;

import study.oop.searcher.model.Post;

import java.util.ArrayList;

public class JsonPostService implements PostService {

  public ArrayList<Post> posts = new ArrayList<Post>();
  public ArrayList idPost = new ArrayList();
  public Post pos = new Post();

  @Override
  public void savePost(Post post) {
    posts.add(post);
    idPost.add(pos.id);
  }

  @Override
  public Post findById(String id) {
    return posts.get(idPost.indexOf(id));
  }

  @Override
  public Post[] findAllPosts() {
    Post[] arrPosts = new Post[posts.size()];
    for (int i = 0; i < posts.size(); i++) {
      arrPosts[i] = posts.get(i);
    }
    return arrPosts;
  }
}
