all::help

help:	# to get all commands        
	@grep '^[^#[:space:]].*:' Makefile 

docker-test-calculator: 	# run calculator feature file test on docker
	@echo "run calculator feature file test on docker"
	docker-compose up -d 
	docker-compose exec cucumber mvn clean install -Dmaven.test.skip=true
	docker-compose exec cucumber mvn test -Dcucumber.filter.tags="@calculator"
	open -a "Google Chrome" file://$PWD/cucumberDemo/test-results/HtmlReports/report.html

docker-test-computer:		# run computer feature file test on docker
	@echo "run computer feature file test on docker"
	docker-compose up -d 
	docker-compose exec cucumber mvn clean install -Dmaven.test.skip=true
	docker-compose exec cucumber mvn test -Dcucumber.filter.tags="@computer"
	open -a "Google Chrome" file://$PWD/cucumberDemo/test-results/HtmlReports/report.html

docker-test-database:		# run database feature file test on docker
	@echo "run database feature file test on docker"
	docker-compose up -d 
	docker-compose exec cucumber mvn clean install -Dmaven.test.skip=true
	docker-compose exec cucumber mvn test -Dcucumber.filter.tags="@database"
	open -a "Google Chrome" file://$PWD/cucumberDemo/test-results/HtmlReports/report.html

docker-test-mapping:		# run mapping feature file test on docker
	@echo "run mapping feature file test on docker"
	docker-compose up -d 
	docker-compose exec cucumber mvn clean install -Dmaven.test.skip=true
	docker-compose exec cucumber mvn test -Dcucumber.filter.tags="@mapping"
	open -a "Google Chrome" file://$PWD/cucumberDemo/test-results/HtmlReports/report.html

docker-test-tagging:		# run tagging feature file test on docker
	@echo "run tagging feature file test on docker"
	docker-compose up -d 
	docker-compose exec cucumber mvn clean install -Dmaven.test.skip=true
	docker-compose exec cucumber mvn test -Dcucumber.filter.tags="@tagging"
	open -a "Google Chrome" file://$PWD/cucumberDemo/test-results/HtmlReports/report.html