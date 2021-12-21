package br.com.cursojava;

    public class LimiteConta extends ContaBancaria {

        private double limiteConta;

        public double getLimiteConta() {
            return limiteConta;
        }

        public void setLimiteConta(double limite) {
            this.limiteConta = limite;
        }

        @Override
        public String toString() {
            String s = "LimiteConta [";
            s += " LimiteConta: "+ limiteConta;
            s += " = "+ super.toString();
            s += "]";
            return s;
        }

        public boolean sacar(double valor) {
            double saldoLimiteConta = this.getSaldo() + limiteConta;
            if((saldoLimiteConta - valor) >= 0) {
                this.setSaldo(this.getSaldo() - valor);
                return true;
            }
            return false;
        }
    }


