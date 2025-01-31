package aprendizado.EstruturaDeDados.AulaED2703array.src;

public class AppEx5 {
    
    public static void main(String[] args) throws Exception {
        
        MyArray locadora = new MyArray(10);
        locadora.add(new Carro("FIAT",2023,2023,"Argo","branco",75000.00));
        locadora.add(new Carro("FIAT",2023,2024,"Cronos","cinza",85000.00));
        locadora.add(new Carro("FORD",2023,2024,"KA","branco",70000.00));
        locadora.add(new Carro("FORD",2020,2021,"FIESTA","preto",75000.00));
        locadora.add(new Carro("VW",2022,2022,"POLO","vermelho",73000.00));
        locadora.add(new Carro("VW",2023,2023,"NIVUS","cinza",145000.00));
        locadora.add(new Carro("Chevrolet",2023,2024,"Onix","prata",72000.00));
        locadora.add(new Carro("Chevrolet",2024,2024,"Tracker","preto",130000.00));
        locadora.add(new Carro("BYD",2023,2023,"Dolphin","branco",125000.00));
        locadora.add(new Carro("RENAULT",2024,2024,"Kwid","branco",71000.00));
        
        for (int i = 0; i < locadora.size(); i++){            
            System.out.println("Marca: "+ ((Carro) locadora.get(i)).getMarca());
            System.out.println("Modelo: "+ ((Carro) locadora.get(i)).getModelo());
            System.out.println("Preço: R$ "+ ((Carro) locadora.get(i)).getPreco());
        }
        
        double total = 0;
        for (int i = 0; i < locadora.size(); i++){
            total += ((Carro) locadora.get(i)).getPreco();
        }
        System.out.println("Preço total: "+total);
        
    }
    
}
