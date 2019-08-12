package org.ougen.smdemo.listener;

import org.ougen.smdemo.event.QueryEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Author: OuGen
 * Discription:
 * Date: 13:42 2019/7/25
 */
@Component
public class QueryListener implements ApplicationListener<QueryEvent> {
    private static Logger logger = LoggerFactory.getLogger(QueryListener.class);
    @Override
    public void onApplicationEvent(QueryEvent event) {
        logger.info("时间监听:{}",event.getSource());
    }
}
