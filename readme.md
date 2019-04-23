## Build testNG sample project include test groups and maven build profiles

### - Run all tests:
`mvn -B -T 10 -fn -f "E:\TRICENTIS\auto-samples\testng-tests\pom.xml" -PUcmsNightlyqTest test`
### - Run specific test:
`mvn -B -T 10 -fn -f "E:\TRICENTIS\auto-samples\testng-tests\pom.xml" -PUcmsNightlyqTest -Dtest="com.google.tests.Search" test`
