package com.walking.counterAggregation;

import com.walking.counterAggregation.model.Counter;
import com.walking.counterAggregation.service.CounterService;

public class Main {

    public static final String GAS_NAME = "Газ";
    public static final String COLD_WATER_NAME = "Холодная вода";
    public static final String HOT_WATER_NAME = "Горячая вода";
    public static final String ELECTRICITY_NAME = "Электричество";

    public static final String M_3_UNIT = "м3";
    public static final String KW_H_UNIT = "кВт/ч";


    static void main(String[] args) {
        Counter gas = new Counter(GAS_NAME, M_3_UNIT, 0);
        gas.setValue(10);

        Counter electric = new Counter(ELECTRICITY_NAME, KW_H_UNIT, 0);
        gas.setValue(234);

        CounterService service = new CounterService(gas, electric);
        service.getNameCounters(gas.getName());
        service.increase("dedsf");
        service.increase(gas.getName());
        service.reset(gas.getName());
        service.increase(electric.getName(), 123);

        output(gas);
        output(service.getAllCounters());
    }

    private static void output(Counter[] counter) {
        for (Counter counters : counter) {
            System.out.println(counters.getName() + ": " + counters.getValue());
        }
    }

    private static void output(Counter counter) {
        System.out.println(counter.getName() + ": " + counter.getValue());
    }
}
