package com.github.jaskey.consistenthash.sample;

import com.github.jaskey.consistenthash.HashFunction;

import java.nio.charset.StandardCharsets;

public enum Murmur3HashFunction implements HashFunction {
    MURMUR3_HASH_32, MURMUR3_HASH_64;

    @Override
    public long hash(String key) {
        if (MURMUR3_HASH_64.equals(this)) {
            return Murmur3HashAlgorithm.hash64(key.getBytes(StandardCharsets.UTF_8));
        } else {
            return Murmur3HashAlgorithm.hash32(key.getBytes(StandardCharsets.UTF_8));
        }
    }
}
