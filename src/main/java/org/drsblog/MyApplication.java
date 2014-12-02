package org.drsblog;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.drsblog.hello.Hello;

/**
 * Created by d.panin on 12/2/2014.
 */
public class MyApplication extends WebApplication {

    @Override
    public Class<? extends Page> getHomePage() {
        return Hello.class; //return default page
    }

}
