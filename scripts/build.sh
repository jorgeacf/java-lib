
cd ./src/utils;
mvn test package;

cd ../../src/structures;
mvn test package;
mvn cobertura:cobertura coveralls:report;

cd ../../src/algorithms;
mvn test package

cd ../../src/problems;
mvn test package;
