FROM java:v1
ENV PORT=3306
ENV HOST=192.168.43.201
ENTRYPOINT ["./wait-for-it.sh","192.168.43.201:${PORT}","--","./start.sh"]