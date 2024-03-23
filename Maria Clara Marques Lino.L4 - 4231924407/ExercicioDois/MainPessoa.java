package ExercicioDois;

public class MainPessoa {
    
        public static void main(String[] args) {
    
            Pessoa vinicius = new Pessoa("Vinícius", 41);
            Pessoa daniela = new Pessoa("Daniela", 44);
            Pessoa ana = new Pessoa("Ana", 18);
            Pessoa carla = new Pessoa("Carla", 20);
            Pessoa daniel = new Pessoa("Daniel Paiva", 31);
            Pessoa felipe = new Pessoa("Felipe", 24);
            Pessoa patricia = new Pessoa("Patricia", 23);
            Pessoa rafael = new Pessoa("Rafael", 20);
            Pessoa pedro = new Pessoa("Pedro", 22);
            Pessoa marcela = new Pessoa("Marcela", 24);
            Pessoa amanda = new Pessoa("Amanda", 100);
    
            Pessoa[] listaPessoas = { vinicius, daniela,
                    ana, carla,
                    daniel, felipe,
                    pedro, patricia,
                    rafael, marcela, amanda };

            System.out.println("Pessoa com 100 anos de idade: ");
            for (Pessoa pessoa : listaPessoas) {
                if (pessoa.getIdade() == 100) {
                    System.out.println(pessoa.toString());
                }
            }
    
            System.out.println("\nPessoas acima de 31 anos de idade:");
            for (Pessoa pessoa : listaPessoas) {
                if (pessoa.getIdade() > 31) {
                    System.out.println(pessoa.toString());
                }
            }
    
            System.out.println("\nAlterando todas as idades para 18 anos");
            for (Pessoa pessoa : listaPessoas) {
                pessoa.setIdade(18);
                System.out.println(pessoa.toString());
            }
        }
    }

