public class Radical {
    static int numarDeNumere = 1;
    int nr;
    
    Radical (int nr) {
        this.nr = nr;
        numarDeNumere++;
    }
    
double radacinaPatrata() {
    return Math.sqrt(nr);
}
}