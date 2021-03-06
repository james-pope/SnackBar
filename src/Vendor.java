/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor {
  private static double totalSales;
  // Fields:
  private int price;
  private int stock;
  private int deposit;
  private int change;

  /**
   * Constructs a Vendor
   *
   * @param price the price of a single item in cents (int)
   * @param stock number of items to place in stock (int)
   */
  public Vendor(int cost, int totalStock) {
    price = cost;
    stock = totalStock;
    deposit = 0;
    change = 0;
  }

  /**
   * Sets the quantity of items in stock.
   *
   * @param qty number of items to place in stock (int)
   */
  public void setStock(int quantity) {
    stock += quantity;
  }

  /**
   * Returns the number of items currently in stock.
   *
   * @return number of items currently in stock (int)
   */
  public int getStock() {
    return stock;
  }

  /**
   * Adds a specified amount (in cents) to the
   * deposited amount.
   *
   * @param number of cents to add to the deposit (int)
   */
  public void addMoney(int amt) {
    deposit += amt;
  }

  /**
   * Returns the currently deposited amount (in cents).
   *
   * @return number of cents in the current deposit (int)
   */
  public int getDeposit() {
    return deposit;
  }

  /**
   * Implements a sale.  If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock
   * and calculates and sets change and returns true;
   * otherwise refunds the whole deposit (moves it into
   * change) and returns false.
   *
   * @return true for a successful sale, false otherwise (boolean)
   */
  public boolean makeSale() {
    boolean x = false;
    if (getStock() == 0 || getDeposit() < price) {
      change = getDeposit();
      deposit = 0;
      return x;
    }
    if (getStock() > 0 && getDeposit() >= price) {
      stock--;
      change = deposit - price;
      deposit = 0;
      totalSales += price;
      x = true;
    }
    return x;
  }

  /**
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   *
   * @return number of cents in the current change (int)
   */
  public int getChange() {
    return change;
  }

  public static double getTotalSales() {
    return (double)totalSales/100;
  }
}
