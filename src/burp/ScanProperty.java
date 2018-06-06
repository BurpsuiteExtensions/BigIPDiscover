/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burp;

import extend.view.base.MatchItem;
import java.util.EnumSet;

/**
 *
 * @author isayan
 */
public class ScanProperty {

    private boolean scanRequest = true;

    public boolean getScanRequest() {
        return this.scanRequest;
    }

    public void setScanRequest(boolean value) {
        this.scanRequest = value;
    }

    private boolean scanResponse = true;

    public boolean getScanResponse() {
        return this.scanResponse;
    }

    public void setScanResponse(boolean value) {
        this.scanResponse = value;
    }

    private EnumSet<MatchItem.NotifyType> notifyTypes = EnumSet.noneOf(MatchItem.NotifyType.class);

    /**
     * @return the notifyTypes
     */
    public EnumSet<MatchItem.NotifyType> getNotifyTypes() {
        return this.notifyTypes;
    }

    /**
     * @param notifyTypes the notifyType to set
     */
    public void setNotifyTypes(EnumSet<MatchItem.NotifyType> notifyTypes) {
        this.notifyTypes = notifyTypes;
    }

    private MatchItem.HighlightColor highlightColor = null;

    /**
     * @return the highlightColor
     */
    public MatchItem.HighlightColor getHighlightColor() {
        return this.highlightColor;
    }

    /**
     * @param highlightColor the highlightColor to set
     */
    public void setHighlightColor(MatchItem.HighlightColor highlightColor) {
        this.highlightColor = highlightColor;
    }
}
