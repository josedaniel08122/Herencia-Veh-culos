/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transportes;

/**
 *
 * @author josed
 */
public class Transportes {

    
    public static void main(String[] args) {
        // Crear un vehiculo terrestre
        
        VehiculoTerrestre vehiculoTerrestre=new VehiculoTerrestre("Mattel", "Terreneitor", 4);
        VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha", "Yamaha", "Motor prr prr");
        
        
        //Mostrar información de los vehiculos
        System.out.println("Información del Vehículo Terrestre");
        vehiculoTerrestre.mostrarInfo();
        
        System.out.println("Información del Vehículo Acuático");
        vehiculoAcuatico.mostrarInfo();
    }
    
}
