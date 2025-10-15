package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class DeleteGroupTest extends TestBase {


    @Test
    public void deleteGroup() {
        app.openGroupsPage();
        if (!app.isGroupPresent()) {
            app.newGroup(new GroupData("group name", "group header", "group footer"));
        }
        app.removeGroup();
    }


}
