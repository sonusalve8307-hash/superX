package com.pragyan.view;

import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class LandingPage extends Application {

    

    @Override
    public void start(Stage primaryStage) {
        Image bg = new Image("assets/images/background.png");
        ImageView background = new ImageView(bg);
        background.setFitWidth(1280);
        background.setFitHeight(720);
        background.setPreserveRatio(false);

        Image logo = new Image("assets/icons/icon.png");
        ImageView logoView = new ImageView(logo);
        logoView.setFitWidth(220);
        logoView.setFitHeight(220);
        logoView.setPreserveRatio(true);

        Text title = new Text("FraudSheild AI");
        title.setStyle("-fx-font-size: 50px; -fx-fill: white; -fx-font-weight: bold;");

        Text subtitle = new Text("AI powered fraud detection and prevention");
        subtitle.setStyle("-fx-font-size: 20px; -fx-fill: #C8C8C8;");

        Text tagline = new Text("Detection. Prevention. Protection.");
        tagline.setStyle("-fx-font-size: 24px; -fx-fill: #A855F7;-fx-font-weight: bold;");


        ImageView f1 = new ImageView(new Image("assets/icons/AI_SHEILD.png"));
        f1.setFitWidth(95);
        f1.setFitHeight(95);
        Text f1Text = new Text("AI\nFraud");
        f1Text.setTextAlignment(TextAlignment.CENTER);
        f1Text.setStyle("-fx-font-size: 15px; -fx-fill: white;-fx-font-family: 'Segoe UI';");
        VBox f1Box = new VBox(10);
        f1Box.setAlignment(Pos.CENTER);
        f1Box.setStyle("-fx-background-color: rgba(255, 255, 255, 0.1); -fx-padding: 18px; -fx-border-radius: 20px; -fx-background-radius: 20px;-fx-border-color: rgba(168, 85, 247, 0.35); -fx-border-width: 1px;");
        f1Box.getChildren().addAll(f1, f1Text);

        ImageView f2 = new ImageView(new Image("assets/icons/ID_Protection.png"));
        f2.setFitWidth(95);
        f2.setFitHeight(95);
        Text f2Text = new Text("Identity\nProtection");
        f2Text.setTextAlignment(TextAlignment.CENTER);
        f2Text.setStyle("-fx-font-size: 15px; -fx-fill: white;-fx-font-family: 'Segoe UI';");
        VBox f2Box = new VBox(10);
        f2Box.setAlignment(Pos.CENTER);
        f2Box.setStyle("-fx-background-color: rgba(255, 255, 255, 0.1); -fx-padding: 18px; -fx-border-radius: 20px; -fx-background-radius: 20px;-fx-border-color: rgba(168, 85, 247, 0.35); -fx-border-width: 1px;");
        f2Box.getChildren().addAll(f2, f2Text);

        ImageView f3 = new ImageView(new Image("assets/icons/Phishing_Protection.png"));
        f3.setFitWidth(95);
        f3.setFitHeight(95);
        Text f3Text = new Text("Phishing\nProtection");
        f3Text.setTextAlignment(TextAlignment.CENTER);
        f3Text.setStyle("-fx-font-size: 15px; -fx-fill: white;-fx-font-family: 'Segoe UI';");
        VBox f3Box = new VBox(10);
        f3Box.setAlignment(Pos.CENTER);
        f3Box.setStyle("-fx-background-color: rgba(255, 255, 255, 0.1); -fx-padding: 18px; -fx-border-radius: 20px; -fx-background-radius: 20px;-fx-border-color: rgba(168, 85, 247, 0.35); -fx-border-width: 1px;");
        f3Box.getChildren().addAll(f3, f3Text);

        ImageView f4 = new ImageView(new Image("assets/icons/realtime_monitoring.png"));
        f4.setFitWidth(95);
        f4.setFitHeight(95);
        Text f4Text = new Text("Real-time\nMonitoring");
        f4Text.setTextAlignment(TextAlignment.CENTER);
        f4Text.setStyle("-fx-font-size: 15px; -fx-fill: white;-fx-font-family: 'Segoe UI';");
        VBox f4Box = new VBox(10);
        f4Box.setAlignment(Pos.CENTER);
        f4Box.setStyle("-fx-background-color: rgba(255, 255, 255, 0.1); -fx-padding: 18px; -fx-border-radius: 20px; -fx-background-radius: 20px;-fx-border-color: rgba(168, 85, 247, 0.35); -fx-border-width: 1px;");
        f4Box.getChildren().addAll(f4, f4Text);

        ImageView f5 = new ImageView(new Image("assets/icons/Secure_Network.png"));
        f5.setFitWidth(95);
        f5.setFitHeight(95);
        Text f5Text = new Text("Secure\nNetwork");
        f5Text.setTextAlignment(TextAlignment.CENTER);
        f5Text.setStyle("-fx-font-size: 15px; -fx-fill: white;-fx-font-family: 'Segoe UI';");
        VBox f5Box = new VBox(10);
        f5Box.setAlignment(Pos.CENTER);
        f5Box.setStyle("-fx-background-color: rgba(255, 255, 255, 0.1); -fx-padding: 18px; -fx-border-radius: 20px; -fx-background-radius: 20px;-fx-border-color: rgba(168, 85, 247, 0.35); -fx-border-width: 1px;");
        f5Box.getChildren().addAll(f5, f5Text);

        DropShadow shadow = new DropShadow();
        shadow.setRadius(15);
        shadow.setSpread(0.15);
        shadow.setColor(Color.rgb(124,58,237,0.45));
        f1Box.setEffect(shadow);
        f2Box.setEffect(shadow);
        f3Box.setEffect(shadow);
        f4Box.setEffect(shadow);
        f5Box.setEffect(shadow);

        Text lodingText = new Text("Initializing AI Engine...");
        lodingText.setStyle("-fx-font-size: 18px; -fx-fill: white;-fx-font-family: 'Segoe UI';-fx-font-weight: bold;");

        ProgressBar progress = new ProgressBar();
        progress.setPrefWidth(380);
        progress.setPrefHeight(10);
        progress.setProgress(0.0);

        Text percentage = new Text("0%");
        percentage.setStyle("-fx-fill:#A855F7;-fx-font-size:18px;-fx-font-weight:bold;");
        
        VBox loadingBox = new VBox(10);
        loadingBox.setAlignment(Pos.CENTER);
        loadingBox.getChildren().addAll(lodingText, progress, percentage);

        HBox featureBox = new HBox();
        featureBox.setAlignment(Pos.CENTER);
        featureBox.setSpacing(35);
        featureBox.getChildren().addAll(f1Box, f2Box, f3Box, f4Box, f5Box);


        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        Region spacer = new Region();
        spacer.setPrefHeight(20);
        vbox.getChildren().addAll(logoView, title, subtitle, tagline ,spacer, featureBox, loadingBox);
        vbox.setTranslateY(-40);

       
        StackPane gr = new StackPane();
        gr.getChildren().addAll(background, vbox);

        Scene scene = new Scene(gr, 1280, 720);

        primaryStage.setTitle("FraudShield AI");
        primaryStage.setScene(scene);
        primaryStage.show();

        Timeline timeline = new Timeline(
            new KeyFrame(Duration.millis(40), e -> {
                double value = progress.getProgress();
                if (value < 1.0) {
                    value += 0.01;
                    progress.setProgress(value);
                    percentage.setText((int)(value * 100) + "%");
                } 
            })
        );
        timeline.setCycleCount(100);
        timeline.play();
        
    }
}
