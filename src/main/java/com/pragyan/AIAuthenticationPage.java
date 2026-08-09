package com.pragyan;


import javafx.util.Duration;
import javafx.animation.TranslateTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.FadeTransition;
import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.stage.Stage;

public class AIAuthenticationPage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        ImageView bg = new ImageView(new Image("assets/images/bg2.jpeg"));



        ImageView logo = new ImageView(new Image("assets/icons/icon.png"));

        Text headerText = new Text("FraudShield AI");

        Text t1 = new Text("AI Authentication Intelligence.");

        Text t2 = new Text("Making secure authentication decision...");

        logo.setFitWidth(60);
        logo.setFitHeight(60);
        headerText.setStyle(
            "-fx-font-size:40px;" +
            "-fx-font-weight:bold;" +
            "-fx-fill:white;"
        );
        t1.setStyle(
            "-fx-font-size:22px;" +
            "-fx-fill:#D7D7D7;"
        );
        t2.setStyle(
            "-fx-font-size:16px;" +
            "-fx-fill:#9A9A9A;"
        );


        VBox header = new VBox(5);
        header.getChildren().addAll(logo,headerText,t1,t2);
        header.setAlignment(Pos.CENTER);
        header.setSpacing(2);
        header.setStyle("-fx-border-color:red;");
        header.setPrefHeight(95);



        ImageView ring = new ImageView(new Image("assets/icons/ring.png"));
        ring.setFitWidth(290);
        ring.setFitHeight(290);
        RotateTransition hudRotate = new RotateTransition(Duration.seconds(20), ring);
        hudRotate.setByAngle(360);
        hudRotate.setCycleCount(Animation.INDEFINITE);
        hudRotate.setInterpolator(Interpolator.LINEAR);
        hudRotate.play();

        Circle glow = new Circle(95);
        glow.setFill(Color.web("#7C3AED"));
        glow.setOpacity(0.05);
        ScaleTransition glowPulse = new ScaleTransition(Duration.seconds(1.5), glow);
        glowPulse.setFromX(1);
        glowPulse.setFromY(1);
        glowPulse.setToX(1.15);
        glowPulse.setToY(1.15);
        glowPulse.setAutoReverse(true);
        glowPulse.setCycleCount(Animation.INDEFINITE);
        glowPulse.play();
        FadeTransition glowFade = new FadeTransition(Duration.seconds(1.5), glow);
        glowFade.setFromValue(0.08);
        glowFade.setToValue(0.18);
        glowFade.setAutoReverse(true);
        glowFade.setCycleCount(Animation.INDEFINITE);
        glowFade.play();

        Circle scanRing = new Circle(135);
        scanRing.setFill(Color.TRANSPARENT);
        scanRing.setStroke(Color.web("#C084FC"));
        scanRing.setStrokeWidth(1.5);
        scanRing.setOpacity(0.25);
        ScaleTransition scanPulse =
        new ScaleTransition(Duration.seconds(2.5), scanRing);
        scanPulse.setFromX(1);
        scanPulse.setFromY(1);
        scanPulse.setToX(1.08);
        scanPulse.setToY(1.08);
        scanPulse.setAutoReverse(true);
        scanPulse.setCycleCount(Animation.INDEFINITE);
        scanPulse.play();

        Circle progress = new Circle(115);
        progress.setFill(Color.TRANSPARENT);
        progress.setStroke(Color.web("#C084FC"));
        progress.setStrokeWidth(6);
        progress.getStrokeDashArray().addAll(28.0,12.0);
        progress.setStrokeDashOffset(720);   
        progress.setRotate(-90);
        Timeline ringAnimation = new Timeline(
            new KeyFrame(
                Duration.seconds(3),
                new KeyValue(
                    progress.strokeDashOffsetProperty(),
                    58,
                    Interpolator.EASE_BOTH
                )
            )
        );;
        ringAnimation.play();
      
        Text percent = new Text("0%");
        percent.setStyle(
            "-fx-fill:white;" +
            "-fx-font-size:60;" +
            "-fx-font-weight:bold;"
        );

        Text process = new Text("AI Decision Processing");
        process.setStyle(
            "-fx-fill:#C9B8FF;" +
            "-fx-font-size:22;"
        );
        ImageView shield = new ImageView(new Image("assets/icons/icon.png"));
        shield.setFitWidth(40);
        shield.setFitHeight(40);
        ScaleTransition shieldPulse =
        new ScaleTransition(Duration.seconds(1.5), shield);
        shieldPulse.setFromX(1);
        shieldPulse.setFromY(1);
        shieldPulse.setToX(1.15);
        shieldPulse.setToY(1.15);
        shieldPulse.setAutoReverse(true);
        shieldPulse.setCycleCount(Animation.INDEFINITE);
        shieldPulse.play();
        TranslateTransition shieldFloat =
        new TranslateTransition(Duration.seconds(2), shield);
        shieldFloat.setFromY(0);
        shieldFloat.setToY(-5);
        shieldFloat.setAutoReverse(true);
        shieldFloat.setCycleCount(Animation.INDEFINITE);
        shieldFloat.play();

        VBox centerBox = new VBox(5);
        centerBox.setAlignment(Pos.CENTER);
        centerBox.getChildren().addAll(shield,percent, process);

        StackPane circlePane = new StackPane();
        circlePane.setPrefSize(250, 250);
        circlePane.setTranslateY(-40);
        circlePane.getChildren().addAll(
           
            glow,
            scanRing,
           ring,
            progress,
            centerBox
        );

        Text status = new Text("Evaluating authentication request...");
        status.setStyle(
                "-fx-fill:#BEB8D9;" +
                "-fx-font-size:18px;"
        );
        status.setTranslateY(-12);
        Timeline statusAnimation = new Timeline(
            new KeyFrame(Duration.seconds(0),
                e -> status.setText("Scanning device...")),
            new KeyFrame(Duration.seconds(2),
                e -> status.setText("Verifying identity...")),
            new KeyFrame(Duration.seconds(4),
                e -> status.setText("Analyzing behavior...")),
            new KeyFrame(Duration.seconds(6),
                e -> status.setText("Running AI model...")),
            new KeyFrame(Duration.seconds(8),
                e -> status.setText("Generating trust score..."))
        );
        statusAnimation.setCycleCount(Animation.INDEFINITE);
        statusAnimation.play();

        VBox loaderContent = new VBox(6);
        loaderContent.setAlignment(Pos.CENTER);
        loaderContent.getChildren().addAll(
                circlePane,
                status
        );

        StackPane loader = new StackPane();
        loader.setAlignment(Pos.CENTER);
        loader.getChildren().add(loaderContent);
        loader.setStyle("-fx-border-color:blue;");

        
        VBox deviceCard = new VBox(8);
        deviceCard.setPrefSize(310,82);
       deviceCard.setStyle(
        "-fx-background-color: rgba(18,18,35,0.55);" +
        "-fx-background-radius:18;" +
        "-fx-border-radius:18;" +
        "-fx-border-color: rgba(168,85,247,0.65);" +
        "-fx-border-width:1.2;" +
        "-fx-effect:dropshadow(gaussian, rgba(124,58,237,0.45),18,0.3,0,0);"
        );
        deviceCard.setPadding(new Insets(15));;

        ImageView pcIcon = new ImageView( new Image("assets/icons/device.png"));
        pcIcon.setFitWidth(26);
        pcIcon.setFitHeight(26);
        Text title = new Text("Device Verified");
        title.setStyle(
                "-fx-fill:white;" +
                "-fx-font-size:20;" +
                "-fx-font-weight:bold;"
        );
        Text sub = new Text("Windows 11 • Chrome");
        sub.setStyle(
                "-fx-fill:#A7A7A7;" +
                "-fx-font-size:13;"
        );
       Circle trustedDot = new Circle(4);
        trustedDot.setFill(Color.web("#22C55E"));
        ScaleTransition pulse =  new ScaleTransition(Duration.seconds(0.8),trustedDot);
        pulse.setFromX(1);
        pulse.setFromY(1);
        pulse.setToX(1.35);
        pulse.setToY(1.35);
        pulse.setAutoReverse(true);
        pulse.setCycleCount(Animation.INDEFINITE);
        pulse.play();

        Text trusted = new Text("Trusted");
        trusted.setStyle(
            "-fx-fill:#22C55E;" +
            "-fx-font-size:13;" +
            "-fx-font-weight:bold;"
        );

        HBox trustedBox = new HBox(6);
        trustedBox.setAlignment(Pos.CENTER_LEFT);
        trustedBox.getChildren().addAll(trustedDot, trusted);

        HBox top = new HBox();
        top.setAlignment(Pos.CENTER_LEFT);
        
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        top.getChildren().addAll(
                pcIcon,
                spacer
        );
        deviceCard.getChildren().addAll(
                top,
                title,
                sub,
                trustedBox
        );

       
      
        ImageView locationIcon = new ImageView(
                new Image("assets/icons/location.png"));
        locationIcon.setFitWidth(24);
        locationIcon.setFitHeight(24);

        Circle locationGreenDot = new Circle(5);
        locationGreenDot.setFill(Color.web("#22C55E"));


        ScaleTransition locationPulse =
                new ScaleTransition(Duration.seconds(0.8), locationGreenDot);
        locationPulse.setFromX(1);
        locationPulse.setFromY(1);
        locationPulse.setToX(1.35);
        locationPulse.setToY(1.35);
        locationPulse.setAutoReverse(true);
        locationPulse.setCycleCount(Animation.INDEFINITE);
        locationPulse.play();

        StackPane topLeft = new StackPane(locationIcon);
        topLeft.setAlignment(Pos.CENTER_LEFT);

        StackPane topRight = new StackPane(locationGreenDot);
        topRight.setAlignment(Pos.CENTER_RIGHT);

        HBox topRow = new HBox();
        topRow.setAlignment(Pos.CENTER);
        topRow.getChildren().addAll(topLeft, topRight);

        HBox.setHgrow(topLeft, Priority.ALWAYS);
        HBox.setHgrow(topRight, Priority.ALWAYS);

        // Title
        Text locationTitle = new Text("Location Analysis");
        locationTitle.setStyle(
                "-fx-fill:white;" +
                "-fx-font-size:20px;" +
                "-fx-font-weight:bold;"
        );


        Text locationSubtitle = new Text("Pune, Maharashtra");
        locationSubtitle.setStyle(
                "-fx-fill:#9E9E9E;" +
                "-fx-font-size:12px;"
        );


        Circle verifiedDot = new Circle(4);
        verifiedDot.setFill(Color.web("#22C55E"));

        Text verifiedText = new Text("Verified Location");
        verifiedText.setStyle(
                "-fx-fill:#22C55E;" +
                "-fx-font-size:13px;" +
                "-fx-font-weight:bold;"
        );

        HBox verifiedBox = new HBox(6);
        verifiedBox.setAlignment(Pos.CENTER_LEFT);
        verifiedBox.getChildren().addAll(
                verifiedDot,
                verifiedText
        );

        // Content
        VBox locationContent = new VBox(8);
        locationContent.getChildren().addAll(
                topRow,
                locationTitle,
                locationSubtitle,
                verifiedBox
        );


        StackPane locationCard = new StackPane(locationContent);

        locationCard.setPrefSize(340,100);

        locationCard.setPadding(new Insets(15));

        locationCard.setStyle(
                "-fx-background-color: rgba(18,18,35,0.55);" +
                "-fx-background-radius:18;" +
                "-fx-border-radius:18;" +
                "-fx-border-color: rgba(168,85,247,0.65);" +
                "-fx-border-width:1.2;" +
                "-fx-effect:dropshadow(gaussian, rgba(124,58,237,0.45),18,0.3,0,0);"
        );

        


    
        ImageView brainIcon = new ImageView(
                new Image("assets/icons/brain.png"));
        brainIcon.setFitWidth(24);
        brainIcon.setFitHeight(24);


        Circle behaviourGreenDot = new Circle(5);
        behaviourGreenDot.setFill(Color.web("#22C55E"));
        ScaleTransition behaviourPulse = new ScaleTransition(Duration.seconds(0.8), behaviourGreenDot);

        behaviourPulse.setFromX(1);
        behaviourPulse.setFromY(1);
        behaviourPulse.setToX(1.35);
        behaviourPulse.setToY(1.35);
        behaviourPulse.setAutoReverse(true);
        behaviourPulse.setCycleCount(Animation.INDEFINITE);
        behaviourPulse.play();

        StackPane behaviourLeft = new StackPane(brainIcon);
        behaviourLeft.setAlignment(Pos.CENTER_LEFT);

        StackPane behaviourRight = new StackPane(behaviourGreenDot);
        behaviourRight.setAlignment(Pos.CENTER_RIGHT);

        HBox behaviourTop = new HBox();
        behaviourTop.setAlignment(Pos.CENTER);

        behaviourTop.getChildren().addAll(
                behaviourLeft,
                behaviourRight
        );

        HBox.setHgrow(behaviourLeft, Priority.ALWAYS);
        HBox.setHgrow(behaviourRight, Priority.ALWAYS);


        Text behaviourTitle = new Text("Behaviour Analysis");
        behaviourTitle.setStyle(
                "-fx-fill:white;" +
                "-fx-font-size:20px;" +
                "-fx-font-weight:bold;"
        );


        Text behaviourSubtitle = new Text("Normal Behaviour");
        behaviourSubtitle.setStyle(
                "-fx-fill:#9E9E9E;" +
                "-fx-font-size:12px;"
        );

        Circle behaviourDot = new Circle(4);
        behaviourDot.setFill(Color.web("#22C55E"));

        Text behaviourStatus = new Text("Verified");
        behaviourStatus.setStyle(
                "-fx-fill:#22C55E;" +
                "-fx-font-size:13px;" +
                "-fx-font-weight:bold;"
        );

        HBox behaviourBadge = new HBox(6);
        behaviourBadge.setAlignment(Pos.CENTER_LEFT);

        behaviourBadge.getChildren().addAll(
                behaviourDot,
                behaviourStatus
        );

        Text stability = new Text("Behaviour Stability : 98.4%");
        stability.setStyle(
                "-fx-fill:#CFCFCF;" +
                "-fx-font-size:12px;"
        );

        VBox behaviourContent = new VBox(8);

        behaviourContent.getChildren().addAll(
                behaviourTop,
                behaviourTitle,
                behaviourSubtitle,
                behaviourBadge,
                stability
        );

        StackPane behaviourCard = new StackPane(behaviourContent);

        behaviourCard.setPrefSize(340,100);

        behaviourCard.setPadding(new Insets(15));

        behaviourCard.setStyle(
                "-fx-background-color: rgba(18,18,35,0.55);" +
                "-fx-background-radius:18;" +
                "-fx-border-radius:18;" +
                "-fx-border-color: rgba(168,85,247,0.65);" +
                "-fx-border-width:1.2;" +
                "-fx-effect:dropshadow(gaussian, rgba(124,58,237,0.45),18,0.3,0,0);"
        );




        ImageView shieldIcon = new ImageView(
                new Image("assets/icons/shield.png"));
        shieldIcon.setFitWidth(24);
        shieldIcon.setFitHeight(24);

        Circle threatGreenDot = new Circle(5);
        threatGreenDot.setFill(Color.web("#22C55E"));

        ScaleTransition threatPulse =
                new ScaleTransition(Duration.seconds(0.8), threatGreenDot);

        threatPulse.setFromX(1);
        threatPulse.setFromY(1);
        threatPulse.setToX(1.35);
        threatPulse.setToY(1.35);
        threatPulse.setAutoReverse(true);
        threatPulse.setCycleCount(Animation.INDEFINITE);
        threatPulse.play();

        StackPane threatLeft = new StackPane(shieldIcon);
        threatLeft.setAlignment(Pos.CENTER_LEFT);

        StackPane threatRight = new StackPane(threatGreenDot);
        threatRight.setAlignment(Pos.CENTER_RIGHT);

        HBox threatTop = new HBox();
        threatTop.setAlignment(Pos.CENTER);

        threatTop.getChildren().addAll(
                threatLeft,
                threatRight
        );

        HBox.setHgrow(threatLeft, Priority.ALWAYS);
        HBox.setHgrow(threatRight, Priority.ALWAYS);

        Text threatTitle = new Text("Threat Assessment");
        threatTitle.setStyle(
                "-fx-fill:white;" +
                "-fx-font-size:20px;" +
                "-fx-font-weight:bold;"
        );

        Text threatSubtitle = new Text("Low Risk Detected");
        threatSubtitle.setStyle(
                "-fx-fill:#9E9E9E;" +
                "-fx-font-size:12px;"
        );

        Text score = new Text("AI Risk Score : 12 / 100");
        score.setStyle(
                "-fx-fill:white;" +
                "-fx-font-size:13px;" +
                "-fx-font-weight:bold;"
        );

        StackPane barBackground = new StackPane();
        barBackground.setPrefSize(260,8);
        barBackground.setStyle(
                "-fx-background-color:#2A2A3A;" +
                "-fx-background-radius:20;"
        );

        StackPane barFill = new StackPane();
        barFill.setPrefSize(35,8);

        barFill.setStyle(
                "-fx-background-color:#22C55E;" +
                "-fx-background-radius:20;"
        );

        StackPane progressBar = new StackPane();
        progressBar.setAlignment(Pos.CENTER_LEFT);

        progressBar.getChildren().addAll(
                barBackground,
                barFill
        );

        Circle riskDot = new Circle(4);
        riskDot.setFill(Color.web("#22C55E"));

        Text riskStatus = new Text("SAFE");
        riskStatus.setStyle(
                "-fx-fill:#22C55E;" +
                "-fx-font-size:13px;" +
                "-fx-font-weight:bold;"
        );

        HBox riskBadge = new HBox(6);
        riskBadge.setAlignment(Pos.CENTER_LEFT);

        riskBadge.getChildren().addAll(
                riskDot,
                riskStatus
        );

        VBox threatContent = new VBox(8);

        threatContent.getChildren().addAll(
                threatTop,
                threatTitle,
                threatSubtitle,
                score,
                progressBar,
                riskBadge
        );

        StackPane threatCard = new StackPane(threatContent);

        threatCard.setPrefSize(340,120);

        threatCard.setPadding(new Insets(15));

        threatCard.setStyle(
                "-fx-background-color: rgba(18,18,35,0.55);" +
                "-fx-background-radius:18;" +
                "-fx-border-radius:18;" +
                "-fx-border-color: rgba(168,85,247,0.65);" +
                "-fx-border-width:1.2;" +
                "-fx-effect:dropshadow(gaussian, rgba(124,58,237,0.45),18,0.3,0,0);"
        );

       

        HBox verification = new HBox(20);
        verification.setAlignment(Pos.CENTER);
        verification.setPadding(new Insets(10));
        verification.setPrefHeight(90);
        verification.setStyle("-fx-border-color:green;");
        verification.getChildren().addAll(deviceCard,locationCard,behaviourCard,threatCard);



        Text explainTitle = new Text("Explainable AI");
        explainTitle.setStyle(
                "-fx-fill:white;" +
                "-fx-font-size:22px;" +
                "-fx-font-weight:bold;"
        );


        VBox leftColumn = new VBox(14);
        leftColumn.setPrefWidth(310);

        String[] bulletTexts = {
                "Historical login pattern matched",
                "Trusted device successfully recognized",
                "Geographic location consistent",
                "No behavioural anomalies detected"
        };

        for (String text : bulletTexts) {

            HBox row = new HBox(10);
            row.setAlignment(Pos.CENTER_LEFT);

            Circle bullet = new Circle(5);
            bullet.setFill(Color.web("#22C55E"));

            Text label = new Text(text);
            label.setStyle(
                    "-fx-fill:white;" +
                    "-fx-font-size:15px;"
            );

            row.getChildren().addAll(bullet, label);

            // ✅ Add each row inside the loop
            leftColumn.getChildren().add(row);
        }


        VBox divider = new VBox();
        divider.setPrefWidth(1);
        divider.setStyle(
            "-fx-background-color:rgba(255,255,255,0.15);"
        );


        Text summaryTitle = new Text("AI Summary");
        summaryTitle.setStyle(
                "-fx-fill:#C084FC;" +
                "-fx-font-size:18px;" +
                "-fx-font-weight:bold;"
        );

        Text summary = new Text(
                "Authentication request matches previous login history,\n\n" +
                "Trusted device and familiar location were detected.\n\n" +
                "Behaviour pattern appears normal with no suspicious\n" +
                "activity requiring additional verification."
        );
        summary.setWrappingWidth(320);
        summary.setStyle(
                "-fx-fill:#D7D7D7;" +
                "-fx-font-size:14px;"
        );


        VBox rightColumn = new VBox(12);
        rightColumn.setPrefWidth(330);
        rightColumn.getChildren().addAll(
                summaryTitle,
                summary
        );


        HBox explainContent = new HBox(30);
        explainContent.getChildren().addAll(
                leftColumn,
                divider,
                rightColumn
        );


        VBox explainCard = new VBox(15);
        explainCard.setPrefSize(700,220);
        explainCard.setPadding(new Insets(18));
        explainCard.setStyle(
            "-fx-background-color:rgba(18,18,35,0.55);" +
            "-fx-background-radius:18;" +
            "-fx-border-radius:18;" +
            "-fx-border-color:rgba(168,85,247,0.65);" +
            "-fx-border-width:1.2;" +
            "-fx-effect:dropshadow(gaussian, rgba(124,58,237,0.45),18,0.3,0,0);"
        );
        explainCard.getChildren().addAll(
        explainTitle,
        explainContent
        );



        VBox confidenceCard = new VBox(16);
        confidenceCard.setPrefSize(330, 230);
        confidenceCard.setPadding(new Insets(20));
        confidenceCard.setAlignment(Pos.TOP_LEFT);

        confidenceCard.setStyle(
                "-fx-background-color:rgba(25,20,45,0.60);" +
                "-fx-background-radius:18;" +
                "-fx-border-radius:18;" +
                "-fx-border-color:rgba(170,120,255,0.45);" +
                "-fx-border-width:1.2;"
        );


        Text confidenceTitle = new Text("AI Decision Confidence");
        confidenceTitle.setStyle(
                "-fx-fill:white;" +
                "-fx-font-size:18px;" +
                "-fx-font-weight:bold;"
        );


        Text confidenceValue = new Text("98.7%");
        confidenceValue.setStyle(
                "-fx-fill:white;" +
                "-fx-font-size:42px;" +
                "-fx-font-weight:bold;"
        );

        Text confidenceLevel = new Text("Very High");
        confidenceLevel.setStyle(
                "-fx-fill:#22C55E;" +
                "-fx-font-size:18px;" +
                "-fx-font-weight:bold;"
        );

        Text confidenceText = new Text("Confidence");
        confidenceText.setStyle(
                "-fx-fill:#CFCFCF;" +
                "-fx-font-size:14px;"
        );


        Circle confidenceRing = new Circle(60);
        confidenceRing.setFill(Color.TRANSPARENT);
        confidenceRing.setStroke(Color.web("#7C3AED"));
        confidenceRing.setStrokeWidth(5);


        VBox confidenceCenter = new VBox(2);
        confidenceCenter.setAlignment(Pos.CENTER);
        confidenceCenter.getChildren().addAll(
                confidenceValue,
                confidenceLevel,
                confidenceText
        );

        StackPane confidencePane = new StackPane();
        confidencePane.setPrefSize(140, 140);
        confidencePane.getChildren().addAll(
                confidenceRing,
                confidenceCenter
        );


        Text distribution = new Text("Confidence Distribution");
        distribution.setStyle(
                "-fx-fill:#BFBFBF;" +
                "-fx-font-size:13px;"
        );

        ProgressBar confidenceBar = new ProgressBar(0.987);
        confidenceBar.setPrefWidth(200);
        confidenceBar.setStyle("-fx-accent:#A855F7;");


        Text footer = new Text("AI Model Reliability : Excellent");
        footer.setStyle(
                "-fx-fill:#22C55E;" +
                "-fx-font-size:13px;"
        );


        confidenceCard.getChildren().addAll(
                confidenceTitle,
                confidencePane,
                distribution,
                confidenceBar,
                footer
        );


        VBox predictionCard = new VBox(18);
        predictionCard.setPrefSize(270, 220);
        predictionCard.setPadding(new Insets(18));

        predictionCard.setStyle(
                "-fx-background-color: rgba(35,22,60,0.55);" +
                "-fx-background-radius:20;" +
                "-fx-border-color: rgba(168,85,247,0.45);" +
                "-fx-border-radius:20;"
        );

        Text predictionTitle = new Text("Current Prediction");
        predictionTitle.setStyle(
                "-fx-fill:white;" +
                "-fx-font-size:17px;" +
                "-fx-font-weight:bold;"
        );

        Circle outerCircle = new Circle(42);
        outerCircle.setFill(Color.TRANSPARENT);
        outerCircle.setStroke(Color.web("#22C55E"));
        outerCircle.setStrokeWidth(3);

        Text check = new Text("✓");
        check.setStyle(
                "-fx-fill:#22C55E;" +
                "-fx-font-size:34px;" +
                "-fx-font-weight:bold;"
        );

        StackPane predictionIcon = new StackPane(outerCircle, check);

        Text risk = new Text("LOW RISK");
        risk.setStyle(
                "-fx-fill:#22C55E;" +
                "-fx-font-size:26px;" +
                "-fx-font-weight:bold;"
        );

        Text approved = new Text("Authentication Approved");
        approved.setStyle(
                "-fx-fill:#CFCFCF;" +
                "-fx-font-size:14px;"
        );

        Separator sep = new Separator();
        sep.setStyle("-fx-background-color:#A855F7;");

        Text status2 = new Text("Decision Status");
        status2.setStyle("-fx-fill:#9CA3AF;-fx-font-size:13px;");

        Text statusValue = new Text("Access Recommended");
        statusValue.setStyle(
                "-fx-fill:#22C55E;" +
                "-fx-font-size:13px;" +
                "-fx-font-weight:bold;"
        );

        Text conf = new Text("Decision Confidence");
        conf.setStyle("-fx-fill:#9CA3AF;-fx-font-size:13px;");

        Text confValue = new Text("98.7%");
        confValue.setStyle(
                "-fx-fill:#22C55E;" +
                "-fx-font-size:13px;" +
                "-fx-font-weight:bold;"
        );

        predictionCard.getChildren().addAll(
                predictionTitle,
                predictionIcon,
                risk,
                approved,
                sep,
                status2,
                statusValue,
                conf,
                confValue
        );

        HBox analysisBox = new HBox(20);
        analysisBox.setStyle("-fx-border-color:yellow;");
        analysisBox.setPrefHeight(250);
        analysisBox.getChildren().addAll(
        explainCard,confidenceCard,predictionCard
        );
        analysisBox.setTranslateX(50);

        HBox timeBox = new HBox();
        timeBox.setStyle("-fx-border-color:white;");
        timeBox.setPrefHeight(85);


        VBox container = new VBox(12);
        container.getChildren().addAll(header,loader,verification,analysisBox,timeBox);
        container.setAlignment(Pos.TOP_CENTER);
        container.setPadding(new Insets(35));


        StackPane root = new StackPane(bg,container);
       
        Scene scene = new Scene(root,1540,850);

        Timeline percentageAnimation = new Timeline();
        for (int i = 0; i <= 92; i++) {
            final int value = i;
            KeyFrame frame = new KeyFrame(
                    Duration.millis(i * 40),
                    e -> percent.setText(value + "%")
            );
            percentageAnimation.getKeyFrames().add(frame);
        }
        percentageAnimation.play();

        primaryStage.setTitle("FraudShield AI");
        primaryStage.setScene(scene);
        primaryStage.show();
    } 
    
}
