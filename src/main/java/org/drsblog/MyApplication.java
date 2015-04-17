package org.drsblog;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.target.coding.QueryStringUrlCodingStrategy;

/**
 * Created by d.panin on 12/2/2014.
 */
public class MyApplication extends WebApplication {

    @Override
    protected void init() {
        super.init();
        mount(new QueryStringUrlCodingStrategy("home", Hello.class));
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return Hello.class;
    }

}
