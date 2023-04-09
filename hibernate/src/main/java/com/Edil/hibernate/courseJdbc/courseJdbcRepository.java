package com.Edil.hibernate.courseJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class courseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY = """
            
            insert into course (id, name, author)
            values(12, 'spring' , 'springAuthor');
            """;

    public void insert(){
        springJdbcTemplate.update(INSERT_QUERY);
    }

}
