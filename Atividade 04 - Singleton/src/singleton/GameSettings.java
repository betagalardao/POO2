public class GameSettings {
    
    private int volume;
    private Nivel nivel; 
    private Resolucao resolucao;
    private static GameSettings setting = null; 

    public static GameSettings getInstance(){
        if (setting == null){
            setting = new GameSettings();
        }

        return setting;
    }

    //construtor privado
    private GameSettings(){
        this.volume = 0;
        this.nivel = Nivel.NORMAL;
        this.resolucao = Resolucao.ALTA;
        }

        @Override
        public String toString(){
            String config = "\nVolume: " + this.volume +
                            "\nNivel: " + this.nivel +
                            "\nResolucao: " + this.resolucao;
        return config;
        }
        //get
        public Nivel getNivel() {
            return nivel;
        }
        public Resolucao getResolucao() {
            return resolucao;
        }
        public int getVolume() {
            return volume;
        }
        //set
        public void setNivel(Nivel nivel) {
            this.nivel = nivel;
        }
        public void setResolucao(Resolucao resolucao) {
            this.resolucao = resolucao;
        }
        public void setVolume(int volume) {
            this.volume = volume;
        }
}
