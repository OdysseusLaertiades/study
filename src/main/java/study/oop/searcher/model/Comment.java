package study.oop.searcher.model;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode(of = "id")
public class Comment {

  public final String id;
  public final String postId;
  public final String email;
  public final String body;
}
