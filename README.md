# logger-demo

#By default spring boot will check the logback.xml file in classpath, 
#we already excluded this in pom file and added log4j2 dependency additionaly
#so it would expect the file log4j2.xml file in resources folder by default

#Using the following property we can change the file name as user defined
logging.config=classpath:log4j-srini.xml
