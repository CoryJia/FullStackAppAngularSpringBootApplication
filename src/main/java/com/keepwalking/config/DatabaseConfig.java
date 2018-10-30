package com.keepwalking.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("com.keepwalking")
@EnableTransactionManagement
public class DatabaseConfig {
}
