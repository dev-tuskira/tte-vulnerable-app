package com.tuskira.tte;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * TTE Vulnerable Application
 * Intentionally contains security vulnerabilities for Tuskira detection validation.
 */
public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    // TTE: Hardcoded DB credentials (CWE-798)
    private static final String DB_URL  = "jdbc:mysql://internal-db:3306/appdb";
    private static final String DB_USER = "admin";
    private static final String DB_PASS = "Sup3rS3cr3tP@ss!";

    public static void main(String[] args) throws Exception {
        // TTE: Log4Shell trigger - logs user-controlled input
        String userInput = System.getenv("USER_INPUT");
        logger.info("Processing request from: " + userInput);

        searchUser(userInput);
    }

    // TTE: SQL Injection (CWE-89) - CodeQL will flag this
    public static void searchUser(String username) throws Exception {
        Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        Statement stmt = conn.createStatement();
        // Unsanitised input directly concatenated into SQL query
        String query = "SELECT * FROM users WHERE username = '" + username + "'";
        stmt.executeQuery(query);
    }
}
