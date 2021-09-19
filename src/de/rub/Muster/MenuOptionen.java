package de.rub.Muster;

public class MenuOptionen {
    private ActionListenerCommand openCommand;
    private ActionListenerCommand saveCommand;

    public MenuOptionen(ActionListenerCommand open, ActionListenerCommand save){
        this.openCommand = open;
        this.saveCommand = save;
    }
    public void clickOpen(){
        openCommand.execute();
    }
    public void clickSave(){
        saveCommand.execute();
    }
}
