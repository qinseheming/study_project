package com.study.redis.lock;

import redis.clients.jedis.Jedis;

/**
 * @author yangming
 * @date 2020/6/29
 */
public class Lock {

    public static int expireSecond = 5;
    private Jedis jedis;

    public Lock(Jedis jedis) {
        this.jedis = jedis;
    }

    public boolean lock(String key, int expireSecond, String value) {
        String setex = jedis.setex(key, expireSecond, value);
        return false;
    }
}
