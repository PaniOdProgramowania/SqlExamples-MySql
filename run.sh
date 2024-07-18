#!/bin/bash
cd infrastructure || exit
if [ $# != 2 ]; then
  echo "2 arguments expected: password and username for database (in this order)"
  exit
fi
docker build -t pop-dancers-mysql  .
docker run -d -e MYSQL_ROOT_PASSWORD="$1" -e MYSQL_USER="$2" -e MYSQL_PASSWORD="$1" -i --name pop-dancers-mysql -p 5558:3306 pop-dancers-mysql
