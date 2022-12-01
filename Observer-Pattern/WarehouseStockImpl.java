public class StockNum implements WarehouseStock { // this creates a public class called StockNum and implements it into WarehouseStock
  private string stock; // This makes a private string called Stock, this means It can only be used within this module

  @override // the @override function allows you to have multiple funcitons with the same name by making the most recent override take precedence
  public void update (Object stock){ // this creates a public void update, and because it's a void it won't return anything.
    this.setStock((string) stock);
  }
  public string getStock(){ // this is a public string "getStock"
    return stock // this will return the value of stock
  }
  public void setStock(string InStock){ // this is a public void, therefore it will not return a value
    this.InStock = InStock
  }
}
