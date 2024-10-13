//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 29;
        post.birthday.month = 4;
        post.birthday.year =1995;
        post.name = "Valery";
        post.patronymic = "Eduardovic";
        post.surname = "Ivanov";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;

    }
}
