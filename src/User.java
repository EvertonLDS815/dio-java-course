public class User {
    public static void main(String[] args) throws Exception {
        Television television = new Television();

        System.out.println("TV Ligada? " + television.isOpened);
        System.out.println("Volume: " + television.volume);
        System.out.println("Canal: " + television.canal);

        television.plusChannel();
        television.plusChannel();
        television.plusChannel();
        television.changeChannel(22);
        System.out.println("Novo Canal: " + television.canal);
    }
}
