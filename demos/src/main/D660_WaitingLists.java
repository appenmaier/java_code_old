package main;

import java.util.ArrayList;
import model.ConsumerThread;
import model.PrinterThread;
import model.ProducerThread;

/**
 * Wartelisten
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D660_WaitingLists {

  public static ArrayList<Integer> numbers = new ArrayList<>();

  public static void main(String[] args) throws InterruptedException {

    ProducerThread producer = new ProducerThread();
    ConsumerThread consumer = new ConsumerThread();
    PrinterThread printer = new PrinterThread();

    producer.start();
    consumer.start();
    printer.start();

    Thread.sleep(1000);

    producer.stop();
    consumer.stop();

    Thread.sleep(1000);

  }

}
