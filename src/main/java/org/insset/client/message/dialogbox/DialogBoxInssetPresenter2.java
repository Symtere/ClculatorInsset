/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.message.dialogbox;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 *
 * @author user
 */
public class DialogBoxInssetPresenter2 extends DialogBox {

    public DialogBoxInssetPresenter2(String titre, String demande, String reponse[]) {
        super();
        this.setText(titre);
        formateBox(demande, reponse);
    }

    private void formateBox(String demande, String reponse[]) {

//         Create the popup dialog box
        setAnimationEnabled(true);
        final Button closeButton = new Button("Close");
        // We can set the id of a widget by accessing its Element
        closeButton.getElement().setId("closeButton");

        //Add a handler to close the DialogBox
        closeButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                hide();
            }
        });

        final Label textToServerLabel = new Label(demande);
        final HTML serverResponseLabel = new HTML(reponse[0]);
        final HTML serverResponse2Label = new HTML(reponse[1]);
        VerticalPanel dialogVPanel = new VerticalPanel();
        dialogVPanel.addStyleName("dialogVPanel");
        dialogVPanel.add(new HTML("<b>Demande envoyé au server :</b>"));
        dialogVPanel.add(textToServerLabel);
        dialogVPanel.add(new HTML("<br><b>Montant de la reduction :</b>"));
        dialogVPanel.add(serverResponseLabel);
        dialogVPanel.add(new HTML("<br><b>Prix total :</b>"));
        dialogVPanel.add(serverResponse2Label);
        dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
        dialogVPanel.add(closeButton);
        setWidget(dialogVPanel);
        center();
        closeButton.setFocus(true);
    }
}
