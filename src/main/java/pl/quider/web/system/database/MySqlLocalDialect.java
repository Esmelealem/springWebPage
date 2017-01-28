package pl.quider.web.system.database;

import org.hibernate.dialect.MySQL5InnoDBDialect;

/**
 * Created by Adrian on 28.01.2017.
 */
public class MySqlLocalDialect extends MySQL5InnoDBDialect {
    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }

}

