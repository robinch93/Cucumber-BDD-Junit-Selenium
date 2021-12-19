docker-compose up -d && \
docker-compose exec cucumber mvn clean install && \
open -a "Google Chrome" file://$PWD/cucumberDemo/test-results/HtmlReports/report.html