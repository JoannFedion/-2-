#убиваем процессы, в которых работают java приложения
#p.s. подразумевается, что нет сторонних приложений, которые имеют такую же приставку "org.example"
jps -l | grep org.example | cut -d' ' -f1 | while read line ; do kill "$line" ; done

#останавливаем grafana и prometheus
docker-compose down