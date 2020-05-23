package exercise;

import java.util.List;

class Consumer {

  void send(List<PriceUpdate> priceUpdates) {
    priceUpdates.forEach(System.out::println);
  }

}
