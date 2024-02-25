package com.example.hw1_software_development; // Adjust this to your actual package name

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;

public class HelloController {

    @FXML
    private TableView<?> tv;

    @FXML
    private TableColumn<?, ?> tv_name;

    @FXML
    private TableColumn<?, ?> tv_email;

    @FXML
    private TableColumn<?, ?> tv_address;

    @FXML
    private TableColumn<?, ?> tv_password;

    @FXML
    private TableColumn<?, ?> tv_phone;

    @FXML
    private ImageView img_view;

    @FXML
    private TextField name;

    @FXML
    private TextField email;

    @FXML
    private TextField address;

    @FXML
    private TextField password;

    @FXML
    private TextField phone;

    @FXML
    private Button clearbtn;

    @FXML
    private Button addBtn;

    @FXML
    private Button editBtn;

    @FXML
    private Button deletebtn;

    @FXML
    private void initialize() {

    }

    @FXML
    private void clearForm() {

        name.clear();
        email.clear();
        address.clear();
        password.clear();
        phone.clear();
    }

    @FXML
    private void addNewRecord() {

    }

    @FXML
    private void editRecord() {

    }

    @FXML
    private void deleteRecord() {

    }

    @FXML
    private void showImage() {
        File file = (new FileChooser()).showOpenDialog(this.img_view.getScene().getWindow());
        if (file != null) {
            this.img_view.setImage(new Image(file.toURI().toString()));
        }
    }
}
