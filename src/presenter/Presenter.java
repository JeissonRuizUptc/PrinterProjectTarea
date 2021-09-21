package presenter;

import model.MainModel;
import view.MainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter implements ActionListener {

    private MainModel model;
    private MainWindow window;

    public Presenter(){
        model = new MainModel();
        window = new MainWindow(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "addImpress":
                break;
        }
    }


    public void addImpress(){

    }

}
