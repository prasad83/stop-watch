/*
 * StopWatchMidlet.java
 *
 * Created on April 6, 2007, 6:18 PM
 */

package prasad.mobile.midlet;

import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 *
 * @author prasad
 */
public class StopWatchMidlet extends MIDlet implements CommandListener {
    private int i_ms;
    private int i_sec;
    private int i_min;
    private int i_hr;
    private Timer timer;
    
    /**
     * Creates a new instance of StopWatchMidlet
     */
    public StopWatchMidlet() {
    }
    
    private Command exitCommand;//GEN-BEGIN:MVDFields
    private StringItem mcolons;
    private StringItem minItem;
    private StringItem hourItem;
    private StringItem secItem;
    private Form stopWatchFrm;
    private StringItem hcolonm;
    private Font boldFont;
    private Spacer topSpacer;
    private StringItem scolonms;
    private StringItem msItem;
    private Command startCommand;
    private Command stopCommand;
    private Command resetCommand;//GEN-END:MVDFields
    
//GEN-LINE:MVDMethods

    /** This method initializes UI of the application.//GEN-BEGIN:MVDInitBegin
     */
    private void initialize() {//GEN-END:MVDInitBegin
        // Insert pre-init code here
        getDisplay().setCurrent(get_stopWatchFrm());//GEN-LINE:MVDInitInit
        // Insert post-init code here
    }//GEN-LINE:MVDInitEnd
    
    /** Called by the system to indicate that a command has been invoked on a particular displayable.//GEN-BEGIN:MVDCABegin
     * @param command the Command that ws invoked
     * @param displayable the Displayable on which the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:MVDCABegin
        // Insert global pre-action code here
        if (displayable == stopWatchFrm) {//GEN-BEGIN:MVDCABody
            if (command == exitCommand) {//GEN-END:MVDCABody
                // Insert pre-action code here
                exitMIDlet();//GEN-LINE:MVDCAAction3
                // Insert post-action code here
            } else if (command == stopCommand) {//GEN-LINE:MVDCACase3
                // Insert pre-action code here
                // Do nothing//GEN-LINE:MVDCAAction24
                // Insert post-action code here
                stopCommand();
            } else if (command == startCommand) {//GEN-LINE:MVDCACase24
                // Insert pre-action code here
                // Do nothing//GEN-LINE:MVDCAAction21
                // Insert post-action code here
                startCommand();
            } else if (command == resetCommand) {//GEN-LINE:MVDCACase21
                // Insert pre-action code here
                // Do nothing//GEN-LINE:MVDCAAction27
                // Insert post-action code here
                resetCommand();
            }//GEN-BEGIN:MVDCACase27
        }//GEN-END:MVDCACase27
        // Insert global post-action code here
}//GEN-LINE:MVDCAEnd
    
    /**
     * This method should return an instance of the display.
     */
    public Display getDisplay() {//GEN-FIRST:MVDGetDisplay
        return Display.getDisplay(this);
    }//GEN-LAST:MVDGetDisplay
    
    /**
     * This method should exit the midlet.
     */
    public void exitMIDlet() {//GEN-FIRST:MVDExitMidlet
        getDisplay().setCurrent(null);
        destroyApp(true);
        notifyDestroyed();
    }//GEN-LAST:MVDExitMidlet
    
    /** This method returns instance for stopWatchFrm component and should be called instead of accessing stopWatchFrm field directly.//GEN-BEGIN:MVDGetBegin2
     * @return Instance for stopWatchFrm component
     */
    public Form get_stopWatchFrm() {
        if (stopWatchFrm == null) {//GEN-END:MVDGetBegin2
            // Insert pre-init code here
            stopWatchFrm = new Form("StopWatch", new Item[] {//GEN-BEGIN:MVDGetInit2
                get_topSpacer(),
                get_hourItem(),
                get_hcolonm(),
                get_minItem(),
                get_mcolons(),
                get_secItem(),
                get_scolonms(),
                get_msItem()
            });
            stopWatchFrm.addCommand(get_startCommand());
            stopWatchFrm.addCommand(get_stopCommand());
            stopWatchFrm.addCommand(get_resetCommand());
            stopWatchFrm.addCommand(get_exitCommand());
            stopWatchFrm.setCommandListener(this);//GEN-END:MVDGetInit2
            // Insert post-init code here
        }//GEN-BEGIN:MVDGetEnd2
        return stopWatchFrm;
    }//GEN-END:MVDGetEnd2
    
    
    /** This method returns instance for exitCommand component and should be called instead of accessing exitCommand field directly.//GEN-BEGIN:MVDGetBegin5
     * @return Instance for exitCommand component
     */
    public Command get_exitCommand() {
        if (exitCommand == null) {//GEN-END:MVDGetBegin5
            // Insert pre-init code here
            exitCommand = new Command("Exit", Command.EXIT, 4);//GEN-LINE:MVDGetInit5
            // Insert post-init code here
        }//GEN-BEGIN:MVDGetEnd5
        return exitCommand;
    }//GEN-END:MVDGetEnd5

    /** This method returns instance for hourItem component and should be called instead of accessing hourItem field directly.//GEN-BEGIN:MVDGetBegin9
     * @return Instance for hourItem component
     */
    public StringItem get_hourItem() {
        if (hourItem == null) {//GEN-END:MVDGetBegin9
            // Insert pre-init code here
            hourItem = new StringItem("", "00");//GEN-BEGIN:MVDGetInit9
            hourItem.setFont(get_boldFont());//GEN-END:MVDGetInit9
            // Insert post-init code here
        }//GEN-BEGIN:MVDGetEnd9
        return hourItem;
    }//GEN-END:MVDGetEnd9

    /** This method returns instance for minItem component and should be called instead of accessing minItem field directly.//GEN-BEGIN:MVDGetBegin10
     * @return Instance for minItem component
     */
    public StringItem get_minItem() {
        if (minItem == null) {//GEN-END:MVDGetBegin10
            // Insert pre-init code here
            minItem = new StringItem("", "00");//GEN-BEGIN:MVDGetInit10
            minItem.setFont(get_boldFont());//GEN-END:MVDGetInit10
            // Insert post-init code here
        }//GEN-BEGIN:MVDGetEnd10
        return minItem;
    }//GEN-END:MVDGetEnd10

    /** This method returns instance for secItem component and should be called instead of accessing secItem field directly.//GEN-BEGIN:MVDGetBegin11
     * @return Instance for secItem component
     */
    public StringItem get_secItem() {
        if (secItem == null) {//GEN-END:MVDGetBegin11
            // Insert pre-init code here
            secItem = new StringItem("", "00");//GEN-BEGIN:MVDGetInit11
            secItem.setFont(get_boldFont());//GEN-END:MVDGetInit11
            // Insert post-init code here
        }//GEN-BEGIN:MVDGetEnd11
        return secItem;
    }//GEN-END:MVDGetEnd11

    /** This method returns instance for hcolonm component and should be called instead of accessing hcolonm field directly.//GEN-BEGIN:MVDGetBegin12
     * @return Instance for hcolonm component
     */
    public StringItem get_hcolonm() {
        if (hcolonm == null) {//GEN-END:MVDGetBegin12
            // Insert pre-init code here
            hcolonm = new StringItem("", ":");//GEN-BEGIN:MVDGetInit12
            hcolonm.setFont(get_boldFont());//GEN-END:MVDGetInit12
            // Insert post-init code here
        }//GEN-BEGIN:MVDGetEnd12
        return hcolonm;
    }//GEN-END:MVDGetEnd12

    /** This method returns instance for mcolons component and should be called instead of accessing mcolons field directly.//GEN-BEGIN:MVDGetBegin14
     * @return Instance for mcolons component
     */
    public StringItem get_mcolons() {
        if (mcolons == null) {//GEN-END:MVDGetBegin14
            // Insert pre-init code here
            mcolons = new StringItem("", ":");//GEN-BEGIN:MVDGetInit14
            mcolons.setFont(get_boldFont());//GEN-END:MVDGetInit14
            // Insert post-init code here
        }//GEN-BEGIN:MVDGetEnd14
        return mcolons;
    }//GEN-END:MVDGetEnd14

    /** This method returns instance for boldFont component and should be called instead of accessing boldFont field directly.//GEN-BEGIN:MVDGetBegin16
     * @return Instance for boldFont component
     */
    public Font get_boldFont() {
        if (boldFont == null) {//GEN-END:MVDGetBegin16
            // Insert pre-init code here
            boldFont = Font.getFont(Font.FACE_SYSTEM, 0x1, Font.SIZE_MEDIUM);//GEN-LINE:MVDGetInit16
            // Insert post-init code here
        }//GEN-BEGIN:MVDGetEnd16
        return boldFont;
    }//GEN-END:MVDGetEnd16

    /** This method returns instance for topSpacer component and should be called instead of accessing topSpacer field directly.//GEN-BEGIN:MVDGetBegin17
     * @return Instance for topSpacer component
     */
    public Spacer get_topSpacer() {
        if (topSpacer == null) {//GEN-END:MVDGetBegin17
            // Insert pre-init code here
            topSpacer = new Spacer(1000, 1);//GEN-BEGIN:MVDGetInit17
            topSpacer.setLayout(Item.LAYOUT_CENTER | Item.LAYOUT_VCENTER | Item.LAYOUT_2);//GEN-END:MVDGetInit17
            // Insert post-init code here
        }//GEN-BEGIN:MVDGetEnd17
        return topSpacer;
    }//GEN-END:MVDGetEnd17

    /** This method returns instance for scolonms component and should be called instead of accessing scolonms field directly.//GEN-BEGIN:MVDGetBegin18
     * @return Instance for scolonms component
     */
    public StringItem get_scolonms() {
        if (scolonms == null) {//GEN-END:MVDGetBegin18
            // Insert pre-init code here
            scolonms = new StringItem("", ":");//GEN-BEGIN:MVDGetInit18
            scolonms.setFont(get_boldFont());//GEN-END:MVDGetInit18
            // Insert post-init code here
        }//GEN-BEGIN:MVDGetEnd18
        return scolonms;
    }//GEN-END:MVDGetEnd18

    /** This method returns instance for msItem component and should be called instead of accessing msItem field directly.//GEN-BEGIN:MVDGetBegin19
     * @return Instance for msItem component
     */
    public StringItem get_msItem() {
        if (msItem == null) {//GEN-END:MVDGetBegin19
            // Insert pre-init code here
            msItem = new StringItem("", "00");//GEN-BEGIN:MVDGetInit19
            msItem.setFont(get_boldFont());//GEN-END:MVDGetInit19
            // Insert post-init code here
        }//GEN-BEGIN:MVDGetEnd19
        return msItem;
    }//GEN-END:MVDGetEnd19

    /** This method returns instance for startCommand component and should be called instead of accessing startCommand field directly.//GEN-BEGIN:MVDGetBegin20
     * @return Instance for startCommand component
     */
    public Command get_startCommand() {
        if (startCommand == null) {//GEN-END:MVDGetBegin20
            // Insert pre-init code here
            startCommand = new Command("Start", Command.OK, 1);//GEN-LINE:MVDGetInit20
            // Insert post-init code here
        }//GEN-BEGIN:MVDGetEnd20
        return startCommand;
    }//GEN-END:MVDGetEnd20
    /** This method returns instance for stopCommand component and should be called instead of accessing stopCommand field directly.//GEN-BEGIN:MVDGetBegin23
     * @return Instance for stopCommand component
     */
    public Command get_stopCommand() {
        if (stopCommand == null) {//GEN-END:MVDGetBegin23
            // Insert pre-init code here
            stopCommand = new Command("Stop", Command.STOP, 2);//GEN-LINE:MVDGetInit23
            // Insert post-init code here
        }//GEN-BEGIN:MVDGetEnd23
        return stopCommand;
    }//GEN-END:MVDGetEnd23
 
    /** This method returns instance for resetCommand component and should be called instead of accessing resetCommand field directly.//GEN-BEGIN:MVDGetBegin26
     * @return Instance for resetCommand component
     */
    public Command get_resetCommand() {
        if (resetCommand == null) {//GEN-END:MVDGetBegin26
            // Insert pre-init code here
            resetCommand = new Command("Reset", Command.CANCEL, 3);//GEN-LINE:MVDGetInit26
            // Insert post-init code here
        }//GEN-BEGIN:MVDGetEnd26
        return resetCommand;
    }//GEN-END:MVDGetEnd26
 
     
    public void startApp() {
        initialize();
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    
    /** Timer with 100ms accuracy. */
    private void startCommand() {
        if(timer == null) {
            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    doTimeUpdate(false);
                }
            }, 1, 100); // For second accuracy only use, 1000 instead of 100
        }
    }
    private void stopCommand() {
        if(timer != null) {
            timer.cancel();
            timer = null;
        }
    }
    private void resetCommand() {
        stopCommand();
        i_ms = 0;
        i_sec = 0;
        i_min = 0;
        i_hr = 0;
        doTimeDisplay(msItem, i_ms, true);
        doTimeDisplay(secItem, i_sec, false);
        doTimeDisplay(minItem, i_min, false);
        doTimeDisplay(hourItem, i_hr, false);
    }
    
    private void doTimeUpdate(boolean ignoreMS) {
        if(!ignoreMS) {
            if(i_ms < 9) {
                ++i_ms;
                doTimeDisplay(msItem, i_ms, true);
                return;
            } else {
                i_ms = 0;
                doTimeDisplay(msItem, i_ms, true);
                doTimeDisplay(secItem, i_sec, false);
            }
        }
        
        if(i_sec < 59) {
            ++i_sec;
            doTimeDisplay(secItem, i_sec, false);
            return;
        } else {
            i_sec = 0;
            doTimeDisplay(secItem, i_sec, false);
            doTimeDisplay(minItem, i_min, false);
        }
        
        if(i_min < 59) {
            ++i_min;
            doTimeDisplay(minItem, i_min, false);
            return;
        } else {
            i_min = 0;
            doTimeDisplay(minItem, i_min, false);
            doTimeDisplay(hourItem, i_hr, false);
        }
        
        if(i_hr < 23) {
            ++i_hr;
            doTimeDisplay(hourItem, i_hr, false);
            return;
        } else {
            i_hr = 0;
            doTimeDisplay(hourItem, i_hr, false);
            // TODO: Should we record this as a lap?
        }
    }
    private void doTimeDisplay(StringItem item, int value, boolean noPadding) {
        String valueText = "";
        if(value < 10 && !noPadding) valueText = "0"+value;
        else valueText += value;
        item.setText(valueText);
    }
}

