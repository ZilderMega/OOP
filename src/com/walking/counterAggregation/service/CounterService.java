package com.walking.counterAggregation.service;

import com.walking.counterAggregation.model.Counter;

public class CounterService {
    private Counter[] counters;

    public CounterService(Counter... counters) {
        this.counters = counters;
    }

    public Counter[] getAllCounters() {
        return counters;
    }

    public Counter getNameCounters(String name) {
        for (Counter counterName : this.counters) {
            if (counterName.getName().equals(name)) {
                return counterName;
            }
        }
        return null;
    }

    public Counter increase(String name) {
        for (Counter counterIncrease : this.counters) {
            if (counterIncrease.getName().equals(name)) {
                counterIncrease.setValue(counterIncrease.getValue() + 1);
                return counterIncrease;
            }
        }
        return null;
    }

    public Counter increase(String name, int number) {
        for (Counter counterIncrease : this.counters) {
            if (counterIncrease.getName().equals(name)) {
                counterIncrease.setValue(counterIncrease.getValue() + number);
                return counterIncrease;
            }
        }
        return null;
    }

    public Counter reset(String name) {
        for (Counter counterIncrease : this.counters) {
            if (counterIncrease.getName().equals(name)) {
                counterIncrease.setValue(0);
                return counterIncrease;
            }
        }
        return null;
    }
}

