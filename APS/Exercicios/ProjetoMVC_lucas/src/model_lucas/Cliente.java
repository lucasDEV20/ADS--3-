/*
apresenta a implementação da classe Cliente. Observe que os mesmos atributos que
aparecem no banco de dados são refletidos nessa implementação. Além disso, um construtor que recebe
todos os atributos da classe é codificado, como também os getters e setters tradicionais e o
método toString(), seguindo assim o padrão JavaBeans
 */
package model_lucas;

/**
 *
 * @author Computador
 */
public class Cliente {
    //metodos privados
    private int id;
    private String nome;
    private String email;
    
    
    public Cliente(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
        
    }

    //getrs 
    public int getId() {return id;}

    public String getNome() {return nome;}

    public String getEmail() {return email;}

    //setrs
    public void setId(int id) {this.id = id;}
    
    public void setNome(String nome) {this.nome = nome;}

    public void setEmail(String email) { this.email = email;}

    
    //toString
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", email=" + email + '}';
    }
    
}

