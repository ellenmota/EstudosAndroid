package signosapp.ellenmota.com.signosapp;

/**
 * Created by ellenmota on 27/03/2018.
 */

public class Signo {

    protected String titulo;
    protected String subtitulo;
    protected int imagem;
    protected int id;


    public Signo(int id,String titulo, String subtitulo, int imagem){
        this.id = id;
        this.imagem = imagem;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
