package org.jboss.bpm.console.client.navigation.tasks;

import com.google.gwt.place.shared.PlaceController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@Ignore
public class TasksNavigationItemBuilderTest {

    private TasksNavigationItemBuilder builder;
    private TasksHeaderView tasksHeaderView;

    @Before
    public void setUp() throws Exception {
//        NavigationViewFactory navigationViewFactory = mock(NavigationViewFactory.class);
//        tasksHeaderView = mock(TasksHeaderView.class);
//        when(
//                navigationViewFactory.getTasksHeaderView()
//        ).thenReturn(
//                tasksHeaderView
//        );
//        TasksTreeView tasksTreeView = mock(TasksTreeView.class);
//        when(
//                navigationViewFactory.getTasksTreeView()
//        ).thenReturn(
//                tasksTreeView
//        );
//        PlaceController placeController = mock(PlaceController.class);
//        builder = new TasksNavigationItemBuilder(navigationViewFactory, placeController);
    }

    @Test
    public void testAlwaysBuilds() throws Exception {
        Assert.assertTrue(builder.hasPermissionToBuild());
    }

    @Test
    public void testHeader() throws Exception {
        Assert.assertEquals(tasksHeaderView, builder.getHeader());
    }

    @Test
    public void testContent() throws Exception {
        Assert.assertTrue(builder.getContent() instanceof TasksTree);
    }
}
