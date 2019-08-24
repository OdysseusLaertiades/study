package study.oop.searcher.model;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode(of = "id")
public class Post {

  public final String id;
  public final String authorId;
  public final String title;
  public final String body;
}