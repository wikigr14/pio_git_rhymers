package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer rozszerza klasę DefaultCountingOutRhymer.
 * Dodaje funkcjonalność do licznika, który odrzuca wstawiane wartości,
 * jeśli są one większe od bieżącej wartości na szczycie stosu.
 * Zlicza również liczbę odrzuconych wartości.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Liczba odrzuconych wartości.
     */
    private int totalRejected = 0;

    /**
     * Zwraca liczbę odrzuconych wartości.
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje liczbę do stosu, jeżeli nie jest większa od wartości na szczycie.
     * W przeciwnym razie zwiększa licznik odrzuconych wartości.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) {
            totalRejected++;  // Inkrementacja liczby odrzuconych wartości.
        } else {
            super.countIn(in);  // Wywołanie metody z klasy bazowej.
        }
    }
}