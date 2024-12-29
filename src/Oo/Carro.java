package Oo;

public class Carro {
    Motor motor;

    Carro(){
        this.motor = new Motor(this);
    }

    void acelerar(){
       if (motor.fatorInjecao < 2.4){
           motor.fatorInjecao += 0.4;
       }else{
           motor.fatorInjecao = 2.4;
       }
    }

    void frear(){
        if (motor.fatorInjecao > 0.4){
            motor.fatorInjecao -= 0.4;
        }else{
            motor.fatorInjecao = 0;
        }
    }

    void ligar(){
        motor.ligado = true;
    }

    void desligar(){
        motor.ligado = false;
    }
}
