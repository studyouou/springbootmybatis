package org.ougen.smdemo.event;

import org.springframework.context.ApplicationEvent;

/**
 * Author: OuGen
 * Discription:
 * Date: 13:41 2019/7/25
 */
public class QueryEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public QueryEvent(Object source) {
        super(source);
    }
}
