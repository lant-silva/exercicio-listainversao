package view;
import model.Lista;
public class Main {
	public static void main(String[] args) throws Exception{
		
		int[] vetor = {3,5,18,12,9,7,6,2,13,4,16};
		Lista l = new Lista();
		l.vectorInit(vetor, l);
		
		l = inverterLista(l);
		l.printList(l);
	}

	private static Lista inverterLista(Lista l) throws Exception {
		Lista aux = new Lista();
		
		for(int i=0; i < l.size(); i++) {
			aux.add(l.get((l.size()-1)-i), i);
		}	
		return aux;
	}
}
