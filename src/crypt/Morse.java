package crypt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;


public class Morse extends Spielsprache
{
    private Map <String, String> charToCode;
    private Map <String, String> codeToChar;

    String[] mutatables = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "?", ".", ",", "ß", "ä", "ö", "ü", " "};

    String[] encoded = {". -", "- . . .", "- . - .", "- . .", ".", ". . - .", "- - .", ". . . .", ". .", ". - - -",
    "- . -", ". - . .", "- -", "- .", "- - -", ". - - .", "- - . -", ". - .", ". . .", "-", ". . -", ". . . -",
    ". - -", "- . . -", "- . - -", "- - . .", ". - - - -", ". . - - -", ". . . - -", ". . . . -", ". . . . .",
    "- . . . .", "- - . . .", "- - - . .", "- - - - .", "- - - - -", ". . - - . .", ". - . - . -", "- - . . - -",
    ". . . - - . .", ". - . -", "- - - .", ". . - -", " "
    };
    
    
    public Morse()
    {
        this.charToCode = Tools.mapDict(mutatables, encoded);
        this.codeToChar = Tools.mapDict(encoded, mutatables);
    }
   
    @Override
    public String encrypt(String t)
    {          
        t = t.toLowerCase();
        String out = "";
        
        for(int i = 0; i < t.length(); i++) {
        	if (Arrays.asList(mutatables).contains(String.valueOf(t.charAt(i)))){
        		out += charToCode.get(String.valueOf(t.charAt(i))) + "   ";
        	}
        	else{
        		out += t.charAt(i);
        	}
        }        
        return out.trim();
    }
    
    @Override
    public String decrypt(String m) {   
            String in = m.trim();
           
            ArrayList<String> words = new ArrayList<>();
        
            try{
                while(in.length() != 0) {
                    String word = in.substring(0, in.indexOf("       "));
                    words.add(word);
                    in = in.replace(word + "       ", "");
                    words.add(" ");
                }
            } catch(Exception e) {words.add(in);}
        
            ArrayList<String> characters = new ArrayList<>();
        
            for(int i = 0; i < words.size(); i++) {
                String singleword = words.get(i);
                System.out.println("Betrachte: " + singleword);
                try{
                    while(singleword.length() != 0) {
                        String singlechar = singleword.substring(0, singleword.indexOf("   "));
                        System.out.println("Extrahiere: " + singlechar);
                        characters.add(singlechar);
                        singleword = singleword.replaceFirst(singlechar + "   ", "");
                    }   
                } catch(Exception e) {characters.add(singleword);}

            String out = "";
            String currentChar = "";
        
            for(int i = 0; i < characters.size(); i++) {
                currentChar = characters.get(i);
                out = out + codeToChar.get(currentChar);
                currentChar = "";
            }
            
            return out;
      } 
}   