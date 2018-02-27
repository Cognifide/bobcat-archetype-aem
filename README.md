![Cognifide logo](http://cognifide.github.io/images/cognifide-logo.png)
# This archetype is deprecated please use https://github.com/Cognifide/bobcat-gradle-template
# Bobcat AEM Archetype

## Summary 
This project is Maven archetype for Bobcat using JUnit tests with support for AEM. It contains tests examples and page object ready to use in AEM .

## Prerequisites
* JDK 8
* Maven 3

## Create project
```
mvn archetype:generate \
        -DarchetypeGroupId=com.cognifide.qa.bb \
        -DarchetypeArtifactId=bobcat-archetype-aem \
        -DarchetypeVersion=1.0.2 \
```
Example properties for archetype
```
Define value for property 'groupId': : com.cognifde.qa.bb
Define value for property 'artifactId': : hello-world
Define value for property 'version':  1.0-SNAPSHOT: : 1.0.0
Define value for property 'package':  com.cognifde.qa.bb: : com.hello.world
```
## Project structure

```
└───hello-world
 |   └───src
 |       ├───main
 |       │   ├───config
 |       │   │   ├───common
 |       │   │   ├───dev
 |       │   │   └───integration
 |       │   └───java
 |       │       └───com
 |       │           └───hello
 |       │               └───world
 |       │                   └───pageobjects
 |       │                       ├───feedback
 |       │                       ├───login
 |       │                       └───summer
 |       └───test
 |           ├───java
 |           │   └───com
 |           │       └───hello
 |           │           └───world
 |           │               ├───feedback
 |           │               ├───login
 |           │               └───summer
 |           └───resources
 └───pom.xml
```

**Configuration**

Configurations for different environments are stored in the config directory:

```
 |    └───src
 |        ├───main
 |        │   ├───config
 |        │   │   ├───common
 |        │   │   ├───dev
 |        │   │   └───integration
```

**Page object classes**

Page object classes for has their place in com.hello.world.pageobjects package:

```
 |       │       └───com
 |       │           └───hello
 |       │               └───world
 |       │                   └───pageobjects
```

**Test cases**

Test cases written in Java are in com.hello.world package in test directory:

```
 |       └───test
 |           ├───java
 |           │   └───com
 |           │       └───hello
 |           │           └───world
 |           │               ├───feedback
 |           │               ├───login
 |           │               └───summer
```

## Running sample AEM test cases
Instruction is the same regardless of a project archetype:
1. Edit _/src/main/config/integration/instances.properties_ and provide your AEM instance details,
2. Edit _/src/main/config/common/webdriver.properties_ and provide your browser details,
3. Execute following command from the command line:
```
mvn clean test -Pintegration
```
