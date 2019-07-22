springBoot log 的一般介绍

1、如何在项目中打印日志
	- private static final Logger LOG = LoggerFactory.getLogger(LogConfig.class);
	- LOG.info("==========print log==========");
2、日志信息保存到日志文件
	- application.yml中添加属性logging.path=/Users/jackie/workspace/rome/，即使保存日志文件的目录
	- 一般文件名采用默认的即可
3、设置日志文件大小
	- 属性：logging.file.max-size=1MB ,超过大小自动打包之前内容，并清空本文件。
4、设置日志级别
	- logging.level.root=info 即全局为info级别
	- logging.level.com.ictehi.controller=warn package级别，特定包下的日志级别
5、日志格式 pattern
	- 自定义日志格式输出样式
	- logging.pattern.console=%clr(%d{yyyy-MM-dd}){blue} [%thread] %clr(%-5p) %clr(%logger) - %msg%n
	- logging.pattern.file=%d{yyyy/MM/dd-HH:mm} [%thread] %-5level %logger- %msg%n