# Startup
Basic set up of spring project using gradle.

* Pre-commit hook


#### Pre-commit hook:

Do you forget to run tests locally and push your code changes? In general, it is good practice to run tests for every commit.
To automate this process, you can configure pre-commit hook. This will run unit tests just before every commit and wont allow you to commit if the tests fails.
For the pre-commit hook to run on your system, you will need to run below command from the root directory of the project

```cd .git/hooks && ln -s ../../git-hooks/pre-commit.sh pre-commit```

If you want to skip the pre-commit hook, just append "-n" to the git commit command:
```git commit -m "Commit Message" -n```


# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#production-ready)
* [Spring Web Starter](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

#### …or push an existing repository from the command line
git remote add origin https://github.com/gracem9092/startup.git
git push -u origin master