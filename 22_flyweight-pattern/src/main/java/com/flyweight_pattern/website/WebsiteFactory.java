package com.flyweight_pattern.website;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 网站工厂
 *
 * @author sobann
 */
public class WebsiteFactory {

    private final Map<String, Website> flyweights = new ConcurrentHashMap<>(8);

    public Website getWebsiteCategory(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebsite(key));
        }
        return flyweights.get(key);
    }

    public int getWebsiteCount() {
        return flyweights.size();
    }
}
