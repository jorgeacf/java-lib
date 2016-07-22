
cd ./src/utils;
mvn test package;

cd ../../src/structures;
mvn test package;
mvn clean cobertura:cobertura coveralls:report;

cd ../../src/algorithms;
mvn test package

cd ../../src/problems;
mvn test package;
