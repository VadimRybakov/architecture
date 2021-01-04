package ru.geekbrains;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import ru.geekbrains.adapter.AdapterUsbToUsbC;
import ru.geekbrains.adapter.Keyboard;
import ru.geekbrains.adapter.UsbC;
import ru.geekbrains.bridge.MongoDb;
import ru.geekbrains.bridge.NewsService;
import ru.geekbrains.bridge.Postgresql;
import ru.geekbrains.bridge.UserService;
import ru.geekbrains.composite.Data;
import ru.geekbrains.composite.Directory;
import ru.geekbrains.composite.File;

class StructuralPatternsTests {

  @Test
  void adapterTest() {

    final Keyboard keyboard = new Keyboard();

    class MacBook {
      private UsbC usbC;
      public MacBook() {
        usbC = new AdapterUsbToUsbC(keyboard);
      }
      String connect() {
        return usbC.connect();
      }
    }

    MacBook mac = new MacBook();

    assertEquals(keyboard.connectUsb(), mac.connect());
  }

  @Test
  void bridgeTest() {
    MongoDb mongoDb = new MongoDb();
    Postgresql postgresql = new Postgresql();

    UserService userService = new UserService(postgresql);
    NewsService newsService = new NewsService(mongoDb);

    assertEquals(userService.connect(), postgresql.connect());
    assertEquals(newsService.connect(), mongoDb.connect());
    assertNotEquals(userService.connect(), newsService.connect());
  }

  @Test
  void compositeTest() {
    Data a = new File("a");
    Data b = new File("b");
    Data c = new File("c");
    Data directory = new Directory().add(a, b, c);

    assertEquals(a.info() + ", " + b.info() + ", "  + c.info(), directory.info());
  }
}
