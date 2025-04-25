/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author elron
 */
public class Lista {
    public ObjectMapper objMapper = new ObjectMapper();
    
    public void getJSON() throws IOException{
        Lista lista =objMapper.readValue(new File("ListaTempo.json"),Lista.class);
        System.out.println();
    }
    
    public void Adicionar(){
        
    }
    public void Deletar(){
        
    }
    public void Editar(){
        
    }
}
