package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupCreation extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test12", "test13", "test14"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
