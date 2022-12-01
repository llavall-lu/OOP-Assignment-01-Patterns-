public class StockReccord { // this creates a public class called StockReccord
  private string InStock; // This creates a private string called Stock, being private means that it can only be used within this function
  private List<WarehouseStock> Stock = new ArrayList<>(); // this creates a private ArrayList

  public void addObserver(WarehouseStock stockAmt){ // This creates a public void which means it will return nothing
      this.Stock.add(stockAmt); // this adds Stock to stockAmt, also known as adding an observer to an Observable
  }
  public void removeObserver(WarehouseStock stockAmt){ // This creates a public void which means it will return nothing
      this.Stock.remove(stockAmt); // this removes Stock from stockAmt, also known as removing an observer from an Observable
  }
  public void setStock(string InStock){ // This creates a public void which means it will return nothing
      this.InStock = InStock; // here is the this function which allows you to reference the current object
      for (WarehouseStock stockAmt : this.Stock){ // here is the this function which allows you to reference the current object
        stockAmt.update(this.InStock); // here is the this function which allows you to reference the current object, When the stock changes this will update the stockAmt
      }
  }
}
