package org.dromara.soul.common.dto.convert;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.dromara.soul.common.constant.Constants;
import org.dromara.soul.common.enums.HystrixIsolationModeEnum;

/**
 * this is hystrix handle.
 *
 * @author xiaoyu(Myth)
 */
@Getter
@Setter
@EqualsAndHashCode
public class HystrixHandle {

    /**
     * hystrix group key is required.
     */
    private String groupKey;

    /**
     * hystrix command key is required.
     */
    private String commandKey;

    /**
     * hystrix withExecutionIsolationSemaphoreMaxConcurrentRequests.
     */
    private int maxConcurrentRequests = Constants.MAX_CONCURRENT_REQUESTS;

    /**
     * hystrix withCircuitBreakerErrorThresholdPercentage.
     */
    private int errorThresholdPercentage = Constants.ERROR_THRESHOLD_PERCENTAGE;

    /**
     * hystrix withCircuitBreakerRequestVolumeThreshold.
     */
    private int requestVolumeThreshold = Constants.REQUEST_VOLUME_THRESHOLD;

    /**
     * hystrix withCircuitBreakerSleepWindowInMilliseconds.
     */
    private int sleepWindowInMilliseconds = Constants.SLEEP_WINDOW_INMILLISECONDS;

    /**
     * timeout is required.
     */
    private long timeout = Constants.TIME_OUT;

    /**
     * call back uri.
     * when some error occurs in hystrix invoke it will forward to this
     */
    private String callBackUri;

    /**
     * Isolation strategy to use when executing a hystrix command.
     */
    private int executionIsolationStrategy = HystrixIsolationModeEnum.SEMAPHORE.getCode();

    /**
     * hystrix thread pool config.
     */
    private HystrixThreadPoolConfig hystrixThreadPoolConfig;


}
