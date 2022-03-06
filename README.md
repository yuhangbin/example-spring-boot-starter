# Spring Boot Starter Example

Personal understanding: 
    Spring Boot Starter contains autoconfigure and dependencies integration.

What should do?
1. An auto-configure class for our library along with a properties class for custom configuration. [2]
2. A starter pom to bring in the dependencies of the library and the autoconfigure project. [2]

## Module Explain
echo-library: Need autoconfigure library. (There is an echo bot inside.)
echo-sample-app: sample for testing autoconfigure and starter (Using starter to autoconfigure and create echo bot.)
echo-spring-boot-autoconfigure: autoconfigure beans (Read properties)
echo-spring-boot-starter: dependencies integration

## References
1. https://github.com/snicoll/spring-boot-master-auto-configuration
2. https://www.baeldung.com/spring-boot-custom-starter 
3. https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using.build-systems.starters
4. https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#features.developing-auto-configuration.custom-starter
