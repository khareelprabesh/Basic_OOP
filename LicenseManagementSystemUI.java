// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.ArrayList;
// import java.util.List;

// // User Class
// class User {
//     private String userID;
//     private String name;
//     private String role; // "admin" or "normal"
//     private String email;
//     private String citizenshipNumber;
//     private String password;

//     public User(String userID, String name, String role, String email, String citizenshipNumber, String password) {
//         this.userID = userID;
//         this.name = name;
//         this.role = role;
//         this.email = email;
//         this.citizenshipNumber = citizenshipNumber;
//         this.password = password;
//     }

//     // Getters and Setters
//     public String getUserID() { return userID; }
//     public String getName() { return name; }
//     public String getRole() { return role; }
//     public String getEmail() { return email; }
//     public String getCitizenshipNumber() { return citizenshipNumber; }
//     public String getPassword() { return password; }

//     // Login Method
//     public boolean login(String email, String password) {
//         return this.email.equals(email) && this.password.equals(password);
//     }
// }

// // Admin Class (Inherits User)
// class Admin extends User {
//     public Admin(String userID, String name, String email, String citizenshipNumber, String password) {
//         super(userID, name, "admin", email, citizenshipNumber, password);
//     }

//     // Approve Application
//     public void approveApplication(Application app) {
//         app.setStatus("approved");
//         System.out.println("Application " + app.getApplicationID() + " approved.");
//     }

//     // Reject Application
//     public void rejectApplication(Application app) {
//         app.setStatus("rejected");
//         System.out.println("Application " + app.getApplicationID() + " rejected.");
//     }

//     // Generate Report
//     public void generateReport(List<Application> applications) {
//         StringBuilder report = new StringBuilder("=== License Application Report ===\n");
//         for (Application app : applications) {
//             report.append("Application ID: ").append(app.getApplicationID()).append(", Status: ").append(app.getStatus()).append("\n");
//         }
//         JOptionPane.showMessageDialog(null, report.toString());
//     }
// }

// // NormalUser Class (Inherits User)
// class NormalUser extends User {
//     public NormalUser(String userID, String name, String email, String citizenshipNumber, String password) {
//         super(userID, name, "normal", email, citizenshipNumber, password);
//     }

//     // Apply for License
//     public void applyForLicense(String category, List<Application> applications) {
//         String applicationID = "APP" + (applications.size() + 1);
//         applications.add(new Application(applicationID, this.getUserID(), category, "pending"));
//         JOptionPane.showMessageDialog(null, "Application submitted for category: " + category);
//     }

//     // Check Application Status
//     public void checkStatus(String applicationID, List<Application> applications) {
//         for (Application app : applications) {
//             if (app.getApplicationID().equals(applicationID)) {
//                 JOptionPane.showMessageDialog(null, "Status of Application " + applicationID + ": " + app.getStatus());
//                 return;
//             }
//         }
//         JOptionPane.showMessageDialog(null, "Application not found.");
//     }
// }

// // License Class
// class License {
//     private String licenseID;
//     private String category;
//     private String issueDate;
//     private String expiryDate;

//     public License(String licenseID, String category, String issueDate, String expiryDate) {
//         this.licenseID = licenseID;
//         this.category = category;
//         this.issueDate = issueDate;
//         this.expiryDate = expiryDate;
//     }

//     // Getters
//     public String getLicenseID() { return licenseID; }
//     public String getCategory() { return category; }
//     public String getIssueDate() { return issueDate; }
//     public String getExpiryDate() { return expiryDate; }
// }

// // Application Class
// class Application {
//     private String applicationID;
//     private String userID;
//     private String requestedCategory;
//     private String status; // "pending", "approved", "rejected"

//     public Application(String applicationID, String userID, String requestedCategory, String status) {
//         this.applicationID = applicationID;
//         this.userID = userID;
//         this.requestedCategory = requestedCategory;
//         this.status = status;
//     }

//     // Getters and Setters
//     public String getApplicationID() { return applicationID; }
//     public String getUserID() { return userID; }
//     public String getRequestedCategory() { return requestedCategory; }
//     public String getStatus() { return status; }
//     public void setStatus(String status) { this.status = status; }
// }

// // Main UI Class
// public class LicenseManagementSystemUI extends JFrame {
//     private static List<User> users = new ArrayList<>();
//     private static List<Application> applications = new ArrayList<>();
//     private static List<License> licenses = new ArrayList<>();
//     private static User currentUser = null;

//     public LicenseManagementSystemUI() {
//         setTitle("License Management System");
//         setSize(400, 300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);

//         // Main Panel
//         JPanel mainPanel = new JPanel(new BorderLayout());
//         JLabel titleLabel = new JLabel("Welcome to License Management System", SwingConstants.CENTER);
//         mainPanel.add(titleLabel, BorderLayout.NORTH);

//         // Buttons
//         JPanel buttonPanel = new JPanel(new GridLayout(3, 1));
//         JButton registerButton = new JButton("Register");
//         JButton loginButton = new JButton("Login");
//         JButton exitButton = new JButton("Exit");

//         buttonPanel.add(registerButton);
//         buttonPanel.add(loginButton);
//         buttonPanel.add(exitButton);
//         mainPanel.add(buttonPanel, BorderLayout.CENTER);

//         // Add Action Listeners
//         registerButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 registerUser();
//             }
//         });

//         loginButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 loginUser();
//             }
//         });

//         exitButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 System.exit(0);
//             }
//         });

//         add(mainPanel);
//     }

//     // User Registration
//     private void registerUser() {
//         JTextField userIDField = new JTextField();
//         JTextField nameField = new JTextField();
//         JTextField roleField = new JTextField();
//         JTextField emailField = new JTextField();
//         JTextField citizenshipField = new JTextField();
//         JPasswordField passwordField = new JPasswordField();

//         Object[] fields = {
//                 "User ID:", userIDField,
//                 "Name:", nameField,
//                 "Role (admin/normal):", roleField,
//                 "Email:", emailField,
//                 "Citizenship Number:", citizenshipField,
//                 "Password:", passwordField
//         };

//         int option = JOptionPane.showConfirmDialog(null, fields, "Register", JOptionPane.OK_CANCEL_OPTION);
//         if (option == JOptionPane.OK_OPTION) {
//             String userID = userIDField.getText();
//             String name = nameField.getText();
//             String role = roleField.getText();
//             String email = emailField.getText();
//             String citizenshipNumber = citizenshipField.getText();
//             String password = new String(passwordField.getPassword());

//             User user;
//             if (role.equalsIgnoreCase("admin")) {
//                 user = new Admin(userID, name, email, citizenshipNumber, password);
//             } else {
//                 user = new NormalUser(userID, name, email, citizenshipNumber, password);
//             }
//             users.add(user);
//             JOptionPane.showMessageDialog(null, "User registered successfully.");
//         }
//     }

//     // User Login
//     private void loginUser() {
//         JTextField emailField = new JTextField();
//         JPasswordField passwordField = new JPasswordField();

//         Object[] fields = {
//                 "Email:", emailField,
//                 "Password:", passwordField
//         };

//         int option = JOptionPane.showConfirmDialog(null, fields, "Login", JOptionPane.OK_CANCEL_OPTION);
//         if (option == JOptionPane.OK_OPTION) {
//             String email = emailField.getText();
//             String password = new String(passwordField.getPassword());

//             for (User user : users) {
//                 if (user.login(email, password)) {
//                     currentUser = user;
//                     JOptionPane.showMessageDialog(null, "Login successful. Welcome, " + user.getName() + "!");
//                     if (user.getRole().equals("admin")) {
//                         adminDashboard();
//                     } else {
//                         normalUserDashboard();
//                     }
//                     return;
//                 }
//             }
//             JOptionPane.showMessageDialog(null, "Invalid email or password.");
//         }
//     }

//     // Admin Dashboard
//     private void adminDashboard() {
//         Admin admin = (Admin) currentUser;
//         while (true) {
//             String[] options = {"View Applications", "Approve Application", "Reject Application", "Generate Report", "Logout"};
//             int choice = JOptionPane.showOptionDialog(null, "Admin Dashboard", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

//             switch (choice) {
//                 case 0:
//                     StringBuilder apps = new StringBuilder("=== Applications ===\n");
//                     for (Application app : applications) {
//                         apps.append("Application ID: ").append(app.getApplicationID()).append(", Category: ").append(app.getRequestedCategory()).append(", Status: ").append(app.getStatus()).append("\n");
//                     }
//                     JOptionPane.showMessageDialog(null, apps.toString());
//                     break;
//                 case 1:
//                     String appID = JOptionPane.showInputDialog("Enter Application ID to approve:");
//                     Application app = findApplication(appID);
//                     if (app != null) {
//                         admin.approveApplication(app);
//                     } else {
//                         JOptionPane.showMessageDialog(null, "Application not found.");
//                     }
//                     break;
//                 case 2:
//                     appID = JOptionPane.showInputDialog("Enter Application ID to reject:");
//                     app = findApplication(appID);
//                     if (app != null) {
//                         admin.rejectApplication(app);
//                     } else {
//                         JOptionPane.showMessageDialog(null, "Application not found.");
//                     }
//                     break;
//                 case 3:
//                     admin.generateReport(applications);
//                     break;
//                 case 4:
//                     currentUser = null;
//                     return;
//                 default:
//                     break;
//             }
//         }
//     }

//     // Normal User Dashboard
//     private void normalUserDashboard() {
//         NormalUser normalUser = (NormalUser) currentUser;
//         while (true) {
//             String[] options = {"Apply for License", "Check Application Status", "Logout"};
//             int choice = JOptionPane.showOptionDialog(null, "Normal User Dashboard", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

//             switch (choice) {
//                 case 0:
//                     String category = JOptionPane.showInputDialog("Enter License Category:");
//                     normalUser.applyForLicense(category, applications);
//                     break;
//                 case 1:
//                     String appID = JOptionPane.showInputDialog("Enter Application ID:");
//                     normalUser.checkStatus(appID, applications);
//                     break;
//                 case 2:
//                     currentUser = null;
//                     return;
//                 default:
//                     break;
//             }
//         }
//     }

//     // Helper Method to Find Application by ID
//     private Application findApplication(String appID) {
//         for (Application app : applications) {
//             if (app.getApplicationID().equals(appID)) {
//                 return app;
//             }
//         }
//         return null;
//     }

//     // Main Method
//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 new LicenseManagementSystemUI().setVisible(true);
//             }
//         });
//     }
// }

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

// Enhanced License Management System UI
public class LicenseManagementSystemUI extends JFrame {
    private static List<User> users = new ArrayList<>();
    private static List<Application> applications = new ArrayList<>();
    private static User currentUser = null;

    public LicenseManagementSystemUI() {
        setTitle("License Management System");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(44, 62, 80));
        
        JLabel titleLabel = new JLabel("License Management System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setForeground(Color.WHITE);
        mainPanel.add(titleLabel, BorderLayout.NORTH);
        
        JPanel buttonPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        buttonPanel.setBackground(new Color(44, 62, 80));
        
        JButton registerButton = createStyledButton("Register");
        JButton loginButton = createStyledButton("Login");
        JButton applyLicenseButton = createStyledButton("Apply for License");
        JButton exitButton = createStyledButton("Exit");

        buttonPanel.add(registerButton);
        buttonPanel.add(loginButton);
        buttonPanel.add(applyLicenseButton);
        buttonPanel.add(exitButton);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        registerButton.addActionListener(e -> registerUser());
        loginButton.addActionListener(e -> loginUser());
        applyLicenseButton.addActionListener(e -> applyForLicense());
        exitButton.addActionListener(e -> System.exit(0));

        add(mainPanel);
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setBackground(new Color(52, 152, 219));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        return button;
    }

    private void registerUser() {
        JTextField nameField = new JTextField();
        JTextField roleField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField citizenshipField = new JTextField();
        JTextField ageField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        Object[] fields = {
                "Name:", nameField,
                "Role (admin/normal):", roleField,
                "Email:", emailField,
                "Citizenship Number:", citizenshipField,
                "Age:", ageField,
                "Password:", passwordField
        };

        int option = JOptionPane.showConfirmDialog(null, fields, "Register", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String name = nameField.getText();
            String role = roleField.getText();
            String email = emailField.getText();
            String citizenshipNumber = citizenshipField.getText();
            int age = Integer.parseInt(ageField.getText());
            String password = new String(passwordField.getPassword());

            User user = role.equalsIgnoreCase("admin") ? new Admin(name, email, citizenshipNumber, age, password) : new NormalUser(name, email, citizenshipNumber, age, password);
            users.add(user);
            JOptionPane.showMessageDialog(null, "User registered successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void loginUser() {
        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        Object[] fields = {
                "Email:", emailField,
                "Password:", passwordField
        };

        int option = JOptionPane.showConfirmDialog(null, fields, "Login", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());

            for (User user : users) {
                if (user.login(email, password)) {
                    currentUser = user;
                    JOptionPane.showMessageDialog(null, "Login successful. Welcome, " + user.getName() + "!");
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Invalid email or password.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void applyForLicense() {
        if (currentUser == null) {
            JOptionPane.showMessageDialog(null, "Please login first!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (currentUser.getAge() < 18) {
            JOptionPane.showMessageDialog(null, "You must be at least 18 years old to apply for a license!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JTextField categoryField = new JTextField();
        Object[] fields = {
                "License Category (A, B, C, etc.):", categoryField
        };

        int option = JOptionPane.showConfirmDialog(null, fields, "Apply for License", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String category = categoryField.getText();
            applications.add(new Application(currentUser.getName(), category, "Pending"));
            JOptionPane.showMessageDialog(null, "License application submitted!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LicenseManagementSystemUI().setVisible(true));
    }
}

class User {
    private String name;
    private String email;
    private String citizenshipNumber;
    private int age;
    private String password;

    public User(String name, String email, String citizenshipNumber, int age, String password) {
        this.name = name;
        this.email = email;
        this.citizenshipNumber = citizenshipNumber;
        this.age = age;
        this.password = password;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }
}

class Admin extends User {
    public Admin(String name, String email, String citizenshipNumber, int age, String password) {
        super(name, email, citizenshipNumber, age, password);
    }
}

class NormalUser extends User {
    public NormalUser(String name, String email, String citizenshipNumber, int age, String password) {
        super(name, email, citizenshipNumber, age, password);
    }
}

class Application {
    private String userName;
    private String category;
    private String status;

    public Application(String userName, String category, String status) {
        this.userName = userName;
        this.category = category;
        this.status = status;
    }
}
