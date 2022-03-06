package com.yu.echo.autoconfigure;

import com.yu.echo.EchoBot;
import com.yu.echo.EchoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuhangbin
 * @date 2022/3/6
 **/
@Configuration
@ConditionalOnClass(EchoBot.class)
@EnableConfigurationProperties(EchoProperties.class)
public class EchoAutoConfiguration {

	@Autowired
	private EchoProperties echoProperties;

	@Bean
	@ConditionalOnMissingBean
	public EchoConfig echoConfig() {
		EchoConfig echoConfig = new EchoConfig();
		echoConfig.setName(echoProperties.getName() == null ? "unnamed" : echoProperties.getName());
		return echoConfig;
	}

	@Bean
	@ConditionalOnMissingBean
	public EchoBot echoBot(EchoConfig echoConfig) {
		return new EchoBot(echoConfig);
	}

}
