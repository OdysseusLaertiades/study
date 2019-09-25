package study.oop.searcher.service;

import study.oop.searcher.model.Post;

import java.util.Arrays;

import static java.lang.String.format;

public class JsonPostService implements PostService {

    private Post[] postsArr = new Post[0];

    @Override
    public void savePost(Post post) {
        int i = 0;
        while (postsArr.length > i) {
            if (postsArr[i] == post) {
                throw new RuntimeException(format("post %s already contained  in list", post));
            }
            i++;
        }
        if (i == postsArr.length) {
            postsArr = Arrays.copyOf(postsArr, i + 1);
            postsArr[i] = post;
        }
    }

    @Override
    public Post findById(String id) {
        int idIn = Integer.parseInt(id);
        if (postsArr.length < idIn) {
            throw new RuntimeException(format("id of post %s doesn't contained  in list", id));
        }
        return postsArr[idIn];
    }

    @Override
    public Post[] findAllPosts() {
        return postsArr;
    }
}
