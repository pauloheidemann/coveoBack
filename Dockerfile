FROM jboss/wildfly

ADD target/coveo.war /opt/jboss/wildfly/standalone/deployments/

EXPOSE 8080
EXPOSE 9990