public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Альберт";
        post.surname = "Сабиров";
        post.passport = "5234 № 532765";
        post.patronymic = "Наилевич";
        post.phone = "+7(965)452-35-66";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 3;
        post.birthday.month = 11;
        post.birthday.year = 1990;
    }
}