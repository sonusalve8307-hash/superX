package com.pragyan.view;

import javafx.animation.ScaleTransition;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;  

public class PortalSelection extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        
        ImageView bg = new ImageView(new Image("assets/images/loginBG.png"));
        bg.setFitWidth(1540);
        bg.setFitHeight(850);
        bg.setPreserveRatio(false);
        bg.setOpacity(1.0);
         bg.setEffect(new GaussianBlur(1.5));

        Text title = new Text("FRAUDSHIELD AI");
        title.setStyle(
        "-fx-fill:white;" +
        "-fx-font-size:38;" +
        "-fx-font-weight:bold;"
        );

        Text subtitle = new Text("Enterprise Cyber • Threat Neutralization • Real-Time Analytics");

        subtitle.setStyle(
        "-fx-fill:#D8D8D8;" +
        "-fx-font-size:18;"
        );


        BorderPane container = new BorderPane();
        container.setMaxWidth(900);
        container.setMaxHeight(700);
        container.setStyle(
            "-fx-background-color:rgba(18,18,30,0.72);" +
            "-fx-background-radius:25;" +
            "-fx-border-radius:25;" +
            "-fx-border-color:#7C3AED;" +
            "-fx-border-width:1;"
        );

        VBox header = new VBox(10);
        header.getChildren().addAll(title,subtitle);
        container.setTop(header);
        header.setAlignment(Pos.CENTER);
        header.setPadding(new Insets(35,0,20,0));


        ImageView customerIcon = new ImageView(
        new Image(getClass().getResourceAsStream("/Assets/Icons/cusIcon.png")));
        customerIcon.setFitWidth(70);
        customerIcon.setFitHeight(70);
        Text customer = new Text("Customer Portal");
        customer.setStyle(
        "-fx-fill:white;" +
        "-fx-font-size:28;" +
        "-fx-font-weight:bold;"
        );
        Region line1 = new Region();
        line1.setPrefSize(90,2);
        line1.setStyle(
        "-fx-background-color:#7C3AED;"
        );
        Text customerInfo = new Text("Secure banking\nTransaction Monitoring\nIdentity Protection");
        customerInfo.setFill(Color.LIGHTGRAY);
        customerInfo.setTextAlignment(TextAlignment.CENTER);
        customerInfo.setWrappingWidth(240);
        customerInfo.setStyle("-fx-font-size:16;-fx-fill:#D0D0D0;");
        Button customerBtn = new Button("Continue");
        customerBtn.setStyle(
        "-fx-background-color:#7C3AED;" +
        "-fx-text-fill:white;" +
        "-fx-font-size:16;" +
        "-fx-background-radius:12;"
        );
        customerBtn.setPrefWidth(240);
        customerBtn.setPrefHeight(50);

        

        VBox customerCard = new VBox(18);
        customerCard.getChildren().addAll(customerIcon,customer,line1,customerInfo,customerBtn);
        customerCard.setAlignment(Pos.TOP_CENTER);
        customerCard.setPadding(new Insets(35,25,25,25));
        customerCard.setPrefSize(330,420);
        customerCard.setStyle(
       "-fx-background-color: rgba(22,22,34,0.94);" +
        "-fx-background-radius:20;" +
        "-fx-border-radius:20;" +
        "-fx-border-color:#6D28D9;" +
        "-fx-border-width:1;"
        );



        ImageView staffIcon = new ImageView(
        new Image(getClass().getResourceAsStream("/Assets/Icons/staffIcon.png")));
        staffIcon.setFitWidth(70);
        staffIcon.setFitHeight(70);
        Text staffTitle = new Text("Staff Portal");
        staffTitle.setStyle(
        "-fx-fill:white;" +
        "-fx-font-size:28;" +
        "-fx-font-weight:bold;"
        );
        Region line2 = new Region();
        line2.setPrefSize(90,2);
        line2.setStyle(
        "-fx-background-color:#7C3AED;"
        );
        Text desc = new Text(
        "Authorized access for security analysts.\n\n" +
        "Monitor global threat streams and\n" +
        "manage neural network parameters.");
        desc.setFill(Color.LIGHTGRAY);
        desc.setTextAlignment(TextAlignment.CENTER);
        desc.setWrappingWidth(250);
        desc.setStyle(
        "-fx-fill:#D0D0D0;" +
        "-fx-font-size:16;"
        );
        Button loginBtn = new Button("System Login");
        loginBtn.setPrefWidth(240);
        loginBtn.setPrefHeight(50);
        loginBtn.setStyle(
        "-fx-background-color:#242235;" +
        "-fx-background-radius:12;" +
        "-fx-text-fill:white;" +
        "-fx-font-size:16;" +
        "-fx-font-weight:bold;"
        );

        addButtonAnimation(customerBtn);
        addButtonAnimation(loginBtn);

        

        VBox staffCard = new VBox(18);
        staffCard.getChildren().addAll(staffIcon,staffTitle,line2,desc,loginBtn);
        staffCard.setAlignment(Pos.TOP_CENTER);
        staffCard.setPadding(new Insets(35,25,25,25));
        staffCard.setPrefSize(330, 420);
        staffCard.setStyle(
                "-fx-background-color: rgba(22,22,34,0.94);" +
                "-fx-background-radius:20;" +
                "-fx-border-radius:20;" +
                "-fx-border-color:#6D28D9;" +
                "-fx-border-width:1;"
            );


        DropShadow shadow = new DropShadow();
        shadow.setRadius(18);
        shadow.setSpread(0.15);
        shadow.setColor(Color.web("#7C3AED"));

        customerCard.setEffect(shadow);
        staffCard.setEffect(shadow);


        HBox portalCard = new HBox(35);
        portalCard.getChildren().addAll(customerCard,staffCard);
        portalCard.setAlignment(Pos.CENTER);
        portalCard.setPadding(new Insets(20));

        container.setCenter(portalCard);
        container.setPadding(new Insets(30));


        StackPane root = new StackPane();
        
        root.getChildren().addAll(bg,container);
        Scene scene = new Scene(root, 1540, 850);

        primaryStage.setTitle("FraudShield AI");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    private void addButtonAnimation(Button button) {

    button.setOnMousePressed(e -> {
        ScaleTransition press = new ScaleTransition(Duration.millis(100), button);
        press.setToX(0.95);
        press.setToY(0.95);
        press.play();
    });

    button.setOnMouseReleased(e -> {
        ScaleTransition release = new ScaleTransition(Duration.millis(120), button);
        release.setToX(1);
        release.setToY(1);
        release.play();
    });
}
    
}
