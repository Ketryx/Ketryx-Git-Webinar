# Ketryx Git Webinar

This is a sample repository highlighting the [Ketryx Platform](https://www.ketryx.com/platform) features around [Git-based configuration items](https://docs.ketryx.com/manuals/man-09-git-based-configuration-items) for our [webinar about Git for IEC 62304](https://www.linkedin.com/posts/ketryx_register-today-activity-7181351604917280768-RTpJ/).

The sample code itself is a tiny web application based on [Create Next App](https://github.com/vercel/next.js/tree/canary/packages/create-next-app#readme) with TypeScript and Cucumber code. In addition, it contains some  [Java code](java-src).

## Structure

* [Java function](java-src/src/main/java/com/ketryx/sample/AddNumbers.java) and corresponding [JUnit test](java-src/src/test/java/com/ketryx/sample/AddNumbersTest.java)
* [Markdown specification](specs/spec-dose-administration.md) (linked to fulfilled requirements in Git and Jira, and an introduced risk in Jira) and corresponding [Cucumber test](features/dose-administration.feature)
* [Markdown requirements](reqs) (linked to parent requirements in Jira)
* [Markdown tests](tests) (as a basis to create manual test executions in Jira)

Automated tests are executed and reported to Ketryx as part of the [CI/CD GitHub Actions workflow](.github/workflows/cicd.yml), with calls like the following:

```yaml
      - name: Report JS build to Ketryx
        uses: Ketryx/ketryx-github-action@v1
        if: success() || failure()
        with:
          ketryx-url: ${{ vars.KETRYX_URL }}
          project: ${{ vars.KETRYX_PROJECT }}
          version: ${{ vars.KETRYX_VERSION }}
          api-key: ${{ secrets.KETRYX_API_KEY }}
          build-name: ci-js
          test-junit-path: test-results/jest-junit.xml
          test-cucumber-path: test-results/cucumber-report.json

      - name: Report Java build to Ketryx
        uses: Ketryx/ketryx-github-action@v1
        if: success() || failure()
        with:
          ketryx-url: ${{ vars.KETRYX_URL }}
          project: ${{ vars.KETRYX_PROJECT }}
          version: ${{ vars.KETRYX_VERSION }}
          api-key: ${{ secrets.KETRYX_API_KEY }}
          build-name: ci-java
          test-junit-path: java-src/build/test-results/test/*.xml
```

## Install dependencies

```bash
npm install
```

## Running Tests

Run unit and integration tests:

```bash
npm run test:unit-integration-ci
```

Run tests in watch mode:

```bash
npm test
```

Run end-to-end tests:

```bash
npm run test:e2e
```

Run Java unit tests:

```bash
cd java-src
./gradlew test
```
