package kotlininaction.chap05.fpapi;

public class MethodExample {

  void postponeComputation(int delay, Runnable computation) throws InterruptedException {
    Thread.sleep(delay);
    Thread thread = new Thread(computation);
    thread.start();
  }
}
