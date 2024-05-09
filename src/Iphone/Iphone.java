package Iphone;

public class Iphone  implements Phone, MusicPlayer, WebBrowser {
    private int currentVolume = 50;  // Example attribute
    private String currentTab = "home";  // Initial homepage tab
    private String phoneStatus = "idle"; // Possible statuses: idle, calling, in call

    // MusicPlayer implementation
    public void play() {
        System.out.println("Music playing...");
    }

    public void pause() {
        System.out.println("Music paused.");
    }

    public void selectSong(String song) {
        System.out.println("Selected song: " + song);
    }

    // Telephone implementation
    public void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
        phoneStatus = "calling";
    }

    public void answer() {
        System.out.println("Call answered.");
        phoneStatus = "in call";
    }

    public void startVoicemail() {
        System.out.println("Voicemail started.");
        phoneStatus = "idle";
    }

    // WebBrowser implementation
    public void displayPage(String url) {
        System.out.println("Displaying page: " + url);
        currentTab = url;
    }

    public void addNewTab(String url) {
        System.out.println("New tab added for: " + url);
    }

    public void refreshPage() {
        System.out.println("Page refreshed.");
    }
}
