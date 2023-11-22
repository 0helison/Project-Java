package Entities;

import exceptions.BusinessException;

public class PhysicalPerson extends Person implements IData {
    private long cpf;
    private int age;
    public PhysicalPerson(String name, Double balance, Double withdrawLimit, long cpf, int age) {
        super(name, balance, withdrawLimit);
        this.cpf = cpf;
        this.age = age;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void period() {
        if (getAge() < 18) {
            throw new BusinessException("Falhou, seus dados informam que você é menor de idade!");
        }
    }
    @Override
    public String data() {
        return "Tipo de conta: PF" + "\n" +
                "Idenficação CPF: " + getCpf() + "\n" +
                "Nome: " + getName() + "\n" +
                "Idade: " + getAge() + " anos";
    }
}



