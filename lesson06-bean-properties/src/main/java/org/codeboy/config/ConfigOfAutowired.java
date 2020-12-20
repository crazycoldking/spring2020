package org.codeboy.config;

import org.codeboy.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"org.codeboy.service", "org.codeboy.dao", "org.codeboy.controller"})
public class ConfigOfAutowired {

    /**
     * @Autowired annotation can help us to register dependencies of beans
     */

    @Bean("daoB")
    public BookDao bookDao() {
        final BookDao bookDao = new BookDao();
        bookDao.setLabel("dd");
        return bookDao;
    }
}
