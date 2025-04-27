Simple Spring Boot java project to demonstrate the error when trying to create a sequence per descendant on an @Id defined in the ancestor.

The POM contains Testcontainers.  The only infrastructure required is a container (docker) environment running.

The test `SequenceServiceTest` demonstrates the problem.
