package br.edu.ifpb.padroes.service;

import java.sql.Connection;

public interface DatabaseConnect {

    Connection getConnection();

}
