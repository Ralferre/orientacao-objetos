package Principal;

import modelos.Favoritos;
import modelos.Musica;
import modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica1 = new Musica();
        minhaMusica1.setTitulo("Goodness of God");
        minhaMusica1.setArtista("Cece Winans");
        minhaMusica1.setGenero("Gospel International");

        Musica minhaMusica2 = new Musica();
        minhaMusica2.setTitulo("I found love");
        minhaMusica2.setArtista("Cece Winans and Bebe");
        minhaMusica2.setGenero("Romantic Gospel International");
        minhaMusica2.setAlbum("Still");

        int i;
        for(i = 0; i < 1200; ++i) {
            minhaMusica1.reproduzir();

        }

        for(i = 0; i < 400; ++i) {
            minhaMusica2.reproduzir();

        }

        Podcast meupodcast = new Podcast();
        meupodcast.setTitulo("Tecnologias atuais");
        meupodcast.setApresentador("Felipe Aguiar");
        meupodcast.setTema("Uso de Frameworks");

        Podcast myPodcast2 = new Podcast();
        myPodcast2.setTitulo("The future we're building");
        myPodcast2.setTema("The future we're building");
        myPodcast2.setApresentador("TED");
        myPodcast2.setDescricao("An interview with Elon Musk discussing his new projects and his motivation for building a future better");

        Podcast mypodcast3 = new Podcast();
        mypodcast3.setTitulo("How to learn speak English fluently in few months");
        mypodcast3.setEpisodio(1);
        mypodcast3.setApresentador("Tom Hanks");
        mypodcast3.setDescricao("Discussing about many issues, showing new words to practice and get more vocabulary");
        mypodcast3.setTema("Learning English");

        for(i = 0; i < 400; ++i) {
            meupodcast.curtir();
        }

        for(i = 0; i < 800; ++i) {
            myPodcast2.curtir();
            mypodcast3.curtir();
        }

        Favoritos favorito = new Favoritos();
        favorito.incluiFavoritos(minhaMusica1);
        favorito.incluiFavoritos(minhaMusica2);
        favorito.incluiFavoritos(meupodcast);
        favorito.incluiFavoritos(myPodcast2);
        favorito.incluiFavoritos(mypodcast3);

        System.out.println(String.format("Total de reproduções da música: %s foi de %d, com nota de %d", minhaMusica1.getTitulo(), minhaMusica1.getTotalReproducoes(), minhaMusica1.classificar()));
        System.out.println(String.format("Total de reproduções da música: %s foi de %d, com nota de %d", minhaMusica2.getTitulo(), minhaMusica2.getTotalReproducoes(), minhaMusica2.classificar()));

        System.out.println(String.format("Total de reproduções do podcast: %s foi de %d, com nota de %d", meupodcast.getTitulo(), meupodcast.getCurtidas(), meupodcast.classificar()));
        System.out.println(String.format("Total de reproduções do podcast: %s foi de %d, com nota de %d", myPodcast2.getTitulo(), myPodcast2.getCurtidas(), myPodcast2.classificar()));
    }

}
