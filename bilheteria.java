



ubli class. App{
    Run/ Debung
    public static void main(String[]args)throws exeption{
        // instancia a closse Scanner
        Scanner leia= new Scanner(System.in);

        // declaração de variáveis
        String[] salas= nex String[5];
        String nome;
        String sala;
        int idade;
        int idadeMinima=0;

        // iniciar a array
        salas[0]= "Aroda Quadradade";
        salas [1]="A Volta dos Não Foram";
        salas [2]= "Poeira em Alto Mar";
        salas [3]=" AS Tranças do Rei Careca";
        salas [4]= "A Vingança do Peixe Frito";

        // entrada de dados
        System.out.printin("Informe o nome:");
        nome= leia.nextlime();
        System.out.printin("Informe a idade:");
        idade= leia.nexInt();

        //limpeza de buffer 
+        leia.nextline();

        // loop
        do{
            //menu
            System.out.printin("Sala 1-"+ salas[0]+"-Livre");
            System.out.printin("Sala 2-"+ salas[1]+"- 12 anos");
            System.out.printin("Sala 3-"+ salas[2]+"- 14 anos ");
            System.out.printin("Sala 4-"+ salas[3]+"- 16 anos");
            System.out.printin("Sala 5-"+ salas[4]+"- 18 anos);
            System.out.printin(" Informe a sala desejada:");
            sala=leia.nexline();

            //TODO: TERMINAR O PROGRAMA

        }while(idade<idadeMinima);


        // fecha objeto leia
        leia close ();
    }