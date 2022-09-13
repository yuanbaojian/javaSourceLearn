package studyDemo.thread;

public class ThreadLocalDemo {

  public static void main(String[] args) {
      Thread thread = new Thread();
      ThreadLocal<String> threadLocal = new ThreadLocal<>();
      InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();
      threadLocal.set("t1");
      final String s = threadLocal.get();
      System.out.println("s = " + s);
      //
  }
}
