git clone https://github.com/studyouou/innerandouttomcat.git
mvn -Dmaven.test.skip=true clean package
#java_param=$JAVA_PARAM
java -jar ./target/springmybatis.jar --spring.datasource.port=${PORT} --spring.datasource.host=${HOST} spring.datasource.shemae=${SHEMAE}