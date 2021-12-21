import br.com.cursojava.ContaBancaria;

import java.util.Calendar;

class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;
    private double Saldo;

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        String s = "ContaPoupanca [";
        s += " Dia do rendimento: "+ diaRendimento;
        s += " = "+ super.toString();
        s += "]";
        return s;
    }

    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();

        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            //saldo += saldo * taxaRendimento;
            this.setSaldo(setSaldo() + (this.setSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }

    private double setSaldo() {
        return Saldo;
    }

    public void setNomeCliente(String NomeCliente) {
    }

    public void depositar(double v) {
    }

    public void setNumConta(String s) {
    }

    @Override
    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
}