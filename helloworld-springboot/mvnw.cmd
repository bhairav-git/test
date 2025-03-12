@echo off
setlocal

set MAVEN_HOME=%~dp0\.mvn\wrapper\maven-wrapper.jar
set MAVEN_OPTS=-Xmx1024m -XX:MaxPermSize=256m

if not exist "%MAVEN_HOME%" (
    echo Maven wrapper not found. Please ensure you have the correct version of the Maven wrapper.
    exit /b 1
)

java -cp "%MAVEN_HOME%" org.apache.maven.wrapper.MavenWrapperMain %*