package modelos;
public class Favoritos {
    public Favoritos() {
    }

    public void incluiFavoritos(Audio audio) {
        if (audio.classificar() >= 8) {
            System.out.println(String.format("O áudio: %s está entre os favoritos do momento!", audio.getTitulo()));
        } else if (audio.classificar() >= 6) {
            System.out.println(String.format("O áudio: %s muito bem avaliado no momento!", audio.getTitulo()));
        } else if (audio.classificar() >= 4) {
            System.out.println(String.format("O áudio: %s está em crescente para chegar entre os muito bem avaliados no momento!", audio.getTitulo()));
        } else {
            System.out.println(String.format("O áudio: %s não está bem avaliado no momento!", audio.getTitulo()));
        }
//        if (audio.classificar() <= 5) {
//            System.out.println(String.format("%s não está bem avaliado", audio.getTitulo()));
//        }
//        if (audio.classificar() >= 8) {
//            System.out.println(String.format("%s está entre os favoritos do momento", audio.getTitulo()));
//        }
//        if (audio.classificar() >= 6 || audio.classificar() < 8) {
//            System.out.println(String.format("%s está em crescente para chegar nos favoritos", audio.getTitulo()));
//        }
    }
}
