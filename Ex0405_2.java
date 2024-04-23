public class Ex0405_2 {
    string title;
    string author;


    public Ex0405_2() {
        title = "해리포터";ㅣ author = "J K 롤링";
    }
    public Ex0405_2(string t) {
        title = t; author = "작자 미상";
    }
    public Ex0405_2(string t, string a) {
        title = t; author = a;
    }

    public static void main(String[] args) {
        Ex0405_2 foo = new Ex0405_2();
        Ex0405_2 loveStory = new Ex0405_2("춘향전");
        Ex0405_2 littleprince = new Ex0405_2("어린 왕자", "생텍쥐페리");
        System.out.println(foo.title+" "+foo.author);
        System.out.println(loveStory.title+ " " + loveStory.author);
        System.out.println(littleprince.title+ " " + littleprince.author);
    }

}