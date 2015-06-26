package br.com.hisamoto.listViewAndroid;

/**
 * Classe que vai conter dos dados que via ser mostrado
 * em cada linha da ListView
 *
 * @author Leandro Shindi
 * @version 1.0 26/06/15.
 */
public class ListViewCustomizadoItem {

    private String nomeActivity;
    private int imagemActivity;
    private String email;
    private String hora;
    private String status;

    public ListViewCustomizadoItem(String nomeActivity, int imagemActivity, String email, String hora, String status) {

        this.nomeActivity = nomeActivity;
        this.imagemActivity = imagemActivity;
        this.email = email;
        this.hora = hora;
        this.status = status;
    }

    public String getNomeActivity() {

        return this.nomeActivity;
    }

    public String getEmail(){

        return this.email;
    }

    public String getHora(){

        return this.hora;
    }

    public String getStatus() {

        return this.status;
    }

    public int getImagemActivity() {

        return this.imagemActivity;
    }
}
