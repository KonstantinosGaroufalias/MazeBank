package com.jmc.mazebank.Controllers.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;



public class DashboardController implements Initializable {
    public Button send_money_btn;
    public TextArea message_fld;
    public TextField amount_fld;
    public TextField payee_fld;
    public ListView transaction_listview;
    public Label expense_lbl;
    public Label income_lbl;
    public Label savings_acc_num;
    public Label savings_bal;
    public Label checking_acc_num;
    public Label checking_bal;
    public Label login_date;
    public Text user_name;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

    }
}


