package Entities;

public class LegalPerson extends Person implements IData {
    private long cnpj;
    private String corporateReason;

    public LegalPerson(String name, Double balance, Double withdrawLimit, long cnpj, String corporateReason) {
        super(name, balance, withdrawLimit);
        this.cnpj = cnpj;
        this.corporateReason = corporateReason;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getCorporateReason() {
        return corporateReason;
    }

    public void setCorporateReason(String corporateReason) {
        this.corporateReason = corporateReason;
    }

    @Override
    public String data() {
        return "Tipo de conta: PJ" + "\n" +
                "Idenficação CNPJ: " + getCnpj() + "\n" +
                "Razão Social " + getCorporateReason() + "\n" +
                "Nome do Responsável da Empresa: " + getName();
    }
}
