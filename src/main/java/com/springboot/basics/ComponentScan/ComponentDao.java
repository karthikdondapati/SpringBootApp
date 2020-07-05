package com.springboot.basics.ComponentScan;

import com.springboot.basics.SpringBootApp.scope.JDBcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDao {

    public ComponentJDBcConnection getJdbConnection() {
        return componentJDBcConnection;
    }

    public void setJdbConnection(JDBcConnection jdbConnection) {
        this.componentJDBcConnection = componentJDBcConnection;
    }

    @Autowired
    ComponentJDBcConnection componentJDBcConnection;
}
