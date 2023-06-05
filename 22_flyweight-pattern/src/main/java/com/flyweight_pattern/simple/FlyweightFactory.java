package com.flyweight_pattern.simple;

import com.flyweight_pattern.simple.flyweight.ConcreteFlyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sobann
 */
public class FlyweightFactory {

    private final Map<String, Flyweight> flyweights = new HashMap<>(8);

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return flyweights.get(key);
    }
}
