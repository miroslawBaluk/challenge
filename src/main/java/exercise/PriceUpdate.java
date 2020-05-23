package exercise;

class PriceUpdate {
  private final String companyName;
  private final double price;

  PriceUpdate(String companyName, double price) {
    this.companyName = companyName;
    this.price = price;
  }

  @Override
  public String toString() {
    return companyName + " - " + price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    PriceUpdate that = (PriceUpdate) o;

    return companyName.equals(that.companyName);

  }

  @Override
  public int hashCode() {
    return companyName.hashCode();
  }
}
