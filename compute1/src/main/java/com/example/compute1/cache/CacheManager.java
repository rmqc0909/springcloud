//package com.example.compute1.cache;
//
//import com.google.common.cache.Cache;
//import com.google.common.cache.CacheBuilder;
//import com.google.common.cache.CacheLoader;
//import com.google.common.cache.LoadingCache;
//
//import java.cache.concurrent.ExecutionException;
//import java.cache.concurrent.TimeUnit;
//
//public class CacheManager {
//    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        LoadingCache<String, String> cache = CacheBuilder.newBuilder()
//                .maximumSize(100)
//                //写之后5s过期
//                .expireAfterWrite(5, TimeUnit.MILLISECONDS)
//                .concurrencyLevel(1)
//                .build(createCacheLoader());
//        cache.put("hello1", "我是hello1");
//        cache.put("hello2", "我是hello2");
//        cache.put("hello3", "我是hello3");
//        cache.put("hello4", "我是hello4");
//        //至少睡眠10ms
//        Thread.sleep(10);
//        System.out.println(cache.size());
//        cache.put("hello5", "我是hello5");
//        System.out.println(cache.get("hello5"));
//        System.out.println(cache.size());
//    }
//
//    public static CacheLoader<String, String> createCacheLoader() {
//        return new CacheLoader<String, String>() {
//            @Override
//            public String load(String key){
//                return key;
//            }
//        };
//    }
//
//}
