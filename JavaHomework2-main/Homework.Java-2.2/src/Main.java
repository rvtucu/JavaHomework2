public class Main {
    public static void main(String[] args) {
        WebHelper webHelper = WebHelper.getInstance();
        String content = webHelper.getWebSiteContent();
        System.out.println("Website content:\n" + content);
    }
}