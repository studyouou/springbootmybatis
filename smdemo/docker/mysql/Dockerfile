FROM mysql:5.7
COPY ./my.cnf /etc/mysql/
COPY ./1-schema.sql ./docker-entrypoint-initdb.d/
COPY ./2-table.sql ./docker-entrypoint-initdb.d/