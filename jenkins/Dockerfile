FROM jenkins:latest
RUN mkdir -p /var/jenkins_home/jobs/seed-job 
COPY seedJobConfig.xml /var/jenkins_home/jobs/seed-job/config.xml
COPY set-permissions.sh /
ENTRYPOINT ./set-permissions.sh
