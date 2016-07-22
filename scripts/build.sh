
cd ./src/utils;
mvn package;

cd ../../src/structures;
mvn package;

cd ../../src/algorithms;
mvn package

cd ../../src/problems;
mvn package;

cd ../../;
mvn cobertura:cobertura coveralls:report
