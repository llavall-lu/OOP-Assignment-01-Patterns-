public abstract class PizzaDecorator implements PizzaBase {
protected PizzaBase decoratedPizza;

public PizzaBaseDecorator(PizzaBase decoratedPizza){
  this.decoratedPizza = decoratedPizza;
}
public void selection(){
  decoratedPizza.selection();
 }
}
