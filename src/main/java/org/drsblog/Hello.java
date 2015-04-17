package org.drsblog;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

/**
 * Created by d.panin on 12/2/2014
 */
public class Hello extends WebPage {

    private static final long serialVersionUID = 1L;

    private DropDownChoice<String> firstDropDownField;
    private String firstFieldData = "Unchanged data of firstFieldData";

    public Hello() {

        firstDropDownField = new DropDownChoice<String>("firstDropDownField", new PropertyModel<String>(this, "firstFieldData"), new ArrayList<String>());
        firstDropDownField.setChoices(Arrays.asList("one", "two", "three"));

        final Model<String> messageModel = Model.of("Hello World, Wicket");
        final Label message = new Label("message", messageModel);
        message.setOutputMarkupId(true);

        add(message);
        add(firstDropDownField);

        firstDropDownField.add(new AjaxFormComponentUpdatingBehavior("onchange") {
            @Override
            protected void onUpdate(AjaxRequestTarget target) {
                messageModel.setObject("Value is: " + firstFieldData);
                target.addComponent(message);
            }
        });

    }
}
