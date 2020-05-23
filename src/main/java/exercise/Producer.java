package exercise;

class Producer extends Thread {

  private LoadHandler loadHandler;

  Producer(LoadHandler loadHandler) {
    this.loadHandler = loadHandler;
  }

  @Override
  public void run() {
    try {
      generateUpdates();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void generateUpdates() throws InterruptedException {
    for (int i = 1; i < 10000000; i++) {
      loadHandler.receive(new PriceUpdate("Apple", 97.85));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.66));
      loadHandler.receive(new PriceUpdate("Google", 160.73));
      loadHandler.receive(new PriceUpdate("Facebook", 91.71));
      loadHandler.receive(new PriceUpdate("Google", 160.76));
      loadHandler.receive(new PriceUpdate("Apple", 97.81));
      loadHandler.receive(new PriceUpdate("Apple", 97.80));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.63));
      loadHandler.receive(new PriceUpdate("Apple", 97.85));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.66));
      loadHandler.receive(new PriceUpdate("Google", 160.73));
      loadHandler.receive(new PriceUpdate("Facebook", 91.71));
      loadHandler.receive(new PriceUpdate("Google", 160.76));
      loadHandler.receive(new PriceUpdate("Apple", 97.81));
      loadHandler.receive(new PriceUpdate("Apple", 97.80));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.63));
      loadHandler.receive(new PriceUpdate("Apple", 97.85));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.66));
      loadHandler.receive(new PriceUpdate("Google", 160.73));
      loadHandler.receive(new PriceUpdate("Facebook", 91.71));
      loadHandler.receive(new PriceUpdate("Google", 160.76));
      loadHandler.receive(new PriceUpdate("Apple", 97.81));
      loadHandler.receive(new PriceUpdate("Apple", 97.80));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.63));
      loadHandler.receive(new PriceUpdate("Apple", 97.85));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.66));
      loadHandler.receive(new PriceUpdate("Google", 160.73));
      loadHandler.receive(new PriceUpdate("Facebook", 91.71));
      loadHandler.receive(new PriceUpdate("Google", 160.76));
      loadHandler.receive(new PriceUpdate("Apple", 97.81));
      loadHandler.receive(new PriceUpdate("Apple", 97.80));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.63));
      loadHandler.receive(new PriceUpdate("Apple", 97.85));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.66));
      loadHandler.receive(new PriceUpdate("Google", 160.73));
      loadHandler.receive(new PriceUpdate("Facebook", 91.71));
      loadHandler.receive(new PriceUpdate("Google", 160.76));
      loadHandler.receive(new PriceUpdate("Apple", 97.81));
      loadHandler.receive(new PriceUpdate("Apple", 97.80));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.63));
      loadHandler.receive(new PriceUpdate("Apple", 97.85));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.66));
      loadHandler.receive(new PriceUpdate("Google", 160.73));
      loadHandler.receive(new PriceUpdate("Facebook", 91.71));
      loadHandler.receive(new PriceUpdate("Google", 160.76));
      loadHandler.receive(new PriceUpdate("Apple", 97.81));
      loadHandler.receive(new PriceUpdate("Apple", 97.80));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.63));
      loadHandler.receive(new PriceUpdate("Apple", 97.85));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.66));
      loadHandler.receive(new PriceUpdate("Google", 160.73));
      loadHandler.receive(new PriceUpdate("Facebook", 91.71));
      loadHandler.receive(new PriceUpdate("Google", 160.76));
      loadHandler.receive(new PriceUpdate("Apple", 97.81));
      loadHandler.receive(new PriceUpdate("Apple", 97.80));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.63));
      loadHandler.receive(new PriceUpdate("Apple", 97.85));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.66));
      loadHandler.receive(new PriceUpdate("Google", 160.73));
      loadHandler.receive(new PriceUpdate("Facebook", 91.71));
      loadHandler.receive(new PriceUpdate("Google", 160.76));
      loadHandler.receive(new PriceUpdate("Apple", 97.81));
      loadHandler.receive(new PriceUpdate("Apple", 97.80));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.63));
      loadHandler.receive(new PriceUpdate("Apple", 97.85));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.66));
      loadHandler.receive(new PriceUpdate("Google", 160.73));
      loadHandler.receive(new PriceUpdate("Facebook", 91.71));
      loadHandler.receive(new PriceUpdate("Google", 160.76));
      loadHandler.receive(new PriceUpdate("Apple", 97.81));
      loadHandler.receive(new PriceUpdate("Apple", 97.80));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.63));
      loadHandler.receive(new PriceUpdate("Apple", 97.85));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.66));
      loadHandler.receive(new PriceUpdate("Google", 160.73));
      loadHandler.receive(new PriceUpdate("Facebook", 91.71));
      loadHandler.receive(new PriceUpdate("Google", 160.76));
      loadHandler.receive(new PriceUpdate("Apple", 97.81));
      loadHandler.receive(new PriceUpdate("Apple", 97.80));
      loadHandler.receive(new PriceUpdate("Google", 160.71));
      loadHandler.receive(new PriceUpdate("Facebook", 91.63));
      loadHandler.receive(new PriceUpdate("Google", 860.71));
      loadHandler.receive(new PriceUpdate("Facebook", 860.71));

    }
  }

}
