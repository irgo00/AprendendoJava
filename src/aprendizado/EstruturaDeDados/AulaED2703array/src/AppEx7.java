package aprendizado.EstruturaDeDados.AulaED2703array.src;

public class AppEx7 {
    
    public static void main(String[] args) throws Exception {
        
        MyArray locadora1 = new MyArray(5);
        locadora1.add(new Carro("FIAT",2023,2023,"Argo","branco",75000.00));
        locadora1.add(new Carro("FIAT",2023,2024,"Cronos","cinza",85000.00));
        locadora1.add(new Carro("FORD",2023,2024,"KA","branco",70000.00));
        locadora1.add(new Carro("FORD",2020,2021,"FIESTA","preto",75000.00));
        locadora1.add(new Carro("VW",2022,2022,"POLO","vermelho",73000.00));
        MyArray locadora2 = new MyArray(5);
        locadora2.add(new Carro("VW",2023,2023,"NIVUS","cinza",145000.00));
        locadora2.add(new Carro("Chevrolet",2023,2024,"Onix","prata",72000.00));
        locadora2.add(new Carro("Chevrolet",2024,2024,"Tracker","preto",130000.00));
        locadora2.add(new Carro("BYD",2023,2023,"Dolphin","branco",125000.00));
        locadora2.add(new Carro("RENAULT",2024,2024,"Kwid","branco",71000.00));
        
        System.out.println(locadora1);
        System.out.println("\n\n\n");
        System.out.println(locadora2);
        
        MyArray fusao = locadora1.concatenate(locadora2);
        System.out.println(fusao);
        System.out.println("\n\n\n");
        
        MyArray fusao2 = MyArray.concatenate(locadora1, locadora2);
        System.out.println(fusao2);
        
    }
    
}
