package com.yu.echo.autoconfigure;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yuhangbin
 * @date 2022/3/6
 **/
@Data
@NoArgsConstructor
@ConfigurationProperties(prefix = "yu.echo")
public class EchoProperties {

	private String name;
}
