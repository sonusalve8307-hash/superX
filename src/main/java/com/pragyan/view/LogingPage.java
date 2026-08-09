package com.pragyan.view;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class LogingPage extends Application {

    @Override
    public void start(Stage primaryStage) {

        Image bg = new Image("assets/images/loginBG.png");
        ImageView bgView = new ImageView(bg);
        bgView.setFitWidth(1280);
        bgView.setFitHeight(720);
        bgView.setPreserveRatio(false);

        Text title1 = new Text("FraudShield AI");
        title1.setStyle("-fx-font-size: 25; -fx-fill: white; -fx-font-weight: bold;");

        Text title2 = new Text("Detection. Prevention. Protection.");
        title2.setStyle("-fx-font-size: 15; -fx-fill: #A855F7;-fx-font-weight: bold;");

        VBox title =new VBox();
        title.setAlignment(Pos.CENTER_LEFT);
        title.setSpacing(5);
        title.getChildren().addAll(title1, title2);

        ImageView logo = new ImageView(new Image("assets/icons/icon.png"));
        logo.setFitWidth(150);
        logo.setFitHeight(150);
        logo.setPreserveRatio(true);

        HBox logoBox = new HBox();
        logoBox.setAlignment(Pos.CENTER);
        logoBox.setSpacing(10);
        logoBox.getChildren().addAll(logo, title);


        ImageView icon = new ImageView(new Image("assets/icons/user_icon.png"));
        icon.setFitWidth(100);
        icon.setFitHeight(100);
        icon.setPreserveRatio(true);  
        
        Text welcomeText = new Text("Welcome");
        welcomeText.setStyle("-fx-font-size: 26; -fx-fill: white; -fx-font-weight: bold;");

        Label welcomeLabel = new Label("sign in to continue to FraudShield AI");
        welcomeLabel.setStyle("-fx-font-size: 16; -fx-text-fill: #CFC5F7;");

        VBox welcomeBox = new VBox();
        welcomeBox.setAlignment(Pos.CENTER);
        welcomeBox.setSpacing(5);
        welcomeBox.getChildren().addAll(icon, welcomeText, welcomeLabel);


        ImageView username = new ImageView(new Image("assets/icons/userIcon.png"));
        username.setFitWidth(40);
        username.setFitHeight(40);


        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");
        usernameField.setPrefSize(320, 48);
        usernameField.setStyle("-fx-background-color: transparent;-fx-text-fill: white;-fx-prompt-text-fill: #9F8CCF;-fx-font-size: 15px;-fx-background-insets: 0;-fx-border-width: 0;");

        HBox usernameBox = new HBox(10);
        usernameBox.setAlignment(Pos.CENTER_LEFT);
        usernameBox.setPadding(new Insets(0,15,0,15));
        usernameBox.setPrefHeight(52);
        usernameBox.setStyle(
            "-fx-background-color: rgba(255,255,255,0.06);" +
            "-fx-background-radius: 14;" +
            "-fx-border-color: #7C3AED;" +
            "-fx-border-radius: 14;"
        );
        usernameBox.getChildren().addAll(username, usernameField);


        ImageView password = new ImageView(new Image("assets/icons/lock.png"));
        password.setFitWidth(30);
        password.setFitHeight(30);
        password.setPreserveRatio(true);

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("password");
        passwordField.setPrefHeight(48);
        passwordField.setStyle(
            "-fx-background-color: transparent;" +
            "-fx-text-fill: white;" +
            "-fx-prompt-text-fill: #9F8CCF;" +
            "-fx-font-size: 15px;" +
            "-fx-background-insets: 0;" +
            "-fx-border-width: 0;" +
            "-fx-padding:0 0 0 10;"
        );
        
        HBox passBox = new HBox(10);
        passBox.setAlignment(Pos.CENTER_LEFT);
        passBox.setPadding(new Insets(0,15,0,15));

        passBox.setPrefHeight(58);
        passBox.setStyle(
        "-fx-background-color: rgba(255,255,255,0.06);" +
        "-fx-background-radius: 14;" +
        "-fx-border-color: #7C3AED;" +
        "-fx-border-radius: 14;"
        );
        passBox.getChildren().addAll(password, passwordField);


        CheckBox check1 = new CheckBox("Remember Me");
        check1.setStyle(
            "-fx-text-fill: white;" +
            "-fx-font-size: 14px;-fx-mark-color: #A855F7"
        );

        Label label = new Label("Forget PassWord?");
        label.setStyle(
            "-fx-text-fill: #A855F7;" +
            "-fx-font-size: 14px;" +
            "-fx-font-weight: bold;"
        );
        label.setOnMouseEntered(e ->
            label.setStyle(
            "-fx-text-fill:#C084FC;" +
            "-fx-underline:true;" +
            "-fx-font-size:14;"
         )
        );

        label.setOnMouseExited(e ->
                label.setStyle(
                "-fx-text-fill:#A855F7;" +
                "-fx-font-size:14;"
                )
            );

        Region rememberSpacer = new Region();
        HBox.setHgrow(rememberSpacer, Priority.ALWAYS);
        HBox rememberBox = new HBox();
        rememberBox.setAlignment(Pos.CENTER_LEFT);
        rememberBox.getChildren().addAll(
        check1,
        rememberSpacer,
        label
        );


        Button sigButton = new Button("Sign In");
        sigButton.setPrefWidth(380);
        sigButton.setPrefHeight(48);
        sigButton.setStyle(
            "-fx-background-color: linear-gradient(to right, #7C3AED, #A855F7);" +
            "-fx-background-radius: 15;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 16px;" +
            "-fx-font-weight: bold;" +
            "-fx-cursor: hand;"
        );
        sigButton.setOnMouseEntered(e ->
        sigButton.setStyle(
            "-fx-background-color: linear-gradient(to right, #8B5CF6, #C084FC);" +
            "-fx-background-radius: 15;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 16px;" +
            "-fx-font-weight: bold;" +
            "-fx-cursor: hand;"
        )
        );
        sigButton.setOnMouseExited(e ->
        sigButton.setStyle(
        "-fx-background-color: linear-gradient(to right, #7C3AED, #A855F7);" +
        "-fx-background-radius: 15;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 16px;" +
        "-fx-font-weight: bold;" +
        "-fx-cursor: hand;"
        )
        );
        sigButton.setOnMousePressed(e -> {
            sigButton.setScaleX(0.97);
            sigButton.setScaleY(0.97);
        });
        sigButton.setOnMouseReleased(e -> {
            sigButton.setScaleX(1);
            sigButton.setScaleY(1);
        });


        Separator left = new Separator();
        Separator right = new Separator();
        Label orLabel = new Label("OR CONTINUE WITH");
        orLabel.setStyle(
            "-fx-text-fill:#9F8CCF;" +
            "-fx-font-size:12;" +
            "-fx-font-weight:bold;"
        );
        HBox.setHgrow(left, Priority.ALWAYS);
        HBox.setHgrow(right, Priority.ALWAYS);
        HBox divider = new HBox(10);
        divider.setAlignment(Pos.CENTER);
        divider.getChildren().addAll(left, orLabel, right);


        ImageView google = new ImageView(new Image("assets/icons/google.png"));
        google.setFitHeight(20);
        google.setFitWidth(20);

        ImageView ms = new ImageView(new Image("assets/icons/ms.png"));
        ms.setFitHeight(20);
        ms.setFitWidth(20);

        Button googleButton = new Button("Google", google);
        Button msButton = new Button("Microsoft",ms);

        String socialStyle =
            "-fx-background-color: rgba(255,255,255,0.05);" +
            "-fx-background-radius: 12;" +
            "-fx-border-color: #7C3AED;" +
            "-fx-border-radius: 12;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 14;" +
            "-fx-font-weight: bold;" +
            "-fx-cursor: hand;";
        googleButton.setStyle(socialStyle);
        msButton.setStyle(socialStyle);

        googleButton.setPrefSize(180, 45);
        msButton.setPrefSize(180, 45);

        HBox socialButtons = new HBox(20);
        socialButtons.setAlignment(Pos.CENTER);
        socialButtons.getChildren().addAll(googleButton,msButton);


        Label accountLabel = new Label("Don't have an account?");
        accountLabel.setStyle(
            "-fx-text-fill: #B8B8B8;" +
            "-fx-font-size: 14px;"
        );
        Label signUpLabel = new Label("Sign Up");
        signUpLabel.setStyle(
            "-fx-text-fill: #A855F7;" +
            "-fx-font-size: 14px;" +
            "-fx-font-weight: bold;" +
            "-fx-cursor: hand;"
        );
        signUpLabel.setOnMouseEntered(e ->
        signUpLabel.setStyle(
            "-fx-text-fill: #C084FC;" +
            "-fx-font-size: 14px;" +
            "-fx-font-weight: bold;" +
            "-fx-underline: true;" +
            "-fx-cursor: hand;"
            )
        );
        signUpLabel.setOnMouseExited(e ->
            signUpLabel.setStyle(
                "-fx-text-fill: #A855F7;" +
                "-fx-font-size: 14px;" +
                "-fx-font-weight: bold;" +
                "-fx-cursor: hand;"
            )
        );
        HBox signUpBox = new HBox(5);
        signUpBox.setAlignment(Pos.CENTER);
        signUpBox.getChildren().addAll( accountLabel, signUpLabel);

        VBox headerBox = new VBox();
        headerBox.setAlignment(Pos.CENTER);
        headerBox.setSpacing(-10);   // adjust between -20 and 5
        headerBox.getChildren().addAll(logoBox, welcomeBox);
        
        VBox loginBox = new VBox(10,headerBox,usernameBox,passBox,rememberBox,sigButton,divider,socialButtons,signUpBox);
        loginBox.setPadding(new Insets(25, 30, 25, 30));
        loginBox.setAlignment(Pos.TOP_CENTER);
        loginBox.setMinSize(450,620);
        loginBox.setPrefSize(450,620);
        loginBox.setMaxSize(450,620);

        

        loginBox.setStyle(
            "-fx-background-color: rgba(22,12,45,0.60);" +
            "-fx-background-radius: 30;" +
            "-fx-border-color: #A855F7;" +
            "-fx-border-radius: 30;" +
            "-fx-border-width: 1;"
        );
        
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        HBox mainLayout = new HBox();
        mainLayout.setPadding(new Insets(0,40,0,40));
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.getChildren().addAll(spacer, loginBox);

        StackPane root = new StackPane();
        root.getChildren().addAll(bgView, mainLayout);

        Scene scene = new Scene(root, 1280, 720);

        primaryStage.setTitle("FraudShield Ai");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
   
    

