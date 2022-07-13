package com.module.demo.setup;

import com.module.demo.templating.functions.HelloWorldTemplatingFunctions;
import info.magnolia.module.DefaultModuleVersionHandler;
import info.magnolia.module.InstallContext;
import info.magnolia.module.delta.Task;
import info.magnolia.rendering.module.setup.InstallRendererContextAttributeTask;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is optional and lets you manage the versions of your module,
 * by registering "deltas" to maintain the module's configuration, or other type of content.
 * If you don't need this, simply remove the reference to this class in the module descriptor xml.
 *
 * @see info.magnolia.module.DefaultModuleVersionHandler
 * @see info.magnolia.module.ModuleVersionHandler
 * @see info.magnolia.module.delta.Task
 */
public class DemoClassVersionHandler extends DefaultModuleVersionHandler {
    @Override
    protected List<Task> getStartupTasks(InstallContext installContext) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(
                new InstallRendererContextAttributeTask(
                        "rendering",
                        "freemarker",
                        HelloWorldTemplatingFunctions.FUNCTION_NAME,
                        HelloWorldTemplatingFunctions.class.getName()));
        tasks.add(
                new InstallRendererContextAttributeTask(
                        "site",
                        "site",
                        HelloWorldTemplatingFunctions.FUNCTION_NAME,
                        HelloWorldTemplatingFunctions.class.getName()));
        return tasks;
    }

}
