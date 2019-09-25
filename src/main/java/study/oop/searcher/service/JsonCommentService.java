package study.oop.searcher.service;

import study.oop.searcher.model.Comment;

import java.util.Arrays;

import static java.lang.String.format;

public class JsonCommentService implements CommentService {

    private Comment[] commentsArr = new Comment[0];

    @Override
    public void saveComment(Comment comment) {
        int i = 0;
        while (i < commentsArr.length) {
            if (commentsArr[i] == comment) {
                throw new IllegalArgumentException(format("comment %s already contains in list", comment));
            }
            i++;
        }
        if (i == commentsArr.length) {
            commentsArr = Arrays.copyOf(commentsArr, i + 1);
            commentsArr[i] = comment;
        }
    }

    @Override
    public void deleteComment(String id) {
        int idIn = Integer.parseInt(id);
        if (commentsArr.length < idIn) {
            throw new IllegalArgumentException(format("comment with id %s is doesn't contains in list", id));
        }
        System.arraycopy(commentsArr, idIn + 1, commentsArr, idIn, commentsArr.length - idIn - 1);
        commentsArr = Arrays.copyOf(commentsArr, commentsArr.length - 1);
    }

    @Override
    public Comment findCommentById(String id) {
        int idIn = Integer.parseInt(id);
        if (commentsArr.length < idIn) {
            throw new IllegalArgumentException(format("comment with id %s is doesn't contains in list", id));
        }
        return commentsArr[idIn];
    }

    @Override
    public Comment[] findAllComments() {
        return commentsArr;
    }

    @Override
    public Comment[] findAllByUserEmail(String email) {
        Comment[] listResult = new Comment[0];
        int i = 0;

        for (Comment comment : commentsArr) {
            if (comment.getEmail().equals(email)) {
                listResult = Arrays.copyOf(listResult, i + 1);
                listResult[i] = comment;
                i++;
            }
        }
        return listResult;
    }
}
