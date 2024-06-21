package org.apache.pulsar.storm;

import org.apache.pulsar.client.api.DeadLetterPolicy;

import java.io.Serializable;

public class PulsarSpoutDeadLetterPolicy extends DeadLetterPolicy implements Serializable {
    public String toString() {
        return "PulsarSpoutDeadLetterPolicy(maxRedeliverCount=" + this.getMaxRedeliverCount() + ", retryLetterTopic=" + this.getRetryLetterTopic() + ", deadLetterTopic=" + this.getDeadLetterTopic() + ", initialSubscriptionName=" + this.getInitialSubscriptionName() + ")";
    }

    public PulsarSpoutDeadLetterPolicy() {
        super();
    }

    public PulsarSpoutDeadLetterPolicy(final int maxRedeliverCount, final String retryLetterTopic, final String deadLetterTopic, final String initialSubscriptionName) {
        super(maxRedeliverCount, retryLetterTopic, deadLetterTopic, initialSubscriptionName);
    }

    public PulsarSpoutDeadLetterPolicy(final DeadLetterPolicy deadLetterPolicy) {
        super(
                deadLetterPolicy.getMaxRedeliverCount(),
                deadLetterPolicy.getRetryLetterTopic(),
                deadLetterPolicy.getDeadLetterTopic(),
                deadLetterPolicy.getInitialSubscriptionName()
        );
    }
}


