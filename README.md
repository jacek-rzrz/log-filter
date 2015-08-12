Set default log level to something high:

	log4j.rootLogger=ERROR, stdout
	
Then set a lower level for what you want to see:

	log4j.logger.com.forecastthis.brilliant=INFO