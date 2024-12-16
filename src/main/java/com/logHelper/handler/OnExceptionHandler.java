package com.logHelper.handler;

import com.logHelper.util.PointUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;

import static com.logHelper.handler.LogHelperTraceHandler.getTraceId;

/**
 * Description: 异常处理
 * Author: cth
 * Created Date: 2024-12-05
 */
@Slf4j
public abstract class OnExceptionHandler {
    public void process(ProceedingJoinPoint point, Exception e, String[] exception) {
        String sb = PointUtils.getMethodName(point) +
                getTraceId();
        log.error(sb);
        onException(point, e, exception);
    }

    public abstract void onException(ProceedingJoinPoint point, Exception e, String[] exception);

}
