public class StockMarket { // this creates a public class called StockMarket
  private string stock; // This creates a private string called Stocks, being private means that it can only be used within this function
  private List<StockExchange> stockEx = new ArrayList<>(); // this creates a private ArrayList

  public void addObserver(StockExchange stockEx){ // This creates a public void which means it will return nothing
      this.Stocks.add(stockEx); // this adds Stocks to stockEx, also known as adding an observer to an Observable
  }
  public void removeObserver(StockExchange stockEx){ // This creates a public void which means it will return nothing
      this.Stocks.remove(stockEx); // this removes Stocks from stockEx, also known as removing an observer from an Observable
  }
  public void addObserver(StockExchange stockEx){ // This creates a public void which means it will return nothing
      this.stock = stock; // here is the this function which allows you to reference the current object
      for (StockExchange stockEx : this.Stocks){ // here is the this function which allows you to reference the current object
        stockEx.update(this.stock); // here is the this function which allows you to reference the current object, When the stock changes this will update the stockEx
      }
  }
}
