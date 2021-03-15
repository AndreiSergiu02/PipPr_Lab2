package lab2;

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("message for second commit");
		System.out.println("just a new commit message");
	}

}

class CountCharacter    
{    
    public static void main(String[] args) {    
        String string = "incercare de combinare al ramurilor master si CountCharacter";    
        int count = 0;    
            
        //contorizeaza fiecare caracter exceptand spatiul    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
           
        System.out.println("Numarul de caractere al stringului este: " + count);    
    }    
}     