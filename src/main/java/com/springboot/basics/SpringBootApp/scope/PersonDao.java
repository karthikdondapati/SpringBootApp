package com.springboot.basics.SpringBootApp.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {

    public JDBcConnection getJdbConnection() {
        return jdbConnection;
    }

    public void setJdbConnection(JDBcConnection jdbConnection) {
        this.jdbConnection = jdbConnection;
    }

    @Autowired
    JDBcConnection jdbConnection;
}
