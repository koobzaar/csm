public class Fila {

    private static Fila instance;

    private Fila() {

    }

    public void imprimeDocumento() {
        System.out.println("Imprimindo documento");
    }

    public void removeDocumento() {
        System.out.println("Removendo documento");
    }

    public void removeTodosDocumentos() {
        System.out.println("Removendo todos os documentos");
    }

    public static Fila getInstance() {
        if (instance == null) {
            instance = new Fila();
        }
        return instance;
    }
}