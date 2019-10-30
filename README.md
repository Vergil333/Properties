I found it to be little cumbersome to import properties into static. 

This minimalistic demo shows how to do it both in main method and also in tests.

### Structure:

#####App
Properties:  
[application.properties](https://github.com/Vergil333/Properties/blob/master/src/main/resources/application.properties)

Properties configuration:
[FacebookProperties](https://github.com/Vergil333/Properties/blob/master/src/main/java/com/martinmachava/properties/configs/FacebookProperties.java)

Main Class:
[PropertiesApplication](https://github.com/Vergil333/Properties/blob/master/src/main/java/com/martinmachava/properties/PropertiesApplication.java)

#####Tests
Test Class:
[FacebookPropertiesTests](https://github.com/Vergil333/Properties/blob/master/src/test/java/com/martinmachava/properties/PropertiesApplicationTests.java)

Enabling and loading properties:
[LoadConfigProperties](https://github.com/Vergil333/Properties/blob/master/src/test/java/com/martinmachava/properties/configs/properties/LoadConfigProperties.java)

