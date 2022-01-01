package parser;

public class Action {
  public Act action;
  //if action = shift : number is state
  //if action = reduce : number is number of rule
  public int number;

  public Action(Act action, int number) {
    this.action = action;
    this.number = number;
  }

  public String toString() {
    switch (action) {
      case accept:
        return "acc";
      case shift:
        return "s" + number;
      case reduce:
        return "r" + number;
      default:
        return action.toString() + number;
    }
  }
}

enum Act {
  shift,
  reduce,
  accept
}
