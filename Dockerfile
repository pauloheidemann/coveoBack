FROM jboss/wildfly

ADD target/coveo.war /opt/jboss/wildfly/standalone/deployments/

EXPOSE 8080
EXPOSE 9990

# Iniciando em modo standalone e escutando todas as interfaces
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]