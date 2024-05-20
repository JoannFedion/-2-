# PPiPDO

Чтобы запустить все необходимо запустить [run.sh](run.sh)
\
Этот скрипт запустит все приложения и заставит подниматься grafana(на 3000 порту) и prometheus(на 9090 порту) \

Для grafana можно зайти на localhost:3000 и авторизоваться \ 
username:admin \
password:admin
\
Далее \
"DATA SOURCES
Add your first data source" 

Выбрать prometheus и указать в поле URL "http://host.docker.internal:9090"
\
После этого можно создать дашборд и выставлять там нужные метрики

Вот пример ![Метрика из графана.png](%D0%9C%D0%B5%D1%82%D1%80%D0%B8%D0%BA%D0%B0%20%D0%B8%D0%B7%20%D0%B3%D1%80%D0%B0%D1%84%D0%B0%D0%BD%D0%B0.png)

По завершению работы следует выполнить скрипт [kill.sh](kill.sh)
\
Он завершит java приложения и docker-compose