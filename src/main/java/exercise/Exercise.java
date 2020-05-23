package exercise;

class Exercise {

  public static void main(String[] args) {
    Consumer consumer = new Consumer();
    LoadHandler loadHandler = new LoadHandler(consumer);
    Producer producer = new Producer(loadHandler);
    producer.start();
  }

}
