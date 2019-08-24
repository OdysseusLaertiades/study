package study.oop.searcher.model;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public class Address {

  public final String street;
  public final String suit;
  public final String city;
  public final String zipcode;
  public final Geo geo;
}
