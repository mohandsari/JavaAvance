package fr.dauphine.javaavance.td3;

public class MyList {
	Cell First;
	
	public MyList() {
		First = new Cell(null,null);
	}
	public void add(String s) {
		First.info =s;
	}

	public Cell getFirst() {
		return First;
	}

	public int size() {
		int nb= 0;
		Cell ref= getFirst();
		while (ref != null) {
			nb++;
			ref= ref.getNext();
		}
		return nb;
	}
	public void ajouterAuDebut(String s) {
		Cell ancienPremier= First;
		First= new Cell(s,ancienPremier);
	}
	public String toString(){
        String retStr = "Contents:\n";

        Cell current = First;
        while(current != null){
            retStr += current.getValeur() + "\n";
            current = current.getNext();

        }

        return retStr;
    }
	
	
	private Cell getDernierElement() {
		Cell dernier= First;
		while (dernier.getNext() != null) {
		dernier= dernier.getNext();
		}
		return dernier;
		}
	
	public void addLast(String s) {
		if (estVide()) {
			First= new Cell(s,null);
		} else {
		// Il y a un dernier élément.
		// On le cherche et on ajoute après lui.
		Cell dernier = getDernierElement();
		// nous savons que
		// dernier.getSuivant() == null => dernier est bien le dernier élément.
		dernier.setNext(new Cell(s,null));
		}
		}

	public void ajouterALaFin(String s) {
		if (estVide()) {
			First= new Cell(s,null);
		} else {
			// Il y a un dernier élément.
			// On le cherche et on ajoute après lui.
			Cell dernier = getLast();
			// nous savons que
			// dernier.getSuivant() == null => dernier est bien le dernier élément.
			dernier.setNext(new Cell(s,null));
		}
	}
	
	
	
	public void add(String s, int i) {
		int indice = 0;
		if (i >= size()) addLast(s); //insertion a la fin
		if (i == 0) {
			// Insertion au début de la liste.
			add(s);
		} else {
			Cell ref= getFirst();
			while (ref != null && indice!=i) {
				ref=ref.getNext();
				indice++;
			}
			Cell n = new Cell(s,ref.getNext());
			ref.setNext(n);
		}
	}


	
	private Cell getLast() {
		Cell dernier= First;
		while (dernier.getNext() != null) {
			dernier= dernier.getNext();
		}
		return dernier;
	}

	private boolean estVide() {
		if (First == null) return true;
		else return false;

	}
	
	public String get(int i) {
		int indice = 0;
		if (i>size()) throw new IllegalArgumentException(i + " is > taille chaine :"+size()) ;
		else if (i == size()) return getLast().info; 
		else if (i == 0) return First.info;
		else {
			Cell ref= getFirst();
			while (ref != null && indice!=i) {
				ref=ref.getNext();
				indice++;
			}
			return ref.info;
		}
	}
	public int sumLetters() {
		int sme =0;
		Cell ref= getFirst();
		while (ref != null ) {
			sme= sme+ref.info.length();
			ref=ref.getNext();
		}
		return sme;
	}
	public static void main(String[] args) {
		 MyList ml = new MyList();
		 ml.addLast("tatu");
		 ml.add("toto");
		 ml.add("titi");
		 ml.addLast("tutu");
		 System.out.println(ml.toString());
		 
	}

}
