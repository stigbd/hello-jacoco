# hello-jacoco

Small project to test jacoco, based on [this tutorial](https://www.baeldung.com/jacoco)

The App class has a single method that tests if the argument at startup is a palindrom and outputs the result. This class is excluded from the coverage report.

The class under test is the Palindrom class.

## Run the tests

```bash
mvn clean install
```

## Inspect the coverage report

Open the file target/site/jacoco/index.html in a browser.

## Run the app

```bash
java -cp target/HelloJacoco-1.0-SNAPSHOT.jar  com.mycompany.hellojacoco.App noon
```
