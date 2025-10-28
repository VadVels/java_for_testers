package tests;

import model.GroupData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewGroupTest extends TestBase {


    @Test
    public void newGroup() {
        int groupCount = app.groups().getCount();
        app.groups().newGroup(new GroupData("Group name", "Group header", "Group footer"));
        int newgroupCount = app.groups().getCount();
        Assertions.assertEquals(groupCount + 1, newgroupCount);
    }

    @Test
    public void newGroupWithEmptyName() {
        app.groups().newGroup(new GroupData());
    }

    @Test
    public void newGroupWithEmptyWithNameOnly() {
        app.groups().newGroup(new GroupData().withName("some name"));
    }
}
