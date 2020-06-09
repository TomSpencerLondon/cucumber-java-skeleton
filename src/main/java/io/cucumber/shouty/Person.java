package io.cucumber.shouty;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
  private List<String> result;
  private List<Person> people = new ArrayList<>();

  public Person() {
    this.result = new ArrayList<>();
  }

  public void moveTo(Integer distance, Person shouter) {
    if(distance <= 15){
      people.add(shouter);
    }
  }

  public void shout(String message) {
    result.add(message);
  }

  public List<String> getMessagesHeard() {
    List<String> msgs = new ArrayList<>();

    for (Person p : people) {
      for (String r : p.result) {
        result.add(r);
      }
    }

    return result;
  }
}
