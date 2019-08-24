package study.oop.searcher.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder(toBuilder = true)
@EqualsAndHashCode(of = "id")
public class User {

  public final long id;
  public final String name;
  public final String userName;
  public final String email;
  public final String phone;
  public final String website;
  public final Address address;
  public final Company company;
}
