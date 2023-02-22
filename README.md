## HibernateFlushLogging
Set up project logging
## 6. JDBC & Hibernate 5. Hibernate
## Задание 2 

Настроить логирование для проекта с дополнительным заданием. 
Из пакета ex_002_insert_and_update создайте в цикле 200 объектов author и сохраните в БД.
Значения полей могут быть любыми.
Используйте метод flush для каждых 10 объектов. Метод сommit выполняйте один раз в конце.

## Заметки

Логирование с записью в файл file.log.

**log4j.prorerties**

*# настройка главного узла, в котором находятся все логи*

log4j.rootLogger=DEBUG, File

*# настройка определенных узлов логирования*

log4j.logger.org.hibernate=info

log4j.logger.org.hibernate.type.descriptor.sql=info

log4j.appender.File=org.apache.log4j.RollingFileAppender

log4j.appender.File.File=file.log

*# размер файла*

log4j.appender.File.MaxFileSize=1MB

*# количество файлов*

log4j.appender.File.MaxBackupIndex=5

*# шаблон сообщения*

log4j.appender.File.layout=org.apache.log4j.PatternLayout

log4j.appender.File.layout.ConversionPattern=%d{HH:mm:ss} %-5p [%c] - %m%n
