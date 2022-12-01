public class HawaiianDecorator extends PizzaDecorator{ // This creates the class "HawaiianDecorator" and makes it public which is then able to be used by the base class through inheritance.

public PepperoniDecorator(selection decoratedPizza) {
  super(decoratedPizza); // The super keyword is being used as a function call here which allows it to access the properties and methods of "decoratedPizza"
}

@Override // the @override function allows you to have multiple funcitons with the same name by making the most recent override take precedence
public void selection(){ // This is a public void and therefore returns nothing
  decoratedPizza.selection(); // this is referencing the Super "decoratedPizza"
  setSelectionToHawaiian(decoratedPizza); // this is referencing the private void "setSelectionToHawaiian"
}
private void setSelectionToHawaiian(selection decoratedPizza){ // This is a private void therfore returns nothing and can only be used inside this specific function
  System.out.printIn("PizzaTopping"); //This prints a string, in this case it will print "PizzaTopping"
}
}
