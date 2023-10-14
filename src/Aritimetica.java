public class Aritimetica implements ICalcMedia{


    @Override
    public double CalculaMedia(double A, double B) {
        double answer = (A+B)/2;
        return answer;
    }

    @Override
    public String Situacao(double media) {
        String resultado;
        if(media>5)
        {
            resultado = "Aprovado";
        } else resultado  = "Reprovado";

        return resultado;

    }
}

