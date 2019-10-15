/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 *
 * @author Programming-2
 */
public class FXMLDocumentController implements Initializable {
    @FXML private AnchorPane anchor;
    @FXML private AnchorPane image;
    
    
    public void setUpMedioPlayer() {
        File dir = new File("src\\resources\\");
        if (!dir.exists() && dir.isDirectory()) {
            System.out.println("Cannot find audio source directory: " + dir);
        }
        
        final List<MediaPlayer> players = new ArrayList<>();
        
        for (String file : dir.list(new FilenameFilter() {
            @Override public boolean accept(File dir, String name) {
              return name.endsWith(".mp3");
            }
        })) players.add(createPlayer("file:///" + (dir.getAbsolutePath() + "\\" + file).replace("\\", "/").replaceAll(" ", "%20")));
        if (players.isEmpty()) {
            System.out.println("No audio found in " + dir);
            return;
        }
        
        //final MediaView mediaView = new MediaView(players.get(0));
        
        for (int i = 0; i < players.size(); i++) {
            final MediaPlayer player     = players.get(i);
            final MediaPlayer nextPlayer = players.get((i + 1) % players.size());
            player.setOnEndOfMedia(new Runnable() {
                @Override public void run() {
                  nextPlayer.play();
                }
            });
        }
        players.get(0).play();
    }
    
    private MediaPlayer createPlayer(String aMediaSrc) {
        final MediaPlayer player = new MediaPlayer(new Media(aMediaSrc));
        player.setOnError(new Runnable() {
            @Override public void run() {
              System.out.println("Media error occurred: " + player.getError());
            }
        });
        return player;
    }
    
    @FXML
    private void setImage() {
        image.setBackground(
            new Background(
                new BackgroundImage(
                    new Image(
                        "/resources/2018-01-09.jpg",
                        image.getPrefWidth(),
                        image.getPrefHeight(),
                        true,
                        false
                    ),
                    BackgroundRepeat.REPEAT, 
                    BackgroundRepeat.NO_REPEAT, 
                    BackgroundPosition.DEFAULT,
                    BackgroundSize.DEFAULT   
                )
            )
        );
    }
    
    private EventHandler modalImage = new EventHandler<MouseEvent>(){
        @Override
        public void handle(MouseEvent event) {
            Pane pane = new Pane();
            pane.setPrefSize(581.0, 518.0);
            pane.setLayoutX(135);
            pane.setLayoutY(75);
            pane.setBackground(
                new Background(
                    new BackgroundImage(
                        new Image(
                            "/resources/2018-01-09.jpg",
                            pane.getPrefWidth(),
                            pane.getPrefHeight(),
                            true,
                            true
                        ),
                        BackgroundRepeat.REPEAT, 
                        BackgroundRepeat.NO_REPEAT, 
                        BackgroundPosition.DEFAULT,
                        BackgroundSize.DEFAULT   
                    )
                )
            );
            
            Button btn = new Button();
            btn.setText("Close");
            btn.setLayoutX(522);
            btn.setLayoutY(14);
            pane.getChildren().add(btn);
            anchor.getChildren().add(pane);
            
        }
    };
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.setUpMedioPlayer();
        this.setImage();
        image.setOnMouseClicked(modalImage);
    }    
    
}
