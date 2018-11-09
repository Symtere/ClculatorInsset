package org.insset.client.integerToRoman;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ResetButton;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.TextBox;
import org.insset.client.message.dialogbox.DialogBoxInssetPresenter2;
import org.insset.client.message.dialogbox.DialogBoxInssetPresenter3;
import org.insset.client.service.CedricConverterIntegerToRomanService;
import org.insset.client.service.CedricConverterIntegerToRomanServiceAsync;
import org.insset.shared.FieldVerifier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author talend
 */
public class IntegerToRomanPresenter extends Composite {

    @UiField
    public ResetButton boutonClear;
    @UiField
    public ResetButton boutonClear2;
    @UiField
    public SubmitButton boutonConvert;
    @UiField
    public SubmitButton boutonConvert2;
    @UiField
    public TextBox val;
    @UiField
    public TextBox val2;
    @UiField
    public Label errorLabel;
    @UiField
    public TextBox val2_1;
    @UiField
    public TextBox val2_2;
    @UiField
    public Label errorLabel2;

    interface MainUiBinder extends UiBinder<HTMLPanel, IntegerToRomanPresenter> {
    }

    private static MainUiBinder ourUiBinder = GWT.create(MainUiBinder.class);
    /**
     * Create a remote service proxy to talk to the server-side Greeting
     * service.
     */
    private final CedricConverterIntegerToRomanServiceAsync service = GWT.create(CedricConverterIntegerToRomanService.class);

    /**
     * Constructeur
     */
    public IntegerToRomanPresenter() {
        initWidget(ourUiBinder.createAndBindUi(this));
        initHandler();
    }

    /**
     * Init des handler
     */
    private void initHandler() {
        boutonClear.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                val.setText("");
                val2.setText("");
                errorLabel.setText("");
            }
        });
        boutonConvert.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                AmountMultiPourcentage();
            }

        });
        boutonClear2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                val2_1.setText("");
                val2_2.setText("");
                errorLabel2.setText("");
            }
        });
        boutonConvert2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                ReducDivisePourcentage();
            }

        });
    }

    /**
     * call server
     */
    private void AmountMultiPourcentage() {
        if (!FieldVerifier.isValidDouble(val.getText(), val2.getText())) {
            errorLabel.addStyleName("serverResponseLabelError");
            errorLabel.setText("Format incorect");
            return;
        }
        service.AmountMultiPourcentage(val.getText(), val2.getText(), new AsyncCallback<String[]>() {
            public void onFailure(Throwable caught) {
                // Show the RPC error message to the user
//                Window.alert(SERVER_ERROR);
            }

            public void onSuccess(String result[]) {
                errorLabel.setText(" ");
                new DialogBoxInssetPresenter2("Résultats : ", val.getText(), result);
            }
        });
    }

    /**
     * call server
     */
    private void ReducDivisePourcentage() {
        if (!FieldVerifier.isValidDouble(val2_1.getText(), val2_2.getText())) {
            errorLabel2.addStyleName("serverResponseLabelError");
            errorLabel2.setText("Format incorect");
            return;
        }
        service.ReducDivisePourcentage(val2_1.getText(), val2_2.getText(), new AsyncCallback<String[]>() {
            public void onFailure(Throwable caught) {
                // Show the RPC error message to the user
//                Window.alert(SERVER_ERROR);
            }

            public void onSuccess(String result[]) {
                errorLabel.setText(" ");
                new DialogBoxInssetPresenter3("Résultats : ", val2_1.getText(), result);
            }
        });
    }
}
