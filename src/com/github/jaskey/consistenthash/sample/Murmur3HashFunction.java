package com.github.jaskey.consistenthash.sample;

import com.github.jaskey.consistenthash.HashFunction;

import java.nio.charset.StandardCharsets;

public class Murmur3HashFunction implements HashFunction {
    public static final Murmur3HashFunction MURMUR3_HASH = new Murmur3HashFunction();

    private Murmur3HashFunction() {

    }

    @Override
    public long hash(String key) {
        return Murmur3HashAlgorithm.hash32(key.getBytes(StandardCharsets.UTF_8));
    }
}
