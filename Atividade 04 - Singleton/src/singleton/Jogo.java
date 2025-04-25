public class Jogo {

    public static void main(String[] args) {
        GameSettings gs = GameSettings.getInstance();
        gs.setVolume(8);
        gs.setResolucao(Resolucao.BAIXA);

        System.out.println(gs);

        GameSettings gs2 = GameSettings.getInstance();
        gs2.setResolucao(Resolucao.ALTA);

        System.out.println(gs2);
    }
}
