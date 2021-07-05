/**
         * Objectif: 
         * 
         * 1. d�clarer tableau de chaines de caract�res. Avec 3 noms de cr�pes
         * 2. Afficher le contenu du tableau en utilisant une boucle foreach.
         * 
         * 
         * Le code comment� est pour la version alternative, utlisant un tableau associatif
         */ 


// import java.util.*;


public class Interface3{

     public static void main(String []args){
         
         
         //Pour l'aternative avec tableau associatif (hashmap)
         // constante:  on ne souhaite plus la modifier apr�s d�claration

        // final String ID_CREPE_BOIS = "crepeBois";  
        // final String ID_CREPE_CUPIDON = "crepeCupidon"; 
        // final String ID_CREPE_COCO = "crepeCoco"; 

         
       String messageBienvenue = "Bienvenue" ;
	   String nomRestaurant = "Sel et Miel"; 
		
		System.out.println(messageBienvenue + " chez " + nomRestaurant); 
	 

		System.out.println("--- Notre Menu Cr�pes ---"); 

	
      
    
        
        String [] menuCrepes = new String [] {"Cr�pe Cupidon", "Cr�pe des bois", "Cr�pe au sucre"}; 
        int [] prixCrepes = new int [] {15, 12, 13}; 
        
        String espacementCrepePrix = "\t...\t";
        String euro = " EUR "; 
        
        //Comme les deux tableaux ont la m�me taille, on peut se permettre defaire 
        for (int i =0 ; i< menuCrepes.length; i++) {
            System.out.println(menuCrepes[i] + 
            
                                espacementCrepePrix + 
                                        prixCrepes[i] + euro); 
                                        

        }
        
    
    
    // 	System.out.println("--- Notre Menu Cr�pes (alternative avec tableau associatif)---"); 

    
    //     Map<String,String> nomCrepes = new HashMap<String,String>();
        
    

    //     nomCrepes.put(ID_CREPE_BOIS, "Cr�pe des Bois"); 
    //     nomCrepes.put(ID_CREPE_CUPIDON, "Cr�pe Cupidon"); 
    //     nomCrepes.put(ID_CREPE_COCO, "Cr�pe Coconutella"); 
        
    //     Map<String,Integer> prixAssoc= new HashMap<String,Integer>();
        
    //     prixAssoc.put(ID_CREPE_BOIS, new Integer(12)); 
    //     prixAssoc.put(ID_CREPE_CUPIDON, new Integer(15)); 
    //     prixAssoc.put(ID_CREPE_COCO, new Integer(13)); 
        
    //     // nomCrepes.keySet() : r�cup�ration des cl�s utilis�es pour le tableau associatif
        
    //     for(String idCrepe : nomCrepes.keySet()){
            
    //     	System.out.println(nomCrepes.get(idCrepe) + 
    //     	                                espacementCrepePrix +
    //     	                                    prixAssoc.get(idCrepe) + euro) ; 

    //     }
        
         
         




     }
}