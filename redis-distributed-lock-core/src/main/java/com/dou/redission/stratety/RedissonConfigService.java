package com.dou.redission.stratety;


import com.dou.redission.entity.RedissonProperties;
import org.redisson.config.Config;

/**
 * @Description: Redisson配置构建接口
 *
 * @author dou
 *
 */
public interface RedissonConfigService {

    /**
     * 根据不同的Redis配置策略创建对应的Config
     * @param redissonProperties
     * @return Config
     */
    Config createRedissonConfig(RedissonProperties redissonProperties);
}
