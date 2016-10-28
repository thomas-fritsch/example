package de.tfritsch.example;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class ExamplePlugin extends Plugin {

    private static ExamplePlugin INSTANCE;

    public static ExamplePlugin getInstance() {
        return INSTANCE;
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        INSTANCE = this;
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        INSTANCE = null;
        super.stop(context);;
    }

}
