package com.aetherwars.model;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import com.aetherwars.util.CSVReader;

public class CardReader {
    public void readCharacter(CardLibrary lib, File characterCSVFile){
        CSVReader csv = new CSVReader(characterCSVFile,"\t");
        csv.setSkipHeader(true);
        List<String[]> data = new ArrayList<String[]>();
        try{
            data = csv.read();
            for (String[] isi : data){
                Card kartu = new Character(Integer.parseInt(isi[0]), isi[1], TypeChar.valueOf(isi[2]), isi[3], isi[4], Integer.parseInt(isi[5]), 
                Integer.parseInt(isi[6]), Integer.parseInt(isi[7]), Integer.parseInt(isi[8]), Integer.parseInt(isi[9]));
                try{
                    lib.addCard(kartu);
                }
                catch(Exception e){
                }
            }
        }
        catch(Exception e){
        }
    }

    public void readPTN(CardLibrary lib, File ptnCSVFile){
        CSVReader csv = new CSVReader(ptnCSVFile,"\t");
        csv.setSkipHeader(true);
        List<String[]> data = new ArrayList<String[]>();
        try{
            data = csv.read();
            for (String[] isi : data){
                Card kartu = new PTN(Integer.parseInt(isi[0]), isi[1], isi[3], isi[2], Integer.parseInt(isi[6]), 
                TypeSpell.valueOf("PTN"), Integer.parseInt(isi[4]), Integer.parseInt(isi[5]), Integer.parseInt(isi[7]));
                try{
                    lib.addCard(kartu);
                }
                catch(Exception e){
                }
            }
        }
        catch(Exception e){
        }
    }

    public void readSwap(CardLibrary lib, File swapCSVFile){
        CSVReader csv = new CSVReader(swapCSVFile,"\t");
        csv.setSkipHeader(true);
        List<String[]> data = new ArrayList<String[]>();
        try{
            data = csv.read();
            for (String[] isi : data){
                Card kartu = new SWAP(Integer.parseInt(isi[0]), isi[1], isi[3], isi[2], Integer.parseInt(isi[4]), 
                TypeSpell.valueOf("SWAP"), Integer.parseInt(isi[5]));
                try{
                    lib.addCard(kartu);
                }
                catch(Exception e){
                }
            }
        }
        catch(Exception e){
        }
    }

    public void readMorph(CardLibrary lib, File morphCSVFile){
        CSVReader csv = new CSVReader(morphCSVFile,"\t");
        csv.setSkipHeader(true);
        List<String[]> data = new ArrayList<String[]>();
        try{
            data = csv.read();
            for (String[] isi : data){
                Card kartu = new MORPH(Integer.parseInt(isi[0]), isi[1], isi[3], isi[2], Integer.parseInt(isi[5]), 
                TypeSpell.valueOf("MORPH"), Integer.parseInt(isi[4]));
                try{
                    lib.addCard(kartu);
                }
                catch(Exception e){
                }
            }
        }
        catch(Exception e){
        }
    }

    public void readLvl(CardLibrary lib, File lvlCSVFile){
        CSVReader csv = new CSVReader(lvlCSVFile,"\t");
        csv.setSkipHeader(true);
        List<String[]> data = new ArrayList<String[]>();
        try{
            data = csv.read();
            System.out.println(data);
            for (String[] isi : data){
                Card kartu = new LVL(Integer.parseInt(isi[0]), isi[1], isi[3], isi[2], Integer.parseInt(isi[5]), 
                TypeSpell.valueOf("LVL"), isi[4]);
                try{
                    lib.addCard(kartu);
                }
                catch(Exception e){
                }
            }
        }
        catch(Exception e){
        }
    }
}
