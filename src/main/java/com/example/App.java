package com.example;

public class App {

    // ===== FAKE SECRETS FOR GITLEAKS TESTING =====
    
    // AWS Credentials
    private static final String AWS_ACCESS_KEY = "AKIAIOSFODNN7EXAMPLE";
    private static final String AWS_SECRET_KEY = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";

    // Database Credentials
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/mydb";
    private static final String DB_USER = "admin";
    private static final String DB_PASSWORD = "Admin@123#";

    // API Keys
    private static final String STRIPE_API_KEY = "sk_live_51JqX2XKb2JX9pQw3Z8X1Y2Z";
    private static final String TWILIO_AUTH_TOKEN = "SK1234567890abcdef1234567890abcdef";

    public static void main(String[] args) {
        System.out.println("Starting application...");
        
        // Simulate using credentials
        connectToDatabase(DB_URL, DB_USER, DB_PASSWORD);
        processPayment(STRIPE_API_KEY);
    }

    private static void connectToDatabase(String url, String user, String password) {
        System.out.println("[DB] Connecting to: " + url);
        System.out.println("[DB] User: " + user);
        // Fake connection logic
    }

    private static void processPayment(String apiKey) {
        System.out.println("[Payment] Processing with key: " + maskKey(apiKey));
    }

    private static String maskKey(String key) {
        return key.substring(0, 8) + "****" + key.substring(key.length() - 4);
    }
}
