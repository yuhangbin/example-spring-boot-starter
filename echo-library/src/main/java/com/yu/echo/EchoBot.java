package com.yu.echo;

/**
 * @author yuhangbin
 * @date 2022/3/6
 **/
public class EchoBot {

	private EchoConfig echoConfig;

	public EchoBot(EchoConfig echoConfig) {
		this.echoConfig = echoConfig;
	}

	public void echo(String msg) {
		System.out.println("Happy to see you ! My name is " + echoConfig.getName() + " ~");
		if (msg == null) {
			System.out.println("I can't understand");
		}
		System.out.println("Echo message: " + msg);
	}

}
