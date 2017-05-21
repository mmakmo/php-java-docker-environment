docker exec php composer install
docker exec php npm install

docker exec php /var/opt/artisan serve --host=0.0.0.0 &
docker exec php npm run watch &
docker exec java /var/opt/gradlew bootRun &