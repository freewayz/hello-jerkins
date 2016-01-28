
package com.pitaside.playground;
public class RunApplication {
    
    
    
    public RunApplication(){
        
    }
    
    public static void main(String arg[]){
        final RunApplication application = new RunApplication();
        application.welcomeMessage();
    }
    
    
    private void showMessage(final String message){
        System.out.println(message);
       
    }
    
    private String readMessage(){
        
        final ReadWelcome welcome = new ReadWelcomeImpl();
        final String messageToRead = welcome.getWelcomeMessage();
        return messageToRead;
    }
    
    
    public void welcomeMessage(){
        final String  welcomeMessage = readMessage();
        showMessage(welcomeMessage);
    }
}