package com.bluemsun.service;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

/**
 * Created by mafx on 2018/11/11.
 * @author mafx.
 */
public class ImageIdentificationService {
    public String ideentification(String imagepath,String language,String tessDataPath){
        System.out.println(imagepath);
        System.out.println(tessDataPath);
        File file=new File(imagepath);
        ITesseract iTesseract=new Tesseract();
        iTesseract.setDatapath(tessDataPath);
        iTesseract.setLanguage(language);
        String result=null;
        try {
            result=iTesseract.doOCR(file);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
        return result;
    }


}
