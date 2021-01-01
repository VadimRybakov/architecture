package ru.geekbrains.patterns;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import ru.geekbrains.patterns.abstract_factory.GameShopFactory;
import ru.geekbrains.patterns.abstract_factory.PSConsole;
import ru.geekbrains.patterns.abstract_factory.PSFactory;
import ru.geekbrains.patterns.abstract_factory.PSGame;
import ru.geekbrains.patterns.abstract_factory.XboxConsole;
import ru.geekbrains.patterns.abstract_factory.XboxFactory;
import ru.geekbrains.patterns.abstract_factory.XboxGame;
import ru.geekbrains.patterns.builder.UserDto;
import ru.geekbrains.patterns.factory_method.Boy;
import ru.geekbrains.patterns.factory_method.Buyer;
import ru.geekbrains.patterns.factory_method.Girl;
import ru.geekbrains.patterns.prototype.Palm;
import ru.geekbrains.patterns.prototype.Spruce;
import ru.geekbrains.patterns.prototype.Tree;
import ru.geekbrains.patterns.singletons.EagerInitSingleton;
import ru.geekbrains.patterns.singletons.InitEnumSingleton;
import ru.geekbrains.patterns.singletons.LazyInitSingleton;


class GenerativePatternsTests {

  @Test
  void AbstractFactoryTest() {
    PSConsole ps = new PSConsole();
    XboxConsole xbox = new XboxConsole();
    PSGame psGame = new PSGame();
    XboxGame xboxGame = new XboxGame();

    GameShopFactory sellPsConsole = new PSFactory();
    GameShopFactory sellXboxConsole = new XboxFactory();

    assertEquals(sellPsConsole.sellConsole().getPrice(), ps.getPrice());
    assertEquals(sellXboxConsole.sellConsole().getPrice(), xbox.getPrice());
    assertEquals(sellPsConsole.sellGame().getPrice(), psGame.getPrice());
    assertEquals(sellXboxConsole.sellGame().getPrice(), xboxGame.getPrice());
  }

  @Test
  void FactoryMethodTest() {
    Buyer boy = new Boy();
    Buyer girl = new Girl();

    ru.geekbrains.patterns.factory_method.PSConsole ps = new ru.geekbrains.patterns.factory_method.PSConsole();
    ru.geekbrains.patterns.factory_method.XboxConsole xbox = new ru.geekbrains.patterns.factory_method.XboxConsole();

    assertEquals(boy.buyConsole().getPrice(), ps.getPrice());
    assertEquals(girl.buyConsole().getPrice(), xbox.getPrice());
  }

  @Test
  void builderTest() {
    UserDto user = new UserDto.Builder()
        .id(12345L)
        .login("Ivan")
        .password("12345")
        .address("Zimbabve")
        .email("ivan@mail.ru")
        .phone("89190034456")
        .build();

    assertEquals(12345L, user.getId());
    assertEquals("Ivan", user.getLogin());
    assertEquals("12345", user.getPassword());
    assertEquals("Zimbabve", user.getAddress());
    assertEquals("ivan@mail.ru", user.getEmail());
    assertEquals("89190034456", user.getPhone());
  }

  @Test
  void prototypeTest() {
    Tree palm = new Palm();
    Tree spruce = new Spruce();

    Tree newPalm = palm.clone();
    Tree newSpruce = spruce.clone();

    assertEquals(palm, newPalm);
    assertEquals(spruce, newSpruce);
    assertNotEquals(palm, spruce);
  }

  @Test
  void singletonTest() {
    InitEnumSingleton enum1 = InitEnumSingleton.INSTANCE;
    InitEnumSingleton enum2 = InitEnumSingleton.INSTANCE;

    EagerInitSingleton eager1 = EagerInitSingleton.getInstance();
    EagerInitSingleton eager2 = EagerInitSingleton.getInstance();

    LazyInitSingleton lazy1 = LazyInitSingleton.getInstance();
    LazyInitSingleton lazy2 = LazyInitSingleton.getInstance();

    assertEquals(enum1, enum2);
    assertEquals(eager1, eager2);
    assertEquals(lazy1, lazy2);
  }
}
