package com.pragyan.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
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
import javafx.animation.ScaleTransition;
import javafx.util.Duration;
public class RBAC extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        ImageView bg = new ImageView(new Image("assets/images/loginBG.png"));
        bg.setFitWidth(1540);
        bg.setFitHeight(850);
        bg.setPreserveRatio(false);
        bg.setOpacity(0.92);
        bg.setEffect(new GaussianBlur(1.5));

        Region overlay = new Region();
        overlay.setPrefSize(1540, 850);
        overlay.setStyle(
            "-fx-background-color: rgba(0,0,0,0.40);"
        );

        ImageView logo = new ImageView(new Image(getClass().getResourceAsStream("/assets/icons/icon.png")));
        logo.setFitWidth(90);
        logo.setFitHeight(90);


        Text title = new Text("FRAUDSHIELD AI");
        title.setStyle(
                "-fx-fill:white;" +
                "-fx-font-size:38;" +
                "-fx-font-weight:bold;" +
                "-fx-letter-spacing:2px;"
        );
        Text subtitle = new Text("ENTERPRISE CYBER • THREAT NEUTRALIZATION");
        subtitle.setStyle(
                "-fx-fill:#B0B0B0;" +
                "-fx-font-size:16;"
        );

        Text heading = new Text("Select Your Access Level");
        heading.setStyle(
                "-fx-fill:white;" +
                "-fx-font-size:34;" +
                "-fx-font-weight:bold;"
        );

        Text description = new Text("Please choose the operational profile that corresponds\n" +"to your organizational duties to initialize the secure session.");
        description.setTextAlignment(TextAlignment.CENTER);
        description.setStyle(
                "-fx-fill:#A8A8A8;" +
                "-fx-font-size:18;"
        );

        VBox header = new VBox(10);
        header.setAlignment(Pos.CENTER);
        header.getChildren().addAll( logo,title,subtitle,heading,description);

        
       
        VBox adminCard = createRoleCard(
        "/assets/icons/adminIcon.png",
        "Admin",
        "Full system configuration and user management.",
        "Manage User Nodes",
        "Global Audit Logs",
        "Continue"
        );

        VBox analystCard = createRoleCard(
        "/assets/icons/analystIcon.png",
        "Fraud Analyst",
        "Real-time threat detection and AI investigation.",
        "Investigation Suite",
        "AI Threat Insights",
        "Continue"
        );

        VBox supportCard = createRoleCard(
        "/assets/icons/supportIcon.png",
        "Customer Support",
        "Account verification and dispute resolution.",
        "User Lookup Tools",
        "Dispute Resolution",
        "Continue"
        );
        

        HBox hb = new HBox(35);
        hb.getChildren().addAll(adminCard,analystCard,supportCard);
        hb.setAlignment(Pos.CENTER);

        Region gap = new Region();
        gap.setPrefHeight(25);


        VBox glassBox = new VBox(35);
        glassBox.setAlignment(Pos.TOP_CENTER);
        glassBox.setMaxWidth(1280);
        glassBox.setPrefHeight(760);
        glassBox.setPadding(new Insets(45));
       glassBox.setStyle(
    "-fx-background-color: rgba(10,10,20,0.18);" +   // more transparent
    "-fx-background-radius:30;" +
    "-fx-border-color: rgba(180,120,255,0.45);" +
    "-fx-border-width:1.2;" +
    "-fx-border-radius:30;"
);
        glassBox.getChildren().addAll(
                header,
                gap,
                hb
        );
        DropShadow outer = new DropShadow();
        outer.setRadius(18);
        outer.setSpread(0.08);
        outer.setColor(Color.web("#8B5CF6"));
        glassBox.setEffect(outer);

        glassBox.setMaxWidth(1100);
        glassBox.setMaxHeight(650);
        glassBox.setAlignment(Pos.TOP_CENTER);
        glassBox.setPadding(new Insets(35,40,35,40));
        DropShadow glow = new DropShadow();
        glow.setRadius(55);
        glow.setSpread(0.05);
        glow.setOffsetX(0);
        glow.setOffsetY(0);
        glow.setColor(Color.rgb(168,85,247,0.25));
        glassBox.setEffect(glow);

        
        StackPane container = new StackPane( glassBox);
        container.setAlignment(Pos.CENTER);

        StackPane root = new StackPane();
        root.getChildren().addAll(bg,overlay, container);
       
        Scene scene = new Scene(root,1540,850);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FraudShield AI");
        primaryStage.show();

    }

    private VBox createRoleCard(String iconPath,String title,String desc,String feature1,String feature2,String buttonText) {

    ImageView icon = new ImageView(new Image(getClass().getResourceAsStream(iconPath)));
    icon.setFitWidth(70);
    icon.setFitHeight(70);

    StackPane iconBox = new StackPane(icon);
    iconBox.setPrefSize(90,90);
    iconBox.setStyle(
            "-fx-background-color: rgba(18,18,28,0.80);" +
            "-fx-background-radius:18;" +
            "-fx-border-color:#7C3AED;" +
            "-fx-border-radius:18;"
    );

    Text titleText = new Text(title);
    titleText.setStyle(
            "-fx-fill:white;" +
            "-fx-font-size:28;" +
            "-fx-font-weight:bold;"
    );



    Text description = new Text(desc);
    description.setWrappingWidth(270);
    description.setTextAlignment(TextAlignment.CENTER);

    description.setStyle(
            "-fx-fill:#BEBEBE;" +
            "-fx-font-size:15;"
    );



    Text tick1 = new Text("✓  " + feature1);
    tick1.setStyle("-fx-fill:#CFCFCF;-fx-font-size:16;");

    Text tick2 = new Text("✓  " + feature2);
    tick2.setStyle("-fx-fill:#CFCFCF;-fx-font-size:16;");



    VBox featureBox = new VBox(12);
    featureBox.setAlignment(Pos.CENTER_LEFT);
    featureBox.getChildren().addAll(tick1,tick2);



    Button button = new Button(buttonText);
    ScaleTransition hoverIn = new ScaleTransition(Duration.millis(150), button);
    hoverIn.setToX(1.05);
    hoverIn.setToY(1.05);

    ScaleTransition hoverOut = new ScaleTransition(Duration.millis(150), button);
    hoverOut.setToX(1.0);
    hoverOut.setToY(1.0);

    ScaleTransition press = new ScaleTransition(Duration.millis(80), button);
    press.setToX(0.96);
    press.setToY(0.96);

    ScaleTransition release = new ScaleTransition(Duration.millis(100), button);
    release.setToX(1.05);
    release.setToY(1.05);

    button.setOnMouseEntered(e -> hoverIn.playFromStart());
    button.setOnMouseExited(e -> hoverOut.playFromStart());
    button.setOnMousePressed(e -> press.playFromStart());
    button.setOnMouseReleased(e -> release.playFromStart());
    button.setCursor(Cursor.HAND);

    button.setPrefWidth(280);
    button.setPrefHeight(48);

    button.setStyle(
            "-fx-background-color:linear-gradient(#8B5CF6,#A855F7);" +
            "-fx-background-radius:12;" +
            "-fx-text-fill:white;" +
            "-fx-font-size:16;" +
            "-fx-font-weight:bold;"
    );



    VBox card = new VBox(16);

    card.setAlignment(Pos.TOP_CENTER);

    card.setPadding(new Insets(35));

    card.setPrefSize(340,430);

    card.setStyle(
            "-fx-background-color:rgba(22,22,34,0.96);" +
            "-fx-background-radius:25;" +
            "-fx-border-radius:25;" +
            "-fx-border-color:#5B21B6;" +
            "-fx-border-width:1;"
    );

    DropShadow glow = new DropShadow();
    glow.setRadius(10);
    glow.setSpread(0.15);
    glow.setColor(Color.web("#7C3AED"));
    card.setEffect(glow);
    card.getChildren().addAll(
            iconBox,
            titleText,
            description,
            featureBox,
            button
    );
    card.setOnMouseEntered(e -> {
    card.setScaleX(1.03);
    card.setScaleY(1.03);
});

card.setOnMouseExited(e -> {
    card.setScaleX(1);
    card.setScaleY(1);
});

    return card;
}
    
}
