import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.PrintStream;


public class GOFX extends Application {

    //object and variables>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    Stage window;
    Scene scene1,scene2,scene3,scene4,scene5;
    Logintest vaild = new Logintest();

    transaction transaction = new transaction();
    String[] TH= transaction.getTrans();


    int z;


    //main>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public  static void main(String[]args){ launch(args);}

    //GUI>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("ATM");

        //design 1  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<>>>>>>>>>>>>
        Label welcomeLabel = new Label(" WELCOME TO ATM");
        welcomeLabel.setStyle("-fx-font-size: 12pt");
        Label cardNuLabel = new Label("Card No. : ");
        TextField carNoField = new TextField();
        Button next =new Button("NEXT");
        next.setOnAction(event-> window.setScene(scene2));

        //keyboard  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Button b1 =new Button("1");
        b1.setOnAction(event -> carNoField.setText(carNoField.getText()+"1") );

        Button b2 =new Button("2");
        b2.setOnAction(event -> carNoField.setText(carNoField.getText()+"2") );

        Button b3 =new Button("3");
        b3.setOnAction(event -> carNoField.setText(carNoField.getText()+"3") );

        Button b4 =new Button("4");
        b4.setOnAction(event -> carNoField.setText(carNoField.getText()+"4") );

        Button b5 =new Button("5");
        b5.setOnAction(event -> carNoField.setText(carNoField.getText()+"5") );

        Button b6 =new Button("6");
        b6.setOnAction(event -> carNoField.setText(carNoField.getText()+"6") );

        Button b7 =new Button("7");
        b7.setOnAction(event -> carNoField.setText(carNoField.getText()+"7") );

        Button b8 =new Button("8");
        b8.setOnAction(event -> carNoField.setText(carNoField.getText()+"8") );

        Button b9 =new Button("9");
        b9.setOnAction(event -> carNoField.setText(carNoField.getText()+"9") );

        Button b0 =new Button("0");
        b0.setOnAction(event -> carNoField.setText(carNoField.getText()+"0") );

        Button bd =new Button("CLR");
        bd.setOnAction(event -> carNoField.setText("") );


        //grid 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<>>>>>>>>>
        GridPane grid1 =new GridPane();
        grid1.setAlignment(Pos.CENTER);
        grid1.add(welcomeLabel,1,0);
        grid1.add(cardNuLabel,0,1);
        grid1.add(carNoField,1,1);
        grid1.add(next,3,1);
        grid1.add(b1,0,4);
        grid1.add(b2,1,4);
        GridPane.setHalignment(b2, HPos.CENTER);
        grid1.add(b3,2,4);
        grid1.add(b4,0,5);
        grid1.add(b5,1,5);
        GridPane.setHalignment(b5, HPos.CENTER);
        grid1.add(b6,2,5);
        grid1.add(b7,0,6);
        grid1.add(b8,1,6);
        GridPane.setHalignment(b8, HPos.CENTER);
        grid1.add(b9,2,6);
        grid1.add(b0,1,7);
        GridPane.setHalignment(b0, HPos.CENTER);
        grid1.add(bd,2,7);
        scene1=new Scene(grid1,600,400);
        scene1.getStylesheets().add("style.css");

        //design 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<>>>>>>>>>>>
       Label pinLabel = new Label("    Pin:    ");
        Label warning1 = new Label();
        warning1.setStyle("-fx-text-fill: rgba(235,227,227,0.69) ");
        PasswordField pinField = new PasswordField();
        Button previous =new Button("Previous");
        Button LogIn =new Button("Log in");
        previous.setOnAction(e -> {
            window.setScene(scene1);
            warning1.setText("");
        });
        //login test>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        LogIn.setOnAction(e -> {
            String Card =carNoField.getText();
            String Pin =pinField.getText();
            boolean test=vaild.test(Card,Pin);
            if (test) {
                window.setScene(scene3);
                carNoField.setText("");
                pinField.setText("");
            }
            else{
                warning1.setText("WRONG card/PIN!");
            }
        });
        //keyboard>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Button b01 =new Button("1");
        b01.setOnAction(event -> pinField.setText(pinField.getText()+"1") );

        Button b02 =new Button("2");
        b02.setOnAction(event -> pinField.setText(pinField.getText()+"2") );

        Button b03 =new Button("3");
        b03.setOnAction(event -> pinField.setText(pinField.getText()+"3") );

        Button b04 =new Button("4");
        b04.setOnAction(event -> pinField.setText(pinField.getText()+"4") );

        Button b05 =new Button("5");
        b05.setOnAction(event -> pinField.setText(pinField.getText()+"5") );

        Button b06 =new Button("6");
        b06.setOnAction(event -> pinField.setText(pinField.getText()+"6") );

        Button b07 =new Button("7");
        b07.setOnAction(event -> pinField.setText(pinField.getText()+"7") );

        Button b08 =new Button("8");
        b08.setOnAction(event -> pinField.setText(pinField.getText()+"8") );

        Button b09 =new Button("9");
        b09.setOnAction(event -> pinField.setText(pinField.getText()+"9") );

        Button b00 =new Button("0");
        b00.setOnAction(event -> pinField.setText(pinField.getText()+"0") );

        Button b0d =new Button("CLR");
        b0d.setOnAction(event -> pinField.setText("") );


        //grid 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        GridPane grid2 =new GridPane();
        grid2.setAlignment(Pos.CENTER);
        grid2.add(pinLabel,0,0);
        grid2.add(pinField,1,0);
        grid2.add(previous,3,0);
        grid2.add(LogIn,3,1);
        grid2.add(warning1,4,0);
        grid2.add(b01,0,4);
        grid2.add(b02,1,4);
        GridPane.setHalignment(b02, HPos.CENTER);
        grid2.add(b03,2,4);
        grid2.add(b04,0,5);
        grid2.add(b05,1,5);
        GridPane.setHalignment(b05, HPos.CENTER);
        grid2.add(b06,2,5);
        grid2.add(b07,0,6);
        grid2.add(b08,1,6);
        GridPane.setHalignment(b08, HPos.CENTER);
        grid2.add(b09,2,6);
        grid2.add(b00,1,7);
        GridPane.setHalignment(b00, HPos.CENTER);
        grid2.add(b0d,2,7);
        scene2=new Scene(grid2,600,400);
        scene2.getStylesheets().add("style.css");


        //design 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Label homeLabel = new Label("Home Screeen");
        homeLabel.setStyle("-fx-font-size: 15pt");
        Label balancelabel = new Label();

        //open withdraw window>>>>>>>>>>>>>>>>>>>>>>>>>
        Button withdrawB =new Button("Withdraw");
        withdrawB.setOnAction(event -> {
            window.setScene(scene4);
            balancelabel.setText("");
        } );

        //open deposit window>>>>>>>>>>>>>>>>>>>>>>>>>
        Button depositB =new Button("Deposit");
        depositB.setOnAction(event -> {
            window.setScene(scene5);
            balancelabel.setText("");
        } );

        //show Balance amount>>>>>>>>>>>>>>>>>>>>>>>>>
        Button balanceB =new Button("Balance");
        balanceB.setOnAction(event -> {
            int balance= transaction.getBalance();
            balancelabel.setText( "balance: " + String.valueOf(balance) );
            transaction.returnbalanceH();
        });

        //history arguments (pre an next) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Button nextB =new Button("NEXT");
        nextB.setOnAction(event -> {
            int j = transaction.incI();
            if (j>z)
                balancelabel.setText("NO NEXT transaction");
            else
            balancelabel.setText(TH[j]);
        });
        Button previousB =new Button("PREVIOUS");
       previousB.setOnAction(event -> {
           int j = transaction.decI();
           if (transaction.getI()<0 || j<(z-5) )
               balancelabel.setText("NO PREVIOUS HISTORY");
           else{
                   balancelabel.setText(TH[j]);
           }
       });


        //grid 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        GridPane grid3 =new GridPane();
        grid3.setAlignment(Pos.CENTER);
        grid3.add(homeLabel,1,0);
        grid3.add(withdrawB,0,1);
        grid3.add(depositB,2,1);
        grid3.add(balanceB,1,2);
        GridPane.setHalignment(balanceB, HPos.CENTER);
        grid3.add(balancelabel,1,4);
        GridPane.setHalignment(balancelabel, HPos.CENTER);
        grid3.add(nextB,2,4);
        grid3.add(previousB,0,4);
        scene3=new Scene(grid3,600,400);
        scene3.getStylesheets().add("style.css");

        //design 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Label withdrawLabel = new Label(" Enter withdraw amount:  ");
        int i =0;
        TextField withdrawField = new TextField();
        Label warning2 = new Label();
        warning2.setStyle("-fx-text-fill: #ebe3e3 ");

        //withdraw arguments >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Button withdraw =new Button("Withdraw");
        withdraw.setOnAction(event ->{
            int withdrawAmount = Integer.parseInt(withdrawField.getText());
            int test= transaction.withdrawM(withdrawAmount);
            if (test==1){
                warning2.setText("Please Collect your money");
                z=transaction.getI();
            }
            else   if (test==0){
                warning2.setText("you can't withdraw #0 balance!");
            }
            else {
                warning2.setText("Insufficient Balance");
            }
        });

        //back to home >>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Button homeW =new Button("HOME");
        homeW.setOnAction(event -> {
            window.setScene(scene3);
            warning2.setText("");
            withdrawField.setText("");
        } );

        //keyboard>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Button b11 =new Button("1");
        b11.setOnAction(event -> withdrawField.setText(withdrawField.getText()+"1") );

        Button b12 =new Button("2");
        b12.setOnAction(event -> withdrawField.setText(withdrawField.getText()+"2") );

        Button b13 =new Button("3");
        b13.setOnAction(event -> withdrawField.setText(withdrawField.getText()+"3") );

        Button b14 =new Button("4");
        b14.setOnAction(event -> withdrawField.setText(withdrawField.getText()+"4") );

        Button b15 =new Button("5");
        b15.setOnAction(event -> withdrawField.setText(withdrawField.getText()+"5") );

        Button b16 =new Button("6");
        b16.setOnAction(event -> withdrawField.setText(withdrawField.getText()+"6") );

        Button b17 =new Button("7");
        b17.setOnAction(event -> withdrawField.setText(withdrawField.getText()+"7") );

        Button b18 =new Button("8");
        b18.setOnAction(event -> withdrawField.setText(withdrawField.getText()+"8") );

        Button b19 =new Button("9");
        b19.setOnAction(event -> withdrawField.setText(withdrawField.getText()+"9") );

        Button b10 =new Button("0");
        b10.setOnAction(event -> withdrawField.setText(withdrawField.getText()+"0") );

        Button b1d =new Button("CLR");
        b1d.setOnAction(event -> {
            withdrawField.setText("");
            warning2.setText("");
        } );


        //grid 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        GridPane grid4 =new GridPane();
        grid4.setAlignment(Pos.CENTER);
        homeW.setPrefWidth(150);
        grid4.add(withdrawLabel,0,0);
        grid4.add(withdrawField,0,1);
        grid4.add(homeW,2,1);
        grid4.add(withdraw,1,1);
        grid4.add(warning2,0,2);
        grid4.add(b11,0,3);
        GridPane.setHalignment(b11, HPos.RIGHT);
        grid4.add(b12,1,3);
        grid4.add(b13,2,3);
        grid4.add(b14,0,4);
        GridPane.setHalignment(b14, HPos.RIGHT);
        grid4.add(b15,1,4);
        grid4.add(b16,2,4);
        grid4.add(b17,0,5);
        GridPane.setHalignment(b17, HPos.RIGHT);
        grid4.add(b18,1,5);
        grid4.add(b19,2,5);
        grid4.add(b10,1,6);
        grid4.add(b1d,2,6);
        scene4=new Scene(grid4,600,400);
        scene4.getStylesheets().add("style.css");

        //design 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Label depositLabel = new Label(" Enter deposit amount:  ");
        TextField depositField = new TextField();
        Label warning3 = new Label();
        warning3.setStyle("-fx-text-fill: #ebe3e3 ");
        //deposit arguments >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Button deposit =new Button("Deposit");
        deposit.setOnAction(event ->{
            int depositAmount = Integer.parseInt(depositField.getText());
            if (depositAmount!=0){
                transaction.depositM(depositAmount);
                warning3.setText("  successfully deposited");
                z=transaction.getI();
            }
            else
                warning3.setText("you can't deposit #0 balance!!");
        });

        //back to home >>>>>>>>>>>>>>>>>>>>>>>>>>
        Button homeD =new Button("HOME");
        homeD.setOnAction(event -> {
            window.setScene(scene3);
            warning3.setText("");
            depositField.setText("");
        } );

        //keyboard>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Button b21 =new Button("1");
        b21.setOnAction(event -> depositField.setText(depositField.getText()+"1") );

        Button b22 =new Button("2");
        b22.setOnAction(event -> depositField.setText(depositField.getText()+"2") );

        Button b23 =new Button("3");
        b23.setOnAction(event -> depositField.setText(depositField.getText()+"3") );

        Button b24 =new Button("4");
        b24.setOnAction(event -> depositField.setText(depositField.getText()+"4") );

        Button b25 =new Button("5");
        b25.setOnAction(event -> depositField.setText(depositField.getText()+"5") );

        Button b26 =new Button("6");
        b26.setOnAction(event -> depositField.setText(depositField.getText()+"6") );

        Button b27 =new Button("7");
        b27.setOnAction(event -> depositField.setText(depositField.getText()+"7") );

        Button b28 =new Button("8");
        b28.setOnAction(event -> depositField.setText(depositField.getText()+"8") );

        Button b29 =new Button("9");
        b29.setOnAction(event -> depositField.setText(depositField.getText()+"9") );

        Button b20 =new Button("0");
        b20.setOnAction(event -> depositField.setText(depositField.getText()+"0") );

        Button b2d =new Button("CLR");
        b2d.setOnAction(event -> {
            depositField.setText("");
            warning3.setText("");
        } );

        //grid 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        GridPane grid5 =new GridPane();
        grid5.setAlignment(Pos.CENTER);
        //deposit.setPrefWidth(150);
        homeD.setPrefWidth(150);
        grid5.add(depositLabel,0,0);
        grid5.add(depositField,0,1);
        grid5.add(homeD,2,1);
        grid5.add(deposit,1,1);
        grid5.add(warning3,0,2);
        grid5.add(b21,0,3);
        GridPane.setHalignment(b21, HPos.RIGHT);
        grid5.add(b22,1,3);
        grid5.add(b23,2,3);
        grid5.add(b24,0,4);
        GridPane.setHalignment(b24, HPos.RIGHT);
        grid5.add(b25,1,4);
        grid5.add(b26,2,4);
        grid5.add(b27,0,5);
        GridPane.setHalignment(b27, HPos.RIGHT);
        grid5.add(b28,1,5);
        grid5.add(b29,2,5);
        grid5.add(b20,1,6);
        grid5.add(b2d,2,6);
        scene5=new Scene(grid5,600,400);
        scene5.getStylesheets().add("style.css");

        //show GUI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        window.setScene(scene1);
        window.show();


    }
}
