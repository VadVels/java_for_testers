package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class DeleteGroupTest extends TestBase {


    @Test
    public void deleteGroup() {
        if (!app.groups().isGroupPresent()) {
            app.groups().newGroup(new GroupData("group name", "group header", "group footer"));
        }
        app.groups().removeGroup();
    }


}
