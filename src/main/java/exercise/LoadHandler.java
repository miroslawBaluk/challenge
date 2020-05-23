package exercise;

import java.util.Timer;
import java.util.concurrent.LinkedBlockingQueue;

class LoadHandler {

  private static final int MAX_PRICE_UPDATES = 100;
  private final LoadHandlerTask loadHandlerTask;

  private final LinkedBlockingQueue<PriceUpdate> priceUpdates = new LinkedBlockingQueue<>();

  LoadHandler(Consumer consumer) {
    loadHandlerTask = new LoadHandlerTask(consumer, priceUpdates);
    timer();
  }

  void receive(PriceUpdate priceUpdate) {
    if(priceUpdates.size() >= MAX_PRICE_UPDATES) {
      priceUpdates.remove(priceUpdate);
    }
    priceUpdates.add(priceUpdate);
  }

  private void timer() {
    Timer timer = new Timer();
    timer.schedule(loadHandlerTask, 1000, 1000);
  }

}

