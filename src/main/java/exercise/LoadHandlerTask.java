package exercise;

import java.util.ArrayList;
import java.util.Queue;
import java.util.TimerTask;

class LoadHandlerTask extends TimerTask {
  private final Consumer consumer;
  private final Queue<PriceUpdate> cache;

  public LoadHandlerTask(Consumer consumer, Queue<PriceUpdate> cache) {
    this.consumer = consumer;
    this.cache = cache;
  }

  @Override
  public void run() {
    ArrayList<PriceUpdate> listToSend = new ArrayList<>(cache);
    cache.clear();
    consumer.send(listToSend);

  }

}
