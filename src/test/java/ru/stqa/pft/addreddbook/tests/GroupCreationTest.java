package ru.stqa.pft.addreddbook.tests;// Generated by Selenium IDE


import org.junit.Test;
import ru.stqa.pft.addreddbook.model.GroupData;


public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreate() {
        app.getNavigationHelper().gotoGroupPage("GROUPS");
        app.getGroupHelper().initGroupCreation("new");
        app.getGroupHelper().fillGroupForm(new GroupData("asd", "asd1", "asd2"));
        app.getGroupHelper().submitGroupCreation("submit");
        app.getGroupHelper().returnToGroupPage("group page");
        app.logout("LOGOUT");
    }

}
