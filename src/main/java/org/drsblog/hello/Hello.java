package org.drsblog.hello;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Created by d.panin on 12/2/2014.
 */
public class Hello extends WebPage {

    private static final long serialVersionUID = 1L;

    public Hello(final PageParameters parameters) {

        add(new Label("message", "Hello World, Wicket"));

    }
}
