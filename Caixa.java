import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Caixa implements Comparable<Caixa> {
    
    private final int id;
    private final int[] dimensoes;

    public Caixa(int id, int[] dimensoes) {
        this.id = id;
        this.dimensoes = dimensoes;
    }

    @Override
    public int compareTo(Caixa outra) {
        Comparator<Caixa> comparador = Comparator.comparingInt(
            caixa -> Arrays.compare(caixa.dimensoes, outra.dimensoes));
        return comparador.compare(this, outra);
    }

    public boolean cabeDentro(Caixa outra) {
        return IntStream.range(0, 3).allMatch(i -> this.dimensoes[i] < outra.dimensoes[i]);
    }

    public int getId() {return id;}
}
