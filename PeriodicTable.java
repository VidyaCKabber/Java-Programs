/*Let’s do something fun for your assignment.

In this assignment, you will use abbreviations of the elements in the chemistry periodic table to spell English words. We will provide you with the abbreviations in the assignment starter code.

Specifically, your program will prompt the user to enter an English word and respell the word using abbreviations of the elements.

For example, if you enter the word phone, the program will respell the word using abbreviations of the elements (with correct punctuations) as PHoNe.

Or more specifically, your program will spell the word 'phone' with the following elements:

Phosphorous (P)
Ho (Holmium)
Ne (Neon)

If you cannot spell the given word with the elements of the periodic table, your program should output “cannot spell word”.
Here are a few additional test cases for you to test your program.
If the inputs are —
ten
conference
onomatopoeia

The outputs should be —
TeN
CoNFeReNCe
cannot spell word
*/

import java.util.*;

class PeriodicTable {
    public static void main(String[] args) {
        String[] elements = { "H", "a", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl",
                    "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr",
                    "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs",
                    "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W",
                    "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np",
                    "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg",
                    "Cn", "Uut", "Uuq", "Uup", "Uuh", "Uus", "Uuo"};
            
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String inputWord = myScanner.next();
            String result = spellWord(inputWord, elements);
            System.out.print(result);
            myScanner.close();
    }
    
    public static String spellWord(String word, String[] elements) {
        // write your code here to spell word with element abbreviations
        String updatedWord = "", updatedChar = "", result="";
        String arr[] = {};  
        
        List<String> ele = new ArrayList<String>();
            for(String i : elements) {
                ele.add(i.toLowerCase());
            }
        arr = ele.toArray(arr); 
        
        try {
            for(int i=0; i< word.length(); i++){
                updatedChar = "";
                for(int j=i+1; j<= word.length(); j++){
                    if (Arrays.asList(arr).contains(word.substring(i,j))){
                     System.out.println(word.substring(i,j)+" found\n");
                        updatedChar = "";
                        updatedChar = updatedChar + word.substring(i, j);
                    } 
                }
                
                int index = Arrays.asList(arr).indexOf(updatedChar);
                updatedWord = updatedWord + elements[index];
                i = updatedWord.length()-1;
            }
            
            if(word.length() == updatedWord.length()){
                return updatedWord;
            } else {
                return "cannot spell word";
            }
        
        } catch (ArrayIndexOutOfBoundsException e ){
            return "cannot spell word";
        }
    }
};
            
