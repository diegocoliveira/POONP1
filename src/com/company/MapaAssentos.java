public class MapaAssentos {

    private char [][] primeiraClasse =
            {{'X','X','X'},
             {'X','X','X'},
             {'X','X','X'}};

    private char [][] classeExecutiva =
            {{'X','X','X','X'},
             {'X','X','X','X'},
             {'X','X','X','X'},
             {'X','X','X','X'},
             {'X','X','X','X'},
             {'X','X','X','X'},
             {'X','X','X','X'},
             {'X','X','X','X'}};

    private char [][] classeEconomica =
            {{'X','X','X','X','X','X'},
             {'X','X','X','X','X','X'},
             {'X','X','X','X','X','X'},
             {'X','X','X','X','X','X'},
             {'X','X','X','X','X','X'},
             {'X','X','X','X','X','X'},
             {'X','X','X','X','X','X'},
             {'X','X','X','X','X','X'},
             {'X','X','X','X','X','X'},
             {'X','X','X','X','X','X'}};;

     public void mostrarMapaAssentos(){
         int cont = 01;

         System.out.println("\nMAPA DE ASSENTOS DO VÔO SELECIONADO COM DIVISÃO DAS CLASSES\n");
         System.out.print("\n\t-\t\t\tA\t\tB\t\tC\t\tD\t\tE\t\tF\n\n");
         System.out.println("1ª Classe:");

         for (int i = 0; i < 3; i++) {
             System.out.println();
             System.out.printf("\t%02d\t\t",cont);
             cont++;
             for (int j = 0; j < 3; j++) {
                 System.out.printf("\t%c\t", primeiraClasse[i][j]);
             }
         }

         System.out.println("\n\nExecutiva:");

         for (int i = 0; i < 8; i++) {
             System.out.println();
             System.out.printf("\t%02d\t\t",cont);
             cont++;
             for (int j = 0; j < 4; j++) {
                 System.out.printf("\t%c\t", classeExecutiva[i][j]);
             }
         }

         System.out.println("\n\nEconômica:");

         for (int i = 0; i < 10; i++) {
             System.out.println();
             System.out.printf("\t%02d\t\t",cont);
             cont++;
             for (int j = 0; j < 6; j++) {
                 System.out.printf("\t%c\t", classeEconomica[i][j]);
             }
         }

         System.out.println("\n\nLegenda do mapa:");
         System.out.println("'X' - Poltrona Disponível");
         System.out.println("'-' - Poltrona Ocupada");

     }
    
     public char[][] getPrimeiraClasse() {
        return primeiraClasse;
    }

    public void setPrimeiraClasse(char[][] primeiraClasse) {
        this.primeiraClasse = primeiraClasse;
    }

    public char[][] getClasseExecutiva() {
        return classeExecutiva;
    }

    public void setClasseExecutiva(char[][] classeExecutiva) {
        this.classeExecutiva = classeExecutiva;
    }

    public char[][] getClasseEconomica() {
        return classeEconomica;
    }

    public void setClasseEconomica(char[][] classeEconomica) {
        this.classeEconomica = classeEconomica;
    }
}
