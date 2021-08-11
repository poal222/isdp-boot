1、maven 仓库推送 命令如下
推送命令（建议针对不同的jar包，分别推送）

<code>
mvn clean install org.apache.maven.plugins:maven-deploy-plugin:2.8:deploy -DskipTests
</code>