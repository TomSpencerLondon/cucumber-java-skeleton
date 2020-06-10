package io.cucumber.shouty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
  private List<String> shouts;
  private List<Person> people = new ArrayList<>();

  public Person() {
    this.shouts = new ArrayList<>();
  }

  public List<String> getShouts() {
    return shouts;
  }

  public void moveTo(Integer distance, Person shouter) {
    if(distance <= 15){
      people.add(shouter);
    }
  }

  public void shout(String message) {
    shouts.add(message);
  }

  public List<String> getMessagesHeard() {
    for (Person p : people) {
      for (String r : p.shouts) {
        shouts.add(r);
      }
    }

    return shouts;
  }
}
